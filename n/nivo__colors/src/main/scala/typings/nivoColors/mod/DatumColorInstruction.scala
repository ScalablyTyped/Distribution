package typings.nivoColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatumColorInstruction
  extends _OrdinalColorsInstruction[js.Any] {
  var datum: String
}

object DatumColorInstruction {
  @scala.inline
  def apply(datum: String): DatumColorInstruction = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatumColorInstruction]
  }
}

