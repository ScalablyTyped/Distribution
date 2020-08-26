package typings.nivoColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatumColorInstruction
  extends _OrdinalColorsInstruction[js.Any] {
  var datum: String = js.native
}

object DatumColorInstruction {
  @scala.inline
  def apply(datum: String): DatumColorInstruction = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatumColorInstruction]
  }
  @scala.inline
  implicit class DatumColorInstructionOps[Self <: DatumColorInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatum(value: String): Self = this.set("datum", value.asInstanceOf[js.Any])
  }
  
}

