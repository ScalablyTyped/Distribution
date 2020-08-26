package typings.nivoHeatmap.mod

import typings.nivoAxes.mod.AxisProps
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
import typings.nivoTooltip.mod.BasicTooltipProps
import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/core.@nivo/core.ColorProps<@nivo/heatmap.@nivo/heatmap.HeatMapDatum> & std.Partial<{  forceSquare :boolean,   sizeVariation :number,   margin :@nivo/core.@nivo/core.Box,   padding :number,   cellShape :'rect' | 'circle' | react.react.StatelessComponent<any>,   cellOpacity :number,   cellBorderWidth :number,   cellBorderColor :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/heatmap.@nivo/heatmap.HeatMapDatumWithColor>,   axisTop :@nivo/axes.@nivo/axes.AxisProps | null,   axisRight :@nivo/axes.@nivo/axes.AxisProps | null,   axisBottom :@nivo/axes.@nivo/axes.AxisProps | null,   axisLeft :@nivo/axes.@nivo/axes.AxisProps | null,   enableGridX :boolean,   enableGridY :boolean,   enableLabels :boolean,   labelTextColor :@nivo/colors.@nivo/colors.InheritedColorProp<@nivo/heatmap.@nivo/heatmap.HeatMapDatumWithColor>,   isInteractive :boolean,   hoverTarget :'cell' | 'row' | 'column' | 'rowColumn',   cellHoverOpacity :number,   cellHoverOthersOpacity :number,   tooltipFormat :string | @nivo/heatmap.@nivo/heatmap.ValueFormatter,   tooltip :react.react.StatelessComponent<@nivo/tooltip.@nivo/tooltip.BasicTooltipProps & @nivo/heatmap.@nivo/heatmap.NodeData>,   theme :@nivo/core.@nivo/core.Theme}> */
@js.native
trait HeatMapCommonProps extends js.Object {
  var axisBottom: js.UndefOr[AxisProps | Null] = js.native
  var axisLeft: js.UndefOr[AxisProps | Null] = js.native
  var axisRight: js.UndefOr[AxisProps | Null] = js.native
  var axisTop: js.UndefOr[AxisProps | Null] = js.native
  var cellBorderColor: js.UndefOr[InheritedColorProp[HeatMapDatumWithColor]] = js.native
  var cellBorderWidth: js.UndefOr[Double] = js.native
  var cellHoverOpacity: js.UndefOr[Double] = js.native
  var cellHoverOthersOpacity: js.UndefOr[Double] = js.native
  var cellOpacity: js.UndefOr[Double] = js.native
  var cellShape: js.UndefOr[rect | circle | StatelessComponent[_]] = js.native
  var colorBy: js.UndefOr[String | GetColor[HeatMapDatum]] = js.native
  var colors: js.UndefOr[Colors] = js.native
  var enableGridX: js.UndefOr[Boolean] = js.native
  var enableGridY: js.UndefOr[Boolean] = js.native
  var enableLabels: js.UndefOr[Boolean] = js.native
  var forceSquare: js.UndefOr[Boolean] = js.native
  var hoverTarget: js.UndefOr[cell | row | column | rowColumn] = js.native
  var isInteractive: js.UndefOr[Boolean] = js.native
  var labelTextColor: js.UndefOr[InheritedColorProp[HeatMapDatumWithColor]] = js.native
  var margin: js.UndefOr[Box] = js.native
  var padding: js.UndefOr[Double] = js.native
  var sizeVariation: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var tooltip: js.UndefOr[StatelessComponent[BasicTooltipProps with NodeData]] = js.native
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.native
}

object HeatMapCommonProps {
  @scala.inline
  def apply(): HeatMapCommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeatMapCommonProps]
  }
  @scala.inline
  implicit class HeatMapCommonPropsOps[Self <: HeatMapCommonProps] (val x: Self) extends AnyVal {
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
    def setCellBorderColorFunction1(value: HeatMapDatumWithColor => String): Self = this.set("cellBorderColor", js.Any.fromFunction1(value))
    @scala.inline
    def setCellBorderColor(value: InheritedColorProp[HeatMapDatumWithColor]): Self = this.set("cellBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellBorderColor: Self = this.set("cellBorderColor", js.undefined)
    @scala.inline
    def setCellBorderWidth(value: Double): Self = this.set("cellBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellBorderWidth: Self = this.set("cellBorderWidth", js.undefined)
    @scala.inline
    def setCellHoverOpacity(value: Double): Self = this.set("cellHoverOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellHoverOpacity: Self = this.set("cellHoverOpacity", js.undefined)
    @scala.inline
    def setCellHoverOthersOpacity(value: Double): Self = this.set("cellHoverOthersOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellHoverOthersOpacity: Self = this.set("cellHoverOthersOpacity", js.undefined)
    @scala.inline
    def setCellOpacity(value: Double): Self = this.set("cellOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellOpacity: Self = this.set("cellOpacity", js.undefined)
    @scala.inline
    def setCellShape(value: rect | circle | StatelessComponent[_]): Self = this.set("cellShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellShape: Self = this.set("cellShape", js.undefined)
    @scala.inline
    def setColorByFunction1(value: HeatMapDatum => String): Self = this.set("colorBy", js.Any.fromFunction1(value))
    @scala.inline
    def setColorBy(value: String | GetColor[HeatMapDatum]): Self = this.set("colorBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBy: Self = this.set("colorBy", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: Colors): Self = this.set("colors", value.asInstanceOf[js.Any])
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
    def setEnableLabels(value: Boolean): Self = this.set("enableLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableLabels: Self = this.set("enableLabels", js.undefined)
    @scala.inline
    def setForceSquare(value: Boolean): Self = this.set("forceSquare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSquare: Self = this.set("forceSquare", js.undefined)
    @scala.inline
    def setHoverTarget(value: cell | row | column | rowColumn): Self = this.set("hoverTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverTarget: Self = this.set("hoverTarget", js.undefined)
    @scala.inline
    def setIsInteractive(value: Boolean): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInteractive: Self = this.set("isInteractive", js.undefined)
    @scala.inline
    def setLabelTextColorFunction1(value: HeatMapDatumWithColor => String): Self = this.set("labelTextColor", js.Any.fromFunction1(value))
    @scala.inline
    def setLabelTextColor(value: InheritedColorProp[HeatMapDatumWithColor]): Self = this.set("labelTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelTextColor: Self = this.set("labelTextColor", js.undefined)
    @scala.inline
    def setMargin(value: Box): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setSizeVariation(value: Double): Self = this.set("sizeVariation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeVariation: Self = this.set("sizeVariation", js.undefined)
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTooltip(value: StatelessComponent[BasicTooltipProps with NodeData]): Self = this.set("tooltip", value.asInstanceOf[js.Any])
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

