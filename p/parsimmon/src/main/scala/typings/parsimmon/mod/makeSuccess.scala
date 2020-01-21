package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "makeSuccess")
@js.native
object makeSuccess extends js.Object {
  /**
  	 * To be used inside of Parsimmon(fn). Generates an object describing how
  	 * far the successful parse went (index), and what value it created doing
  	 * so. See documentation for Parsimmon(fn).
  	 */
  def apply[T](index: Double, value: T): SuccessReply[T] = js.native
}

