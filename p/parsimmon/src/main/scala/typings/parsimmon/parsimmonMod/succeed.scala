package typings.parsimmon.parsimmonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "succeed")
@js.native
object succeed extends js.Object {
  /**
  	 * Returns a parser that doesn't consume any of the string, and yields result.
  	 */
  def apply[U](result: U): Parser[U] = js.native
}

