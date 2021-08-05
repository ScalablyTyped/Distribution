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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](fn: js.Function2[/* input */ String, /* i */ Double, Reply[T]]): Parser[T] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Parser[T]]
  
  @JSImport("parsimmon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    def lookahead(arg: Parser[js.Any]): Parser[T] = js.native
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
    def notFollowedBy(anotherParser: Parser[js.Any]): Parser[T] = js.native
    
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
    def wrap(before: Parser[js.Any], after: Parser[js.Any]): Parser[T] = js.native
  }
  object Parser {
    
    /**
      * Alias of `Parsimmon(fn)` for backwards compatibility.
      */
    @JSImport("parsimmon", "Parser")
    @js.native
    def apply[T](fn: js.Function2[/* input */ String, /* i */ Double, Reply[T]]): Parser[T] = js.native
  }
  
  /**
    * consumes and yields the entire remainder of the stream.
    */
  @JSImport("parsimmon", "all")
  @js.native
  val all: Parser[String] = js.native
  
  inline def alt(parsers: Parser[js.Any]*): Parser[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(parsers.asInstanceOf[js.Any]).asInstanceOf[Parser[js.Any]]
  
  /**
    * accepts a variable number of parsers, and yields the value of the first one that succeeds,
    * backtracking in between.
    */
  inline def alt_U[U](parsers: Parser[U]*): Parser[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(parsers.asInstanceOf[js.Any]).asInstanceOf[Parser[U]]
  
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
  inline def bitSeq(alignments: js.Array[Double]): Parser[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bitSeq")(alignments.asInstanceOf[js.Any]).asInstanceOf[Parser[js.Array[Double]]]
  
  /**
    * Works like Parsimmon.bitSeq except each item in the array is either a number of
    * bits or pair (array with length = 2) of name and bits. The bits are parsed in order
    * and put into an object based on the name supplied. If there's no name for the bits,
    * it will be parsed but discarded from the returned value.
    */
  inline def bitSeqObj[Key /* <: String */](namedAlignments: js.Array[(js.Tuple2[Key, Double]) | Double]): Parser[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: number}
    */ typings.parsimmon.parsimmonStrings.bitSeqObj & TopLevel[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bitSeqObj")(namedAlignments.asInstanceOf[js.Any]).asInstanceOf[Parser[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: number}
    */ typings.parsimmon.parsimmonStrings.bitSeqObj & TopLevel[js.Any]
  ]]
  
  /**
    * Returns a parser that yields a byte (as a number) that matches the given input;
    * similar to Parsimmon.digit and Parsimmon.letter.
    */
  inline def byte(int: Double): Parser[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("byte")(int.asInstanceOf[js.Any]).asInstanceOf[Parser[Double]]
  
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
  inline def createLanguage(rules: Rule): Language = ^.asInstanceOf[js.Dynamic].applyDynamic("createLanguage")(rules.asInstanceOf[js.Any]).asInstanceOf[Language]
  inline def createLanguage[TLanguageSpec](rules: TypedRule[TLanguageSpec]): TypedLanguage[TLanguageSpec] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLanguage")(rules.asInstanceOf[js.Any]).asInstanceOf[TypedLanguage[TLanguageSpec]]
  
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
  inline def custom[U](
    parsingFunction: js.Function2[
      /* success */ SuccessFunctionType[U], 
      /* failure */ FailureFunctionType[U], 
      ParseFunctionType[U]
    ]
  ): Parser[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("custom")(parsingFunction.asInstanceOf[js.Any]).asInstanceOf[Parser[U]]
  
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
  inline def empty(): Parser[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Parser[scala.Nothing]]
  
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
  val eof: Parser[Unit] = js.native
  
  /**
    * fail paring with a message
    */
  inline def fail(message: String): Parser[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[Parser[scala.Nothing]]
  
  /**
    * Takes the string passed to parser.parse(string) and the error returned from
    * parser.parse(string) and turns it into a human readable error message string.
    * Note that there are certainly better ways to format errors, so feel free to write your own.
    */
  inline def formatError[T](string: String, error: Result[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(string.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * is a parser that yields the current index of the parse.
    */
  @JSImport("parsimmon", "index")
  @js.native
  val index: Parser[Index_] = js.native
  
  /**
    * Returns true if obj is a Parsimmon parser, otherwise false.
    */
  inline def isParser(obj: js.Any): /* is parsimmon.parsimmon.Parser<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParser")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is parsimmon.parsimmon.Parser<any> */ Boolean]
  
  inline def `lazy`[U](description: String, f: js.Function0[Parser[U]]): Parser[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(description.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Parser[U]]
  /**
    * accepts a function that returns a parser, which is evaluated the first time the parser is used.
    * This is useful for referencing parsers that haven't yet been defined.
    */
  inline def `lazy`[U](f: js.Function0[Parser[U]]): Parser[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(f.asInstanceOf[js.Any]).asInstanceOf[Parser[U]]
  
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
  
  inline def lookahead(arg: String): Parser[_empty] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookahead")(arg.asInstanceOf[js.Any]).asInstanceOf[Parser[_empty]]
  /**
    * Parses using arg, but does not consume what it parses. Yields an empty string.
    */
  inline def lookahead(arg: Parser[js.Any]): Parser[_empty] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookahead")(arg.asInstanceOf[js.Any]).asInstanceOf[Parser[_empty]]
  inline def lookahead(arg: RegExp): Parser[_empty] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookahead")(arg.asInstanceOf[js.Any]).asInstanceOf[Parser[_empty]]
  
  /**
    * To be used inside of Parsimmon(fn). Generates an object describing how
    * far the unsuccessful parse went (index), and what kind of syntax it
    * expected to see (expectation). See documentation for Parsimmon(fn).
    */
  inline def makeFailure(furthest: Double, expectation: String): FailureReply = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFailure")(furthest.asInstanceOf[js.Any], expectation.asInstanceOf[js.Any])).asInstanceOf[FailureReply]
  inline def makeFailure(furthest: Double, expectation: js.Array[String]): FailureReply = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFailure")(furthest.asInstanceOf[js.Any], expectation.asInstanceOf[js.Any])).asInstanceOf[FailureReply]
  
  /**
    * To be used inside of Parsimmon(fn). Generates an object describing how
    * far the successful parse went (index), and what value it created doing
    * so. See documentation for Parsimmon(fn).
    */
  inline def makeSuccess[T](index: Double, value: T): SuccessReply[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSuccess")(index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[SuccessReply[T]]
  
  /**
    * This flexible parser will match any kind of text file line ending.
    */
  @JSImport("parsimmon", "newline")
  @js.native
  val newline: Parser[String] = js.native
  
  /**
    * Returns a parser that looks for exactly one character NOT from string, and yields that character.
    */
  inline def noneOf(string: String): Parser[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("noneOf")(string.asInstanceOf[js.Any]).asInstanceOf[Parser[String]]
  
  /**
    * Parses using parser, but does not consume what it parses. Yields null if the parser
    * does not match the input. Otherwise it fails.
    */
  inline def notFollowedBy(parser: Parser[js.Any]): Parser[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("notFollowedBy")(parser.asInstanceOf[js.Any]).asInstanceOf[Parser[Null]]
  
  /**
    * This is an alias for Parsimmon.succeed(result).
    */
  inline def of[U](result: U): Parser[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(result.asInstanceOf[js.Any]).asInstanceOf[Parser[U]]
  
  /**
    * Returns a parser that looks for exactly one character from string, and yields that character.
    */
  inline def oneOf(string: String): Parser[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(string.asInstanceOf[js.Any]).asInstanceOf[Parser[String]]
  
  /**
    * is equivalent to Parsimmon.regex(/\s*`/)
    */
  @JSImport("parsimmon", "optWhitespace")
  @js.native
  val optWhitespace: Parser[String] = js.native
  
  /**
    * Parsers a single character in from begin to end, inclusive.
    */
  inline def range(begin: String, end: String): Parser[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Parser[String]]
  
  /**
    * This was the original name for Parsimmon.regexp, but now it is just an alias.
    */
  inline def regex(myregex: RegExp): Parser[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("regex")(myregex.asInstanceOf[js.Any]).asInstanceOf[Parser[String]]
  inline def regex(myregex: RegExp, group: Double): Parser[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("regex")(myregex.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[Parser[String]]
  
  /**
    * Returns a parser that looks for a match to the regexp and yields the given match group
    * (defaulting to the entire match). The regexp will always match starting at the current
    * parse location. The regexp may only use the following flags: imu. Any other flag will
    * result in an error being thrown.
    */
  inline def regexp(myregex: RegExp): Parser[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("regexp")(myregex.asInstanceOf[js.Any]).asInstanceOf[Parser[String]]
  inline def regexp(myregex: RegExp, group: Double): Parser[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("regexp")(myregex.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[Parser[String]]
  
  /**
    * Accepts two parsers, and expects zero or more matches for content, separated by separator, yielding an array.
    */
  inline def sepBy[T, U](content: Parser[T], separator: Parser[U]): Parser[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sepBy")(content.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Parser[js.Array[T]]]
  
  /**
    * This is the same as Parsimmon.sepBy, but matches the content parser at least once.
    */
  inline def sepBy1[T, U](content: Parser[T], separator: Parser[U]): Parser[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("sepBy1")(content.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Parser[js.Array[T]]]
  
  /**
    * accepts a variable number of parsers that it expects to find in order, yielding an array of the results.
    */
  inline def seq[T](p1: Parser[T]): Parser[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("seq")(p1.asInstanceOf[js.Any]).asInstanceOf[Parser[js.Array[T]]]
  inline def seq[T /* <: js.Array[js.Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param parsers because its type T is not an array type */ parsers: T
  ): Parser[UnParser[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("seq")(parsers.asInstanceOf[js.Any]).asInstanceOf[Parser[UnParser[T]]]
  inline def seq[T](parsers: Parser[T]*): Parser[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("seq")(parsers.asInstanceOf[js.Any]).asInstanceOf[Parser[js.Array[T]]]
  inline def seq[T, U](p1: Parser[T], p2: Parser[U]): Parser[js.Tuple2[T, U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Parser[js.Tuple2[T, U]]]
  inline def seq[T, U, V](p1: Parser[T], p2: Parser[U], p3: Parser[V]): Parser[js.Tuple3[T, U, V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Parser[js.Tuple3[T, U, V]]]
  inline def seq[T, U, V, W](p1: Parser[T], p2: Parser[U], p3: Parser[V], p4: Parser[W]): Parser[js.Tuple4[T, U, V, W]] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any])).asInstanceOf[Parser[js.Tuple4[T, U, V, W]]]
  inline def seq[T, U, V, W, X](p1: Parser[T], p2: Parser[U], p3: Parser[V], p4: Parser[W], p5: Parser[X]): Parser[js.Tuple5[T, U, V, W, X]] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Parser[js.Tuple5[T, U, V, W, X]]]
  inline def seq[T, U, V, W, X, Y](p1: Parser[T], p2: Parser[U], p3: Parser[V], p4: Parser[W], p5: Parser[X], p6: Parser[Y]): Parser[js.Tuple6[T, U, V, W, X, Y]] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any], p6.asInstanceOf[js.Any])).asInstanceOf[Parser[js.Tuple6[T, U, V, W, X, Y]]]
  inline def seq[T, U, V, W, X, Y, Z](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    p6: Parser[Y],
    p7: Parser[Z]
  ): Parser[js.Tuple7[T, U, V, W, X, Y, Z]] = (^.asInstanceOf[js.Dynamic].applyDynamic("seq")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any], p6.asInstanceOf[js.Any], p7.asInstanceOf[js.Any])).asInstanceOf[Parser[js.Tuple7[T, U, V, W, X, Y, Z]]]
  
  /**
    * Matches all parsers sequentially, and passes their results as the arguments to a function.
    * Similar to calling Parsimmon.seq and then .map, but the values are not put in an array.
    */
  inline def seqMap[T, U](p1: Parser[T], cb: js.Function1[/* a1 */ T, U]): Parser[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("seqMap")(p1.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Parser[U]]
  inline def seqMap[T, U, V](p1: Parser[T], p2: Parser[U], cb: js.Function2[/* a1 */ T, /* a2 */ U, V]): Parser[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("seqMap")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Parser[V]]
  inline def seqMap[T, U, V, W](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    cb: js.Function3[/* a1 */ T, /* a2 */ U, /* a3 */ V, W]
  ): Parser[W] = (^.asInstanceOf[js.Dynamic].applyDynamic("seqMap")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Parser[W]]
  inline def seqMap[T, U, V, W, X](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    cb: js.Function4[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, X]
  ): Parser[X] = (^.asInstanceOf[js.Dynamic].applyDynamic("seqMap")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Parser[X]]
  inline def seqMap[T, U, V, W, X, Y](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    cb: js.Function5[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, /* a5 */ X, Y]
  ): Parser[Y] = (^.asInstanceOf[js.Dynamic].applyDynamic("seqMap")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Parser[Y]]
  inline def seqMap[T, U, V, W, X, Y, Z](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    p6: Parser[Y],
    cb: js.Function6[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, /* a5 */ X, /* a6 */ Y, Z]
  ): Parser[Z] = (^.asInstanceOf[js.Dynamic].applyDynamic("seqMap")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any], p6.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Parser[Z]]
  inline def seqMap[T, U, V, W, X, Y, Z, A](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    p6: Parser[Y],
    p7: Parser[Z],
    cb: js.Function7[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, /* a5 */ X, /* a6 */ Y, /* a7 */ Z, A]
  ): Parser[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("seqMap")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any], p6.asInstanceOf[js.Any], p7.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Parser[A]]
  inline def seqMap[T, U, V, W, X, Y, Z, A, B](
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
  ): Parser[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("seqMap")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any], p6.asInstanceOf[js.Any], p7.asInstanceOf[js.Any], p8.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Parser[B]]
  inline def seqMap[T, U, V, W, X, Y, Z, A, B, C](
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
  ): Parser[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("seqMap")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any], p6.asInstanceOf[js.Any], p7.asInstanceOf[js.Any], p8.asInstanceOf[js.Any], p9.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Parser[C]]
  inline def seqMap[T, U, V, W, X, Y, Z, A, B, C, D](
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
  ): Parser[D] = (^.asInstanceOf[js.Dynamic].applyDynamic("seqMap")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any], p6.asInstanceOf[js.Any], p7.asInstanceOf[js.Any], p8.asInstanceOf[js.Any], p9.asInstanceOf[js.Any], p10.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Parser[D]]
  
  inline def seqObj[T, Key /* <: /* keyof T */ String */](
    args: ((js.Tuple2[
      Key, 
      Parser[
        /* import warning: importer.ImportType#apply Failed type conversion: T[Key] */ js.Any
      ]
    ]) | Parser[js.Any])*
  ): Parser[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: T[K]}
    */ typings.parsimmon.parsimmonStrings.seqObj & TopLevel[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("seqObj")(args.asInstanceOf[js.Any]).asInstanceOf[Parser[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Key ]: T[K]}
    */ typings.parsimmon.parsimmonStrings.seqObj & TopLevel[T]
  ]]
  
  /**
    * is a parser that expects to find "my-string", and will yield the same.
    */
  inline def string(string: String): Parser[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(string.asInstanceOf[js.Any]).asInstanceOf[Parser[String]]
  
  /**
    * Returns a parser that doesn't consume any of the string, and yields result.
    */
  inline def succeed[U](result: U): Parser[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("succeed")(result.asInstanceOf[js.Any]).asInstanceOf[Parser[U]]
  
  /**
    * Returns a parser yield a string containing all the next characters that pass the predicate
    */
  inline def takeWhile(predicate: js.Function1[/* char */ String, Boolean]): Parser[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[Parser[String]]
  
  /**
    * Returns a parser that yield a single character if it passes the predicate
    */
  inline def test(predicate: js.Function1[/* char */ String, Boolean]): Parser[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(predicate.asInstanceOf[js.Any]).asInstanceOf[Parser[String]]
  
  /**
    * is equivalent to Parsimmon.regex(/\s+/)
    */
  @JSImport("parsimmon", "whitespace")
  @js.native
  val whitespace: Parser[String] = js.native
  
  trait Failure
    extends StObject
       with Result[js.Any] {
    
    var expected: js.Array[String]
    
    var index: Index_
    
    var status: `false`
  }
  object Failure {
    
    inline def apply(expected: js.Array[String], index: Index_): Failure = {
      val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = false)
      __obj.asInstanceOf[Failure]
    }
    
    extension [Self <: Failure](x: Self) {
      
      inline def setExpected(value: js.Array[String]): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedVarargs(value: String*): Self = StObject.set(x, "expected", js.Array(value :_*))
      
      inline def setIndex(value: Index_): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: `false`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type FailureFunctionType[U] = js.Function2[/* index */ Double, /* msg */ String, Reply[U]]
  
  trait FailureReply
    extends StObject
       with Reply[js.Any] {
    
    var expected: js.Array[String]
    
    var furthest: Double
    
    var index: `-1`
    
    var status: `false`
    
    var value: Null
  }
  object FailureReply {
    
    inline def apply(expected: js.Array[String], furthest: Double, value: Null): FailureReply = {
      val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], furthest = furthest.asInstanceOf[js.Any], index = -1, status = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FailureReply]
    }
    
    extension [Self <: FailureReply](x: Self) {
      
      inline def setExpected(value: js.Array[String]): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedVarargs(value: String*): Self = StObject.set(x, "expected", js.Array(value :_*))
      
      inline def setFurthest(value: Double): Self = StObject.set(x, "furthest", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: `-1`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: `false`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Null): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index_ extends StObject {
    
    /** one-based column offset */
    var column: Double
    
    /** one-based line offset */
    var line: Double
    
    /** zero-based character offset */
    var offset: Double
  }
  object Index_ {
    
    inline def apply(column: Double, line: Double, offset: Double): Index_ = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index_]
    }
    
    extension [Self <: Index_](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  type Language = StringDictionary[Parser[js.Any]]
  
  trait Mark[T] extends StObject {
    
    var end: Index_
    
    var start: Index_
    
    var value: T
  }
  object Mark {
    
    inline def apply[T](end: Index_, start: Index_, value: T): Mark[T] = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mark[T]]
    }
    
    extension [Self <: Mark[?], T](x: Self & Mark[T]) {
      
      inline def setEnd(value: Index_): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Index_): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node[Name /* <: String */, T]
    extends StObject
       with Mark[T] {
    
    var name: Name
  }
  object Node {
    
    inline def apply[Name /* <: String */, T](end: Index_, name: Name, start: Index_, value: T): Node[Name, T] = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node[Name, T]]
    }
    
    extension [Self <: Node[?, ?], Name /* <: String */, T](x: Self & (Node[Name, T])) {
      
      inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ParseFunctionType[U] = js.Function2[/* stream */ StreamType, /* index */ Double, Reply[U]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.parsimmon.mod.SuccessReply[T]
    - typings.parsimmon.mod.FailureReply
  */
  trait Reply[T] extends StObject
  object Reply {
    
    inline def FailureReply(expected: js.Array[String], furthest: Double, value: Null): typings.parsimmon.mod.FailureReply = {
      val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], furthest = furthest.asInstanceOf[js.Any], index = -1, status = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parsimmon.mod.FailureReply]
    }
    
    inline def SuccessReply[T](expected: js.Array[String], index: Double, value: T): typings.parsimmon.mod.SuccessReply[T] = {
      val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], furthest = -1, index = index.asInstanceOf[js.Any], status = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parsimmon.mod.SuccessReply[T]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parsimmon.mod.Success[T]
    - typings.parsimmon.mod.Failure
  */
  trait Result[T] extends StObject
  object Result {
    
    inline def Failure(expected: js.Array[String], index: Index_): typings.parsimmon.mod.Failure = {
      val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = false)
      __obj.asInstanceOf[typings.parsimmon.mod.Failure]
    }
    
    inline def Success[T](value: T): typings.parsimmon.mod.Success[T] = {
      val __obj = js.Dynamic.literal(status = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parsimmon.mod.Success[T]]
    }
  }
  
  type Rule = StringDictionary[js.Function1[/* r */ Language, Parser[js.Any]]]
  
  type StreamType = String
  
  trait Success[T]
    extends StObject
       with Result[T] {
    
    var status: `true`
    
    var value: T
  }
  object Success {
    
    inline def apply[T](value: T): Success[T] = {
      val __obj = js.Dynamic.literal(status = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Success[T]]
    }
    
    extension [Self <: Success[?], T](x: Self & Success[T]) {
      
      inline def setStatus(value: `true`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SuccessFunctionType[U] = js.Function2[/* index */ Double, /* result */ U, Reply[U]]
  
  trait SuccessReply[T]
    extends StObject
       with Reply[T] {
    
    var expected: js.Array[String]
    
    var furthest: `-1`
    
    var index: Double
    
    var status: `true`
    
    var value: T
  }
  object SuccessReply {
    
    inline def apply[T](expected: js.Array[String], index: Double, value: T): SuccessReply[T] = {
      val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], furthest = -1, index = index.asInstanceOf[js.Any], status = true, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessReply[T]]
    }
    
    extension [Self <: SuccessReply[?], T](x: Self & SuccessReply[T]) {
      
      inline def setExpected(value: js.Array[String]): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedVarargs(value: String*): Self = StObject.set(x, "expected", js.Array(value :_*))
      
      inline def setFurthest(value: `-1`): Self = StObject.set(x, "furthest", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: `true`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TypedLanguage[TLanguageSpec] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TLanguageSpec ]: parsimmon.parsimmon.Parser<TLanguageSpec[P]>}
    */ typings.parsimmon.parsimmonStrings.TypedLanguage & TopLevel[TLanguageSpec]
  
  type TypedRule[TLanguageSpec] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TLanguageSpec ]: (r : parsimmon.parsimmon.TypedLanguage<TLanguageSpec>): parsimmon.parsimmon.Parser<TLanguageSpec[P]>}
    */ typings.parsimmon.parsimmonStrings.TypedRule & TopLevel[TLanguageSpec]
  
  type UnParser[T] = js.Any
}
