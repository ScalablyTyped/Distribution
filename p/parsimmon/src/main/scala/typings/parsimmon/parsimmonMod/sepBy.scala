package typings.parsimmon.parsimmonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "sepBy")
@js.native
object sepBy extends js.Object {
  /**
  	 * Accepts two parsers, and expects zero or more matches for content, separated by separator, yielding an array.
  	 */
  def apply[T, U](content: Parser[T], separator: Parser[U]): Parser[js.Array[T]] = js.native
}

