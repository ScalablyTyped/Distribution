package typings.nivoGeo.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMapCommonProps extends CommonProps {
  var borderColor: js.UndefOr[String | (FeatureAccessor[_, Double])] = js.native
  var borderWidth: js.UndefOr[Double | (FeatureAccessor[_, Double])] = js.native
  var fillColor: js.UndefOr[String | (FeatureAccessor[_, String])] = js.native
  var onClick: js.UndefOr[GeoMapEventHandler] = js.native
  var onMouseEnter: js.UndefOr[GeoMapEventHandler] = js.native
  var onMouseLeave: js.UndefOr[GeoMapEventHandler] = js.native
  var onMouseMove: js.UndefOr[GeoMapEventHandler] = js.native
  var tooltip: js.UndefOr[GeoMapTooltip] = js.native
}

object GeoMapCommonProps {
  @scala.inline
  def apply(features: js.Array[_]): GeoMapCommonProps = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMapCommonProps]
  }
  @scala.inline
  implicit class GeoMapCommonPropsOps[Self <: GeoMapCommonProps] (val x: Self) extends AnyVal {
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
    def setBorderColorFunction1(value: _ => Double): Self = this.set("borderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderColor(value: String | (FeatureAccessor[_, Double])): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderWidthFunction1(value: _ => Double): Self = this.set("borderWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderWidth(value: Double | (FeatureAccessor[_, Double])): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setFillColorFunction1(value: _ => String): Self = this.set("fillColor", js.Any.fromFunction1(value))
    @scala.inline
    def setFillColor(value: String | (FeatureAccessor[_, String])): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setOnClick(value: (/* feature */ js.Any, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: (/* feature */ js.Any, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: (/* feature */ js.Any, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(value: (/* feature */ js.Any, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit): Self = this.set("onMouseMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setTooltip(value: GeoMapTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

