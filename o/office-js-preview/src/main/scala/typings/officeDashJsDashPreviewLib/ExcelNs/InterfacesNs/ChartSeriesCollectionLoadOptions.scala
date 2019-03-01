package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of chart series.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartSeriesCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the group for the specified series. Read/Write
    *
    * [Api set: ExcelApi 1.8]
    */
  var axisGroup: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Encapsulates the bin options only for histogram chart and pareto chart.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var binOptions: js.UndefOr[ChartBinOptionsLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Encapsulates the options for the Box & Whisker chart.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var boxwhiskerOptions: js.UndefOr[ChartBoxwhiskerOptionsLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the scale factor for bubbles in the specified chart group. Can be an integer value from 0 (zero) to 300, corresponding to a percentage of the default size. Applies only to bubble charts. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var bubbleScale: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the chart type of a series. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents a collection of all dataLabels in the series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the doughnut hole size of a chart series.  Only valid on doughnut and doughnutExploded charts.
    Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var doughnutHoleSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the explosion value for a pie-chart or doughnut-chart slice. Returns 0 (zero) if there's no explosion (the tip of the slice is in the center of the pie). Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var explosion: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Boolean value representing if the series is filtered or not. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var filtered: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts. Can be a value from 0 through 360. Read/Write
    *
    * [Api set: ExcelApi 1.8]
    */
  var firstSliceAngle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the formatting of a chart series, which includes fill and line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartSeriesFormatLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the gap width of a chart series.  Only valid on bar and column charts, as well as
    specific classes of line and pie charts.  Throws an invalid argument exception on invalid charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var gapWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the Color for maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMaximumColor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the type for maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMaximumType: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMaximumValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the Color for midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMidpointColor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the type for midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMidpointType: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMidpointValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the Color for minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMinimumColor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the type for minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMinimumType: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientMinimumValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets series gradient style of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var gradientStyle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Boolean value representing if the series has data labels or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabels: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the fill color for negative data points in a series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var invertColor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: True if Microsoft Excel inverts the pattern in the item when it corresponds to a negative number. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var invertIfNegative: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Encapsulates the options for the Map chart.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var mapOptions: js.UndefOr[ChartMapOptionsLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents markers background color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents markers foreground color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents marker size of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents marker style of a chart series. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the name of a series in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Specifies how bars and columns are positioned. Can be a value between –100 and 100. Applies only to 2-D bar and 2-D column charts. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var overlap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets series parent label strategy area of a treemap chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var parentLabelStrategy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the plot order of a chart series within the chart group.
    *
    * [Api set: ExcelApi 1.7]
    */
  var plotOrder: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents a collection of all points in the series.
    *
    * [Api set: ExcelApi 1.1]
    */
  var points: js.UndefOr[ChartPointsCollectionLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the size of the secondary section of either a pie of pie chart or a bar of pie chart, as a percentage of the size of the primary pie. Can be a value from 5 to 200. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var secondPlotSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets if connector lines show in a waterfall chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var showConnectorLines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: True if Microsoft Excel show leaderlines for each datalabel in series. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var showLeaderLines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Boolean value representing if the series has a shadow or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Boolean value representing if the series is smooth or not. Only applicable to line and scatter charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var smooth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the way the two sections of either a pie of pie chart or a bar of pie chart are split. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var splitType: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets the threshold value separating the two sections of either a pie of pie chart or a bar of pie chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var splitValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: True if Microsoft Excel assigns a different color or pattern to each data marker. The chart must contain only one series. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var varyByCategories: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the error bar object for a chart series.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var xerrorBars: js.UndefOr[ChartErrorBarsLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the error bar object for a chart series.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var yerrorBars: js.UndefOr[ChartErrorBarsLoadOptions] = js.undefined
}

object ChartSeriesCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    axisGroup: js.UndefOr[scala.Boolean] = js.undefined,
    binOptions: ChartBinOptionsLoadOptions = null,
    boxwhiskerOptions: ChartBoxwhiskerOptionsLoadOptions = null,
    bubbleScale: js.UndefOr[scala.Boolean] = js.undefined,
    chartType: js.UndefOr[scala.Boolean] = js.undefined,
    dataLabels: ChartDataLabelsLoadOptions = null,
    doughnutHoleSize: js.UndefOr[scala.Boolean] = js.undefined,
    explosion: js.UndefOr[scala.Boolean] = js.undefined,
    filtered: js.UndefOr[scala.Boolean] = js.undefined,
    firstSliceAngle: js.UndefOr[scala.Boolean] = js.undefined,
    format: ChartSeriesFormatLoadOptions = null,
    gapWidth: js.UndefOr[scala.Boolean] = js.undefined,
    gradientMaximumColor: js.UndefOr[scala.Boolean] = js.undefined,
    gradientMaximumType: js.UndefOr[scala.Boolean] = js.undefined,
    gradientMaximumValue: js.UndefOr[scala.Boolean] = js.undefined,
    gradientMidpointColor: js.UndefOr[scala.Boolean] = js.undefined,
    gradientMidpointType: js.UndefOr[scala.Boolean] = js.undefined,
    gradientMidpointValue: js.UndefOr[scala.Boolean] = js.undefined,
    gradientMinimumColor: js.UndefOr[scala.Boolean] = js.undefined,
    gradientMinimumType: js.UndefOr[scala.Boolean] = js.undefined,
    gradientMinimumValue: js.UndefOr[scala.Boolean] = js.undefined,
    gradientStyle: js.UndefOr[scala.Boolean] = js.undefined,
    hasDataLabels: js.UndefOr[scala.Boolean] = js.undefined,
    invertColor: js.UndefOr[scala.Boolean] = js.undefined,
    invertIfNegative: js.UndefOr[scala.Boolean] = js.undefined,
    mapOptions: ChartMapOptionsLoadOptions = null,
    markerBackgroundColor: js.UndefOr[scala.Boolean] = js.undefined,
    markerForegroundColor: js.UndefOr[scala.Boolean] = js.undefined,
    markerSize: js.UndefOr[scala.Boolean] = js.undefined,
    markerStyle: js.UndefOr[scala.Boolean] = js.undefined,
    name: js.UndefOr[scala.Boolean] = js.undefined,
    overlap: js.UndefOr[scala.Boolean] = js.undefined,
    parentLabelStrategy: js.UndefOr[scala.Boolean] = js.undefined,
    plotOrder: js.UndefOr[scala.Boolean] = js.undefined,
    points: ChartPointsCollectionLoadOptions = null,
    secondPlotSize: js.UndefOr[scala.Boolean] = js.undefined,
    showConnectorLines: js.UndefOr[scala.Boolean] = js.undefined,
    showLeaderLines: js.UndefOr[scala.Boolean] = js.undefined,
    showShadow: js.UndefOr[scala.Boolean] = js.undefined,
    smooth: js.UndefOr[scala.Boolean] = js.undefined,
    splitType: js.UndefOr[scala.Boolean] = js.undefined,
    splitValue: js.UndefOr[scala.Boolean] = js.undefined,
    varyByCategories: js.UndefOr[scala.Boolean] = js.undefined,
    xerrorBars: ChartErrorBarsLoadOptions = null,
    yerrorBars: ChartErrorBarsLoadOptions = null
  ): ChartSeriesCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(axisGroup)) __obj.updateDynamic("axisGroup")(axisGroup)
    if (binOptions != null) __obj.updateDynamic("binOptions")(binOptions)
    if (boxwhiskerOptions != null) __obj.updateDynamic("boxwhiskerOptions")(boxwhiskerOptions)
    if (!js.isUndefined(bubbleScale)) __obj.updateDynamic("bubbleScale")(bubbleScale)
    if (!js.isUndefined(chartType)) __obj.updateDynamic("chartType")(chartType)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (!js.isUndefined(doughnutHoleSize)) __obj.updateDynamic("doughnutHoleSize")(doughnutHoleSize)
    if (!js.isUndefined(explosion)) __obj.updateDynamic("explosion")(explosion)
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered)
    if (!js.isUndefined(firstSliceAngle)) __obj.updateDynamic("firstSliceAngle")(firstSliceAngle)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(gapWidth)) __obj.updateDynamic("gapWidth")(gapWidth)
    if (!js.isUndefined(gradientMaximumColor)) __obj.updateDynamic("gradientMaximumColor")(gradientMaximumColor)
    if (!js.isUndefined(gradientMaximumType)) __obj.updateDynamic("gradientMaximumType")(gradientMaximumType)
    if (!js.isUndefined(gradientMaximumValue)) __obj.updateDynamic("gradientMaximumValue")(gradientMaximumValue)
    if (!js.isUndefined(gradientMidpointColor)) __obj.updateDynamic("gradientMidpointColor")(gradientMidpointColor)
    if (!js.isUndefined(gradientMidpointType)) __obj.updateDynamic("gradientMidpointType")(gradientMidpointType)
    if (!js.isUndefined(gradientMidpointValue)) __obj.updateDynamic("gradientMidpointValue")(gradientMidpointValue)
    if (!js.isUndefined(gradientMinimumColor)) __obj.updateDynamic("gradientMinimumColor")(gradientMinimumColor)
    if (!js.isUndefined(gradientMinimumType)) __obj.updateDynamic("gradientMinimumType")(gradientMinimumType)
    if (!js.isUndefined(gradientMinimumValue)) __obj.updateDynamic("gradientMinimumValue")(gradientMinimumValue)
    if (!js.isUndefined(gradientStyle)) __obj.updateDynamic("gradientStyle")(gradientStyle)
    if (!js.isUndefined(hasDataLabels)) __obj.updateDynamic("hasDataLabels")(hasDataLabels)
    if (!js.isUndefined(invertColor)) __obj.updateDynamic("invertColor")(invertColor)
    if (!js.isUndefined(invertIfNegative)) __obj.updateDynamic("invertIfNegative")(invertIfNegative)
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions)
    if (!js.isUndefined(markerBackgroundColor)) __obj.updateDynamic("markerBackgroundColor")(markerBackgroundColor)
    if (!js.isUndefined(markerForegroundColor)) __obj.updateDynamic("markerForegroundColor")(markerForegroundColor)
    if (!js.isUndefined(markerSize)) __obj.updateDynamic("markerSize")(markerSize)
    if (!js.isUndefined(markerStyle)) __obj.updateDynamic("markerStyle")(markerStyle)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap)
    if (!js.isUndefined(parentLabelStrategy)) __obj.updateDynamic("parentLabelStrategy")(parentLabelStrategy)
    if (!js.isUndefined(plotOrder)) __obj.updateDynamic("plotOrder")(plotOrder)
    if (points != null) __obj.updateDynamic("points")(points)
    if (!js.isUndefined(secondPlotSize)) __obj.updateDynamic("secondPlotSize")(secondPlotSize)
    if (!js.isUndefined(showConnectorLines)) __obj.updateDynamic("showConnectorLines")(showConnectorLines)
    if (!js.isUndefined(showLeaderLines)) __obj.updateDynamic("showLeaderLines")(showLeaderLines)
    if (!js.isUndefined(showShadow)) __obj.updateDynamic("showShadow")(showShadow)
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth)
    if (!js.isUndefined(splitType)) __obj.updateDynamic("splitType")(splitType)
    if (!js.isUndefined(splitValue)) __obj.updateDynamic("splitValue")(splitValue)
    if (!js.isUndefined(varyByCategories)) __obj.updateDynamic("varyByCategories")(varyByCategories)
    if (xerrorBars != null) __obj.updateDynamic("xerrorBars")(xerrorBars)
    if (yerrorBars != null) __obj.updateDynamic("yerrorBars")(yerrorBars)
    __obj.asInstanceOf[ChartSeriesCollectionLoadOptions]
  }
}

