package typings.nivoGeo.mod

import typings.nivoGeo.nivoGeoStrings.`string VerticallineNobreakspacenumber`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChoroplethBoundFeature extends js.Object {
  var color: String = js.native
  var data: js.Any = js.native
  var formattedValue: `string VerticallineNobreakspacenumber` = js.native
  var label: String = js.native
  var value: Double = js.native
}

object ChoroplethBoundFeature {
  @scala.inline
  def apply(
    color: String,
    data: js.Any,
    formattedValue: `string VerticallineNobreakspacenumber`,
    label: String,
    value: Double
  ): ChoroplethBoundFeature = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoroplethBoundFeature]
  }
  @scala.inline
  implicit class ChoroplethBoundFeatureOps[Self <: ChoroplethBoundFeature] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattedValue(value: `string VerticallineNobreakspacenumber`): Self = this.set("formattedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

