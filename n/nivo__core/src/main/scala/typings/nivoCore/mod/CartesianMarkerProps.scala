package typings.nivoCore.mod

import typings.nivoCore.anon.PartialCSSProperties
import typings.nivoCore.nivoCoreStrings.x
import typings.nivoCore.nivoCoreStrings.y
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CartesianMarkerProps extends js.Object {
  var axis: x | y = js.native
  var legend: js.UndefOr[String] = js.native
  var lineStyle: js.UndefOr[PartialCSSProperties] = js.native
  var textStyle: js.UndefOr[PartialCSSProperties] = js.native
  var value: String | Double | Date = js.native
}

object CartesianMarkerProps {
  @scala.inline
  def apply(axis: x | y, value: String | Double | Date): CartesianMarkerProps = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartesianMarkerProps]
  }
  @scala.inline
  implicit class CartesianMarkerPropsOps[Self <: CartesianMarkerProps] (val x: Self) extends AnyVal {
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
    def setAxis(value: typings.nivoCore.nivoCoreStrings.x | y): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String | Double | Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegend(value: String): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setLineStyle(value: PartialCSSProperties): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setTextStyle(value: PartialCSSProperties): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

