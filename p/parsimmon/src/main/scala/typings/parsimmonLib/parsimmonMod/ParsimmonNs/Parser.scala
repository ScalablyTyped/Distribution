package typings
package parsimmonLib.parsimmonMod.ParsimmonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser[T] extends js.Object {
  /**
  		 * Takes parser which returns a function and applies it to the parsed value of otherParser.
  		 */
  def ap[U](otherParser: Parser[js.Function1[/* t */ T, U]]): Parser[U] = js.native
  /**
  		 * expects parser at least n times. Yields an array of the results.
  		 */
  def atLeast(n: scala.Double): Parser[js.Array[T]] = js.native
  /**
  		 * expects parser at most n times. Yields an array of the results.
  		 */
  def atMost(n: scala.Double): Parser[js.Array[T]] = js.native
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
  def desc(description: java.lang.String): Parser[T] = js.native
  def desc(description: js.Array[java.lang.String]): Parser[T] = js.native
  // Fantasy land support
  /**
  		 * Returns Parsimmon.fail("fantasy-land/empty").
  		 */
  def empty(): Parser[scala.Nothing] = js.native
  /**
  		 * returns a new parser that returns the fallback value if the first parser failed.
  		 */
  def fallback[U](fallbackValue: U): Parser[T | U] = js.native
  def lookahead(arg: java.lang.String): Parser[T] = js.native
  /**
  		 * Returns a parser that looks for whatever arg wants to parse, but does not
  		 * consume it. Yields the same result as parser. Equivalent to
  		 * parser.skip(Parsimmon.lookahead(anotherParser)).
  		 */
  def lookahead(arg: Parser[_]): Parser[T] = js.native
  def lookahead(arg: stdLib.RegExp): Parser[T] = js.native
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
  def node[Name /* <: java.lang.String */](name: Name): Parser[Node[Name, T]] = js.native
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
  def parse(input: java.lang.String): Result[T] = js.native
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
  // tslint:disable-next-line:unified-signatures
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
  def tie(): Parser[java.lang.String] = js.native
  /**
  		 * When called on a parser yielding an array of strings, yields all their strings
  		 * concatenated with the separator. Asserts that its input is actually an array of strings.
  		 */
  def tieWith(join: java.lang.String): Parser[java.lang.String] = js.native
  /**
  		 * expects parser between min and max times, and yields an array of the results.
  		 */
  // tslint:disable-next-line:unified-signatures
  def times(min: scala.Double, max: scala.Double): Parser[js.Array[T]] = js.native
  /**
  		 * expects parser exactly n times, and yields an array of the results.
  		 */
  def times(n: scala.Double): Parser[js.Array[T]] = js.native
  /**
  		 * expects anotherParser before and after parser, yielding the result of parser
  		 */
  def trim[U](anotherParser: Parser[U]): Parser[T] = js.native
  /**
  		 * Like parser.parse(input) but either returns the parsed value or throws
  		 * an error on failure. The error object contains additional properties
  		 * about the error.
  		 */
  def tryParse(input: java.lang.String): T = js.native
  /**
  		 * Expects the parser before before parser and after after parser.
  		 */
  def wrap(before: Parser[_], after: Parser[_]): Parser[T] = js.native
}

