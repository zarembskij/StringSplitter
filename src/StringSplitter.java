import java.util.stream.Stream;

public class StringSplitter {

    private static String regexp = "\\D";

    public static int splitAndSum(String string) {
        return Stream.of(string.split(regexp)).filter(s -> !s.equals("")).map(s -> s.trim()).mapToInt(s -> Integer.parseInt(s)).sum();
    }
}
