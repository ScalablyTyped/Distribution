package typings
package atNivoHeatmapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxisBottom extends js.Object {
  var axisBottom: atNivoAxesLib.atNivoAxesMod.Axis
  var axisLeft: atNivoAxesLib.atNivoAxesMod.Axis
  var axisRight: atNivoAxesLib.atNivoAxesMod.Axis
  var axisTop: atNivoAxesLib.atNivoAxesMod.Axis
  var cellBorderColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[atNivoHeatmapLib.atNivoHeatmapMod.HeatMapDatumWithColor]
  var cellBorderWidth: scala.Double
  var cellHoverOpacity: scala.Double
  var cellHoverOthersOpacity: scala.Double
  var cellOpacity: scala.Double
  var cellShape: atNivoHeatmapLib.atNivoHeatmapLibStrings.rect | atNivoHeatmapLib.atNivoHeatmapLibStrings.circle | reactLib.reactMod.StatelessComponent[_]
  var enableGridX: scala.Boolean
  var enableGridY: scala.Boolean
  var enableLabels: scala.Boolean
  var forceSquare: scala.Boolean
  var hoverTarget: atNivoHeatmapLib.atNivoHeatmapLibStrings.cell | atNivoHeatmapLib.atNivoHeatmapLibStrings.row | atNivoHeatmapLib.atNivoHeatmapLibStrings.column | atNivoHeatmapLib.atNivoHeatmapLibStrings.rowColumn
  var isInteractive: scala.Boolean
  var labelTextColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[atNivoHeatmapLib.atNivoHeatmapMod.HeatMapDatumWithColor]
  var margin: atNivoCoreLib.atNivoCoreMod.Box
  var padding: scala.Double
  var sizeVariation: scala.Double
  var theme: atNivoCoreLib.atNivoCoreMod.Theme
  var tooltipFormat: java.lang.String | atNivoHeatmapLib.atNivoHeatmapMod.ValueFormatter
}

object Anon_AxisBottom {
  @scala.inline
  def apply(
    axisBottom: atNivoAxesLib.atNivoAxesMod.Axis,
    axisLeft: atNivoAxesLib.atNivoAxesMod.Axis,
    axisRight: atNivoAxesLib.atNivoAxesMod.Axis,
    axisTop: atNivoAxesLib.atNivoAxesMod.Axis,
    cellBorderColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[atNivoHeatmapLib.atNivoHeatmapMod.HeatMapDatumWithColor],
    cellBorderWidth: scala.Double,
    cellHoverOpacity: scala.Double,
    cellHoverOthersOpacity: scala.Double,
    cellOpacity: scala.Double,
    cellShape: atNivoHeatmapLib.atNivoHeatmapLibStrings.rect | atNivoHeatmapLib.atNivoHeatmapLibStrings.circle | reactLib.reactMod.StatelessComponent[_],
    enableGridX: scala.Boolean,
    enableGridY: scala.Boolean,
    enableLabels: scala.Boolean,
    forceSquare: scala.Boolean,
    hoverTarget: atNivoHeatmapLib.atNivoHeatmapLibStrings.cell | atNivoHeatmapLib.atNivoHeatmapLibStrings.row | atNivoHeatmapLib.atNivoHeatmapLibStrings.column | atNivoHeatmapLib.atNivoHeatmapLibStrings.rowColumn,
    isInteractive: scala.Boolean,
    labelTextColor: atNivoColorsLib.atNivoColorsMod.InheritedColorProp[atNivoHeatmapLib.atNivoHeatmapMod.HeatMapDatumWithColor],
    margin: atNivoCoreLib.atNivoCoreMod.Box,
    padding: scala.Double,
    sizeVariation: scala.Double,
    theme: atNivoCoreLib.atNivoCoreMod.Theme,
    tooltipFormat: java.lang.String | atNivoHeatmapLib.atNivoHeatmapMod.ValueFormatter
  ): Anon_AxisBottom = {
    val __obj = js.Dynamic.literal(axisBottom = axisBottom, axisLeft = axisLeft, axisRight = axisRight, axisTop = axisTop, cellBorderColor = cellBorderColor.asInstanceOf[js.Any], cellBorderWidth = cellBorderWidth, cellHoverOpacity = cellHoverOpacity, cellHoverOthersOpacity = cellHoverOthersOpacity, cellOpacity = cellOpacity, cellShape = cellShape.asInstanceOf[js.Any], enableGridX = enableGridX, enableGridY = enableGridY, enableLabels = enableLabels, forceSquare = forceSquare, hoverTarget = hoverTarget.asInstanceOf[js.Any], isInteractive = isInteractive, labelTextColor = labelTextColor.asInstanceOf[js.Any], margin = margin, padding = padding, sizeVariation = sizeVariation, theme = theme, tooltipFormat = tooltipFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AxisBottom]
  }
}

