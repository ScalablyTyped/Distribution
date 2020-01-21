package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "makeFailure")
@js.native
object makeFailure extends js.Object {
  /**
  	 * To be used inside of Parsimmon(fn). Generates an object describing how
  	 * far the unsuccessful parse went (index), and what kind of syntax it
  	 * expected to see (expectation). See documentation for Parsimmon(fn).
  	 */
  def apply(furthest: Double, expectation: String): FailureReply = js.native
  def apply(furthest: Double, expectation: js.Array[String]): FailureReply = js.native
}

