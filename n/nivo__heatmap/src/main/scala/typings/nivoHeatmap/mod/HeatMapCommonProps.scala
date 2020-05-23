package typings.nivoHeatmap.mod

import typings.nivoAxes.mod.Axis
import typings.nivoColors.mod.InheritedColorProp
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Colors
import typings.nivoCore.mod.GetColor
import typings.nivoCore.mod.Theme
import typings.nivoHeatmap.nivoHeatmapStrings.cell
import typings.nivoHeatmap.nivoHeatmapStrings.circle
import typings.nivoHeatmap.nivoHeatmapStrings.column
import typings.nivoHeatmap.nivoHeatmapStrings.rect
import typings.nivoHeatmap.nivoHeatmapStrings.row
import typings.nivoHeatmap.nivoHeatmapStrings.rowColumn
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/core.@nivo/core.ColorProps<@nivo/heatmap.@nivo/heatmap.HeatMapDatum> & std.Partial<{  forceSquare  :boolean,   sizeVariation  :number,   margin  :@nivo/core.@nivo/core.Box,   padding  :number,   cellShape  :'rect' | 'circle' | react.react.StatelessComponent<any>,   cellOpacity  :number,   cellBorderWidth  :number,   cellBorderColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/heatmap.@nivo/heatmap.HeatMapDatumWithColor>,   axisTop  :@nivo/axes.@nivo/axes.Axis,   axisRight  :@nivo/axes.@nivo/axes.Axis,   axisBottom  :@nivo/axes.@nivo/axes.Axis,   axisLeft  :@nivo/axes.@nivo/axes.Axis,   enableGridX  :boolean,   enableGridY  :boolean,   enableLabels  :boolean,   labelTextColor  :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/heatmap.@nivo/heatmap.HeatMapDatumWithColor>,   isInteractive  :boolean,   hoverTarget  :'cell' | 'row' | 'column' | 'rowColumn',   cellHoverOpacity  :number,   cellHoverOthersOpacity  :number,   tooltipFormat  :string | @nivo/heatmap.@nivo/heatmap.ValueFormatter,   theme  :@nivo/core.@nivo/core.Theme}> */
trait HeatMapCommonProps extends js.Object {
  var axisBottom: js.UndefOr[Axis] = js.undefined
  var axisLeft: js.UndefOr[Axis] = js.undefined
  var axisRight: js.UndefOr[Axis] = js.undefined
  var axisTop: js.UndefOr[Axis] = js.undefined
  var cellBorderColor: js.UndefOr[InheritedColorProp[HeatMapDatumWithColor]] = js.undefined
  var cellBorderWidth: js.UndefOr[Double] = js.undefined
  var cellHoverOpacity: js.UndefOr[Double] = js.undefined
  var cellHoverOthersOpacity: js.UndefOr[Double] = js.undefined
  var cellOpacity: js.UndefOr[Double] = js.undefined
  var cellShape: js.UndefOr[rect | circle | StatelessComponent[_]] = js.undefined
  var colorBy: js.UndefOr[String | GetColor[HeatMapDatum]] = js.undefined
  var colors: js.UndefOr[Colors] = js.undefined
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  var enableLabels: js.UndefOr[Boolean] = js.undefined
  var forceSquare: js.UndefOr[Boolean] = js.undefined
  var hoverTarget: js.UndefOr[cell | row | column | rowColumn] = js.undefined
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var labelTextColor: js.UndefOr[InheritedColorProp[HeatMapDatumWithColor]] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var sizeVariation: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.undefined
}

object HeatMapCommonProps {
  @scala.inline
  def apply(
    axisBottom: Axis = null,
    axisLeft: Axis = null,
    axisRight: Axis = null,
    axisTop: Axis = null,
    cellBorderColor: InheritedColorProp[HeatMapDatumWithColor] = null,
    cellBorderWidth: js.UndefOr[Double] = js.undefined,
    cellHoverOpacity: js.UndefOr[Double] = js.undefined,
    cellHoverOthersOpacity: js.UndefOr[Double] = js.undefined,
    cellOpacity: js.UndefOr[Double] = js.undefined,
    cellShape: rect | circle | StatelessComponent[_] = null,
    colorBy: String | GetColor[HeatMapDatum] = null,
    colors: Colors = null,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enableLabels: js.UndefOr[Boolean] = js.undefined,
    forceSquare: js.UndefOr[Boolean] = js.undefined,
    hoverTarget: cell | row | column | rowColumn = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    labelTextColor: InheritedColorProp[HeatMapDatumWithColor] = null,
    margin: Box = null,
    padding: js.UndefOr[Double] = js.undefined,
    sizeVariation: js.UndefOr[Double] = js.undefined,
    theme: Theme = null,
    tooltipFormat: String | ValueFormatter = null
  ): HeatMapCommonProps = {
    val __obj = js.Dynamic.literal()
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (cellBorderColor != null) __obj.updateDynamic("cellBorderColor")(cellBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(cellBorderWidth)) __obj.updateDynamic("cellBorderWidth")(cellBorderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellHoverOpacity)) __obj.updateDynamic("cellHoverOpacity")(cellHoverOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellHoverOthersOpacity)) __obj.updateDynamic("cellHoverOthersOpacity")(cellHoverOthersOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellOpacity)) __obj.updateDynamic("cellOpacity")(cellOpacity.get.asInstanceOf[js.Any])
    if (cellShape != null) __obj.updateDynamic("cellShape")(cellShape.asInstanceOf[js.Any])
    if (colorBy != null) __obj.updateDynamic("colorBy")(colorBy.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabels)) __obj.updateDynamic("enableLabels")(enableLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSquare)) __obj.updateDynamic("forceSquare")(forceSquare.get.asInstanceOf[js.Any])
    if (hoverTarget != null) __obj.updateDynamic("hoverTarget")(hoverTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.get.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeVariation)) __obj.updateDynamic("sizeVariation")(sizeVariation.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapCommonProps]
  }
}

