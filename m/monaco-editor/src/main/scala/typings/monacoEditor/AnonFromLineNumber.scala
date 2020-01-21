package typings.monacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromLineNumber extends js.Object {
  /**
    * The start of the range (inclusive)
    */
  val fromLineNumber: Double
  /**
    * The end of the range (inclusive)
    */
  val toLineNumber: Double
}

object AnonFromLineNumber {
  @scala.inline
  def apply(fromLineNumber: Double, toLineNumber: Double): AnonFromLineNumber = {
    val __obj = js.Dynamic.literal(fromLineNumber = fromLineNumber.asInstanceOf[js.Any], toLineNumber = toLineNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFromLineNumber]
  }
}

