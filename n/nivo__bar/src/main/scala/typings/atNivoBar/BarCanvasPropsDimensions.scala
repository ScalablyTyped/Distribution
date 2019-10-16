package typings.atNivoBar

import typings.atNivoBar.atNivoBarMod.AccessorFunc
import typings.atNivoBar.atNivoBarMod.Axis
import typings.atNivoBar.atNivoBarMod.BarClickHandler
import typings.atNivoBar.atNivoBarMod.BarDatumWithColor
import typings.atNivoBar.atNivoBarMod.BarExtendedDatum
import typings.atNivoBar.atNivoBarMod.BarItemProps
import typings.atNivoBar.atNivoBarMod.IndexByFunc
import typings.atNivoBar.atNivoBarMod.LabelFormatter
import typings.atNivoBar.atNivoBarMod.TooltipProp
import typings.atNivoBar.atNivoBarMod.ValueFormatter
import typings.atNivoBar.atNivoBarStrings.auto
import typings.atNivoBar.atNivoBarStrings.grouped
import typings.atNivoBar.atNivoBarStrings.horizontal
import typings.atNivoBar.atNivoBarStrings.stacked
import typings.atNivoBar.atNivoBarStrings.vertical
import typings.atNivoColors.atNivoColorsMod.InheritedColorProp
import typings.atNivoColors.atNivoColorsMod.OrdinalColorsInstruction
import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.CartesianMarkerProps
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.StatelessComponent
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/bar.@nivo/bar.BarCanvasProps & @nivo/core.@nivo/core.Dimensions */
trait BarCanvasPropsDimensions extends js.Object {
  var axisBottom: js.UndefOr[Axis] = js.undefined
  var axisLeft: js.UndefOr[Axis] = js.undefined
  var axisRight: js.UndefOr[Axis] = js.undefined
  var axisTop: js.UndefOr[Axis] = js.undefined
  var barComponent: js.UndefOr[StatelessComponent[BarItemProps]] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.undefined
  var data: js.Array[js.Object]
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  var enableLabel: js.UndefOr[Boolean] = js.undefined
  var groupMode: js.UndefOr[stacked | grouped] = js.undefined
  var height: Double
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
  var legends: js.UndefOr[js.Array[dataFromindexeskeysLegendProps]] = js.undefined
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
  var width: Double
}

object BarCanvasPropsDimensions {
  @scala.inline
  def apply(
    data: js.Array[js.Object],
    height: Double,
    width: Double,
    axisBottom: Axis = null,
    axisLeft: Axis = null,
    axisRight: Axis = null,
    axisTop: Axis = null,
    barComponent: StatelessComponent[BarItemProps] = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    colors: OrdinalColorsInstruction[_] = null,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enableLabel: js.UndefOr[Boolean] = js.undefined,
    groupMode: stacked | grouped = null,
    indexBy: String | IndexByFunc = null,
    innerPadding: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[String] = null,
    label: String | AccessorFunc = null,
    labelFormat: String | LabelFormatter = null,
    labelLinkColor: InheritedColorProp[BarDatumWithColor] = null,
    labelSkipHeight: Int | Double = null,
    labelSkipWidth: Int | Double = null,
    labelTextColor: InheritedColorProp[BarDatumWithColor] = null,
    layout: horizontal | vertical = null,
    legends: js.Array[dataFromindexeskeysLegendProps] = null,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    maxValue: Double | auto = null,
    minValue: Double | auto = null,
    onClick: (/* datum */ BarExtendedDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit = null,
    padding: Int | Double = null,
    pixelRatio: Int | Double = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    theme: Theme = null,
    tooltip: TooltipProp = null,
    tooltipFormat: String | ValueFormatter = null
  ): BarCanvasPropsDimensions = {
    val __obj = js.Dynamic.literal(data = data, height = height, width = width)
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom)
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft)
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight)
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop)
    if (barComponent != null) __obj.updateDynamic("barComponent")(barComponent)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX)
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY)
    if (!js.isUndefined(enableLabel)) __obj.updateDynamic("enableLabel")(enableLabel)
    if (groupMode != null) __obj.updateDynamic("groupMode")(groupMode.asInstanceOf[js.Any])
    if (indexBy != null) __obj.updateDynamic("indexBy")(indexBy.asInstanceOf[js.Any])
    if (innerPadding != null) __obj.updateDynamic("innerPadding")(innerPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat.asInstanceOf[js.Any])
    if (labelLinkColor != null) __obj.updateDynamic("labelLinkColor")(labelLinkColor.asInstanceOf[js.Any])
    if (labelSkipHeight != null) __obj.updateDynamic("labelSkipHeight")(labelSkipHeight.asInstanceOf[js.Any])
    if (labelSkipWidth != null) __obj.updateDynamic("labelSkipWidth")(labelSkipWidth.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (markers != null) __obj.updateDynamic("markers")(markers)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarCanvasPropsDimensions]
  }
}

