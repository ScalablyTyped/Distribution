package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreemapChartSpec extends StObject {
  
  /**
    * The data that determines the background color of each treemap data cell. This field is optional. If not specified, size_data is used to determine background colors. If specified,
    * the data is expected to be numeric. color_scale will determine how the values in this data map to data cell background colors.
    */
  var colorData: js.UndefOr[ChartData] = js.undefined
  
  /**
    * The color scale for data cells in the treemap chart. Data cells are assigned colors based on their color values. These color values come from color_data, or from size_data if
    * color_data is not specified. Cells with color values less than or equal to min_value will have minValueColor as their background color. Cells with color values greater than or equal
    * to max_value will have maxValueColor as their background color. Cells with color values between min_value and max_value will have background colors on a gradient between
    * minValueColor and maxValueColor, the midpoint of the gradient being midValueColor. Cells with missing or non-numeric color values will have noDataColor as their background color.
    */
  var colorScale: js.UndefOr[TreemapChartColorScale] = js.undefined
  
  /** The background color for header cells. */
  var headerColor: js.UndefOr[Color] = js.undefined
  
  /** The background color for header cells. If header_color is also set, this field takes precedence. */
  var headerColorStyle: js.UndefOr[ColorStyle] = js.undefined
  
  /** True to hide tooltips. */
  var hideTooltips: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of additional data levels beyond the labeled levels to be shown on the treemap chart. These levels are not interactive and are shown without their labels. Defaults to 0
    * if not specified.
    */
  var hintedLevels: js.UndefOr[Double] = js.undefined
  
  /** The data that contains the treemap cell labels. */
  var labels: js.UndefOr[ChartData] = js.undefined
  
  /** The number of data levels to show on the treemap chart. These levels are interactive and are shown with their labels. Defaults to 2 if not specified. */
  var levels: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum possible data value. Cells with values greater than this will have the same color as cells with this value. If not specified, defaults to the actual maximum value from
    * color_data, or the maximum value from size_data if color_data is not specified.
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum possible data value. Cells with values less than this will have the same color as cells with this value. If not specified, defaults to the actual minimum value from
    * color_data, or the minimum value from size_data if color_data is not specified.
    */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /** The data the contains the treemap cells' parent labels. */
  var parentLabels: js.UndefOr[ChartData] = js.undefined
  
  /**
    * The data that determines the size of each treemap data cell. This data is expected to be numeric. The cells corresponding to non-numeric or missing data will not be rendered. If
    * color_data is not specified, this data is used to determine data cell background colors as well.
    */
  var sizeData: js.UndefOr[ChartData] = js.undefined
  
  /** The text format for all labels on the chart. */
  var textFormat: js.UndefOr[TextFormat] = js.undefined
}
object TreemapChartSpec {
  
  @scala.inline
  def apply(): TreemapChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreemapChartSpec]
  }
  
  @scala.inline
  implicit class TreemapChartSpecMutableBuilder[Self <: TreemapChartSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorData(value: ChartData): Self = StObject.set(x, "colorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorDataUndefined: Self = StObject.set(x, "colorData", js.undefined)
    
    @scala.inline
    def setColorScale(value: TreemapChartColorScale): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
    
    @scala.inline
    def setHeaderColor(value: Color): Self = StObject.set(x, "headerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderColorStyle(value: ColorStyle): Self = StObject.set(x, "headerColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderColorStyleUndefined: Self = StObject.set(x, "headerColorStyle", js.undefined)
    
    @scala.inline
    def setHeaderColorUndefined: Self = StObject.set(x, "headerColor", js.undefined)
    
    @scala.inline
    def setHideTooltips(value: Boolean): Self = StObject.set(x, "hideTooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideTooltipsUndefined: Self = StObject.set(x, "hideTooltips", js.undefined)
    
    @scala.inline
    def setHintedLevels(value: Double): Self = StObject.set(x, "hintedLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintedLevelsUndefined: Self = StObject.set(x, "hintedLevels", js.undefined)
    
    @scala.inline
    def setLabels(value: ChartData): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLevels(value: Double): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setParentLabels(value: ChartData): Self = StObject.set(x, "parentLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLabelsUndefined: Self = StObject.set(x, "parentLabels", js.undefined)
    
    @scala.inline
    def setSizeData(value: ChartData): Self = StObject.set(x, "sizeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeDataUndefined: Self = StObject.set(x, "sizeData", js.undefined)
    
    @scala.inline
    def setTextFormat(value: TextFormat): Self = StObject.set(x, "textFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFormatUndefined: Self = StObject.set(x, "textFormat", js.undefined)
  }
}
