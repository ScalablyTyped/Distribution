package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a series in a chart.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartSeriesLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the group for the specified series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var axisGroup: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Encapsulates the bin options for histogram charts and pareto charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var binOptions: js.UndefOr[ChartBinOptionsLoadOptions] = js.undefined
  /**
    *
    * Encapsulates the options for the box and whisker charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var boxwhiskerOptions: js.UndefOr[ChartBoxwhiskerOptionsLoadOptions] = js.undefined
  /**
    *
    * This can be an integer value from 0 (zero) to 300, representing the percentage of the default size. This property only applies to bubble charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bubbleScale: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the chart type of a series. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents a collection of all dataLabels in the series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsLoadOptions] = js.undefined
  /**
    *
    * Represents the doughnut hole size of a chart series.  Only valid on doughnut and doughnutExploded charts.
    Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var doughnutHoleSize: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the explosion value for a pie-chart or doughnut-chart slice. Returns 0 (zero) if there's no explosion (the tip of the slice is in the center of the pie).
    *
    * [Api set: ExcelApi 1.8]
    */
  var explosion: js.UndefOr[Boolean] = js.undefined
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
  var firstSliceAngle: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the formatting of a chart series, which includes fill and line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartSeriesFormatLoadOptions] = js.undefined
  /**
    *
    * Represents the gap width of a chart series.  Only valid on bar and column charts, as well as
    specific classes of line and pie charts.  Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var gapWidth: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the color for maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the type for maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumType: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumValue: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the color for midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the type for midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointType: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointValue: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the color for minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the type for minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumType: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumValue: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the series gradient style of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientStyle: js.UndefOr[Boolean] = js.undefined
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
  var invertColor: js.UndefOr[Boolean] = js.undefined
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
  var mapOptions: js.UndefOr[ChartMapOptionsLoadOptions] = js.undefined
  /**
    *
    * Specifies the markers background color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the markers foreground color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the marker size of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the marker style of a chart series. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the name of a series in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies how bars and columns are positioned. Can be a value between –100 and 100. Applies only to 2-D bar and 2-D column charts.
    *
    * [Api set: ExcelApi 1.8]
    */
  var overlap: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the series parent label strategy area for a treemap chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var parentLabelStrategy: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the plot order of a chart series within the chart group.
    *
    * [Api set: ExcelApi 1.7]
    */
  var plotOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns a collection of all points in the series.
    *
    * [Api set: ExcelApi 1.1]
    */
  var points: js.UndefOr[ChartPointsCollectionLoadOptions] = js.undefined
  /**
    *
    * Specifies the size of the secondary section of either a pie-of-pie chart or a bar-of-pie chart, as a percentage of the size of the primary pie. Can be a value from 5 to 200.
    *
    * [Api set: ExcelApi 1.8]
    */
  var secondPlotSize: js.UndefOr[Boolean] = js.undefined
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
  var splitType: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the threshold value that separates two sections of either a pie-of-pie chart or a bar-of-pie chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var splitValue: js.UndefOr[Boolean] = js.undefined
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
  var xErrorBars: js.UndefOr[ChartErrorBarsLoadOptions] = js.undefined
  /**
    *
    * Represents the error bar object of a chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var yErrorBars: js.UndefOr[ChartErrorBarsLoadOptions] = js.undefined
}

object ChartSeriesLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    axisGroup: js.UndefOr[Boolean] = js.undefined,
    binOptions: ChartBinOptionsLoadOptions = null,
    boxwhiskerOptions: ChartBoxwhiskerOptionsLoadOptions = null,
    bubbleScale: js.UndefOr[Boolean] = js.undefined,
    chartType: js.UndefOr[Boolean] = js.undefined,
    dataLabels: ChartDataLabelsLoadOptions = null,
    doughnutHoleSize: js.UndefOr[Boolean] = js.undefined,
    explosion: js.UndefOr[Boolean] = js.undefined,
    filtered: js.UndefOr[Boolean] = js.undefined,
    firstSliceAngle: js.UndefOr[Boolean] = js.undefined,
    format: ChartSeriesFormatLoadOptions = null,
    gapWidth: js.UndefOr[Boolean] = js.undefined,
    gradientMaximumColor: js.UndefOr[Boolean] = js.undefined,
    gradientMaximumType: js.UndefOr[Boolean] = js.undefined,
    gradientMaximumValue: js.UndefOr[Boolean] = js.undefined,
    gradientMidpointColor: js.UndefOr[Boolean] = js.undefined,
    gradientMidpointType: js.UndefOr[Boolean] = js.undefined,
    gradientMidpointValue: js.UndefOr[Boolean] = js.undefined,
    gradientMinimumColor: js.UndefOr[Boolean] = js.undefined,
    gradientMinimumType: js.UndefOr[Boolean] = js.undefined,
    gradientMinimumValue: js.UndefOr[Boolean] = js.undefined,
    gradientStyle: js.UndefOr[Boolean] = js.undefined,
    hasDataLabels: js.UndefOr[Boolean] = js.undefined,
    invertColor: js.UndefOr[Boolean] = js.undefined,
    invertIfNegative: js.UndefOr[Boolean] = js.undefined,
    mapOptions: ChartMapOptionsLoadOptions = null,
    markerBackgroundColor: js.UndefOr[Boolean] = js.undefined,
    markerForegroundColor: js.UndefOr[Boolean] = js.undefined,
    markerSize: js.UndefOr[Boolean] = js.undefined,
    markerStyle: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    overlap: js.UndefOr[Boolean] = js.undefined,
    parentLabelStrategy: js.UndefOr[Boolean] = js.undefined,
    plotOrder: js.UndefOr[Boolean] = js.undefined,
    points: ChartPointsCollectionLoadOptions = null,
    secondPlotSize: js.UndefOr[Boolean] = js.undefined,
    showConnectorLines: js.UndefOr[Boolean] = js.undefined,
    showLeaderLines: js.UndefOr[Boolean] = js.undefined,
    showShadow: js.UndefOr[Boolean] = js.undefined,
    smooth: js.UndefOr[Boolean] = js.undefined,
    splitType: js.UndefOr[Boolean] = js.undefined,
    splitValue: js.UndefOr[Boolean] = js.undefined,
    varyByCategories: js.UndefOr[Boolean] = js.undefined,
    xErrorBars: ChartErrorBarsLoadOptions = null,
    yErrorBars: ChartErrorBarsLoadOptions = null
  ): ChartSeriesLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisGroup)) __obj.updateDynamic("axisGroup")(axisGroup.get.asInstanceOf[js.Any])
    if (binOptions != null) __obj.updateDynamic("binOptions")(binOptions.asInstanceOf[js.Any])
    if (boxwhiskerOptions != null) __obj.updateDynamic("boxwhiskerOptions")(boxwhiskerOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbleScale)) __obj.updateDynamic("bubbleScale")(bubbleScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chartType)) __obj.updateDynamic("chartType")(chartType.get.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(doughnutHoleSize)) __obj.updateDynamic("doughnutHoleSize")(doughnutHoleSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(explosion)) __obj.updateDynamic("explosion")(explosion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstSliceAngle)) __obj.updateDynamic("firstSliceAngle")(firstSliceAngle.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(gapWidth)) __obj.updateDynamic("gapWidth")(gapWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientMaximumColor)) __obj.updateDynamic("gradientMaximumColor")(gradientMaximumColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientMaximumType)) __obj.updateDynamic("gradientMaximumType")(gradientMaximumType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientMaximumValue)) __obj.updateDynamic("gradientMaximumValue")(gradientMaximumValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientMidpointColor)) __obj.updateDynamic("gradientMidpointColor")(gradientMidpointColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientMidpointType)) __obj.updateDynamic("gradientMidpointType")(gradientMidpointType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientMidpointValue)) __obj.updateDynamic("gradientMidpointValue")(gradientMidpointValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientMinimumColor)) __obj.updateDynamic("gradientMinimumColor")(gradientMinimumColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientMinimumType)) __obj.updateDynamic("gradientMinimumType")(gradientMinimumType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientMinimumValue)) __obj.updateDynamic("gradientMinimumValue")(gradientMinimumValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientStyle)) __obj.updateDynamic("gradientStyle")(gradientStyle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDataLabels)) __obj.updateDynamic("hasDataLabels")(hasDataLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invertColor)) __obj.updateDynamic("invertColor")(invertColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invertIfNegative)) __obj.updateDynamic("invertIfNegative")(invertIfNegative.get.asInstanceOf[js.Any])
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(markerBackgroundColor)) __obj.updateDynamic("markerBackgroundColor")(markerBackgroundColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(markerForegroundColor)) __obj.updateDynamic("markerForegroundColor")(markerForegroundColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(markerSize)) __obj.updateDynamic("markerSize")(markerSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(markerStyle)) __obj.updateDynamic("markerStyle")(markerStyle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parentLabelStrategy)) __obj.updateDynamic("parentLabelStrategy")(parentLabelStrategy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(plotOrder)) __obj.updateDynamic("plotOrder")(plotOrder.get.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(secondPlotSize)) __obj.updateDynamic("secondPlotSize")(secondPlotSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showConnectorLines)) __obj.updateDynamic("showConnectorLines")(showConnectorLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLeaderLines)) __obj.updateDynamic("showLeaderLines")(showLeaderLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showShadow)) __obj.updateDynamic("showShadow")(showShadow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(splitType)) __obj.updateDynamic("splitType")(splitType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(splitValue)) __obj.updateDynamic("splitValue")(splitValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(varyByCategories)) __obj.updateDynamic("varyByCategories")(varyByCategories.get.asInstanceOf[js.Any])
    if (xErrorBars != null) __obj.updateDynamic("xErrorBars")(xErrorBars.asInstanceOf[js.Any])
    if (yErrorBars != null) __obj.updateDynamic("yErrorBars")(yErrorBars.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesLoadOptions]
  }
}

