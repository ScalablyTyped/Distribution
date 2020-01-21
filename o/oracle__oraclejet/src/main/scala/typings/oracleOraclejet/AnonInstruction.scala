package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInstruction extends js.Object {
  var instruction: js.UndefOr[String] = js.undefined
}

object AnonInstruction {
  @scala.inline
  def apply(instruction: String = null): AnonInstruction = {
    val __obj = js.Dynamic.literal()
    if (instruction != null) __obj.updateDynamic("instruction")(instruction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInstruction]
  }
}

