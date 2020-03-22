package typings.nivoBar.mod

import typings.nivoBar.dataFromindexeskeysLegend
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
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  indexBy  :string | @nivo/bar.@nivo/bar.IndexByFunc,   keys  :std.Array<string>,   groupMode  :'stacked' | 'grouped',   layout  :'horizontal' | 'vertical',   reverse  :boolean,   innerPadding  :number,   minValue  :number | 'auto',   margin  :@nivo/core.@nivo/core.Box,   maxValue  :number | 'auto',   padding  :number,   axisBottom  :@nivo/bar.@nivo/bar.Axis | null,   axisLeft  :@nivo/bar.@nivo/bar.Axis | null,   axisRight  :@nivo/bar.@nivo/bar.Axis | null,   axisTop  :@nivo/bar.@nivo/bar.Axis | null,   enableGridX  :boolean,   enableGridY  :boolean,   barComponent  :react.react.StatelessComponent<@nivo/bar.@nivo/bar.BarItemProps>,   enableLabel  :boolean,   label  :string | @nivo/bar.@nivo/bar.AccessorFunc,   labelFormat  :string | @nivo/bar.@nivo/bar.LabelFormatter,   labelLinkColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/bar.@nivo/bar.BarDatumWithColor>,   labelSkipWidth  :number,   labelSkipHeight  :number,   labelTextColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/bar.@nivo/bar.BarDatumWithColor>,   colors  :@nivo/colors.@nivo/colors.OrdinalColorsInstruction<any>,   borderColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/bar.@nivo/bar.BarDatumWithColor>,   borderRadius  :number,   borderWidth  :number,   theme  :@nivo/core.@nivo/core.Theme,   isInteractive  :boolean,   tooltipFormat  :string | @nivo/bar.@nivo/bar.ValueFormatter,   tooltip  :@nivo/bar.@nivo/bar.TooltipProp,   legends  :std.Array<{  dataFrom  :'indexes' | 'keys'} & @nivo/legends.@nivo/legends.LegendProps>,   markers  :std.Array<@nivo/core.@nivo/core.CartesianMarkerProps>}> */
trait BarProps extends js.Object {
  var axisBottom: js.UndefOr[Axis] = js.undefined
  var axisLeft: js.UndefOr[Axis] = js.undefined
  var axisRight: js.UndefOr[Axis] = js.undefined
  var axisTop: js.UndefOr[Axis] = js.undefined
  var barComponent: js.UndefOr[StatelessComponent[BarItemProps]] = js.undefined
  var borderColor: js.UndefOr[InheritedColorProp[BarDatumWithColor]] = js.undefined
  var borderRadius: js.UndefOr[Double] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.undefined
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
  var padding: js.UndefOr[Double] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltip: js.UndefOr[TooltipProp] = js.undefined
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.undefined
}

object BarProps {
  @scala.inline
  def apply(
    axisBottom: Axis = null,
    axisLeft: Axis = null,
    axisRight: Axis = null,
    axisTop: Axis = null,
    barComponent: StatelessComponent[BarItemProps] = null,
    borderColor: InheritedColorProp[BarDatumWithColor] = null,
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
    legends: js.Array[dataFromindexeskeysLegend] = null,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    maxValue: Double | auto = null,
    minValue: Double | auto = null,
    padding: Int | Double = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    theme: Theme = null,
    tooltip: TooltipProp = null,
    tooltipFormat: String | ValueFormatter = null
  ): BarProps = {
    val __obj = js.Dynamic.literal()
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (barComponent != null) __obj.updateDynamic("barComponent")(barComponent.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabel)) __obj.updateDynamic("enableLabel")(enableLabel.asInstanceOf[js.Any])
    if (groupMode != null) __obj.updateDynamic("groupMode")(groupMode.asInstanceOf[js.Any])
    if (indexBy != null) __obj.updateDynamic("indexBy")(indexBy.asInstanceOf[js.Any])
    if (innerPadding != null) __obj.updateDynamic("innerPadding")(innerPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat.asInstanceOf[js.Any])
    if (labelLinkColor != null) __obj.updateDynamic("labelLinkColor")(labelLinkColor.asInstanceOf[js.Any])
    if (labelSkipHeight != null) __obj.updateDynamic("labelSkipHeight")(labelSkipHeight.asInstanceOf[js.Any])
    if (labelSkipWidth != null) __obj.updateDynamic("labelSkipWidth")(labelSkipWidth.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarProps]
  }
}

