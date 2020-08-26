package typings.nivoGeo.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChoroplethCommonProps extends CommonProps {
  var borderColor: js.UndefOr[String | (FeatureAccessor[ChoroplethBoundFeature, Double])] = js.native
  var borderWidth: js.UndefOr[Double | (FeatureAccessor[ChoroplethBoundFeature, Double])] = js.native
  var colors: js.UndefOr[String | js.Array[String] | (FeatureAccessor[_, String])] = js.native
  var data: js.Array[_] = js.native
  var domain: js.Array[Double] = js.native
  var fillColor: js.UndefOr[String | (FeatureAccessor[ChoroplethBoundFeature, String])] = js.native
  var label: js.UndefOr[String | (FeatureAccessor[_, String])] = js.native
  var `match`: js.UndefOr[String | DatumMatcher] = js.native
  var onClick: js.UndefOr[ChoroplethEventHandler] = js.native
  var onMouseEnter: js.UndefOr[ChoroplethEventHandler] = js.native
  var onMouseLeave: js.UndefOr[ChoroplethEventHandler] = js.native
  var onMouseMove: js.UndefOr[ChoroplethEventHandler] = js.native
  var tooltip: js.UndefOr[ChoroplethTooltip] = js.native
  var unknownColor: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | (FeatureAccessor[_, Double])] = js.native
  var valueFormat: js.UndefOr[String | (FeatureAccessor[_, String | Double])] = js.native
}

object ChoroplethCommonProps {
  @scala.inline
  def apply(data: js.Array[_], domain: js.Array[Double], features: js.Array[_]): ChoroplethCommonProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoroplethCommonProps]
  }
  @scala.inline
  implicit class ChoroplethCommonPropsOps[Self <: ChoroplethCommonProps] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainVarargs(value: Double*): Self = this.set("domain", js.Array(value :_*))
    @scala.inline
    def setDomain(value: js.Array[Double]): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColorFunction1(value: ChoroplethBoundFeature => Double): Self = this.set("borderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderColor(value: String | (FeatureAccessor[ChoroplethBoundFeature, Double])): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderWidthFunction1(value: ChoroplethBoundFeature => Double): Self = this.set("borderWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderWidth(value: Double | (FeatureAccessor[ChoroplethBoundFeature, Double])): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColorsFunction1(value: _ => String): Self = this.set("colors", js.Any.fromFunction1(value))
    @scala.inline
    def setColors(value: String | js.Array[String] | (FeatureAccessor[_, String])): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setFillColorFunction1(value: ChoroplethBoundFeature => String): Self = this.set("fillColor", js.Any.fromFunction1(value))
    @scala.inline
    def setFillColor(value: String | (FeatureAccessor[ChoroplethBoundFeature, String])): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setLabelFunction1(value: _ => String): Self = this.set("label", js.Any.fromFunction1(value))
    @scala.inline
    def setLabel(value: String | (FeatureAccessor[_, String])): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMatchFunction1(value: /* repeated */ js.Any => Boolean): Self = this.set("match", js.Any.fromFunction1(value))
    @scala.inline
    def setMatch(value: String | DatumMatcher): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* feature */ ChoroplethBoundFeature, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnMouseEnter(
      value: (/* feature */ ChoroplethBoundFeature, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit
    ): Self = this.set("onMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(
      value: (/* feature */ ChoroplethBoundFeature, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit
    ): Self = this.set("onMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(
      value: (/* feature */ ChoroplethBoundFeature, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit
    ): Self = this.set("onMouseMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setTooltip(value: ChoroplethTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setUnknownColor(value: String): Self = this.set("unknownColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnknownColor: Self = this.set("unknownColor", js.undefined)
    @scala.inline
    def setValueFunction1(value: _ => Double): Self = this.set("value", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: String | (FeatureAccessor[_, Double])): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueFormatFunction1(value: _ => String | Double): Self = this.set("valueFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setValueFormat(value: String | (FeatureAccessor[_, String | Double])): Self = this.set("valueFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueFormat: Self = this.set("valueFormat", js.undefined)
  }
  
}

