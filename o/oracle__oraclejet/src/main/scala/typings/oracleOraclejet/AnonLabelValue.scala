package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabelValue extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var value: js.Any
}

object AnonLabelValue {
  @scala.inline
  def apply(value: js.Any, label: String = null): AnonLabelValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabelValue]
  }
}

