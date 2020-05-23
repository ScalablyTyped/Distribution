package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelValue extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var value: js.Any
}

object LabelValue {
  @scala.inline
  def apply(value: js.Any, label: String = null): LabelValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelValue]
  }
}

