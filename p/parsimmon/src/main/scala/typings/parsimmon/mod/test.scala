package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "test")
@js.native
object test extends js.Object {
  /**
  	 * Returns a parser that yield a single character if it passes the predicate
  	 */
  def apply(predicate: js.Function1[/* char */ String, Boolean]): Parser[String] = js.native
}

