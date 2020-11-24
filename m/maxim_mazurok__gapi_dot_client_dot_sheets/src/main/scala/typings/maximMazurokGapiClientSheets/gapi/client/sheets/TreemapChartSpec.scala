package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreemapChartSpec extends js.Object {
  
  /**
    * The data that determines the background color of each treemap data cell. This field is optional. If not specified, size_data is used to determine background colors. If specified,
    * the data is expected to be numeric. color_scale will determine how the values in this data map to data cell background colors.
    */
  var colorData: js.UndefOr[ChartData] = js.native
  
  /**
    * The color scale for data cells in the treemap chart. Data cells are assigned colors based on their color values. These color values come from color_data, or from size_data if
    * color_data is not specified. Cells with color values less than or equal to min_value will have minValueColor as their background color. Cells with color values greater than or equal
    * to max_value will have maxValueColor as their background color. Cells with color values between min_value and max_value will have background colors on a gradient between
    * minValueColor and maxValueColor, the midpoint of the gradient being midValueColor. Cells with missing or non-numeric color values will have noDataColor as their background color.
    */
  var colorScale: js.UndefOr[TreemapChartColorScale] = js.native
  
  /** The background color for header cells. */
  var headerColor: js.UndefOr[Color] = js.native
  
  /** The background color for header cells. If header_color is also set, this field takes precedence. */
  var headerColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** True to hide tooltips. */
  var hideTooltips: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of additional data levels beyond the labeled levels to be shown on the treemap chart. These levels are not interactive and are shown without their labels. Defaults to 0
    * if not specified.
    */
  var hintedLevels: js.UndefOr[Double] = js.native
  
  /** The data that contains the treemap cell labels. */
  var labels: js.UndefOr[ChartData] = js.native
  
  /** The number of data levels to show on the treemap chart. These levels are interactive and are shown with their labels. Defaults to 2 if not specified. */
  var levels: js.UndefOr[Double] = js.native
  
  /**
    * The maximum possible data value. Cells with values greater than this will have the same color as cells with this value. If not specified, defaults to the actual maximum value from
    * color_data, or the maximum value from size_data if color_data is not specified.
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /**
    * The minimum possible data value. Cells with values less than this will have the same color as cells with this value. If not specified, defaults to the actual minimum value from
    * color_data, or the minimum value from size_data if color_data is not specified.
    */
  var minValue: js.UndefOr[Double] = js.native
  
  /** The data the contains the treemap cells' parent labels. */
  var parentLabels: js.UndefOr[ChartData] = js.native
  
  /**
    * The data that determines the size of each treemap data cell. This data is expected to be numeric. The cells corresponding to non-numeric or missing data will not be rendered. If
    * color_data is not specified, this data is used to determine data cell background colors as well.
    */
  var sizeData: js.UndefOr[ChartData] = js.native
  
  /** The text format for all labels on the chart. */
  var textFormat: js.UndefOr[TextFormat] = js.native
}
object TreemapChartSpec {
  
  @scala.inline
  def apply(): TreemapChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreemapChartSpec]
  }
  
  @scala.inline
  implicit class TreemapChartSpecOps[Self <: TreemapChartSpec] (val x: Self) extends AnyVal {
    
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
    def setColorData(value: ChartData): Self = this.set("colorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorData: Self = this.set("colorData", js.undefined)
    
    @scala.inline
    def setColorScale(value: TreemapChartColorScale): Self = this.set("colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScale: Self = this.set("colorScale", js.undefined)
    
    @scala.inline
    def setHeaderColor(value: Color): Self = this.set("headerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderColor: Self = this.set("headerColor", js.undefined)
    
    @scala.inline
    def setHeaderColorStyle(value: ColorStyle): Self = this.set("headerColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderColorStyle: Self = this.set("headerColorStyle", js.undefined)
    
    @scala.inline
    def setHideTooltips(value: Boolean): Self = this.set("hideTooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideTooltips: Self = this.set("hideTooltips", js.undefined)
    
    @scala.inline
    def setHintedLevels(value: Double): Self = this.set("hintedLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintedLevels: Self = this.set("hintedLevels", js.undefined)
    
    @scala.inline
    def setLabels(value: ChartData): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLevels(value: Double): Self = this.set("levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setParentLabels(value: ChartData): Self = this.set("parentLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentLabels: Self = this.set("parentLabels", js.undefined)
    
    @scala.inline
    def setSizeData(value: ChartData): Self = this.set("sizeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeData: Self = this.set("sizeData", js.undefined)
    
    @scala.inline
    def setTextFormat(value: TextFormat): Self = this.set("textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextFormat: Self = this.set("textFormat", js.undefined)
  }
}
