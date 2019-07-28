package typings.atNivoBar

import typings.atNivoBar.atNivoBarMod.AccessorFunc
import typings.atNivoBar.atNivoBarMod.Axis
import typings.atNivoBar.atNivoBarMod.BarDatumWithColor
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
import typings.atNivoLegends.atNivoLegendsMod.LegendProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var axisBottom: Axis | Null
  var axisLeft: Axis | Null
  var axisRight: Axis | Null
  var axisTop: Axis | Null
  var barComponent: StatelessComponent[BarItemProps]
  var borderRadius: Double
  var borderWidth: Double
  var colors: OrdinalColorsInstruction[_]
  var enableGridX: Boolean
  var enableGridY: Boolean
  var enableLabel: Boolean
  var groupMode: stacked | grouped
  var indexBy: String | IndexByFunc
  var innerPadding: Double
  var isInteractive: Boolean
  var keys: js.Array[String]
  var label: String | AccessorFunc
  var labelFormat: String | LabelFormatter
  var labelLinkColor: InheritedColorProp[BarDatumWithColor]
  var labelSkipHeight: Double
  var labelSkipWidth: Double
  var labelTextColor: InheritedColorProp[BarDatumWithColor]
  var layout: horizontal | vertical
  var legends: js.Array[Anon_DataFrom with LegendProps]
  var margin: Box
  var markers: js.Array[CartesianMarkerProps]
  var maxValue: Double | auto
  var minValue: Double | auto
  var padding: Double
  var reverse: Boolean
  var theme: Theme
  var tooltip: TooltipProp
  var tooltipFormat: String | ValueFormatter
}

object Anon_Auto {
  @scala.inline
  def apply(
    barComponent: StatelessComponent[BarItemProps],
    borderRadius: Double,
    borderWidth: Double,
    colors: OrdinalColorsInstruction[_],
    enableGridX: Boolean,
    enableGridY: Boolean,
    enableLabel: Boolean,
    groupMode: stacked | grouped,
    indexBy: String | IndexByFunc,
    innerPadding: Double,
    isInteractive: Boolean,
    keys: js.Array[String],
    label: String | AccessorFunc,
    labelFormat: String | LabelFormatter,
    labelLinkColor: InheritedColorProp[BarDatumWithColor],
    labelSkipHeight: Double,
    labelSkipWidth: Double,
    labelTextColor: InheritedColorProp[BarDatumWithColor],
    layout: horizontal | vertical,
    legends: js.Array[Anon_DataFrom with LegendProps],
    margin: Box,
    markers: js.Array[CartesianMarkerProps],
    maxValue: Double | auto,
    minValue: Double | auto,
    padding: Double,
    reverse: Boolean,
    theme: Theme,
    tooltip: TooltipProp,
    tooltipFormat: String | ValueFormatter,
    axisBottom: Axis = null,
    axisLeft: Axis = null,
    axisRight: Axis = null,
    axisTop: Axis = null
  ): Anon_Auto = {
    val __obj = js.Dynamic.literal(barComponent = barComponent, borderRadius = borderRadius, borderWidth = borderWidth, colors = colors.asInstanceOf[js.Any], enableGridX = enableGridX, enableGridY = enableGridY, enableLabel = enableLabel, groupMode = groupMode.asInstanceOf[js.Any], indexBy = indexBy.asInstanceOf[js.Any], innerPadding = innerPadding, isInteractive = isInteractive, keys = keys, label = label.asInstanceOf[js.Any], labelFormat = labelFormat.asInstanceOf[js.Any], labelLinkColor = labelLinkColor.asInstanceOf[js.Any], labelSkipHeight = labelSkipHeight, labelSkipWidth = labelSkipWidth, labelTextColor = labelTextColor.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], legends = legends, margin = margin, markers = markers, maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], padding = padding, reverse = reverse, theme = theme, tooltip = tooltip, tooltipFormat = tooltipFormat.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom)
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft)
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight)
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop)
    __obj.asInstanceOf[Anon_Auto]
  }
}

