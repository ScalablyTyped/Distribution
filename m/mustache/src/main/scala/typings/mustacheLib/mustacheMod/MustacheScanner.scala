package typings
package mustacheLib.mustacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple string scanner that is used by the template parser to find tokens in template strings.
  */
trait MustacheScanner extends js.Object {
  var pos: scala.Double
  var string: java.lang.String
  var tail: java.lang.String
  /**
    * Returns `true` if the tail is empty (end of string).
    */
  def eos(): scala.Boolean
  /**
    * Tries to match the given regular expression at the current position.
    *
    * @param re
    * The regex-pattern to match.
    *
    * @returns
    * The matched text if it can match, the empty string otherwise.
    */
  def scan(re: stdLib.RegExp): java.lang.String
  /**
    * Skips all text until the given regular expression can be matched.
    *
    * @param re
    * The regex-pattern to match.
    *
    * @returns
    * Returns the skipped string, which is the entire tail if no match can be made.
    */
  def scanUntil(re: stdLib.RegExp): java.lang.String
}

