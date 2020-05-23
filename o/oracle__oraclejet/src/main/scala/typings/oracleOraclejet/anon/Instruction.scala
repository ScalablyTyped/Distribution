package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instruction extends js.Object {
  var instruction: js.UndefOr[String] = js.undefined
}

object Instruction {
  @scala.inline
  def apply(instruction: String = null): Instruction = {
    val __obj = js.Dynamic.literal()
    if (instruction != null) __obj.updateDynamic("instruction")(instruction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instruction]
  }
}

