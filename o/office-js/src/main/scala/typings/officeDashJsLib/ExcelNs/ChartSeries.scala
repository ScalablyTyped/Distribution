package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents a series in a chart.
     *
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.ChartSeries")
@js.native
class ChartSeries ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Returns or sets the group for the specified series. Read/Write
           *
           * [Api set: ExcelApi 1.8]
           */
  var axisGroup: ChartAxisGroup | officeDashJsLib.officeDashJsLibStrings.Primary | officeDashJsLib.officeDashJsLibStrings.Secondary = js.native
  /**
           *
           * Represents the chart type of a series. See Excel.ChartType for details.
           *
           * [Api set: ExcelApi 1.7]
           */
  var chartType: /* LimitUnionLength: was union type with length 83 */js.Any = js.native
  /**
           *
           * Represents a collection of all dataLabels in the series.
           *
           * [Api set: ExcelApi 1.8]
           */
  val dataLabels: ChartDataLabels = js.native
  /**
           *
           * Represents the doughnut hole size of a chart series.  Only valid on doughnut and doughnutExploded charts.
              Throws an invalid argument exception on invalid charts.
           *
           * [Api set: ExcelApi 1.7]
           */
  var doughnutHoleSize: scala.Double = js.native
  /**
           *
           * Returns or sets the explosion value for a pie-chart or doughnut-chart slice. Returns 0 (zero) if there's no explosion (the tip of the slice is in the center of the pie). Read/Write.
           *
           * [Api set: ExcelApi 1.8]
           */
  var explosion: scala.Double = js.native
  /**
           *
           * Boolean value representing if the series is filtered or not. Not applicable for surface charts.
           *
           * [Api set: ExcelApi 1.7]
           */
  var filtered: scala.Boolean = js.native
  /**
           *
           * Returns or sets the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts. Can be a value from 0 through 360. Read/Write
           *
           * [Api set: ExcelApi 1.8]
           */
  var firstSliceAngle: scala.Double = js.native
  /**
           *
           * Represents the formatting of a chart series, which includes fill and line formatting. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val format: ChartSeriesFormat = js.native
  /**
           *
           * Represents the gap width of a chart series.  Only valid on bar and column charts, as well as
              specific classes of line and pie charts.  Throws an invalid argument exception on invalid charts.
           *
           * [Api set: ExcelApi 1.7]
           */
  var gapWidth: scala.Double = js.native
  /**
           *
           * Boolean value representing if the series has data labels or not.
           *
           * [Api set: ExcelApi 1.7]
           */
  var hasDataLabels: scala.Boolean = js.native
  /**
           *
           * True if Microsoft Excel inverts the pattern in the item when it corresponds to a negative number. Read/Write.
           *
           * [Api set: ExcelApi 1.8]
           */
  var invertIfNegative: scala.Boolean = js.native
  /**
           *
           * Represents markers background color of a chart series.
           *
           * [Api set: ExcelApi 1.7]
           */
  var markerBackgroundColor: java.lang.String = js.native
  /**
           *
           * Represents markers foreground color of a chart series.
           *
           * [Api set: ExcelApi 1.7]
           */
  var markerForegroundColor: java.lang.String = js.native
  /**
           *
           * Represents marker size of a chart series.
           *
           * [Api set: ExcelApi 1.7]
           */
  var markerSize: scala.Double = js.native
  /**
           *
           * Represents marker style of a chart series. See Excel.ChartMarkerStyle for details.
           *
           * [Api set: ExcelApi 1.7]
           */
  var markerStyle: ChartMarkerStyle | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Square | officeDashJsLib.officeDashJsLibStrings.Diamond | officeDashJsLib.officeDashJsLibStrings.Triangle | officeDashJsLib.officeDashJsLibStrings.X | officeDashJsLib.officeDashJsLibStrings.Star | officeDashJsLib.officeDashJsLibStrings.Dot | officeDashJsLib.officeDashJsLibStrings.Dash | officeDashJsLib.officeDashJsLibStrings.Circle | officeDashJsLib.officeDashJsLibStrings.Plus | officeDashJsLib.officeDashJsLibStrings.Picture = js.native
  /**
           *
           * Represents the name of a series in a chart.
           *
           * [Api set: ExcelApi 1.1]
           */
  var name: java.lang.String = js.native
  /**
           *
           * Specifies how bars and columns are positioned. Can be a value between – 100 and 100. Applies only to 2-D bar and 2-D column charts. Read/Write.
           *
           * [Api set: ExcelApi 1.8]
           */
  var overlap: scala.Double = js.native
  /**
           *
           * Represents the plot order of a chart series within the chart group.
           *
           * [Api set: ExcelApi 1.7]
           */
  var plotOrder: scala.Double = js.native
  /**
           *
           * Represents a collection of all points in the series. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val points: ChartPointsCollection = js.native
  /**
           *
           * Returns or sets the size of the secondary section of either a pie of pie chart or a bar of pie chart, as a percentage of the size of the primary pie. Can be a value from 5 to 200. Read/Write.
           *
           * [Api set: ExcelApi 1.8]
           */
  var secondPlotSize: scala.Double = js.native
  /**
           *
           * Boolean value representing if the series has a shadow or not.
           *
           * [Api set: ExcelApi 1.7]
           */
  var showShadow: scala.Boolean = js.native
  /**
           *
           * Boolean value representing if the series is smooth or not. Only applicable to line and scatter charts.
           *
           * [Api set: ExcelApi 1.7]
           */
  var smooth: scala.Boolean = js.native
  /**
           *
           * Returns or sets the way the two sections of either a pie of pie chart or a bar of pie chart are split. Read/Write.
           *
           * [Api set: ExcelApi 1.8]
           */
  var splitType: officeDashJsLib.officeDashJsLibStrings.SplitByPosition | officeDashJsLib.officeDashJsLibStrings.SplitByValue | officeDashJsLib.officeDashJsLibStrings.SplitByPercentValue | officeDashJsLib.officeDashJsLibStrings.SplitByCustomSplit = js.native
  /**
           *
           * Represents a collection of trendlines in the series. Read-only.
           *
           * [Api set: ExcelApi 1.7]
           */
  val trendlines: ChartTrendlineCollection = js.native
  /**
           *
           * True if Microsoft Excel assigns a different color or pattern to each data marker. The chart must contain only one series. Read/Write.
           *
           * [Api set: ExcelApi 1.8]
           */
  var varyByCategories: scala.Boolean = js.native
  /**
           *
           * Deletes the chart series.
           *
           * [Api set: ExcelApi 1.7]
           */
  def delete(): scala.Unit = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartSeries` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartSeries` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartSeries` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): ChartSeries = js.native
  def load(option: java.lang.String): ChartSeries = js.native
  def load(option: js.Array[java.lang.String]): ChartSeries = js.native
  def load(option: officeDashJsLib.Anon_Select): ChartSeries = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartSeries` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartSeries` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartSeries` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.ChartSeriesLoadOptions): ChartSeries = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartSeries): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ChartSeries): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartSeriesUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ChartSeries): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartSeriesUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
           *
           * Set bubble sizes for a chart series. Only works for bubble charts.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param sourceData The Range object corresponding to the source data.
           */
  def setBubbleSizes(sourceData: Range): scala.Unit = js.native
  /**
           *
           * Set values for a chart series. For scatter chart, it means Y axis values.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param sourceData The Range object corresponding to the source data.
           */
  def setValues(sourceData: Range): scala.Unit = js.native
  /**
           *
           * Set values of X axis for a chart series. Only works for scatter charts.
           *
           * [Api set: ExcelApi 1.7]
           *
           * @param sourceData The Range object corresponding to the source data.
           */
  def setXAxisValues(sourceData: Range): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ChartSeriesData = js.native
}

