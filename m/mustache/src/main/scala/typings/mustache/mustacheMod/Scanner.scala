package typings.mustache.mustacheMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple string scanner that is used by the template parser to find tokens in template strings.
  */
@JSImport("mustache", "Scanner")
@js.native
class Scanner protected () extends MustacheScanner {
  /**
    * Initializes a new instance of the `MustacheScanner` class.
    */
  def this(string: String) = this()
  /* CompleteClass */
  override var pos: Double = js.native
  /* CompleteClass */
  override var string: String = js.native
  /* CompleteClass */
  override var tail: String = js.native
  /**
    * Returns `true` if the tail is empty (end of string).
    */
  /* CompleteClass */
  override def eos(): Boolean = js.native
  /**
    * Tries to match the given regular expression at the current position.
    *
    * @param re
    * The regex-pattern to match.
    *
    * @returns
    * The matched text if it can match, the empty string otherwise.
    */
  /* CompleteClass */
  override def scan(re: RegExp): String = js.native
  /**
    * Skips all text until the given regular expression can be matched.
    *
    * @param re
    * The regex-pattern to match.
    *
    * @returns
    * Returns the skipped string, which is the entire tail if no match can be made.
    */
  /* CompleteClass */
  override def scanUntil(re: RegExp): String = js.native
}

