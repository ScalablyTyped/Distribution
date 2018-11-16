package typings
package parsimmonLib.parsimmonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", JSImport.Namespace)
@js.native
object parsimmonModMembers extends js.Object {
  /**
  	 * consumes and yields the entire remainder of the stream.
  	 */
  val all: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * consumes and yields the next character of the stream.
  	 */
  val any: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * Equivalent to Parsimmon.string("\r").
  	 *
  	 * This parser checks for the "carriage return" character, which is used as the
  	 * line terminator for classic Mac OS 9 text files.
  	 */
  val cr: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * Equivalent to Parsimmon.string("\r\n").
  	 *
  	 * This parser checks for the "carriage return" character followed by the "line
  	 * feed" character, which is used as the line terminator for Windows text files
  	 * and HTTP headers.
  	 */
  val crlf: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * is equivalent to Parsimmon.regex(/[0-9]/)
  	 */
  val digit: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * is equivalent to Parsimmon.regex(/[0-9]*`/)
  	 */
  val digits: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * Equivalent to Parsimmon.alt(Parsimmon.newline, Parsimmon.eof).
  	 *
  	 * This is the most general purpose "end of line" parser. It allows the "end of file"
  	 * in addition to all three text file line endings from Parsimmon.newline. This is
  	 * important because text files frequently do not have line terminators at the
  	 * end ("trailing newline").
  	 */
  val end: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[js.UndefOr[java.lang.String]] = js.native
  /**
  	 * expects the end of the stream.
  	 */
  val eof: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[js.UndefOr[scala.Nothing]] = js.native
  /**
  	 * is a parser that yields the current index of the parse.
  	 */
  val index: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[parsimmonLib.parsimmonMod.ParsimmonNs.Index] = js.native
  /**
  	 * is equivalent to Parsimmon.regex(/[a-z]/i)
  	 */
  val letter: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * is equivalent to Parsimmon.regex(/[a-z]*`/i)
  	 */
  val letters: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * Equivalent to Parsimmon.string("\n").
  	 *
  	 * This parser checks for the "line feed" character, which is used as the line
  	 * terminator for Linux and macOS text files.
  	 */
  val lf: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * This flexible parser will match any kind of text file line ending.
  	 */
  val newline: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * is equivalent to Parsimmon.regex(/\s*`/)
  	 */
  val optWhitespace: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * is equivalent to Parsimmon.regex(/\s+/)
  	 */
  val whitespace: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  def apply[T](
    fn: js.Function2[
      /* input */ java.lang.String, 
      /* i */ scala.Double, 
      parsimmonLib.parsimmonMod.ParsimmonNs.Reply[T]
    ]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T] = js.native
  /**
  	 * Alias of `Parsimmon(fn)` for backwards compatibility.
  	 */
  def Parser[T](
    fn: js.Function2[
      /* input */ java.lang.String, 
      /* i */ scala.Double, 
      parsimmonLib.parsimmonMod.ParsimmonNs.Reply[T]
    ]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T] = js.native
  def alt(parsers: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[_]*): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[_] = js.native
  /**
  	 * accepts a variable number of parsers, and yields the value of the first one that succeeds,
  	 * backtracking in between.
  	 */
  @JSName("alt")
  def alt_U[U](parsers: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U]*): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U] = js.native
  /**
  	 * Returns a parser that yields a byte (as a number) that matches the given input;
  	 * similar to Parsimmon.digit and Parsimmon.letter.
  	 */
  def bitSeq(alignments: js.Array[scala.Double]): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[js.Array[scala.Double]] = js.native
  /**
  	 * Works like Parsimmon.bitSeq except each item in the array is either a number of
  	 * bits or pair (array with length = 2) of name and bits. The bits are parsed in order
  	 * and put into an object based on the name supplied. If there's no name for the bits,
  	 * it will be parsed but discarded from the returned value.
  	 */
  def bitSeqObj[Key /* <: java.lang.String */](namedAlignments: js.Array[(js.Tuple2[Key, scala.Double]) | scala.Double]): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[parsimmonLib.parsimmonLibStrings.bitSeqObj with js.Any] = js.native
  /**
  	 * Returns a parser that yields a byte (as a number) that matches the given input;
  	 * similar to Parsimmon.digit and Parsimmon.letter.
  	 */
  def byte(int: scala.Double): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[scala.Double] = js.native
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
  def createLanguage(rules: parsimmonLib.parsimmonMod.ParsimmonNs.Rule): parsimmonLib.parsimmonMod.ParsimmonNs.Language = js.native
  def createLanguage[TLanguageSpec](rules: parsimmonLib.parsimmonMod.ParsimmonNs.TypedRule[TLanguageSpec]): parsimmonLib.parsimmonMod.ParsimmonNs.TypedLanguage[TLanguageSpec] = js.native
  /**
  	 * allows to add custom primitive parsers.
  	 */
  def custom[U](
    parsingFunction: js.Function2[
      /* success */ parsimmonLib.parsimmonMod.ParsimmonNs.SuccessFunctionType[U], 
      /* failure */ parsimmonLib.parsimmonMod.ParsimmonNs.FailureFunctionType[U], 
      parsimmonLib.parsimmonMod.ParsimmonNs.ParseFunctionType[U]
    ]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U] = js.native
  /**
  	 * Returns Parsimmon.fail("fantasy-land/empty").
  	 */
  def empty(): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[scala.Nothing] = js.native
  /**
  	 * fail paring with a message
  	 */
  def fail(message: java.lang.String): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[scala.Nothing] = js.native
  /**
  	 * Takes the string passed to parser.parse(string) and the error returned from
  	 * parser.parse(string) and turns it into a human readable error message string.
  	 * Note that there are certainly better ways to format errors, so feel free to write your own.
  	 */
  def formatError[T](string: java.lang.String, error: parsimmonLib.parsimmonMod.ParsimmonNs.Result[T]): java.lang.String = js.native
  /**
  	 * Returns true if obj is a Parsimmon parser, otherwise false.
  	 */
  def isParser(obj: js.Any): /* is Parser */scala.Boolean = js.native
  def `lazy`[U](description: java.lang.String, f: js.Function0[parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U]]): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U] = js.native
  /**
  	 * accepts a function that returns a parser, which is evaluated the first time the parser is used.
  	 * This is useful for referencing parsers that haven't yet been defined.
  	 */
  def `lazy`[U](f: js.Function0[parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U]]): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U] = js.native
  /**
  	 * Parses using arg, but does not consume what it parses. Yields an empty string.
  	 */
  def lookahead(arg: java.lang.String): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[parsimmonLib.parsimmonLibStrings.Empty] = js.native
  /**
  	 * Parses using arg, but does not consume what it parses. Yields an empty string.
  	 */
  def lookahead(arg: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[_]): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[parsimmonLib.parsimmonLibStrings.Empty] = js.native
  /**
  	 * Parses using arg, but does not consume what it parses. Yields an empty string.
  	 */
  def lookahead(arg: stdLib.RegExp): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[parsimmonLib.parsimmonLibStrings.Empty] = js.native
  /**
  	 * To be used inside of Parsimmon(fn). Generates an object describing how
  	 * far the unsuccessful parse went (index), and what kind of syntax it
  	 * expected to see (expectation). See documentation for Parsimmon(fn).
  	 */
  def makeFailure(furthest: scala.Double, expectation: java.lang.String): parsimmonLib.parsimmonMod.ParsimmonNs.FailureReply = js.native
  /**
  	 * To be used inside of Parsimmon(fn). Generates an object describing how
  	 * far the unsuccessful parse went (index), and what kind of syntax it
  	 * expected to see (expectation). See documentation for Parsimmon(fn).
  	 */
  def makeFailure(furthest: scala.Double, expectation: js.Array[java.lang.String]): parsimmonLib.parsimmonMod.ParsimmonNs.FailureReply = js.native
  /**
  	 * To be used inside of Parsimmon(fn). Generates an object describing how
  	 * far the successful parse went (index), and what value it created doing
  	 * so. See documentation for Parsimmon(fn).
  	 */
  def makeSuccess[T](index: scala.Double, value: T): parsimmonLib.parsimmonMod.ParsimmonNs.SuccessReply[T] = js.native
  /**
  	 * Returns a parser that looks for exactly one character NOT from string, and yields that character.
  	 */
  def noneOf(string: java.lang.String): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * Parses using parser, but does not consume what it parses. Yields null if the parser
  	 * does not match the input. Otherwise it fails.
  	 */
  def notFollowedBy(parser: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[_]): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[scala.Null] = js.native
  /**
  	 * This is an alias for Parsimmon.succeed(result).
  	 */
  def of[U](result: U): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U] = js.native
  /**
  	 * Returns a parser that looks for exactly one character from string, and yields that character.
  	 */
  def oneOf(string: java.lang.String): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * Parsers a single character in from begin to end, inclusive.
  	 */
  def range(begin: java.lang.String, end: java.lang.String): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * This was the original name for Parsimmon.regexp, but now it is just an alias.
  	 */
  def regex(myregex: stdLib.RegExp): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * This was the original name for Parsimmon.regexp, but now it is just an alias.
  	 */
  def regex(myregex: stdLib.RegExp, group: scala.Double): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * Returns a parser that looks for a match to the regexp and yields the given match group
  	 * (defaulting to the entire match). The regexp will always match starting at the current
  	 * parse location. The regexp may only use the following flags: imu. Any other flag will
  	 * result in an error being thrown.
  	 */
  def regexp(myregex: stdLib.RegExp): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * Returns a parser that looks for a match to the regexp and yields the given match group
  	 * (defaulting to the entire match). The regexp will always match starting at the current
  	 * parse location. The regexp may only use the following flags: imu. Any other flag will
  	 * result in an error being thrown.
  	 */
  def regexp(myregex: stdLib.RegExp, group: scala.Double): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * Accepts two parsers, and expects zero or more matches for content, separated by separator, yielding an array.
  	 */
  def sepBy[T, U](
    content: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    separator: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[js.Array[T]] = js.native
  /**
  	 * This is the same as Parsimmon.sepBy, but matches the content parser at least once.
  	 */
  def sepBy1[T, U](
    content: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    separator: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[js.Array[T]] = js.native
  def seq(parsers: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[_]*): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[js.Array[_]] = js.native
  /**
  	 * accepts a variable number of parsers that it expects to find in order, yielding an array of the results.
  	 */
  def seq[T](p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T]): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[js.Array[T]] = js.native
  def seq[T, U](
    p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    p2: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[js.Tuple2[T, U]] = js.native
  def seq[T, U, V](
    p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    p2: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U],
    p3: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[V]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[js.Tuple3[T, U, V]] = js.native
  def seq[T, U, V, W](
    p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    p2: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U],
    p3: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[V],
    p4: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[W]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[js.Tuple4[T, U, V, W]] = js.native
  def seq[T, U, V, W, X](
    p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    p2: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U],
    p3: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[V],
    p4: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[W],
    p5: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[X]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[js.Tuple5[T, U, V, W, X]] = js.native
  def seq[T, U, V, W, X, Y](
    p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    p2: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U],
    p3: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[V],
    p4: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[W],
    p5: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[X],
    p6: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[Y]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[js.Tuple6[T, U, V, W, X, Y]] = js.native
  def seq[T, U, V, W, X, Y, Z](
    p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    p2: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U],
    p3: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[V],
    p4: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[W],
    p5: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[X],
    p6: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[Y],
    p7: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[Z]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[js.Tuple7[T, U, V, W, X, Y, Z]] = js.native
  /**
  	 * Matches all parsers sequentially, and passes their results as the arguments to a function.
  	 * Similar to calling Parsimmon.seq and then .map, but the values are not put in an array.
  	 */
  def seqMap[T, U](p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T], cb: js.Function1[/* a1 */ T, U]): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U] = js.native
  def seqMap[T, U, V](
    p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    p2: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U],
    cb: js.Function2[/* a1 */ T, /* a2 */ U, V]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[V] = js.native
  def seqMap[T, U, V, W](
    p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    p2: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U],
    p3: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[V],
    cb: js.Function3[/* a1 */ T, /* a2 */ U, /* a3 */ V, W]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[W] = js.native
  def seqMap[T, U, V, W, X](
    p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    p2: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U],
    p3: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[V],
    p4: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[W],
    cb: js.Function4[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, X]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[X] = js.native
  def seqMap[T, U, V, W, X, Y](
    p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    p2: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U],
    p3: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[V],
    p4: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[W],
    p5: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[X],
    cb: js.Function5[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, /* a5 */ X, Y]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[Y] = js.native
  def seqMap[T, U, V, W, X, Y, Z](
    p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    p2: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U],
    p3: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[V],
    p4: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[W],
    p5: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[X],
    p6: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[Y],
    cb: js.Function6[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, /* a5 */ X, /* a6 */ Y, Z]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[Z] = js.native
  def seqMap[T, U, V, W, X, Y, Z, A](
    p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    p2: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U],
    p3: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[V],
    p4: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[W],
    p5: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[X],
    p6: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[Y],
    p7: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[Z],
    cb: js.Function7[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, /* a5 */ X, /* a6 */ Y, /* a7 */ Z, A]
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[A] = js.native
  def seqMap[T, U, V, W, X, Y, Z, A, B](
    p1: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T],
    p2: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U],
    p3: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[V],
    p4: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[W],
    p5: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[X],
    p6: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[Y],
    p7: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[Z],
    p8: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[A],
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
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[B] = js.native
  def seqObj[T, Key /* <: java.lang.String */](
    args: ((js.Tuple2[
      Key, 
      parsimmonLib.parsimmonMod.ParsimmonNs.Parser[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(Key))) */js.Any
      ]
    ]) | parsimmonLib.parsimmonMod.ParsimmonNs.Parser[_])*
  ): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[parsimmonLib.parsimmonLibStrings.seqObj with T] = js.native
  @JSName("seq")
  def seq_T[T](parsers: parsimmonLib.parsimmonMod.ParsimmonNs.Parser[T]*): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[js.Array[T]] = js.native
  /**
  	 * is a parser that expects to find "my-string", and will yield the same.
  	 */
  def string(string: java.lang.String): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * Returns a parser that doesn't consume any of the string, and yields result.
  	 */
  def succeed[U](result: U): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[U] = js.native
  /**
  	 * Returns a parser yield a string containing all the next characters that pass the predicate
  	 */
  def takeWhile(predicate: js.Function1[/* char */ java.lang.String, scala.Boolean]): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
  /**
  	 * Returns a parser that yield a single character if it passes the predicate
  	 */
  def test(predicate: js.Function1[/* char */ java.lang.String, scala.Boolean]): parsimmonLib.parsimmonMod.ParsimmonNs.Parser[java.lang.String] = js.native
}

