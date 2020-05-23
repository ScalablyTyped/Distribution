package typings.nivoBar.mod

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
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/bar.@nivo/bar.Data & @nivo/bar.@nivo/bar.BarProps & std.Partial<{  onClick  :@nivo/bar.@nivo/bar.BarClickHandler,   pixelRatio  :number}> */
trait BarCanvasProps extends js.Object {
  var axisBottom: js.UndefOr[Axis] = js.undefined
  var axisLeft: js.UndefOr[Axis] = js.undefined
  var axisRight: js.UndefOr[Axis] = js.undefined
  var axisTop: js.UndefOr[Axis] = js.undefined
  var barComponent: js.UndefOr[StatelessComponent[BarItemProps]] = js.undefined
  var borderColor: js.UndefOr[InheritedColorProp[BarDatumWithColor]] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.undefined
  var data: js.Array[js.Object]
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  var enableLabel: js.UndefOr[Boolean] = js.undefined
  var groupMode: js.UndefOr[stacked | grouped] = js.undefined
  var indexBy: js.UndefOr[String | IndexByFunc] = js.undefined
  var innerPadding: js.UndefOr[Double] = js.undefined
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  var label: js.UndefOr[String | AccessorFunc] = js.undefined
  var labelFormat: js.UndefOr[String | LabelFormatter] = js.undefined
  var labelLinkColor: js.UndefOr[InheritedColorProp[BarDatumWithColor]] = js.undefined
  var labelSkipHeight: js.UndefOr[Double] = js.undefined
  var labelSkipWidth: js.UndefOr[Double] = js.undefined
  var labelTextColor: js.UndefOr[InheritedColorProp[BarDatumWithColor]] = js.undefined
  var layout: js.UndefOr[horizontal | vertical] = js.undefined
  var legends: js.UndefOr[js.Array[dataFromindexeskeysLegend]] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var markers: js.UndefOr[js.Array[CartesianMarkerProps]] = js.undefined
  var maxValue: js.UndefOr[Double | auto] = js.undefined
  var minValue: js.UndefOr[Double | auto] = js.undefined
  var onClick: js.UndefOr[BarClickHandler] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltip: js.UndefOr[TooltipProp] = js.undefined
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.undefined
}

object BarCanvasProps {
  @scala.inline
  def apply(
    data: js.Array[js.Object],
    axisBottom: Axis = null,
    axisLeft: Axis = null,
    axisRight: Axis = null,
    axisTop: Axis = null,
    barComponent: StatelessComponent[BarItemProps] = null,
    borderColor: InheritedColorProp[BarDatumWithColor] = null,
    borderRadius: js.UndefOr[Double] = js.undefined,
    borderWidth: js.UndefOr[Double] = js.undefined,
    colors: OrdinalColorsInstruction[_] = null,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enableLabel: js.UndefOr[Boolean] = js.undefined,
    groupMode: stacked | grouped = null,
    indexBy: String | IndexByFunc = null,
    innerPadding: js.UndefOr[Double] = js.undefined,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[String] = null,
    label: String | AccessorFunc = null,
    labelFormat: String | LabelFormatter = null,
    labelLinkColor: InheritedColorProp[BarDatumWithColor] = null,
    labelSkipHeight: js.UndefOr[Double] = js.undefined,
    labelSkipWidth: js.UndefOr[Double] = js.undefined,
    labelTextColor: InheritedColorProp[BarDatumWithColor] = null,
    layout: horizontal | vertical = null,
    legends: js.Array[dataFromindexeskeysLegend] = null,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    maxValue: Double | auto = null,
    minValue: Double | auto = null,
    onClick: (/* datum */ BarExtendedDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit = null,
    padding: js.UndefOr[Double] = js.undefined,
    pixelRatio: js.UndefOr[Double] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    theme: Theme = null,
    tooltip: TooltipProp = null,
    tooltipFormat: String | ValueFormatter = null
  ): BarCanvasProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (barComponent != null) __obj.updateDynamic("barComponent")(barComponent.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabel)) __obj.updateDynamic("enableLabel")(enableLabel.get.asInstanceOf[js.Any])
    if (groupMode != null) __obj.updateDynamic("groupMode")(groupMode.asInstanceOf[js.Any])
    if (indexBy != null) __obj.updateDynamic("indexBy")(indexBy.asInstanceOf[js.Any])
    if (!js.isUndefined(innerPadding)) __obj.updateDynamic("innerPadding")(innerPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.get.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat.asInstanceOf[js.Any])
    if (labelLinkColor != null) __obj.updateDynamic("labelLinkColor")(labelLinkColor.asInstanceOf[js.Any])
    if (!js.isUndefined(labelSkipHeight)) __obj.updateDynamic("labelSkipHeight")(labelSkipHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelSkipWidth)) __obj.updateDynamic("labelSkipWidth")(labelSkipWidth.get.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarCanvasProps]
  }
}

