package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartAxisGroup
import typings.officeJs.Excel.ChartGradientStyle
import typings.officeJs.Excel.ChartGradientStyleType
import typings.officeJs.Excel.ChartMarkerStyle
import typings.officeJs.Excel.ChartParentLabelStrategy
import typings.officeJs.Excel.ChartSplitType
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.Banner
import typings.officeJs.officeJsStrings.Circle
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.Diamond
import typings.officeJs.officeJsStrings.Dot
import typings.officeJs.officeJsStrings.ExtremeValue
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Number
import typings.officeJs.officeJsStrings.Overlapping
import typings.officeJs.officeJsStrings.Percent
import typings.officeJs.officeJsStrings.Picture
import typings.officeJs.officeJsStrings.Plus
import typings.officeJs.officeJsStrings.Primary
import typings.officeJs.officeJsStrings.Secondary
import typings.officeJs.officeJsStrings.SplitByCustomSplit
import typings.officeJs.officeJsStrings.SplitByPercentValue
import typings.officeJs.officeJsStrings.SplitByPosition
import typings.officeJs.officeJsStrings.SplitByValue
import typings.officeJs.officeJsStrings.Square
import typings.officeJs.officeJsStrings.Star
import typings.officeJs.officeJsStrings.ThreePhaseColor
import typings.officeJs.officeJsStrings.Triangle
import typings.officeJs.officeJsStrings.TwoPhaseColor
import typings.officeJs.officeJsStrings.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartSeries.toJSON()`. */
trait ChartSeriesData extends StObject {
  
  /**
    *
    * Specifies the group for the specified series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var axisGroup: js.UndefOr[ChartAxisGroup | Primary | Secondary] = js.undefined
  
  /**
    *
    * Encapsulates the bin options for histogram charts and pareto charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var binOptions: js.UndefOr[ChartBinOptionsData] = js.undefined
  
  /**
    *
    * Encapsulates the options for the box and whisker charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var boxwhiskerOptions: js.UndefOr[ChartBoxwhiskerOptionsData] = js.undefined
  
  /**
    *
    * This can be an integer value from 0 (zero) to 300, representing the percentage of the default size. This property only applies to bubble charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bubbleScale: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the chart type of a series. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 84 */ js.Any
  ] = js.undefined
  
  /**
    *
    * Represents a collection of all dataLabels in the series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsData] = js.undefined
  
  /**
    *
    * Represents the doughnut hole size of a chart series.  Only valid on doughnut and doughnutExploded charts.
    Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var doughnutHoleSize: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies the explosion value for a pie-chart or doughnut-chart slice. Returns 0 (zero) if there's no explosion (the tip of the slice is in the center of the pie).
    *
    * [Api set: ExcelApi 1.8]
    */
  var explosion: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies if the series is filtered. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var filtered: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts. Can be a value from 0 through 360.
    *
    * [Api set: ExcelApi 1.8]
    */
  var firstSliceAngle: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the formatting of a chart series, which includes fill and line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartSeriesFormatData] = js.undefined
  
  /**
    *
    * Represents the gap width of a chart series.  Only valid on bar and column charts, as well as
    specific classes of line and pie charts.  Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var gapWidth: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies the color for maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies the type for maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumType: js.UndefOr[ChartGradientStyleType | ExtremeValue | Number | Percent] = js.undefined
  
  /**
    *
    * Specifies the maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumValue: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies the color for midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies the type for midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointType: js.UndefOr[ChartGradientStyleType | ExtremeValue | Number | Percent] = js.undefined
  
  /**
    *
    * Specifies the midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointValue: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies the color for minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies the type for minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumType: js.UndefOr[ChartGradientStyleType | ExtremeValue | Number | Percent] = js.undefined
  
  /**
    *
    * Specifies the minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumValue: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies the series gradient style of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientStyle: js.UndefOr[ChartGradientStyle | TwoPhaseColor | ThreePhaseColor] = js.undefined
  
  /**
    *
    * Specifies if the series has data labels.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabels: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the fill color for negative data points in a series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var invertColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * True if Excel inverts the pattern in the item when it corresponds to a negative number.
    *
    * [Api set: ExcelApi 1.8]
    */
  var invertIfNegative: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Encapsulates the options for a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var mapOptions: js.UndefOr[ChartMapOptionsData] = js.undefined
  
  /**
    *
    * Specifies the markers background color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies the markers foreground color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies the marker size of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies the marker style of a chart series. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[
    ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture
  ] = js.undefined
  
  /**
    *
    * Specifies the name of a series in a chart. The name's length should not be greater than 255 characters.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies how bars and columns are positioned. Can be a value between –100 and 100. Applies only to 2-D bar and 2-D column charts.
    *
    * [Api set: ExcelApi 1.8]
    */
  var overlap: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies the series parent label strategy area for a treemap chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var parentLabelStrategy: js.UndefOr[ChartParentLabelStrategy | None | Banner | Overlapping] = js.undefined
  
  /**
    *
    * Specifies the plot order of a chart series within the chart group.
    *
    * [Api set: ExcelApi 1.7]
    */
  var plotOrder: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Returns a collection of all points in the series.
    *
    * [Api set: ExcelApi 1.1]
    */
  var points: js.UndefOr[js.Array[ChartPointData]] = js.undefined
  
  /**
    *
    * Specifies the size of the secondary section of either a pie-of-pie chart or a bar-of-pie chart, as a percentage of the size of the primary pie. Can be a value from 5 to 200.
    *
    * [Api set: ExcelApi 1.8]
    */
  var secondPlotSize: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies whether connector lines are shown in waterfall charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showConnectorLines: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether leader lines are displayed for each data label in the series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showLeaderLines: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the series has a shadow.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the series is smooth. Only applicable to line and scatter charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var smooth: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the way the two sections of either a pie-of-pie chart or a bar-of-pie chart are split.
    *
    * [Api set: ExcelApi 1.8]
    */
  var splitType: js.UndefOr[
    ChartSplitType | SplitByPosition | SplitByValue | SplitByPercentValue | SplitByCustomSplit
  ] = js.undefined
  
  /**
    *
    * Specifies the threshold value that separates two sections of either a pie-of-pie chart or a bar-of-pie chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var splitValue: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * The collection of trendlines in the series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var trendlines: js.UndefOr[js.Array[ChartTrendlineData]] = js.undefined
  
  /**
    *
    * True if Excel assigns a different color or pattern to each data marker. The chart must contain only one series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var varyByCategories: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the error bar object of a chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var xErrorBars: js.UndefOr[ChartErrorBarsData] = js.undefined
  
  /**
    *
    * Represents the error bar object of a chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var yErrorBars: js.UndefOr[ChartErrorBarsData] = js.undefined
}
object ChartSeriesData {
  
  @scala.inline
  def apply(): ChartSeriesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesData]
  }
  
  @scala.inline
  implicit class ChartSeriesDataMutableBuilder[Self <: ChartSeriesData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisGroup(value: ChartAxisGroup | Primary | Secondary): Self = StObject.set(x, "axisGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisGroupUndefined: Self = StObject.set(x, "axisGroup", js.undefined)
    
    @scala.inline
    def setBinOptions(value: ChartBinOptionsData): Self = StObject.set(x, "binOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinOptionsUndefined: Self = StObject.set(x, "binOptions", js.undefined)
    
    @scala.inline
    def setBoxwhiskerOptions(value: ChartBoxwhiskerOptionsData): Self = StObject.set(x, "boxwhiskerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxwhiskerOptionsUndefined: Self = StObject.set(x, "boxwhiskerOptions", js.undefined)
    
    @scala.inline
    def setBubbleScale(value: Double): Self = StObject.set(x, "bubbleScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbleScaleUndefined: Self = StObject.set(x, "bubbleScale", js.undefined)
    
    @scala.inline
    def setChartType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 84 */ js.Any): Self = StObject.set(x, "chartType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartTypeUndefined: Self = StObject.set(x, "chartType", js.undefined)
    
    @scala.inline
    def setDataLabels(value: ChartDataLabelsData): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    @scala.inline
    def setDoughnutHoleSize(value: Double): Self = StObject.set(x, "doughnutHoleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoughnutHoleSizeUndefined: Self = StObject.set(x, "doughnutHoleSize", js.undefined)
    
    @scala.inline
    def setExplosion(value: Double): Self = StObject.set(x, "explosion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplosionUndefined: Self = StObject.set(x, "explosion", js.undefined)
    
    @scala.inline
    def setFiltered(value: Boolean): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredUndefined: Self = StObject.set(x, "filtered", js.undefined)
    
    @scala.inline
    def setFirstSliceAngle(value: Double): Self = StObject.set(x, "firstSliceAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSliceAngleUndefined: Self = StObject.set(x, "firstSliceAngle", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartSeriesFormatData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGapWidth(value: Double): Self = StObject.set(x, "gapWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapWidthUndefined: Self = StObject.set(x, "gapWidth", js.undefined)
    
    @scala.inline
    def setGradientMaximumColor(value: String): Self = StObject.set(x, "gradientMaximumColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientMaximumColorUndefined: Self = StObject.set(x, "gradientMaximumColor", js.undefined)
    
    @scala.inline
    def setGradientMaximumType(value: ChartGradientStyleType | ExtremeValue | Number | Percent): Self = StObject.set(x, "gradientMaximumType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientMaximumTypeUndefined: Self = StObject.set(x, "gradientMaximumType", js.undefined)
    
    @scala.inline
    def setGradientMaximumValue(value: Double): Self = StObject.set(x, "gradientMaximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientMaximumValueUndefined: Self = StObject.set(x, "gradientMaximumValue", js.undefined)
    
    @scala.inline
    def setGradientMidpointColor(value: String): Self = StObject.set(x, "gradientMidpointColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientMidpointColorUndefined: Self = StObject.set(x, "gradientMidpointColor", js.undefined)
    
    @scala.inline
    def setGradientMidpointType(value: ChartGradientStyleType | ExtremeValue | Number | Percent): Self = StObject.set(x, "gradientMidpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientMidpointTypeUndefined: Self = StObject.set(x, "gradientMidpointType", js.undefined)
    
    @scala.inline
    def setGradientMidpointValue(value: Double): Self = StObject.set(x, "gradientMidpointValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientMidpointValueUndefined: Self = StObject.set(x, "gradientMidpointValue", js.undefined)
    
    @scala.inline
    def setGradientMinimumColor(value: String): Self = StObject.set(x, "gradientMinimumColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientMinimumColorUndefined: Self = StObject.set(x, "gradientMinimumColor", js.undefined)
    
    @scala.inline
    def setGradientMinimumType(value: ChartGradientStyleType | ExtremeValue | Number | Percent): Self = StObject.set(x, "gradientMinimumType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientMinimumTypeUndefined: Self = StObject.set(x, "gradientMinimumType", js.undefined)
    
    @scala.inline
    def setGradientMinimumValue(value: Double): Self = StObject.set(x, "gradientMinimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientMinimumValueUndefined: Self = StObject.set(x, "gradientMinimumValue", js.undefined)
    
    @scala.inline
    def setGradientStyle(value: ChartGradientStyle | TwoPhaseColor | ThreePhaseColor): Self = StObject.set(x, "gradientStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientStyleUndefined: Self = StObject.set(x, "gradientStyle", js.undefined)
    
    @scala.inline
    def setHasDataLabels(value: Boolean): Self = StObject.set(x, "hasDataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDataLabelsUndefined: Self = StObject.set(x, "hasDataLabels", js.undefined)
    
    @scala.inline
    def setInvertColor(value: String): Self = StObject.set(x, "invertColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertColorUndefined: Self = StObject.set(x, "invertColor", js.undefined)
    
    @scala.inline
    def setInvertIfNegative(value: Boolean): Self = StObject.set(x, "invertIfNegative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertIfNegativeUndefined: Self = StObject.set(x, "invertIfNegative", js.undefined)
    
    @scala.inline
    def setMapOptions(value: ChartMapOptionsData): Self = StObject.set(x, "mapOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapOptionsUndefined: Self = StObject.set(x, "mapOptions", js.undefined)
    
    @scala.inline
    def setMarkerBackgroundColor(value: String): Self = StObject.set(x, "markerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerBackgroundColorUndefined: Self = StObject.set(x, "markerBackgroundColor", js.undefined)
    
    @scala.inline
    def setMarkerForegroundColor(value: String): Self = StObject.set(x, "markerForegroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerForegroundColorUndefined: Self = StObject.set(x, "markerForegroundColor", js.undefined)
    
    @scala.inline
    def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
    
    @scala.inline
    def setMarkerStyle(
      value: ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture
    ): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerStyleUndefined: Self = StObject.set(x, "markerStyle", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOverlap(value: Double): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
    
    @scala.inline
    def setParentLabelStrategy(value: ChartParentLabelStrategy | None | Banner | Overlapping): Self = StObject.set(x, "parentLabelStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLabelStrategyUndefined: Self = StObject.set(x, "parentLabelStrategy", js.undefined)
    
    @scala.inline
    def setPlotOrder(value: Double): Self = StObject.set(x, "plotOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotOrderUndefined: Self = StObject.set(x, "plotOrder", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[ChartPointData]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: ChartPointData*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setSecondPlotSize(value: Double): Self = StObject.set(x, "secondPlotSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondPlotSizeUndefined: Self = StObject.set(x, "secondPlotSize", js.undefined)
    
    @scala.inline
    def setShowConnectorLines(value: Boolean): Self = StObject.set(x, "showConnectorLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConnectorLinesUndefined: Self = StObject.set(x, "showConnectorLines", js.undefined)
    
    @scala.inline
    def setShowLeaderLines(value: Boolean): Self = StObject.set(x, "showLeaderLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLeaderLinesUndefined: Self = StObject.set(x, "showLeaderLines", js.undefined)
    
    @scala.inline
    def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
    
    @scala.inline
    def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    @scala.inline
    def setSplitType(value: ChartSplitType | SplitByPosition | SplitByValue | SplitByPercentValue | SplitByCustomSplit): Self = StObject.set(x, "splitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitTypeUndefined: Self = StObject.set(x, "splitType", js.undefined)
    
    @scala.inline
    def setSplitValue(value: Double): Self = StObject.set(x, "splitValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitValueUndefined: Self = StObject.set(x, "splitValue", js.undefined)
    
    @scala.inline
    def setTrendlines(value: js.Array[ChartTrendlineData]): Self = StObject.set(x, "trendlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendlinesUndefined: Self = StObject.set(x, "trendlines", js.undefined)
    
    @scala.inline
    def setTrendlinesVarargs(value: ChartTrendlineData*): Self = StObject.set(x, "trendlines", js.Array(value :_*))
    
    @scala.inline
    def setVaryByCategories(value: Boolean): Self = StObject.set(x, "varyByCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaryByCategoriesUndefined: Self = StObject.set(x, "varyByCategories", js.undefined)
    
    @scala.inline
    def setXErrorBars(value: ChartErrorBarsData): Self = StObject.set(x, "xErrorBars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXErrorBarsUndefined: Self = StObject.set(x, "xErrorBars", js.undefined)
    
    @scala.inline
    def setYErrorBars(value: ChartErrorBarsData): Self = StObject.set(x, "yErrorBars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYErrorBarsUndefined: Self = StObject.set(x, "yErrorBars", js.undefined)
  }
}
