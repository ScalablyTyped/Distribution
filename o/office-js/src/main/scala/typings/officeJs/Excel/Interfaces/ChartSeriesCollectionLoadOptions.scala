package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of chart series.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartSeriesCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the group for the specified series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var axisGroup: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Encapsulates the bin options for histogram charts and pareto charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var binOptions: js.UndefOr[ChartBinOptionsLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Encapsulates the options for the box and whisker charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var boxwhiskerOptions: js.UndefOr[ChartBoxwhiskerOptionsLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: This can be an integer value from 0 (zero) to 300, representing the percentage of the default size. This property only applies to bubble charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bubbleScale: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the chart type of a series. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents a collection of all dataLabels in the series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the doughnut hole size of a chart series.  Only valid on doughnut and doughnutExploded charts.
    Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var doughnutHoleSize: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the explosion value for a pie-chart or doughnut-chart slice. Returns 0 (zero) if there's no explosion (the tip of the slice is in the center of the pie).
    *
    * [Api set: ExcelApi 1.8]
    */
  var explosion: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies if the series is filtered. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var filtered: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts. Can be a value from 0 through 360.
    *
    * [Api set: ExcelApi 1.8]
    */
  var firstSliceAngle: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the formatting of a chart series, which includes fill and line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartSeriesFormatLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the gap width of a chart series.  Only valid on bar and column charts, as well as
    specific classes of line and pie charts.  Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var gapWidth: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the color for maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the type for maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumType: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumValue: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the color for midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the type for midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointType: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointValue: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the color for minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the type for minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumType: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumValue: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the series gradient style of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientStyle: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies if the series has data labels.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabels: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the fill color for negative data points in a series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var invertColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: True if Excel inverts the pattern in the item when it corresponds to a negative number.
    *
    * [Api set: ExcelApi 1.8]
    */
  var invertIfNegative: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Encapsulates the options for a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var mapOptions: js.UndefOr[ChartMapOptionsLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the markers background color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the markers foreground color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the marker size of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the marker style of a chart series. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the name of a series in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies how bars and columns are positioned. Can be a value between –100 and 100. Applies only to 2-D bar and 2-D column charts.
    *
    * [Api set: ExcelApi 1.8]
    */
  var overlap: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the series parent label strategy area for a treemap chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var parentLabelStrategy: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the plot order of a chart series within the chart group.
    *
    * [Api set: ExcelApi 1.7]
    */
  var plotOrder: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns a collection of all points in the series.
    *
    * [Api set: ExcelApi 1.1]
    */
  var points: js.UndefOr[ChartPointsCollectionLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the size of the secondary section of either a pie-of-pie chart or a bar-of-pie chart, as a percentage of the size of the primary pie. Can be a value from 5 to 200.
    *
    * [Api set: ExcelApi 1.8]
    */
  var secondPlotSize: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies whether connector lines are shown in waterfall charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showConnectorLines: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies whether leader lines are displayed for each data label in the series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showLeaderLines: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies if the series has a shadow.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies if the series is smooth. Only applicable to line and scatter charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var smooth: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the way the two sections of either a pie-of-pie chart or a bar-of-pie chart are split.
    *
    * [Api set: ExcelApi 1.8]
    */
  var splitType: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the threshold value that separates two sections of either a pie-of-pie chart or a bar-of-pie chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var splitValue: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: True if Excel assigns a different color or pattern to each data marker. The chart must contain only one series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var varyByCategories: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the error bar object of a chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var xErrorBars: js.UndefOr[ChartErrorBarsLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the error bar object of a chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var yErrorBars: js.UndefOr[ChartErrorBarsLoadOptions] = js.native
}

object ChartSeriesCollectionLoadOptions {
  @scala.inline
  def apply(): ChartSeriesCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesCollectionLoadOptions]
  }
  @scala.inline
  implicit class ChartSeriesCollectionLoadOptionsOps[Self <: ChartSeriesCollectionLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setAxisGroup(value: Boolean): Self = this.set("axisGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisGroup: Self = this.set("axisGroup", js.undefined)
    @scala.inline
    def setBinOptions(value: ChartBinOptionsLoadOptions): Self = this.set("binOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinOptions: Self = this.set("binOptions", js.undefined)
    @scala.inline
    def setBoxwhiskerOptions(value: ChartBoxwhiskerOptionsLoadOptions): Self = this.set("boxwhiskerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxwhiskerOptions: Self = this.set("boxwhiskerOptions", js.undefined)
    @scala.inline
    def setBubbleScale(value: Boolean): Self = this.set("bubbleScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbleScale: Self = this.set("bubbleScale", js.undefined)
    @scala.inline
    def setChartType(value: Boolean): Self = this.set("chartType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartType: Self = this.set("chartType", js.undefined)
    @scala.inline
    def setDataLabels(value: ChartDataLabelsLoadOptions): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    @scala.inline
    def setDoughnutHoleSize(value: Boolean): Self = this.set("doughnutHoleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoughnutHoleSize: Self = this.set("doughnutHoleSize", js.undefined)
    @scala.inline
    def setExplosion(value: Boolean): Self = this.set("explosion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplosion: Self = this.set("explosion", js.undefined)
    @scala.inline
    def setFiltered(value: Boolean): Self = this.set("filtered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiltered: Self = this.set("filtered", js.undefined)
    @scala.inline
    def setFirstSliceAngle(value: Boolean): Self = this.set("firstSliceAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstSliceAngle: Self = this.set("firstSliceAngle", js.undefined)
    @scala.inline
    def setFormat(value: ChartSeriesFormatLoadOptions): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGapWidth(value: Boolean): Self = this.set("gapWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGapWidth: Self = this.set("gapWidth", js.undefined)
    @scala.inline
    def setGradientMaximumColor(value: Boolean): Self = this.set("gradientMaximumColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientMaximumColor: Self = this.set("gradientMaximumColor", js.undefined)
    @scala.inline
    def setGradientMaximumType(value: Boolean): Self = this.set("gradientMaximumType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientMaximumType: Self = this.set("gradientMaximumType", js.undefined)
    @scala.inline
    def setGradientMaximumValue(value: Boolean): Self = this.set("gradientMaximumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientMaximumValue: Self = this.set("gradientMaximumValue", js.undefined)
    @scala.inline
    def setGradientMidpointColor(value: Boolean): Self = this.set("gradientMidpointColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientMidpointColor: Self = this.set("gradientMidpointColor", js.undefined)
    @scala.inline
    def setGradientMidpointType(value: Boolean): Self = this.set("gradientMidpointType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientMidpointType: Self = this.set("gradientMidpointType", js.undefined)
    @scala.inline
    def setGradientMidpointValue(value: Boolean): Self = this.set("gradientMidpointValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientMidpointValue: Self = this.set("gradientMidpointValue", js.undefined)
    @scala.inline
    def setGradientMinimumColor(value: Boolean): Self = this.set("gradientMinimumColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientMinimumColor: Self = this.set("gradientMinimumColor", js.undefined)
    @scala.inline
    def setGradientMinimumType(value: Boolean): Self = this.set("gradientMinimumType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientMinimumType: Self = this.set("gradientMinimumType", js.undefined)
    @scala.inline
    def setGradientMinimumValue(value: Boolean): Self = this.set("gradientMinimumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientMinimumValue: Self = this.set("gradientMinimumValue", js.undefined)
    @scala.inline
    def setGradientStyle(value: Boolean): Self = this.set("gradientStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientStyle: Self = this.set("gradientStyle", js.undefined)
    @scala.inline
    def setHasDataLabels(value: Boolean): Self = this.set("hasDataLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasDataLabels: Self = this.set("hasDataLabels", js.undefined)
    @scala.inline
    def setInvertColor(value: Boolean): Self = this.set("invertColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvertColor: Self = this.set("invertColor", js.undefined)
    @scala.inline
    def setInvertIfNegative(value: Boolean): Self = this.set("invertIfNegative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvertIfNegative: Self = this.set("invertIfNegative", js.undefined)
    @scala.inline
    def setMapOptions(value: ChartMapOptionsLoadOptions): Self = this.set("mapOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapOptions: Self = this.set("mapOptions", js.undefined)
    @scala.inline
    def setMarkerBackgroundColor(value: Boolean): Self = this.set("markerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerBackgroundColor: Self = this.set("markerBackgroundColor", js.undefined)
    @scala.inline
    def setMarkerForegroundColor(value: Boolean): Self = this.set("markerForegroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerForegroundColor: Self = this.set("markerForegroundColor", js.undefined)
    @scala.inline
    def setMarkerSize(value: Boolean): Self = this.set("markerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerSize: Self = this.set("markerSize", js.undefined)
    @scala.inline
    def setMarkerStyle(value: Boolean): Self = this.set("markerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerStyle: Self = this.set("markerStyle", js.undefined)
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOverlap(value: Boolean): Self = this.set("overlap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlap: Self = this.set("overlap", js.undefined)
    @scala.inline
    def setParentLabelStrategy(value: Boolean): Self = this.set("parentLabelStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentLabelStrategy: Self = this.set("parentLabelStrategy", js.undefined)
    @scala.inline
    def setPlotOrder(value: Boolean): Self = this.set("plotOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotOrder: Self = this.set("plotOrder", js.undefined)
    @scala.inline
    def setPoints(value: ChartPointsCollectionLoadOptions): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    @scala.inline
    def setSecondPlotSize(value: Boolean): Self = this.set("secondPlotSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondPlotSize: Self = this.set("secondPlotSize", js.undefined)
    @scala.inline
    def setShowConnectorLines(value: Boolean): Self = this.set("showConnectorLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowConnectorLines: Self = this.set("showConnectorLines", js.undefined)
    @scala.inline
    def setShowLeaderLines(value: Boolean): Self = this.set("showLeaderLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLeaderLines: Self = this.set("showLeaderLines", js.undefined)
    @scala.inline
    def setShowShadow(value: Boolean): Self = this.set("showShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowShadow: Self = this.set("showShadow", js.undefined)
    @scala.inline
    def setSmooth(value: Boolean): Self = this.set("smooth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    @scala.inline
    def setSplitType(value: Boolean): Self = this.set("splitType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitType: Self = this.set("splitType", js.undefined)
    @scala.inline
    def setSplitValue(value: Boolean): Self = this.set("splitValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitValue: Self = this.set("splitValue", js.undefined)
    @scala.inline
    def setVaryByCategories(value: Boolean): Self = this.set("varyByCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVaryByCategories: Self = this.set("varyByCategories", js.undefined)
    @scala.inline
    def setXErrorBars(value: ChartErrorBarsLoadOptions): Self = this.set("xErrorBars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXErrorBars: Self = this.set("xErrorBars", js.undefined)
    @scala.inline
    def setYErrorBars(value: ChartErrorBarsLoadOptions): Self = this.set("yErrorBars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYErrorBars: Self = this.set("yErrorBars", js.undefined)
  }
  
}

