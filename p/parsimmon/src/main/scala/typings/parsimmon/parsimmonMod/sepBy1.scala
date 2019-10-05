package typings.parsimmon.parsimmonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "sepBy1")
@js.native
object sepBy1 extends js.Object {
  /**
  	 * This is the same as Parsimmon.sepBy, but matches the content parser at least once.
  	 */
  def apply[T, U](content: Parser[T], separator: Parser[U]): Parser[js.Array[T]] = js.native
}

