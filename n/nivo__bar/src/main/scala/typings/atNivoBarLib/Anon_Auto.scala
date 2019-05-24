package typings
package atNivoBarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var axisBottom: atNivoBarLib.atNivoBarMod.Axis
  var axisLeft: atNivoBarLib.atNivoBarMod.Axis
  var axisRight: atNivoBarLib.atNivoBarMod.Axis
  var axisTop: atNivoBarLib.atNivoBarMod.Axis
  var barComponent: reactLib.reactMod.StatelessComponent[atNivoBarLib.atNivoBarMod.BarItemProps]
  var borderRadius: scala.Double
  var borderWidth: scala.Double
  var colors: atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_]
  var enableGridX: scala.Boolean
  var enableGridY: scala.Boolean
  var enableLabel: scala.Boolean
  var groupMode: atNivoBarLib.atNivoBarLibStrings.stacked | atNivoBarLib.atNivoBarLibStrings.grouped
  var indexBy: java.lang.String | atNivoBarLib.atNivoBarMod.IndexByFunc
  var innerPadding: scala.Double
  var isInteractive: scala.Boolean
  var keys: js.Array[java.lang.String]
  var label: java.lang.String | atNivoBarLib.atNivoBarMod.AccessorFunc
  var labelFormat: java.lang.String | atNivoBarLib.atNivoBarMod.LabelFormatter
  var labelLinkColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[atNivoBarLib.atNivoBarMod.BarDatumWithColor]
  var labelSkipHeight: scala.Double
  var labelSkipWidth: scala.Double
  var labelTextColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[atNivoBarLib.atNivoBarMod.BarDatumWithColor]
  var layout: atNivoBarLib.atNivoBarLibStrings.horizontal | atNivoBarLib.atNivoBarLibStrings.vertical
  var legends: js.Array[Anon_DataFrom with atNivoLegendsLib.atNivoLegendsMod.LegendProps]
  var margin: atNivoCoreLib.atNivoCoreMod.Box
  var markers: js.Array[atNivoCoreLib.atNivoCoreMod.CartesianMarkerProps]
  var maxValue: scala.Double | atNivoBarLib.atNivoBarLibStrings.auto
  var minValue: scala.Double | atNivoBarLib.atNivoBarLibStrings.auto
  var padding: scala.Double
  var reverse: scala.Boolean
  var theme: atNivoCoreLib.atNivoCoreMod.Theme
  var tooltip: atNivoBarLib.atNivoBarMod.TooltipProp
  var tooltipFormat: java.lang.String | atNivoBarLib.atNivoBarMod.ValueFormatter
}

object Anon_Auto {
  @scala.inline
  def apply(
    axisBottom: atNivoBarLib.atNivoBarMod.Axis,
    axisLeft: atNivoBarLib.atNivoBarMod.Axis,
    axisRight: atNivoBarLib.atNivoBarMod.Axis,
    axisTop: atNivoBarLib.atNivoBarMod.Axis,
    barComponent: reactLib.reactMod.StatelessComponent[atNivoBarLib.atNivoBarMod.BarItemProps],
    borderRadius: scala.Double,
    borderWidth: scala.Double,
    colors: atNivoColorsLib.atNivoColorsMod.OrdinalColorsInstruction[_],
    enableGridX: scala.Boolean,
    enableGridY: scala.Boolean,
    enableLabel: scala.Boolean,
    groupMode: atNivoBarLib.atNivoBarLibStrings.stacked | atNivoBarLib.atNivoBarLibStrings.grouped,
    indexBy: java.lang.String | atNivoBarLib.atNivoBarMod.IndexByFunc,
    innerPadding: scala.Double,
    isInteractive: scala.Boolean,
    keys: js.Array[java.lang.String],
    label: java.lang.String | atNivoBarLib.atNivoBarMod.AccessorFunc,
    labelFormat: java.lang.String | atNivoBarLib.atNivoBarMod.LabelFormatter,
    labelLinkColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[atNivoBarLib.atNivoBarMod.BarDatumWithColor],
    labelSkipHeight: scala.Double,
    labelSkipWidth: scala.Double,
    labelTextColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[atNivoBarLib.atNivoBarMod.BarDatumWithColor],
    layout: atNivoBarLib.atNivoBarLibStrings.horizontal | atNivoBarLib.atNivoBarLibStrings.vertical,
    legends: js.Array[Anon_DataFrom with atNivoLegendsLib.atNivoLegendsMod.LegendProps],
    margin: atNivoCoreLib.atNivoCoreMod.Box,
    markers: js.Array[atNivoCoreLib.atNivoCoreMod.CartesianMarkerProps],
    maxValue: scala.Double | atNivoBarLib.atNivoBarLibStrings.auto,
    minValue: scala.Double | atNivoBarLib.atNivoBarLibStrings.auto,
    padding: scala.Double,
    reverse: scala.Boolean,
    theme: atNivoCoreLib.atNivoCoreMod.Theme,
    tooltip: atNivoBarLib.atNivoBarMod.TooltipProp,
    tooltipFormat: java.lang.String | atNivoBarLib.atNivoBarMod.ValueFormatter
  ): Anon_Auto = {
    val __obj = js.Dynamic.literal(axisBottom = axisBottom, axisLeft = axisLeft, axisRight = axisRight, axisTop = axisTop, barComponent = barComponent, borderRadius = borderRadius, borderWidth = borderWidth, colors = colors.asInstanceOf[js.Any], enableGridX = enableGridX, enableGridY = enableGridY, enableLabel = enableLabel, groupMode = groupMode.asInstanceOf[js.Any], indexBy = indexBy.asInstanceOf[js.Any], innerPadding = innerPadding, isInteractive = isInteractive, keys = keys, label = label.asInstanceOf[js.Any], labelFormat = labelFormat.asInstanceOf[js.Any], labelLinkColor = labelLinkColor.asInstanceOf[js.Any], labelSkipHeight = labelSkipHeight, labelSkipWidth = labelSkipWidth, labelTextColor = labelTextColor.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], legends = legends, margin = margin, markers = markers, maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], padding = padding, reverse = reverse, theme = theme, tooltip = tooltip, tooltipFormat = tooltipFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Auto]
  }
}

