public class SoccerPlayer {
    private String name;
    private int age;
    private String team;
    private int scoredGoals;

    public SoccerPlayer(String name, int age, String team, int scoredGoals) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.scoredGoals = scoredGoals;

    }

    public SoccerPlayer(String name, int age, String team) {
        this(name, age, team, 0);

    }

    // getter
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getTeam() {
        return team;
    }

    public void setTeam() {
        this.team = team;

    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }
     @Override
     public String toString(){
        return
         "SoccerPlayer{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", team='" + team + '\'' +
                 ", scoredGoals=" + scoredGoals +
                 '}';
     }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SoccerPlayer)) return false;
        SoccerPlayer other = (SoccerPlayer) obj;
        return this.scoredGoals == other.scoredGoals && obj.equals().equals(this.team, other.team);
    }
    // main function
    public static void main(String[] args) {

        SoccerPlayer player1 = new SoccerPlayer("dawooed", 20, "team A", 10);
        SoccerPlayer player2 = new SoccerPlayer("chuol", 40, "team B", 20);
        SoccerPlayer player3 = new SoccerPlayer("dawa", 43, "team C", 15);

        // display players
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

        System.out.println("player1 equals player3" +player1.equals(player3));
        System.out.println("player2 equals player4" +player2.equals(player1));
        System.out.println("player3 equals player1" +player1.equals(player2));
    }
}
