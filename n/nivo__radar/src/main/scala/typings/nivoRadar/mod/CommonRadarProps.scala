package typings.nivoRadar.mod

import typings.nivoColors.mod.InheritedColorProp
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.CssMixBlendMode
import typings.nivoLegends.mod.LegendProps
import typings.nivoRadar.nivoRadarStrings.auto
import typings.nivoRadar.nivoRadarStrings.circular
import typings.nivoRadar.nivoRadarStrings.linear
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonRadarProps[Datum] extends js.Object {
  var blendMode: js.UndefOr[CssMixBlendMode] = js.native
  var borderColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  var curve: js.UndefOr[String] = js.native
  var data: js.Array[js.Object] = js.native
  var dotBorderColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var dotBorderWidth: js.UndefOr[Double] = js.native
  var dotColor: js.UndefOr[InheritedColorProp[_]] = js.native
  var dotLabel: js.UndefOr[String | CustomDotLabel] = js.native
  var dotLabelFormat: js.UndefOr[String | CustomFormatter] = js.native
  var dotLabelYOffset: js.UndefOr[Double] = js.native
  var dotSize: js.UndefOr[Double] = js.native
  var dotSymbol: js.UndefOr[CustomDotSymbol] = js.native
  var enableDotLabel: js.UndefOr[Boolean] = js.native
  var enableDots: js.UndefOr[Boolean] = js.native
  var fillOpacity: js.UndefOr[Double] = js.native
  var gridLabel: js.UndefOr[GridLabelCustomFunction] = js.native
  var gridLabelOffset: js.UndefOr[Double] = js.native
  var gridLevels: js.UndefOr[Double] = js.native
  var gridShape: js.UndefOr[circular | linear] = js.native
  var indexBy: Double | String | IndexByCustomFunctiono[Datum] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var keys: js.Array[String | Double] = js.native
  var legends: js.Array[LegendProps] = js.native
  var margin: js.UndefOr[Box] = js.native
  var maxValue: js.UndefOr[auto | Double] = js.native
  var tooltipFormat: js.UndefOr[String | CustomFormatter] = js.native
}

object CommonRadarProps {
  @scala.inline
  def apply[Datum](
    data: js.Array[js.Object],
    indexBy: Double | String | IndexByCustomFunctiono[Datum],
    keys: js.Array[String | Double],
    legends: js.Array[LegendProps]
  ): CommonRadarProps[Datum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], indexBy = indexBy.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonRadarProps[Datum]]
  }
  @scala.inline
  implicit class CommonRadarPropsOps[Self <: CommonRadarProps[_], Datum] (val x: Self with CommonRadarProps[Datum]) extends AnyVal {
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
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexByFunction1(value: Datum => String | Double): Self = this.set("indexBy", js.Any.fromFunction1(value))
    @scala.inline
    def setIndexBy(value: Double | String | IndexByCustomFunctiono[Datum]): Self = this.set("indexBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeysVarargs(value: (String | Double)*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String | Double]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegendsVarargs(value: LegendProps*): Self = this.set("legends", js.Array(value :_*))
    @scala.inline
    def setLegends(value: js.Array[LegendProps]): Self = this.set("legends", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlendMode(value: CssMixBlendMode): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlendMode: Self = this.set("blendMode", js.undefined)
    @scala.inline
    def setBorderColorFunction1(value: _ => String): Self = this.set("borderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderColor(value: InheritedColorProp[_]): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColorsFunction1(value: _ => String): Self = this.set("colors", js.Any.fromFunction1(value))
    @scala.inline
    def setColors(value: OrdinalColorsInstruction[_]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setCurve(value: String): Self = this.set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurve: Self = this.set("curve", js.undefined)
    @scala.inline
    def setDotBorderColorFunction1(value: _ => String): Self = this.set("dotBorderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setDotBorderColor(value: InheritedColorProp[_]): Self = this.set("dotBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotBorderColor: Self = this.set("dotBorderColor", js.undefined)
    @scala.inline
    def setDotBorderWidth(value: Double): Self = this.set("dotBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotBorderWidth: Self = this.set("dotBorderWidth", js.undefined)
    @scala.inline
    def setDotColorFunction1(value: _ => String): Self = this.set("dotColor", js.Any.fromFunction1(value))
    @scala.inline
    def setDotColor(value: InheritedColorProp[_]): Self = this.set("dotColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotColor: Self = this.set("dotColor", js.undefined)
    @scala.inline
    def setDotLabelFunction1(value: /* repeated */ js.Any => ReactNode): Self = this.set("dotLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setDotLabel(value: String | CustomDotLabel): Self = this.set("dotLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotLabel: Self = this.set("dotLabel", js.undefined)
    @scala.inline
    def setDotLabelFormatFunction1(value: /* repeated */ js.Any => ReactNode): Self = this.set("dotLabelFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setDotLabelFormat(value: String | CustomFormatter): Self = this.set("dotLabelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotLabelFormat: Self = this.set("dotLabelFormat", js.undefined)
    @scala.inline
    def setDotLabelYOffset(value: Double): Self = this.set("dotLabelYOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotLabelYOffset: Self = this.set("dotLabelYOffset", js.undefined)
    @scala.inline
    def setDotSize(value: Double): Self = this.set("dotSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotSize: Self = this.set("dotSize", js.undefined)
    @scala.inline
    def setDotSymbol(value: /* repeated */ js.Any => ReactNode): Self = this.set("dotSymbol", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDotSymbol: Self = this.set("dotSymbol", js.undefined)
    @scala.inline
    def setEnableDotLabel(value: Boolean): Self = this.set("enableDotLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDotLabel: Self = this.set("enableDotLabel", js.undefined)
    @scala.inline
    def setEnableDots(value: Boolean): Self = this.set("enableDots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDots: Self = this.set("enableDots", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setGridLabel(value: /* repeated */ js.Any => String): Self = this.set("gridLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGridLabel: Self = this.set("gridLabel", js.undefined)
    @scala.inline
    def setGridLabelOffset(value: Double): Self = this.set("gridLabelOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridLabelOffset: Self = this.set("gridLabelOffset", js.undefined)
    @scala.inline
    def setGridLevels(value: Double): Self = this.set("gridLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridLevels: Self = this.set("gridLevels", js.undefined)
    @scala.inline
    def setGridShape(value: circular | linear): Self = this.set("gridShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridShape: Self = this.set("gridShape", js.undefined)
    @scala.inline
    def setIsInteractive(value: Boolean): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInteractive: Self = this.set("isInteractive", js.undefined)
    @scala.inline
    def setMargin(value: Box): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMaxValue(value: auto | Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setTooltipFormatFunction1(value: /* repeated */ js.Any => ReactNode): Self = this.set("tooltipFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setTooltipFormat(value: String | CustomFormatter): Self = this.set("tooltipFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipFormat: Self = this.set("tooltipFormat", js.undefined)
  }
  
}

