package typings.nivoBar.mod

import typings.nivoAxes.mod.AxisProps
import typings.nivoAxes.mod.GridValues
import typings.nivoBar.anon.dataFromindexeskeysLegend
import typings.nivoBar.nivoBarStrings.auto
import typings.nivoBar.nivoBarStrings.grouped
import typings.nivoBar.nivoBarStrings.horizontal
import typings.nivoBar.nivoBarStrings.stacked
import typings.nivoBar.nivoBarStrings.vertical
import typings.nivoColors.mod.InheritedColorProp
import typings.nivoColors.mod.OrdinalColorsInstruction
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.CartesianMarkerProps
import typings.nivoCore.mod.Theme
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.StatelessComponent
import typings.std.Date
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/bar.@nivo/bar.Data & @nivo/bar.@nivo/bar.BarProps & std.Partial<{  onClick :@nivo/bar.@nivo/bar.BarMouseEventHandler<std.HTMLCanvasElement>,   onMouseEnter :@nivo/bar.@nivo/bar.BarMouseEventHandler<std.HTMLCanvasElement>,   onMouseLeave :@nivo/bar.@nivo/bar.BarMouseEventHandler<std.HTMLCanvasElement>,   pixelRatio :number}> */
@js.native
trait BarCanvasProps extends js.Object {
  var axisBottom: js.UndefOr[AxisProps | Null] = js.native
  var axisLeft: js.UndefOr[AxisProps | Null] = js.native
  var axisRight: js.UndefOr[AxisProps | Null] = js.native
  var axisTop: js.UndefOr[AxisProps | Null] = js.native
  var barComponent: js.UndefOr[StatelessComponent[BarItemProps]] = js.native
  var borderColor: js.UndefOr[InheritedColorProp[BarDatumWithColor]] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  var data: js.Array[js.Object] = js.native
  var enableGridX: js.UndefOr[Boolean] = js.native
  var enableGridY: js.UndefOr[Boolean] = js.native
  var enableLabel: js.UndefOr[Boolean] = js.native
  var gridXValues: js.UndefOr[GridValues[Value]] = js.native
  var gridYValues: js.UndefOr[GridValues[Value]] = js.native
  var groupMode: js.UndefOr[stacked | grouped] = js.native
  var indexBy: js.UndefOr[String | IndexByFunc] = js.native
  var innerPadding: js.UndefOr[Double] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var keys: js.UndefOr[js.Array[String]] = js.native
  var label: js.UndefOr[String | AccessorFunc] = js.native
  var labelFormat: js.UndefOr[String | LabelFormatter] = js.native
  var labelLinkColor: js.UndefOr[InheritedColorProp[BarDatumWithColor]] = js.native
  var labelSkipHeight: js.UndefOr[Double] = js.native
  var labelSkipWidth: js.UndefOr[Double] = js.native
  var labelTextColor: js.UndefOr[InheritedColorProp[BarDatumWithColor]] = js.native
  var layout: js.UndefOr[horizontal | vertical] = js.native
  var legends: js.UndefOr[js.Array[dataFromindexeskeysLegend]] = js.native
  var margin: js.UndefOr[Box] = js.native
  var markers: js.UndefOr[js.Array[CartesianMarkerProps]] = js.native
  var maxValue: js.UndefOr[Double | auto] = js.native
  var minValue: js.UndefOr[Double | auto] = js.native
  var onClick: js.UndefOr[BarMouseEventHandler[HTMLCanvasElement]] = js.native
  var onMouseEnter: js.UndefOr[BarMouseEventHandler[HTMLCanvasElement]] = js.native
  var onMouseLeave: js.UndefOr[BarMouseEventHandler[HTMLCanvasElement]] = js.native
  var padding: js.UndefOr[Double] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltip: js.UndefOr[TooltipProp] = js.native
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.native
}

