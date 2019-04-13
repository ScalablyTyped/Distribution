package typings
package parsimmonLib.parsimmonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	 * consumes and yields the entire remainder of the stream.
  	 */
  val all: Parser[java.lang.String] = js.native
  /**
  	 * consumes and yields the next character of the stream.
  	 */
  val any: Parser[java.lang.String] = js.native
  /**
  	 * Equivalent to Parsimmon.string("\r").
  	 *
  	 * This parser checks for the "carriage return" character, which is used as the
  	 * line terminator for classic Mac OS 9 text files.
  	 */
  val cr: Parser[java.lang.String] = js.native
  /**
  	 * Equivalent to Parsimmon.string("\r\n").
  	 *
  	 * This parser checks for the "carriage return" character followed by the "line
  	 * feed" character, which is used as the line terminator for Windows text files
  	 * and HTTP headers.
  	 */
  val crlf: Parser[java.lang.String] = js.native
  /**
  	 * is equivalent to Parsimmon.regex(/[0-9]/)
  	 */
  val digit: Parser[java.lang.String] = js.native
  /**
  	 * is equivalent to Parsimmon.regex(/[0-9]*`/)
  	 */
  val digits: Parser[java.lang.String] = js.native
  /**
  	 * Equivalent to Parsimmon.alt(Parsimmon.newline, Parsimmon.eof).
  	 *
  	 * This is the most general purpose "end of line" parser. It allows the "end of file"
  	 * in addition to all three text file line endings from Parsimmon.newline. This is
  	 * important because text files frequently do not have line terminators at the
  	 * end ("trailing newline").
  	 */
  val end: Parser[js.UndefOr[java.lang.String]] = js.native
  /**
  	 * expects the end of the stream.
  	 */
  val eof: Parser[js.UndefOr[scala.Nothing]] = js.native
  /**
  	 * is a parser that yields the current index of the parse.
  	 */
  val index: Parser[Index] = js.native
  /**
  	 * is equivalent to Parsimmon.regex(/[a-z]/i)
  	 */
  val letter: Parser[java.lang.String] = js.native
  /**
  	 * is equivalent to Parsimmon.regex(/[a-z]*`/i)
  	 */
  val letters: Parser[java.lang.String] = js.native
  /**
  	 * Equivalent to Parsimmon.string("\n").
  	 *
  	 * This parser checks for the "line feed" character, which is used as the line
  	 * terminator for Linux and macOS text files.
  	 */
  val lf: Parser[java.lang.String] = js.native
  /**
  	 * This flexible parser will match any kind of text file line ending.
  	 */
  val newline: Parser[java.lang.String] = js.native
  /**
  	 * is equivalent to Parsimmon.regex(/\s*`/)
  	 */
  val optWhitespace: Parser[java.lang.String] = js.native
  /**
  	 * is equivalent to Parsimmon.regex(/\s+/)
  	 */
  val whitespace: Parser[java.lang.String] = js.native
  def apply[T](fn: js.Function2[/* input */ java.lang.String, /* i */ scala.Double, Reply[T]]): Parser[T] = js.native
  /**
  	 * Alias of `Parsimmon(fn)` for backwards compatibility.
  	 */
  def Parser[T](fn: js.Function2[/* input */ java.lang.String, /* i */ scala.Double, Reply[T]]): parsimmonLib.parsimmonMod.Parser[T] = js.native
  def alt(parsers: Parser[_]*): Parser[_] = js.native
  /**
  	 * accepts a variable number of parsers, and yields the value of the first one that succeeds,
  	 * backtracking in between.
  	 */
  @JSName("alt")
  def alt_U[U](parsers: Parser[U]*): Parser[U] = js.native
  /**
  	 * Returns a parser that yields a byte (as a number) that matches the given input;
  	 * similar to Parsimmon.digit and Parsimmon.letter.
  	 */
  def bitSeq(alignments: js.Array[scala.Double]): Parser[js.Array[scala.Double]] = js.native
  /**
  	 * Works like Parsimmon.bitSeq except each item in the array is either a number of
  	 * bits or pair (array with length = 2) of name and bits. The bits are parsed in order
  	 * and put into an object based on the name supplied. If there's no name for the bits,
  	 * it will be parsed but discarded from the returned value.
  	 */
  def bitSeqObj[Key /* <: java.lang.String */](namedAlignments: js.Array[(js.Tuple2[Key, scala.Double]) | scala.Double]): Parser[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in Key ]: number}
    */ parsimmonLib.parsimmonLibStrings.bitSeqObj with js.Any
  ] = js.native
  /**
  	 * Returns a parser that yields a byte (as a number) that matches the given input;
  	 * similar to Parsimmon.digit and Parsimmon.letter.
  	 */
  def byte(int: scala.Double): Parser[scala.Double] = js.native
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
  def createLanguage(rules: Rule): Language = js.native
  def createLanguage[TLanguageSpec](rules: TypedRule[TLanguageSpec]): TypedLanguage[TLanguageSpec] = js.native
  /**
  	 * allows to add custom primitive parsers.
  	 */
  def custom[U](
    parsingFunction: js.Function2[
      /* success */ SuccessFunctionType[U], 
      /* failure */ FailureFunctionType[U], 
      ParseFunctionType[U]
    ]
  ): Parser[U] = js.native
  /**
  	 * Returns Parsimmon.fail("fantasy-land/empty").
  	 */
  def empty(): Parser[scala.Nothing] = js.native
  /**
  	 * fail paring with a message
  	 */
  def fail(message: java.lang.String): Parser[scala.Nothing] = js.native
  /**
  	 * Takes the string passed to parser.parse(string) and the error returned from
  	 * parser.parse(string) and turns it into a human readable error message string.
  	 * Note that there are certainly better ways to format errors, so feel free to write your own.
  	 */
  def formatError[T](string: java.lang.String, error: Result[T]): java.lang.String = js.native
  /**
  	 * Returns true if obj is a Parsimmon parser, otherwise false.
  	 */
  def isParser(obj: js.Any): /* is parsimmon.parsimmon.Parser<any> */ scala.Boolean = js.native
  def `lazy`[U](description: java.lang.String, f: js.Function0[Parser[U]]): Parser[U] = js.native
  /**
  	 * accepts a function that returns a parser, which is evaluated the first time the parser is used.
  	 * This is useful for referencing parsers that haven't yet been defined.
  	 */
  def `lazy`[U](f: js.Function0[Parser[U]]): Parser[U] = js.native
  def lookahead(arg: java.lang.String): Parser[parsimmonLib.parsimmonLibStrings.Empty] = js.native
  /**
  	 * Parses using arg, but does not consume what it parses. Yields an empty string.
  	 */
  def lookahead(arg: Parser[_]): Parser[parsimmonLib.parsimmonLibStrings.Empty] = js.native
  def lookahead(arg: stdLib.RegExp): Parser[parsimmonLib.parsimmonLibStrings.Empty] = js.native
  /**
  	 * To be used inside of Parsimmon(fn). Generates an object describing how
  	 * far the unsuccessful parse went (index), and what kind of syntax it
  	 * expected to see (expectation). See documentation for Parsimmon(fn).
  	 */
  def makeFailure(furthest: scala.Double, expectation: java.lang.String): FailureReply = js.native
  def makeFailure(furthest: scala.Double, expectation: js.Array[java.lang.String]): FailureReply = js.native
  /**
  	 * To be used inside of Parsimmon(fn). Generates an object describing how
  	 * far the successful parse went (index), and what value it created doing
  	 * so. See documentation for Parsimmon(fn).
  	 */
  def makeSuccess[T](index: scala.Double, value: T): SuccessReply[T] = js.native
  /**
  	 * Returns a parser that looks for exactly one character NOT from string, and yields that character.
  	 */
  def noneOf(string: java.lang.String): Parser[java.lang.String] = js.native
  /**
  	 * Parses using parser, but does not consume what it parses. Yields null if the parser
  	 * does not match the input. Otherwise it fails.
  	 */
  def notFollowedBy(parser: Parser[_]): Parser[scala.Null] = js.native
  /**
  	 * This is an alias for Parsimmon.succeed(result).
  	 */
  def of[U](result: U): Parser[U] = js.native
  /**
  	 * Returns a parser that looks for exactly one character from string, and yields that character.
  	 */
  def oneOf(string: java.lang.String): Parser[java.lang.String] = js.native
  /**
  	 * Parsers a single character in from begin to end, inclusive.
  	 */
  def range(begin: java.lang.String, end: java.lang.String): Parser[java.lang.String] = js.native
  /**
  	 * This was the original name for Parsimmon.regexp, but now it is just an alias.
  	 */
  def regex(myregex: stdLib.RegExp): Parser[java.lang.String] = js.native
  def regex(myregex: stdLib.RegExp, group: scala.Double): Parser[java.lang.String] = js.native
  /**
  	 * Returns a parser that looks for a match to the regexp and yields the given match group
  	 * (defaulting to the entire match). The regexp will always match starting at the current
  	 * parse location. The regexp may only use the following flags: imu. Any other flag will
  	 * result in an error being thrown.
  	 */
  def regexp(myregex: stdLib.RegExp): Parser[java.lang.String] = js.native
  def regexp(myregex: stdLib.RegExp, group: scala.Double): Parser[java.lang.String] = js.native
  /**
  	 * Accepts two parsers, and expects zero or more matches for content, separated by separator, yielding an array.
  	 */
  def sepBy[T, U](content: Parser[T], separator: Parser[U]): Parser[js.Array[T]] = js.native
  /**
  	 * This is the same as Parsimmon.sepBy, but matches the content parser at least once.
  	 */
  def sepBy1[T, U](content: Parser[T], separator: Parser[U]): Parser[js.Array[T]] = js.native
  def seq(parsers: Parser[_]*): Parser[js.Array[_]] = js.native
  /**
  	 * accepts a variable number of parsers that it expects to find in order, yielding an array of the results.
  	 */
  def seq[T](p1: Parser[T]): Parser[js.Array[T]] = js.native
  def seq[T, U](p1: Parser[T], p2: Parser[U]): Parser[js.Tuple2[T, U]] = js.native
  def seq[T, U, V](p1: Parser[T], p2: Parser[U], p3: Parser[V]): Parser[js.Tuple3[T, U, V]] = js.native
  def seq[T, U, V, W](p1: Parser[T], p2: Parser[U], p3: Parser[V], p4: Parser[W]): Parser[js.Tuple4[T, U, V, W]] = js.native
  def seq[T, U, V, W, X](p1: Parser[T], p2: Parser[U], p3: Parser[V], p4: Parser[W], p5: Parser[X]): Parser[js.Tuple5[T, U, V, W, X]] = js.native
  def seq[T, U, V, W, X, Y](p1: Parser[T], p2: Parser[U], p3: Parser[V], p4: Parser[W], p5: Parser[X], p6: Parser[Y]): Parser[js.Tuple6[T, U, V, W, X, Y]] = js.native
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
  def seqMap[T, U](p1: Parser[T], cb: js.Function1[/* a1 */ T, U]): Parser[U] = js.native
  def seqMap[T, U, V](p1: Parser[T], p2: Parser[U], cb: js.Function2[/* a1 */ T, /* a2 */ U, V]): Parser[V] = js.native
  def seqMap[T, U, V, W](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    cb: js.Function3[/* a1 */ T, /* a2 */ U, /* a3 */ V, W]
  ): Parser[W] = js.native
  def seqMap[T, U, V, W, X](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    cb: js.Function4[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, X]
  ): Parser[X] = js.native
  def seqMap[T, U, V, W, X, Y](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    cb: js.Function5[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, /* a5 */ X, Y]
  ): Parser[Y] = js.native
  def seqMap[T, U, V, W, X, Y, Z](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    p6: Parser[Y],
    cb: js.Function6[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, /* a5 */ X, /* a6 */ Y, Z]
  ): Parser[Z] = js.native
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
  def seqObj[T, Key /* <: java.lang.String */](
    args: ((js.Tuple2[
      Key, 
      Parser[/* import warning: ImportType.apply Failed type conversion: T[Key] */ js.Any]
    ]) | Parser[_])*
  ): Parser[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in Key ]: T[K]}
    */ parsimmonLib.parsimmonLibStrings.seqObj with T
  ] = js.native
  @JSName("seq")
  def seq_T[T](parsers: Parser[T]*): Parser[js.Array[T]] = js.native
  /**
  	 * is a parser that expects to find "my-string", and will yield the same.
  	 */
  def string(string: java.lang.String): Parser[java.lang.String] = js.native
  /**
  	 * Returns a parser that doesn't consume any of the string, and yields result.
  	 */
  def succeed[U](result: U): Parser[U] = js.native
  /**
  	 * Returns a parser yield a string containing all the next characters that pass the predicate
  	 */
  def takeWhile(predicate: js.Function1[/* char */ java.lang.String, scala.Boolean]): Parser[java.lang.String] = js.native
  /**
  	 * Returns a parser that yield a single character if it passes the predicate
  	 */
  def test(predicate: js.Function1[/* char */ java.lang.String, scala.Boolean]): Parser[java.lang.String] = js.native
}

