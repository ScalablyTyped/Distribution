package typings.atNivoHeatmap.atNivoHeatmapMod

import typings.atNivoAxes.atNivoAxesMod.Axis
import typings.atNivoColors.atNivoColorsMod.InheritedColorProp
import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.Colors
import typings.atNivoCore.atNivoCoreMod.GetColor
import typings.atNivoCore.atNivoCoreMod.Theme
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
    cellBorderWidth: Int | Double = null,
    cellHoverOpacity: Int | Double = null,
    cellHoverOthersOpacity: Int | Double = null,
    cellOpacity: Int | Double = null,
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
    padding: Int | Double = null,
    sizeVariation: Int | Double = null,
    theme: Theme = null,
    tooltipFormat: String | ValueFormatter = null
  ): HeatMapCommonProps = {
    val __obj = js.Dynamic.literal()
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom)
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft)
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight)
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop)
    if (cellBorderColor != null) __obj.updateDynamic("cellBorderColor")(cellBorderColor.asInstanceOf[js.Any])
    if (cellBorderWidth != null) __obj.updateDynamic("cellBorderWidth")(cellBorderWidth.asInstanceOf[js.Any])
    if (cellHoverOpacity != null) __obj.updateDynamic("cellHoverOpacity")(cellHoverOpacity.asInstanceOf[js.Any])
    if (cellHoverOthersOpacity != null) __obj.updateDynamic("cellHoverOthersOpacity")(cellHoverOthersOpacity.asInstanceOf[js.Any])
    if (cellOpacity != null) __obj.updateDynamic("cellOpacity")(cellOpacity.asInstanceOf[js.Any])
    if (cellShape != null) __obj.updateDynamic("cellShape")(cellShape.asInstanceOf[js.Any])
    if (colorBy != null) __obj.updateDynamic("colorBy")(colorBy.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX)
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY)
    if (!js.isUndefined(enableLabels)) __obj.updateDynamic("enableLabels")(enableLabels)
    if (!js.isUndefined(forceSquare)) __obj.updateDynamic("forceSquare")(forceSquare)
    if (hoverTarget != null) __obj.updateDynamic("hoverTarget")(hoverTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (sizeVariation != null) __obj.updateDynamic("sizeVariation")(sizeVariation.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapCommonProps]
  }
}

