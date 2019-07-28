package typings.atNivoHeatmap

import typings.atNivoAxes.atNivoAxesMod.Axis
import typings.atNivoColors.atNivoColorsMod.InheritedColorProp
import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.atNivoHeatmap.atNivoHeatmapMod.HeatMapDatumWithColor
import typings.atNivoHeatmap.atNivoHeatmapMod.ValueFormatter
import typings.atNivoHeatmap.atNivoHeatmapStrings.cell
import typings.atNivoHeatmap.atNivoHeatmapStrings.circle
import typings.atNivoHeatmap.atNivoHeatmapStrings.column
import typings.atNivoHeatmap.atNivoHeatmapStrings.rect
import typings.atNivoHeatmap.atNivoHeatmapStrings.row
import typings.atNivoHeatmap.atNivoHeatmapStrings.rowColumn
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AxisBottom extends js.Object {
  var axisBottom: Axis
  var axisLeft: Axis
  var axisRight: Axis
  var axisTop: Axis
  var cellBorderColor: InheritedColorProp[HeatMapDatumWithColor]
  var cellBorderWidth: Double
  var cellHoverOpacity: Double
  var cellHoverOthersOpacity: Double
  var cellOpacity: Double
  var cellShape: rect | circle | StatelessComponent[_]
  var enableGridX: Boolean
  var enableGridY: Boolean
  var enableLabels: Boolean
  var forceSquare: Boolean
  var hoverTarget: cell | row | column | rowColumn
  var isInteractive: Boolean
  var labelTextColor: InheritedColorProp[HeatMapDatumWithColor]
  var margin: Box
  var padding: Double
  var sizeVariation: Double
  var theme: Theme
  var tooltipFormat: String | ValueFormatter
}

object Anon_AxisBottom {
  @scala.inline
  def apply(
    axisBottom: Axis,
    axisLeft: Axis,
    axisRight: Axis,
    axisTop: Axis,
    cellBorderColor: InheritedColorProp[HeatMapDatumWithColor],
    cellBorderWidth: Double,
    cellHoverOpacity: Double,
    cellHoverOthersOpacity: Double,
    cellOpacity: Double,
    cellShape: rect | circle | StatelessComponent[_],
    enableGridX: Boolean,
    enableGridY: Boolean,
    enableLabels: Boolean,
    forceSquare: Boolean,
    hoverTarget: cell | row | column | rowColumn,
    isInteractive: Boolean,
    labelTextColor: InheritedColorProp[HeatMapDatumWithColor],
    margin: Box,
    padding: Double,
    sizeVariation: Double,
    theme: Theme,
    tooltipFormat: String | ValueFormatter
  ): Anon_AxisBottom = {
    val __obj = js.Dynamic.literal(axisBottom = axisBottom, axisLeft = axisLeft, axisRight = axisRight, axisTop = axisTop, cellBorderColor = cellBorderColor.asInstanceOf[js.Any], cellBorderWidth = cellBorderWidth, cellHoverOpacity = cellHoverOpacity, cellHoverOthersOpacity = cellHoverOthersOpacity, cellOpacity = cellOpacity, cellShape = cellShape.asInstanceOf[js.Any], enableGridX = enableGridX, enableGridY = enableGridY, enableLabels = enableLabels, forceSquare = forceSquare, hoverTarget = hoverTarget.asInstanceOf[js.Any], isInteractive = isInteractive, labelTextColor = labelTextColor.asInstanceOf[js.Any], margin = margin, padding = padding, sizeVariation = sizeVariation, theme = theme, tooltipFormat = tooltipFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AxisBottom]
  }
}

