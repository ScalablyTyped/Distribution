package typings.mustache.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple string scanner that is used by the template parser to find tokens in template strings.
  */
trait MustacheScanner extends js.Object {
  var pos: Double
  var string: String
  var tail: String
  /**
    * Returns `true` if the tail is empty (end of string).
    */
  def eos(): Boolean
  /**
    * Tries to match the given regular expression at the current position.
    *
    * @param re
    * The regex-pattern to match.
    *
    * @returns
    * The matched text if it can match, the empty string otherwise.
    */
  def scan(re: RegExp): String
  /**
    * Skips all text until the given regular expression can be matched.
    *
    * @param re
    * The regex-pattern to match.
    *
    * @returns
    * Returns the skipped string, which is the entire tail if no match can be made.
    */
  def scanUntil(re: RegExp): String
}

object MustacheScanner {
  @scala.inline
  def apply(
    eos: () => Boolean,
    pos: Double,
    scan: RegExp => String,
    scanUntil: RegExp => String,
    string: String,
    tail: String
  ): MustacheScanner = {
    val __obj = js.Dynamic.literal(eos = js.Any.fromFunction0(eos), pos = pos.asInstanceOf[js.Any], scan = js.Any.fromFunction1(scan), scanUntil = js.Any.fromFunction1(scanUntil), string = string.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any])
    __obj.asInstanceOf[MustacheScanner]
  }
}