object BarCanvasProps {
  @scala.inline
  def apply(data: js.Array[js.Object]): BarCanvasProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarCanvasProps]
  }
  @scala.inline
  implicit class BarCanvasPropsOps[Self <: BarCanvasProps] (val x: Self) extends AnyVal {
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
    def setAxisBottom(value: AxisProps): Self = this.set("axisBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisBottom: Self = this.set("axisBottom", js.undefined)
    @scala.inline
    def setAxisBottomNull: Self = this.set("axisBottom", null)
    @scala.inline
    def setAxisLeft(value: AxisProps): Self = this.set("axisLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisLeft: Self = this.set("axisLeft", js.undefined)
    @scala.inline
    def setAxisLeftNull: Self = this.set("axisLeft", null)
    @scala.inline
    def setAxisRight(value: AxisProps): Self = this.set("axisRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisRight: Self = this.set("axisRight", js.undefined)
    @scala.inline
    def setAxisRightNull: Self = this.set("axisRight", null)
    @scala.inline
    def setAxisTop(value: AxisProps): Self = this.set("axisTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisTop: Self = this.set("axisTop", js.undefined)
    @scala.inline
    def setAxisTopNull: Self = this.set("axisTop", null)
    @scala.inline
    def setBarComponent(value: StatelessComponent[BarItemProps]): Self = this.set("barComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarComponent: Self = this.set("barComponent", js.undefined)
    @scala.inline
    def setBorderColorFunction1(value: BarDatumWithColor => String): Self = this.set("borderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setBorderColor(value: InheritedColorProp[BarDatumWithColor]): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
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
    def setEnableGridX(value: Boolean): Self = this.set("enableGridX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGridX: Self = this.set("enableGridX", js.undefined)
    @scala.inline
    def setEnableGridY(value: Boolean): Self = this.set("enableGridY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableGridY: Self = this.set("enableGridY", js.undefined)
    @scala.inline
    def setEnableLabel(value: Boolean): Self = this.set("enableLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLabel: Self = this.set("enableLabel", js.undefined)
    @scala.inline
    def setGridXValuesVarargs(value: (Date | Double | String)*): Self = this.set("gridXValues", js.Array(value :_*))
    @scala.inline
    def setGridXValues(value: GridValues[Value]): Self = this.set("gridXValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridXValues: Self = this.set("gridXValues", js.undefined)
    @scala.inline
    def setGridYValuesVarargs(value: (Date | Double | String)*): Self = this.set("gridYValues", js.Array(value :_*))
    @scala.inline
    def setGridYValues(value: GridValues[Value]): Self = this.set("gridYValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridYValues: Self = this.set("gridYValues", js.undefined)
    @scala.inline
    def setGroupMode(value: stacked | grouped): Self = this.set("groupMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupMode: Self = this.set("groupMode", js.undefined)
    @scala.inline
    def setIndexByFunction1(value: /* datum */ BarDatum => String | Double): Self = this.set("indexBy", js.Any.fromFunction1(value))
    @scala.inline
    def setIndexBy(value: String | IndexByFunc): Self = this.set("indexBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexBy: Self = this.set("indexBy", js.undefined)
    @scala.inline
    def setInnerPadding(value: Double): Self = this.set("innerPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerPadding: Self = this.set("innerPadding", js.undefined)
    @scala.inline
    def setIsInteractive(value: Boolean): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInteractive: Self = this.set("isInteractive", js.undefined)
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setLabelFunction1(value: /* datum */ BarDatum => String): Self = this.set("label", js.Any.fromFunction1(value))
    @scala.inline
    def setLabel(value: String | AccessorFunc): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelFormatFunction1(value: /* label */ String | Double => String | Double): Self = this.set("labelFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setLabelFormat(value: String | LabelFormatter): Self = this.set("labelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFormat: Self = this.set("labelFormat", js.undefined)
    @scala.inline
    def setLabelLinkColorFunction1(value: BarDatumWithColor => String): Self = this.set("labelLinkColor", js.Any.fromFunction1(value))
    @scala.inline
    def setLabelLinkColor(value: InheritedColorProp[BarDatumWithColor]): Self = this.set("labelLinkColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelLinkColor: Self = this.set("labelLinkColor", js.undefined)
    @scala.inline
    def setLabelSkipHeight(value: Double): Self = this.set("labelSkipHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelSkipHeight: Self = this.set("labelSkipHeight", js.undefined)
    @scala.inline
    def setLabelSkipWidth(value: Double): Self = this.set("labelSkipWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelSkipWidth: Self = this.set("labelSkipWidth", js.undefined)
    @scala.inline
    def setLabelTextColorFunction1(value: BarDatumWithColor => String): Self = this.set("labelTextColor", js.Any.fromFunction1(value))
    @scala.inline
    def setLabelTextColor(value: InheritedColorProp[BarDatumWithColor]): Self = this.set("labelTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelTextColor: Self = this.set("labelTextColor", js.undefined)
    @scala.inline
    def setLayout(value: horizontal | vertical): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLegendsVarargs(value: dataFromindexeskeysLegend*): Self = this.set("legends", js.Array(value :_*))
    @scala.inline
    def setLegends(value: js.Array[dataFromindexeskeysLegend]): Self = this.set("legends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegends: Self = this.set("legends", js.undefined)
    @scala.inline
    def setMargin(value: Box): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMarkersVarargs(value: CartesianMarkerProps*): Self = this.set("markers", js.Array(value :_*))
    @scala.inline
    def setMarkers(value: js.Array[CartesianMarkerProps]): Self = this.set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    @scala.inline
    def setMaxValue(value: Double | auto): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double | auto): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* datum */ BarExtendedDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnMouseEnter(
      value: (/* datum */ BarExtendedDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(
      value: (/* datum */ BarExtendedDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit
    ): Self = this.set("onMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTooltip(value: TooltipProp): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipFormatFunction1(value: /* value */ Double => String | Double): Self = this.set("tooltipFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setTooltipFormat(value: String | ValueFormatter): Self = this.set("tooltipFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipFormat: Self = this.set("tooltipFormat", js.undefined)
  }
  
}

