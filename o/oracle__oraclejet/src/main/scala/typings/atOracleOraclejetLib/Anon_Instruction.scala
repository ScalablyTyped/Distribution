package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Instruction extends js.Object {
  var instruction: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Instruction {
  @scala.inline
  def apply(instruction: java.lang.String = null): Anon_Instruction = {
    val __obj = js.Dynamic.literal()
    if (instruction != null) __obj.updateDynamic("instruction")(instruction)
    __obj.asInstanceOf[Anon_Instruction]
  }
}

