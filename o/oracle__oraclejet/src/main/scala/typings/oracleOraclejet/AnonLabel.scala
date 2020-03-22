package typings.oracleOraclejet

import typings.oracleOraclejet.ojcolorMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var color: ^
  var label: js.UndefOr[String] = js.undefined
}

object AnonLabel {
  @scala.inline
  def apply(color: ^, label: String = null): AnonLabel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

