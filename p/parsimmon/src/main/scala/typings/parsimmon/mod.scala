package typings.parsimmon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.parsimmon.parsimmonBooleans.`false`
import typings.parsimmon.parsimmonBooleans.`true`
import typings.parsimmon.parsimmonNumbers.`-1`
import typings.parsimmon.parsimmonStrings._empty
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parsimmon", JSImport.Namespace)
  @js.native
  def apply[T](fn: js.Function2[/* input */ String, /* i */ Double, Reply[T]]): Parser[T] = js.native
  
  @js.native
  trait Parser[T] extends StObject {
    
    /**
      * Takes parser which returns a function and applies it to the parsed value of otherParser.
      */
    def ap[U](otherParser: Parser[js.Function1[/* t */ T, U]]): Parser[U] = js.native
    
    /**
      * Passes the result of `parser` to the function `condition`,
      * which returns a boolean. If the the condition is false, returns
      * a failed parse with the given `message`. Else it returns the
      * original result of `parser`.
      */
    def assert(condition: js.Function1[/* result */ T, Boolean], message: String): Parser[T] = js.native
    
    /**
      * expects parser at least n times. Yields an array of the results.
      */
    def atLeast(n: Double): Parser[js.Array[T]] = js.native
    
    /**
      * expects parser at most n times. Yields an array of the results.
      */
    def atMost(n: Double): Parser[js.Array[T]] = js.native
    
    /**
      * returns a new parser which tries parser, and on success calls the given function
      * with the result of the parse, which is expected to return another parser, which
      * will be tried next
      */
    def chain[U](next: js.Function1[/* result */ T, Parser[U]]): Parser[U] = js.native
    
    /**
      * Transforms the input of parser with the given function.
      */
    def contramap[U](fn: js.Function1[/* input */ T, U]): Parser[U] = js.native
    
    /**
      * Returns a new parser whose failure message is description.
      * For example, string('x').desc('the letter x') will indicate that 'the letter x' was expected.
      */
    def desc(description: String): Parser[T] = js.native
    def desc(description: js.Array[String]): Parser[T] = js.native
    
    // Fantasy land support
    /**
      * Returns Parsimmon.fail("fantasy-land/empty").
      */
    def empty(): Parser[scala.Nothing] = js.native
    
    /**
      * returns a new parser that returns the fallback value if the first parser failed.
      */
    def fallback[U](fallbackValue: U): Parser[T | U] = js.native
    
    def lookahead(arg: String): Parser[T] = js.native
    /**
      * Returns a parser that looks for whatever arg wants to parse, but does not
      * consume it. Yields the same result as parser. Equivalent to
      * parser.skip(Parsimmon.lookahead(anotherParser)).
      */
    def lookahead(arg: Parser[_]): Parser[T] = js.native
    def lookahead(arg: RegExp): Parser[T] = js.native
    
    /**
      * expects parser zero or more times, and yields an array of the results.
      */
    def many(): Parser[js.Array[T]] = js.native
    
    /**
      * transforms the output of parser with the given function.
      */
    def map[U](call: js.Function1[/* result */ T, U]): Parser[U] = js.native
    
    /**
      * Yields an object with `start`, `value`, and `end` keys, where `value` is the original
      * value yielded by the parser, and `start` and `end` indicate the `Index` objects representing
      * the range of the parse result.
      */
    def mark(): Parser[Mark[T]] = js.native
    
    /**
      * Like `mark()`, but yields an object with an additional `name` key to use as an AST.
      */
    def node[Name /* <: String */](name: Name): Parser[Node[Name, T]] = js.native
    
    /**
      * Returns a parser that looks for anything but whatever anotherParser wants to
      * parse, and does not consume it. Yields the same result as parser. Equivalent to
      * parser.skip(Parsimmon.notFollowedBy(anotherParser)).
      */
    def notFollowedBy(anotherParser: Parser[_]): Parser[T] = js.native
    
    /**
      * Equivalent to Parsimmon.of(result).
      */
    def of[U](result: U): Parser[U] = js.native
    
    /**
      * returns a new parser which tries parser, and if it fails uses otherParser.
      */
    def or[U](otherParser: Parser[U]): Parser[T | U] = js.native
    
    /**
      * parse the string
      */
    def parse(input: String): Result[T] = js.native
    
    /**
      * Transforms the input and output of parser with the given function.
      */
    def promap[U, V](inputFn: js.Function1[/* input */ T, U], outputFn: js.Function1[/* output */ U, V]): Parser[V] = js.native
    
    /**
      * returns a new parser with the same behavior, but which yields aResult.
      */
    def result[U](aResult: U): Parser[U] = js.native
    
    /**
      * Equivalent to Parsimmon.sepBy(parser, separator).
      *
      * Expects zero or more matches for parser, separated by the parser separator, yielding an array.
      */
    def sepBy[U](separator: Parser[U]): Parser[js.Array[T]] = js.native
    
    /**
      * Equivalent to Parsimmon.sepBy(parser, separator).
      *
      * Expects one or more matches for parser, separated by the parser separator, yielding an array.
      */
    def sepBy1[U](separator: Parser[U]): Parser[js.Array[T]] = js.native
    
    /**
      * expects otherParser after parser, but preserves the yield value of parser.
      */
    def skip[U](otherParser: Parser[U]): Parser[T] = js.native
    
    /**
      * expects anotherParser to follow parser, and yields the result of anotherParser.
      * NB: the result of parser here is ignored.
      */
    def `then`[U](anotherParser: Parser[U]): Parser[U] = js.native
    /**
      * returns a new parser which tries parser, and on success calls the given function
      * with the result of the parse, which is expected to return another parser.
      */
    def `then`[U](call: js.Function1[/* result */ T, Parser[U]]): Parser[U] = js.native
    
    /**
      * returns wrapper(this) from the parser. Useful for custom functions used
      * to wrap your parsers, while keeping with Parsimmon chaining style.
      */
    def thru[U](call: js.Function1[/* wrapper */ Parser[T], Parser[U]]): Parser[U] = js.native
    
    /**
      * Equivalent to parser.tieWith("").
      *
      * Note: parser.tie() is usually used after Parsimmon.seq(...parsers) or parser.many().
      */
    def tie(): Parser[String] = js.native
    
    /**
      * When called on a parser yielding an array of strings, yields all their strings
      * concatenated with the separator. Asserts that its input is actually an array of strings.
      */
    def tieWith(join: String): Parser[String] = js.native
    
    /**
      * expects parser between min and max times, and yields an array of the results.
      */
    // tslint:disable-next-line:unified-signatures
    def times(min: Double, max: Double): Parser[js.Array[T]] = js.native
    /**
      * expects parser exactly n times, and yields an array of the results.
      */
    def times(n: Double): Parser[js.Array[T]] = js.native
    
    /**
      * expects anotherParser before and after parser, yielding the result of parser
      */
    def trim[U](anotherParser: Parser[U]): Parser[T] = js.native
    
    /**
      * Like parser.parse(input) but either returns the parsed value or throws
      * an error on failure. The error object contains additional properties
      * about the error.
      */
    def tryParse(input: String): T = js.native
    
    /**
      * Expects the parser before before parser and after after parser.
      */
    def wrap(before: Parser[_], after: Parser[_]): Parser[T] = js.native
  }
  /**
    * Alias of `Parsimmon(fn)` for backwards compatibility.
    */
  @JSImport("parsimmon", "Parser")
  @js.native
  def Parser[T](fn: js.Function2[/* input */ String, /* i */ Double, Reply[T]]): Parser[T] = js.native
  
  /**
    * consumes and yields the entire remainder of the stream.
    */
  @JSImport("parsimmon", "all")
  @js.native
  val all: Parser[String] = js.native
  
  @JSImport("parsimmon", "alt")
  @js.native
  def alt(parsers: Parser[_]*): Parser[_] = js.native
  /**
    * accepts a variable number of parsers, and yields the value of the first one that succeeds,
    * backtracking in between.
    */
  @JSImport("parsimmon", "alt")
  @js.native
  def alt_U[U](parsers: Parser[U]*): Parser[U] = js.native
  
  /**
    * consumes and yields the next character of the stream.
    */
  @JSImport("parsimmon", "any")
  @js.native
  val any: Parser[String] = js.native
  
  /**
    * Returns a parser that yields a byte (as a number) that matches the given input;
    * similar to Parsimmon.digit and Parsimmon.letter.
    */
  @JSImport("parsimmon", "bitSeq")
  @js.native
  def bitSeq(alignments: js.Array[Double]): Parser[js.Array[Double]] = js.native
  
  /**
    * Works like Parsimmon.bitSeq except each item in the array is either a number of
    * bits or pair (array with length = 2) of name and bits. The bits are parsed in order
    * and put into an object based on the name supplied. If there's no name for the bits,
    * it will be parsed but discarded from the returned value.
    */
  @JSImport("parsimmon", "bitSeqObj")
  @js.native
  def bitSeqObj[Key /* <: String */](namedAlignments: js.Array[(js.Tuple2[Key, Double]) | Double]): Parser[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: number}
    */ typings.parsimmon.parsimmonStrings.bitSeqObj with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Returns a parser that yields a byte (as a number) that matches the given input;
    * similar to Parsimmon.digit and Parsimmon.letter.
    */
  @JSImport("parsimmon", "byte")
  @js.native
  def byte(int: Double): Parser[Double] = js.native
  
  /**
    * Equivalent to Parsimmon.string("\r").
    *
    * This parser checks for the "carriage return" character, which is used as the
    * line terminator for classic Mac OS 9 text files.
    */
  @JSImport("parsimmon", "cr")
  @js.native
  val cr: Parser[String] = js.native
  
  /**
    * Starting point for building a language parser in Parsimmon.
    *
    * For having the resulting language rules return typed parsers, e.g. `Parser<Foo>` instead of
    * `Parser<any>`, pass a language specification as type parameter to this function. The language
    * specification should be of the following form:
    *
    * ```javascript
    * {
    *   rule1: type;
    *   rule2: type;
    * }
    * ```
    *
    * For example:
    *
    * ```javascript
    * const language = Parsimmon.createLanguage<{
    *   expr: Expr;
    *   numberLiteral: number;
    *   stringLiteral: string;
    * }>({
    *   expr: r => (some expression that yields Parser<Expr>),
    *   numberLiteral: r => (some expression that yields Parser<number>),
    *   stringLiteral: r => (some expression that yields Parser<string>)
    * });
    * ```
    *
    * Now both `language` and the parameter `r` that is passed into every parser rule will be of the
    * following type:
    *
    * ```javascript
    * {
    *   expr: Parser<Expr>;
    *   numberLiteral: Parser<number>;
    *   stringLiteral: Parser<string>;
    * }
    * ```
    *
    * Another benefit is that both the `rules` parameter and the resulting `language` should match the
    * properties defined in the language specification type, which means that the compiler checks that
    * there are no missing or superfluous rules in the language definition, and that the rules you access
    * on the resulting language do actually exist.
    */
  @JSImport("parsimmon", "createLanguage")
  @js.native
  def createLanguage(rules: Rule): Language = js.native
  @JSImport("parsimmon", "createLanguage")
  @js.native
  def createLanguage[TLanguageSpec](rules: TypedRule[TLanguageSpec]): TypedLanguage[TLanguageSpec] = js.native
  
  /**
    * Equivalent to Parsimmon.string("\r\n").
    *
    * This parser checks for the "carriage return" character followed by the "line
    * feed" character, which is used as the line terminator for Windows text files
    * and HTTP headers.
    */
  @JSImport("parsimmon", "crlf")
  @js.native
  val crlf: Parser[String] = js.native
  
  /**
    * allows to add custom primitive parsers.
    */
  @JSImport("parsimmon", "custom")
  @js.native
  def custom[U](
    parsingFunction: js.Function2[
      /* success */ SuccessFunctionType[U], 
      /* failure */ FailureFunctionType[U], 
      ParseFunctionType[U]
    ]
  ): Parser[U] = js.native
  
  /**
    * is equivalent to Parsimmon.regex(/[0-9]/)
    */
  @JSImport("parsimmon", "digit")
  @js.native
  val digit: Parser[String] = js.native
  
  /**
    * is equivalent to Parsimmon.regex(/[0-9]*`/)
    */
  @JSImport("parsimmon", "digits")
  @js.native
  val digits: Parser[String] = js.native
  
  /**
    * Returns Parsimmon.fail("fantasy-land/empty").
    */
  @JSImport("parsimmon", "empty")
  @js.native
  def empty(): Parser[scala.Nothing] = js.native
  
  /**
    * Equivalent to Parsimmon.alt(Parsimmon.newline, Parsimmon.eof).
    *
    * This is the most general purpose "end of line" parser. It allows the "end of file"
    * in addition to all three text file line endings from Parsimmon.newline. This is
    * important because text files frequently do not have line terminators at the
    * end ("trailing newline").
    */
  @JSImport("parsimmon", "end")
  @js.native
  val end: Parser[js.UndefOr[String]] = js.native
  
  /**
    * expects the end of the stream.
    */
  @JSImport("parsimmon", "eof")
  @js.native
  val eof: Parser[js.UndefOr[scala.Nothing]] = js.native
  
  /**
    * fail paring with a message
    */
  @JSImport("parsimmon", "fail")
  @js.native
  def fail(message: String): Parser[scala.Nothing] = js.native
  
  /**
    * Takes the string passed to parser.parse(string) and the error returned from
    * parser.parse(string) and turns it into a human readable error message string.
    * Note that there are certainly better ways to format errors, so feel free to write your own.
    */
  @JSImport("parsimmon", "formatError")
  @js.native
  def formatError[T](string: String, error: Result[T]): String = js.native
  
  /**
    * is a parser that yields the current index of the parse.
    */
  @JSImport("parsimmon", "index")
  @js.native
  val index: Parser[Index_] = js.native
  
  /**
    * Returns true if obj is a Parsimmon parser, otherwise false.
    */
  @JSImport("parsimmon", "isParser")
  @js.native
  def isParser(obj: js.Any): /* is parsimmon.parsimmon.Parser<any> */ Boolean = js.native
  
  /**
    * is equivalent to Parsimmon.regex(/[a-z]/i)
    */
  @JSImport("parsimmon", "letter")
  @js.native
  val letter: Parser[String] = js.native
  
  /**
    * is equivalent to Parsimmon.regex(/[a-z]*`/i)
    */
  @JSImport("parsimmon", "letters")
  @js.native
  val letters: Parser[String] = js.native
  
  /**
    * Equivalent to Parsimmon.string("\n").
    *
    * This parser checks for the "line feed" character, which is used as the line
    * terminator for Linux and macOS text files.
    */
  @JSImport("parsimmon", "lf")
  @js.native
  val lf: Parser[String] = js.native
  
  @JSImport("parsimmon", "lookahead")
  @js.native
  def lookahead(arg: String): Parser[_empty] = js.native
  /**
    * Parses using arg, but does not consume what it parses. Yields an empty string.
    */
  @JSImport("parsimmon", "lookahead")
  @js.native
  def lookahead(arg: Parser[_]): Parser[_empty] = js.native
  @JSImport("parsimmon", "lookahead")
  @js.native
  def lookahead(arg: RegExp): Parser[_empty] = js.native
  
  /**
    * To be used inside of Parsimmon(fn). Generates an object describing how
    * far the unsuccessful parse went (index), and what kind of syntax it
    * expected to see (expectation). See documentation for Parsimmon(fn).
    */
  @JSImport("parsimmon", "makeFailure")
  @js.native
  def makeFailure(furthest: Double, expectation: String): FailureReply = js.native
  @JSImport("parsimmon", "makeFailure")
  @js.native
  def makeFailure(furthest: Double, expectation: js.Array[String]): FailureReply = js.native
  
  /**
    * To be used inside of Parsimmon(fn). Generates an object describing how
    * far the successful parse went (index), and what value it created doing
    * so. See documentation for Parsimmon(fn).
    */
  @JSImport("parsimmon", "makeSuccess")
  @js.native
  def makeSuccess[T](index: Double, value: T): SuccessReply[T] = js.native
  
  /**
    * This flexible parser will match any kind of text file line ending.
    */
  @JSImport("parsimmon", "newline")
  @js.native
  val newline: Parser[String] = js.native
  
  /**
    * Returns a parser that looks for exactly one character NOT from string, and yields that character.
    */
  @JSImport("parsimmon", "noneOf")
  @js.native
  def noneOf(string: String): Parser[String] = js.native
  
  /**
    * Parses using parser, but does not consume what it parses. Yields null if the parser
    * does not match the input. Otherwise it fails.
    */
  @JSImport("parsimmon", "notFollowedBy")
  @js.native
  def notFollowedBy(parser: Parser[_]): Parser[Null] = js.native
  
  /**
    * This is an alias for Parsimmon.succeed(result).
    */
  @JSImport("parsimmon", "of")
  @js.native
  def of[U](result: U): Parser[U] = js.native
  
  /**
    * Returns a parser that looks for exactly one character from string, and yields that character.
    */
  @JSImport("parsimmon", "oneOf")
  @js.native
  def oneOf(string: String): Parser[String] = js.native
  
  /**
    * is equivalent to Parsimmon.regex(/\s*`/)
    */
  @JSImport("parsimmon", "optWhitespace")
  @js.native
  val optWhitespace: Parser[String] = js.native
  
  /**
    * Parsers a single character in from begin to end, inclusive.
    */
  @JSImport("parsimmon", "range")
  @js.native
  def range(begin: String, end: String): Parser[String] = js.native
  
  /**
    * This was the original name for Parsimmon.regexp, but now it is just an alias.
    */
  @JSImport("parsimmon", "regex")
  @js.native
  def regex(myregex: RegExp): Parser[String] = js.native
  @JSImport("parsimmon", "regex")
  @js.native
  def regex(myregex: RegExp, group: Double): Parser[String] = js.native
  
  /**
    * Returns a parser that looks for a match to the regexp and yields the given match group
    * (defaulting to the entire match). The regexp will always match starting at the current
    * parse location. The regexp may only use the following flags: imu. Any other flag will
    * result in an error being thrown.
    */
  @JSImport("parsimmon", "regexp")
  @js.native
  def regexp(myregex: RegExp): Parser[String] = js.native
  @JSImport("parsimmon", "regexp")
  @js.native
  def regexp(myregex: RegExp, group: Double): Parser[String] = js.native
  
  /**
    * Accepts two parsers, and expects zero or more matches for content, separated by separator, yielding an array.
    */
  @JSImport("parsimmon", "sepBy")
  @js.native
  def sepBy[T, U](content: Parser[T], separator: Parser[U]): Parser[js.Array[T]] = js.native
  
  /**
    * This is the same as Parsimmon.sepBy, but matches the content parser at least once.
    */
  @JSImport("parsimmon", "sepBy1")
  @js.native
  def sepBy1[T, U](content: Parser[T], separator: Parser[U]): Parser[js.Array[T]] = js.native
  
  /**
    * accepts a variable number of parsers that it expects to find in order, yielding an array of the results.
    */
  @JSImport("parsimmon", "seq")
  @js.native
  def seq[T](p1: Parser[T]): Parser[js.Array[T]] = js.native
  @JSImport("parsimmon", "seq")
  @js.native
  def seq[T /* <: js.Array[_] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param parsers because its type T is not an array type */ parsers: T
  ): Parser[UnParser[T]] = js.native
  @JSImport("parsimmon", "seq")
  @js.native
  def seq[T](parsers: Parser[T]*): Parser[js.Array[T]] = js.native
  @JSImport("parsimmon", "seq")
  @js.native
  def seq[T, U](p1: Parser[T], p2: Parser[U]): Parser[js.Tuple2[T, U]] = js.native
  @JSImport("parsimmon", "seq")
  @js.native
  def seq[T, U, V](p1: Parser[T], p2: Parser[U], p3: Parser[V]): Parser[js.Tuple3[T, U, V]] = js.native
  @JSImport("parsimmon", "seq")
  @js.native
  def seq[T, U, V, W](p1: Parser[T], p2: Parser[U], p3: Parser[V], p4: Parser[W]): Parser[js.Tuple4[T, U, V, W]] = js.native
  @JSImport("parsimmon", "seq")
  @js.native
  def seq[T, U, V, W, X](p1: Parser[T], p2: Parser[U], p3: Parser[V], p4: Parser[W], p5: Parser[X]): Parser[js.Tuple5[T, U, V, W, X]] = js.native
  @JSImport("parsimmon", "seq")
  @js.native
  def seq[T, U, V, W, X, Y](p1: Parser[T], p2: Parser[U], p3: Parser[V], p4: Parser[W], p5: Parser[X], p6: Parser[Y]): Parser[js.Tuple6[T, U, V, W, X, Y]] = js.native
  @JSImport("parsimmon", "seq")
  @js.native
  def seq[T, U, V, W, X, Y, Z](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    p6: Parser[Y],
    p7: Parser[Z]
  ): Parser[js.Tuple7[T, U, V, W, X, Y, Z]] = js.native
  
  /**
    * Matches all parsers sequentially, and passes their results as the arguments to a function.
    * Similar to calling Parsimmon.seq and then .map, but the values are not put in an array.
    */
  @JSImport("parsimmon", "seqMap")
  @js.native
  def seqMap[T, U](p1: Parser[T], cb: js.Function1[/* a1 */ T, U]): Parser[U] = js.native
  @JSImport("parsimmon", "seqMap")
  @js.native
  def seqMap[T, U, V](p1: Parser[T], p2: Parser[U], cb: js.Function2[/* a1 */ T, /* a2 */ U, V]): Parser[V] = js.native
  @JSImport("parsimmon", "seqMap")
  @js.native
  def seqMap[T, U, V, W](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    cb: js.Function3[/* a1 */ T, /* a2 */ U, /* a3 */ V, W]
  ): Parser[W] = js.native
  @JSImport("parsimmon", "seqMap")
  @js.native
  def seqMap[T, U, V, W, X](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    cb: js.Function4[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, X]
  ): Parser[X] = js.native
  @JSImport("parsimmon", "seqMap")
  @js.native
  def seqMap[T, U, V, W, X, Y](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    cb: js.Function5[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, /* a5 */ X, Y]
  ): Parser[Y] = js.native
  @JSImport("parsimmon", "seqMap")
  @js.native
  def seqMap[T, U, V, W, X, Y, Z](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    p6: Parser[Y],
    cb: js.Function6[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, /* a5 */ X, /* a6 */ Y, Z]
  ): Parser[Z] = js.native
  @JSImport("parsimmon", "seqMap")
  @js.native
  def seqMap[T, U, V, W, X, Y, Z, A](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    p6: Parser[Y],
    p7: Parser[Z],
    cb: js.Function7[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, /* a5 */ X, /* a6 */ Y, /* a7 */ Z, A]
  ): Parser[A] = js.native
  @JSImport("parsimmon", "seqMap")
  @js.native
  def seqMap[T, U, V, W, X, Y, Z, A, B](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    p6: Parser[Y],
    p7: Parser[Z],
    p8: Parser[A],
    cb: js.Function8[
      /* a1 */ T, 
      /* a2 */ U, 
      /* a3 */ V, 
      /* a4 */ W, 
      /* a5 */ X, 
      /* a6 */ Y, 
      /* a7 */ Z, 
      /* a8 */ A, 
      B
    ]
  ): Parser[B] = js.native
  @JSImport("parsimmon", "seqMap")
  @js.native
  def seqMap[T, U, V, W, X, Y, Z, A, B, C](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    p6: Parser[Y],
    p7: Parser[Z],
    p8: Parser[A],
    p9: Parser[B],
    cb: js.Function9[
      /* a1 */ T, 
      /* a2 */ U, 
      /* a3 */ V, 
      /* a4 */ W, 
      /* a5 */ X, 
      /* a6 */ Y, 
      /* a7 */ Z, 
      /* a8 */ A, 
      /* a9 */ B, 
      C
    ]
  ): Parser[C] = js.native
  @JSImport("parsimmon", "seqMap")
  @js.native
  def seqMap[T, U, V, W, X, Y, Z, A, B, C, D](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    p6: Parser[Y],
    p7: Parser[Z],
    p8: Parser[A],
    p9: Parser[B],
    p10: Parser[C],
    cb: js.Function10[
      /* a1 */ T, 
      /* a2 */ U, 
      /* a3 */ V, 
      /* a4 */ W, 
      /* a5 */ X, 
      /* a6 */ Y, 
      /* a7 */ Z, 
      /* a8 */ A, 
      /* a9 */ B, 
      /* a10 */ C, 
      D
    ]
  ): Parser[D] = js.native
  
  @JSImport("parsimmon", "seqObj")
  @js.native
  def seqObj[T, Key /* <: /* keyof T */ String */](
    args: ((js.Tuple2[
      Key, 
      Parser[
        /* import warning: importer.ImportType#apply Failed type conversion: T[Key] */ js.Any
      ]
    ]) | Parser[_])*
  ): Parser[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: T[K]}
    */ typings.parsimmon.parsimmonStrings.seqObj with TopLevel[T]
  ] = js.native
  
  /**
    * is a parser that expects to find "my-string", and will yield the same.
    */
  @JSImport("parsimmon", "string")
  @js.native
  def string(string: String): Parser[String] = js.native
  
  /**
    * Returns a parser that doesn't consume any of the string, and yields result.
    */
  @JSImport("parsimmon", "succeed")
  @js.native
  def succeed[U](result: U): Parser[U] = js.native
  
  /**
    * Returns a parser yield a string containing all the next characters that pass the predicate
    */
  @JSImport("parsimmon", "takeWhile")
  @js.native
  def takeWhile(predicate: js.Function1[/* char */ String, Boolean]): Parser[String] = js.native
  
  /**
    * Returns a parser that yield a single character if it passes the predicate
    */
  @JSImport("parsimmon", "test")
  @js.native
  def test(predicate: js.Function1[/* char */ String, Boolean]): Parser[String] = js.native
  
  /**
    * is equivalent to Parsimmon.regex(/\s+/)
    */
  @JSImport("parsimmon", "whitespace")
  @js.native
  val whitespace: Parser[String] = js.native
  
  @js.native
  trait Failure
    extends Result[js.Any] {
    
    var expected: js.Array[String] = js.native
    
    var index: Index_ = js.native
    
    var status: `false` = js.native
  }
  object Failure {
    
    @scala.inline
    def apply(expected: js.Array[String], index: Index_, status: `false`): Failure = {
      val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Failure]
    }
    
    @scala.inline
    implicit class FailureMutableBuilder[Self <: Failure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpected(value: js.Array[String]): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedVarargs(value: String*): Self = StObject.set(x, "expected", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Index_): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: `false`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type FailureFunctionType[U] = js.Function2[/* index */ Double, /* msg */ String, Reply[U]]
  
  @js.native
  trait FailureReply
    extends Reply[js.Any] {
    
    var expected: js.Array[String] = js.native
    
    var furthest: Double = js.native
    
    var index: `-1` = js.native
    
    var status: `false` = js.native
    
    var value: Null = js.native
  }
  object FailureReply {
    
    @scala.inline
    def apply(expected: js.Array[String], furthest: Double, index: `-1`, status: `false`, value: Null): FailureReply = {
      val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], furthest = furthest.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FailureReply]
    }
    
    @scala.inline
    implicit class FailureReplyMutableBuilder[Self <: FailureReply] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpected(value: js.Array[String]): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedVarargs(value: String*): Self = StObject.set(x, "expected", js.Array(value :_*))
      
      @scala.inline
      def setFurthest(value: Double): Self = StObject.set(x, "furthest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: `-1`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: `false`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Null): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Index_ extends StObject {
    
    /** one-based column offset */
    var column: Double = js.native
    
    /** one-based line offset */
    var line: Double = js.native
    
    /** zero-based character offset */
    var offset: Double = js.native
  }
  object Index_ {
    
    @scala.inline
    def apply(column: Double, line: Double, offset: Double): Index_ = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index_]
    }
    
    @scala.inline
    implicit class Index_MutableBuilder[Self <: Index_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  type Language = StringDictionary[Parser[js.Any]]
  
  @js.native
  trait Mark[T] extends StObject {
    
    var end: Index_ = js.native
    
    var start: Index_ = js.native
    
    var value: T = js.native
  }
  object Mark {
    
    @scala.inline
    def apply[T](end: Index_, start: Index_, value: T): Mark[T] = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mark[T]]
    }
    
    @scala.inline
    implicit class MarkMutableBuilder[Self <: Mark[_], T] (val x: Self with Mark[T]) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Index_): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Index_): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Node[Name /* <: String */, T] extends Mark[T] {
    
    var name: Name = js.native
  }
  object Node {
    
    @scala.inline
    def apply[Name /* <: String */, T](end: Index_, name: Name, start: Index_, value: T): Node[Name, T] = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node[Name, T]]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node[_, _], Name /* <: String */, T] (val x: Self with (Node[Name, T])) extends AnyVal {
      
      @scala.inline
      def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ParseFunctionType[U] = js.Function2[/* stream */ StreamType, /* index */ Double, Reply[U]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.parsimmon.mod.SuccessReply[T]
    - typings.parsimmon.mod.FailureReply
  */
  trait Reply[T] extends StObject
  object Reply {
    
    @scala.inline
    def FailureReply(expected: js.Array[String], furthest: Double, index: `-1`, status: `false`, value: Null): typings.parsimmon.mod.FailureReply = {
      val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], furthest = furthest.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parsimmon.mod.FailureReply]
    }
    
    @scala.inline
    def SuccessReply[T](expected: js.Array[String], furthest: `-1`, index: Double, status: `true`, value: T): typings.parsimmon.mod.SuccessReply[T] = {
      val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], furthest = furthest.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parsimmon.mod.SuccessReply[T]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parsimmon.mod.Success[T]
    - typings.parsimmon.mod.Failure
  */
  trait Result[T] extends StObject
  object Result {
    
    @scala.inline
    def Failure(expected: js.Array[String], index: Index_, status: `false`): typings.parsimmon.mod.Failure = {
      val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parsimmon.mod.Failure]
    }
    
    @scala.inline
    def Success[T](status: `true`, value: T): typings.parsimmon.mod.Success[T] = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parsimmon.mod.Success[T]]
    }
  }
  
  type Rule = StringDictionary[js.Function1[/* r */ Language, Parser[js.Any]]]
  
  type StreamType = String
  
  @js.native
  trait Success[T] extends Result[T] {
    
    var status: `true` = js.native
    
    var value: T = js.native
  }
  object Success {
    
    @scala.inline
    def apply[T](status: `true`, value: T): Success[T] = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Success[T]]
    }
    
    @scala.inline
    implicit class SuccessMutableBuilder[Self <: Success[_], T] (val x: Self with Success[T]) extends AnyVal {
      
      @scala.inline
      def setStatus(value: `true`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SuccessFunctionType[U] = js.Function2[/* index */ Double, /* result */ U, Reply[U]]
  
  @js.native
  trait SuccessReply[T] extends Reply[T] {
    
    var expected: js.Array[String] = js.native
    
    var furthest: `-1` = js.native
    
    var index: Double = js.native
    
    var status: `true` = js.native
    
    var value: T = js.native
  }
  object SuccessReply {
    
    @scala.inline
    def apply[T](expected: js.Array[String], furthest: `-1`, index: Double, status: `true`, value: T): SuccessReply[T] = {
      val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], furthest = furthest.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessReply[T]]
    }
    
    @scala.inline
    implicit class SuccessReplyMutableBuilder[Self <: SuccessReply[_], T] (val x: Self with SuccessReply[T]) extends AnyVal {
      
      @scala.inline
      def setExpected(value: js.Array[String]): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedVarargs(value: String*): Self = StObject.set(x, "expected", js.Array(value :_*))
      
      @scala.inline
      def setFurthest(value: `-1`): Self = StObject.set(x, "furthest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: `true`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TypedLanguage[TLanguageSpec] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TLanguageSpec ]: parsimmon.parsimmon.Parser<TLanguageSpec[P]>}
    */ typings.parsimmon.parsimmonStrings.TypedLanguage with TopLevel[TLanguageSpec]
  
  type TypedRule[TLanguageSpec] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TLanguageSpec ]: (r : parsimmon.parsimmon.TypedLanguage<TLanguageSpec>): parsimmon.parsimmon.Parser<TLanguageSpec[P]>}
    */ typings.parsimmon.parsimmonStrings.TypedRule with TopLevel[TLanguageSpec]
  
  type UnParser[T] = js.Any
  
  @JSImport("parsimmon", "lazy")
  @js.native
  def `lazy`[U](description: String, f: js.Function0[Parser[U]]): Parser[U] = js.native
  /**
    * accepts a function that returns a parser, which is evaluated the first time the parser is used.
    * This is useful for referencing parsers that haven't yet been defined.
    */
  @JSImport("parsimmon", "lazy")
  @js.native
  def `lazy`[U](f: js.Function0[Parser[U]]): Parser[U] = js.native
}
