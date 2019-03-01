package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartSeries.toJSON()". */
trait ChartSeriesData extends js.Object {
  /**
    *
    * Returns or sets the group for the specified series. Read/Write
    *
    * [Api set: ExcelApi 1.8]
    */
  var axisGroup: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisGroup | officeDashJsLib.officeDashJsLibStrings.Primary | officeDashJsLib.officeDashJsLibStrings.Secondary
  ] = js.undefined
  /**
    *
    * Represents the chart type of a series. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 83 */ js.Any
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
  var doughnutHoleSize: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the explosion value for a pie-chart or doughnut-chart slice. Returns 0 (zero) if there's no explosion (the tip of the slice is in the center of the pie). Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var explosion: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Boolean value representing if the series is filtered or not. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var filtered: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts. Can be a value from 0 through 360. Read/Write
    *
    * [Api set: ExcelApi 1.8]
    */
  var firstSliceAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the formatting of a chart series, which includes fill and line formatting. Read-only.
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
  var gapWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Boolean value representing if the series has data labels or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabels: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * True if Microsoft Excel inverts the pattern in the item when it corresponds to a negative number. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var invertIfNegative: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents markers background color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents markers foreground color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents marker size of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents marker style of a chart series. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartMarkerStyle | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Square | officeDashJsLib.officeDashJsLibStrings.Diamond | officeDashJsLib.officeDashJsLibStrings.Triangle | officeDashJsLib.officeDashJsLibStrings.X | officeDashJsLib.officeDashJsLibStrings.Star | officeDashJsLib.officeDashJsLibStrings.Dot | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.Circle | officeDashJsLib.officeDashJsLibStrings.Plus | officeDashJsLib.officeDashJsLibStrings.Picture
  ] = js.undefined
  /**
    *
    * Represents the name of a series in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Specifies how bars and columns are positioned. Can be a value between –100 and 100. Applies only to 2-D bar and 2-D column charts. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var overlap: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the plot order of a chart series within the chart group.
    *
    * [Api set: ExcelApi 1.7]
    */
  var plotOrder: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents a collection of all points in the series. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var points: js.UndefOr[js.Array[ChartPointData]] = js.undefined
  /**
    *
    * Returns or sets the size of the secondary section of either a pie of pie chart or a bar of pie chart, as a percentage of the size of the primary pie. Can be a value from 5 to 200. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var secondPlotSize: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Boolean value representing if the series has a shadow or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the series is smooth or not. Only applicable to line and scatter charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var smooth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the way the two sections of either a pie of pie chart or a bar of pie chart are split. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var splitType: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartSplitType | officeDashJsLib.officeDashJsLibStrings.SplitByPosition | officeDashJsLib.officeDashJsLibStrings.SplitByValue | officeDashJsLib.officeDashJsLibStrings.SplitByPercentValue | officeDashJsLib.officeDashJsLibStrings.SplitByCustomSplit
  ] = js.undefined
  /**
    *
    * Represents a collection of trendlines in the series. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var trendlines: js.UndefOr[js.Array[ChartTrendlineData]] = js.undefined
  /**
    *
    * True if Microsoft Excel assigns a different color or pattern to each data marker. The chart must contain only one series. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var varyByCategories: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartSeriesData {
  @scala.inline
  def apply(
    axisGroup: officeDashJsLib.ExcelNs.ChartAxisGroup | officeDashJsLib.officeDashJsLibStrings.Primary | officeDashJsLib.officeDashJsLibStrings.Secondary = null,
    chartType: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 83 */ js.Any = null,
    dataLabels: ChartDataLabelsData = null,
    doughnutHoleSize: scala.Int | scala.Double = null,
    explosion: scala.Int | scala.Double = null,
    filtered: js.UndefOr[scala.Boolean] = js.undefined,
    firstSliceAngle: scala.Int | scala.Double = null,
    format: ChartSeriesFormatData = null,
    gapWidth: scala.Int | scala.Double = null,
    hasDataLabels: js.UndefOr[scala.Boolean] = js.undefined,
    invertIfNegative: js.UndefOr[scala.Boolean] = js.undefined,
    markerBackgroundColor: java.lang.String = null,
    markerForegroundColor: java.lang.String = null,
    markerSize: scala.Int | scala.Double = null,
    markerStyle: officeDashJsLib.ExcelNs.ChartMarkerStyle | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Square | officeDashJsLib.officeDashJsLibStrings.Diamond | officeDashJsLib.officeDashJsLibStrings.Triangle | officeDashJsLib.officeDashJsLibStrings.X | officeDashJsLib.officeDashJsLibStrings.Star | officeDashJsLib.officeDashJsLibStrings.Dot | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.Circle | officeDashJsLib.officeDashJsLibStrings.Plus | officeDashJsLib.officeDashJsLibStrings.Picture = null,
    name: java.lang.String = null,
    overlap: scala.Int | scala.Double = null,
    plotOrder: scala.Int | scala.Double = null,
    points: js.Array[ChartPointData] = null,
    secondPlotSize: scala.Int | scala.Double = null,
    showShadow: js.UndefOr[scala.Boolean] = js.undefined,
    smooth: js.UndefOr[scala.Boolean] = js.undefined,
    splitType: officeDashJsLib.ExcelNs.ChartSplitType | officeDashJsLib.officeDashJsLibStrings.SplitByPosition | officeDashJsLib.officeDashJsLibStrings.SplitByValue | officeDashJsLib.officeDashJsLibStrings.SplitByPercentValue | officeDashJsLib.officeDashJsLibStrings.SplitByCustomSplit = null,
    trendlines: js.Array[ChartTrendlineData] = null,
    varyByCategories: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartSeriesData = {
    val __obj = js.Dynamic.literal()
    if (axisGroup != null) __obj.updateDynamic("axisGroup")(axisGroup.asInstanceOf[js.Any])
    if (chartType != null) __obj.updateDynamic("chartType")(chartType)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (doughnutHoleSize != null) __obj.updateDynamic("doughnutHoleSize")(doughnutHoleSize.asInstanceOf[js.Any])
    if (explosion != null) __obj.updateDynamic("explosion")(explosion.asInstanceOf[js.Any])
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered)
    if (firstSliceAngle != null) __obj.updateDynamic("firstSliceAngle")(firstSliceAngle.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (gapWidth != null) __obj.updateDynamic("gapWidth")(gapWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDataLabels)) __obj.updateDynamic("hasDataLabels")(hasDataLabels)
    if (!js.isUndefined(invertIfNegative)) __obj.updateDynamic("invertIfNegative")(invertIfNegative)
    if (markerBackgroundColor != null) __obj.updateDynamic("markerBackgroundColor")(markerBackgroundColor)
    if (markerForegroundColor != null) __obj.updateDynamic("markerForegroundColor")(markerForegroundColor)
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (overlap != null) __obj.updateDynamic("overlap")(overlap.asInstanceOf[js.Any])
    if (plotOrder != null) __obj.updateDynamic("plotOrder")(plotOrder.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points)
    if (secondPlotSize != null) __obj.updateDynamic("secondPlotSize")(secondPlotSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showShadow)) __obj.updateDynamic("showShadow")(showShadow)
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth)
    if (splitType != null) __obj.updateDynamic("splitType")(splitType.asInstanceOf[js.Any])
    if (trendlines != null) __obj.updateDynamic("trendlines")(trendlines)
    if (!js.isUndefined(varyByCategories)) __obj.updateDynamic("varyByCategories")(varyByCategories)
    __obj.asInstanceOf[ChartSeriesData]
  }
}

