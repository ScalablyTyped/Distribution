package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartSeriesData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartSeriesLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartSeriesUpdateData
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.UpdateOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Banner
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Circle
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dash
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Diamond
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Dot
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ExtremeValue
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Invalid
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Number
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Overlapping
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Percent
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Picture
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Plus
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Primary
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Secondary
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SplitByCustomSplit
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SplitByPercentValue
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SplitByPosition
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SplitByValue
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Square
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Star
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreePhaseColor
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Triangle
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TwoPhaseColor
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.X
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
class ChartSeries () extends ClientObject {
  /**
    *
    * Returns or sets the group for the specified series. Read/Write
    *
    * [Api set: ExcelApi 1.8]
    */
  var axisGroup: ChartAxisGroup | Primary | Secondary = js.native
  /**
    *
    * Encapsulates the bin options for histogram charts and pareto charts. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val binOptions: ChartBinOptions = js.native
  /**
    *
    * Encapsulates the options for the box and whisker charts. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val boxwhiskerOptions: ChartBoxwhiskerOptions = js.native
  /**
    *
    * This can be an integer value from 0 (zero) to 300, representing the percentage of the default size. This property only applies to bubble charts. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bubbleScale: Double = js.native
  /**
    *
    * Represents the chart type of a series. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 83 */ js.Any = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartSeries: RequestContext = js.native
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
  var doughnutHoleSize: Double = js.native
  /**
    *
    * Returns or sets the explosion value for a pie-chart or doughnut-chart slice. Returns 0 (zero) if there's no explosion (the tip of the slice is in the center of the pie). Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var explosion: Double = js.native
  /**
    *
    * Boolean value representing if the series is filtered or not. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var filtered: Boolean = js.native
  /**
    *
    * Returns or sets the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts. Can be a value from 0 through 360. Read/Write
    *
    * [Api set: ExcelApi 1.8]
    */
  var firstSliceAngle: Double = js.native
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
  var gapWidth: Double = js.native
  /**
    *
    * Returns or sets the color for maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumColor: String = js.native
  /**
    *
    * Returns or sets the type for maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumType: ChartGradientStyleType | ExtremeValue | Number | Percent = js.native
  /**
    *
    * Returns or sets the maximum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumValue: Double = js.native
  /**
    *
    * Returns or sets the color for midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointColor: String = js.native
  /**
    *
    * Returns or sets the type for midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointType: ChartGradientStyleType | ExtremeValue | Number | Percent = js.native
  /**
    *
    * Returns or sets the midpoint value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointValue: Double = js.native
  /**
    *
    * Returns or sets the color for minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumColor: String = js.native
  /**
    *
    * Returns or sets the type for minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumType: ChartGradientStyleType | ExtremeValue | Number | Percent = js.native
  /**
    *
    * Returns or sets the minimum value of a region map chart series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumValue: Double = js.native
  /**
    *
    * Returns or sets series gradient style of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientStyle: ChartGradientStyle | TwoPhaseColor | ThreePhaseColor = js.native
  /**
    *
    * Boolean value representing if the series has data labels or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabels: Boolean = js.native
  /**
    *
    * Returns or sets the fill color for negative data points in a series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var invertColor: String = js.native
  /**
    *
    * True if Microsoft Excel inverts the pattern in the item when it corresponds to a negative number. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var invertIfNegative: Boolean = js.native
  /**
    *
    * Encapsulates the options for a region map chart. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val mapOptions: ChartMapOptions = js.native
  /**
    *
    * Represents markers background color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: String = js.native
  /**
    *
    * Represents markers foreground color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: String = js.native
  /**
    *
    * Represents marker size of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: Double = js.native
  /**
    *
    * Represents marker style of a chart series. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture = js.native
  /**
    *
    * Represents the name of a series in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: String = js.native
  /**
    *
    * Specifies how bars and columns are positioned. Can be a value between –100 and 100. Applies only to 2-D bar and 2-D column charts. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var overlap: Double = js.native
  /**
    *
    * Returns or sets the series parent label strategy area for a treemap chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var parentLabelStrategy: ChartParentLabelStrategy | None | Banner | Overlapping = js.native
  /**
    *
    * Represents the plot order of a chart series within the chart group.
    *
    * [Api set: ExcelApi 1.7]
    */
  var plotOrder: Double = js.native
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
  var secondPlotSize: Double = js.native
  /**
    *
    * Specifies whether or not connector lines are shown in waterfall charts. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showConnectorLines: Boolean = js.native
  /**
    *
    * Specifies whether or not leader lines are displayed for each data label in the series. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showLeaderLines: Boolean = js.native
  /**
    *
    * Boolean value representing if the series has a shadow or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: Boolean = js.native
  /**
    *
    * Boolean value representing if the series is smooth or not. Only applicable to line and scatter charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var smooth: Boolean = js.native
  /**
    *
    * Returns or sets the way the two sections of either a pie of pie chart or a bar of pie chart are split. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var splitType: ChartSplitType | SplitByPosition | SplitByValue | SplitByPercentValue | SplitByCustomSplit = js.native
  /**
    *
    * Returns or sets the threshold value that separates two sections of either a pie-of-pie chart or a bar-of-pie chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var splitValue: Double = js.native
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
  var varyByCategories: Boolean = js.native
  /**
    *
    * Represents the error bar object of a chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  val xErrorBars: ChartErrorBars = js.native
  /**
    *
    * Represents the error bar object of a chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  val yErrorBars: ChartErrorBars = js.native
  /**
    *
    * Deletes the chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  def delete(): Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartSeries = js.native
  def load(options: ChartSeriesLoadOptions): ChartSeries = js.native
  def load(propertyNamesAndPaths: Anon_Expand): ChartSeries = js.native
  def load(propertyNames: String): ChartSeries = js.native
  def load(propertyNames: js.Array[String]): ChartSeries = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartSeries): Unit = js.native
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
  def set(properties: ChartSeriesUpdateData): Unit = js.native
  def set(properties: ChartSeriesUpdateData, options: UpdateOptions): Unit = js.native
  /**
    *
    * Set bubble sizes for a chart series. Only works for bubble charts.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param sourceData The Range object corresponding to the source data.
    */
  def setBubbleSizes(sourceData: Range): Unit = js.native
  /**
    *
    * Set values for a chart series. For scatter chart, it means Y axis values.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param sourceData The Range object corresponding to the source data.
    */
  def setValues(sourceData: Range): Unit = js.native
  /**
    *
    * Set values of X axis for a chart series. Only works for scatter charts.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param sourceData The Range object corresponding to the source data.
    */
  def setXAxisValues(sourceData: Range): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartSeries object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartSeriesData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartSeriesData = js.native
}

