package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.ChartSeriesData
import typings.officeJsPreview.Excel.Interfaces.ChartSeriesLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ChartSeriesUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.Banner
import typings.officeJsPreview.officeJsPreviewStrings.BubbleSizes
import typings.officeJsPreview.officeJsPreviewStrings.Categories
import typings.officeJsPreview.officeJsPreviewStrings.Circle
import typings.officeJsPreview.officeJsPreviewStrings.Dash
import typings.officeJsPreview.officeJsPreviewStrings.Diamond
import typings.officeJsPreview.officeJsPreviewStrings.Dot
import typings.officeJsPreview.officeJsPreviewStrings.ExtremeValue
import typings.officeJsPreview.officeJsPreviewStrings.Invalid
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Number
import typings.officeJsPreview.officeJsPreviewStrings.Overlapping
import typings.officeJsPreview.officeJsPreviewStrings.Percent
import typings.officeJsPreview.officeJsPreviewStrings.Picture
import typings.officeJsPreview.officeJsPreviewStrings.Plus
import typings.officeJsPreview.officeJsPreviewStrings.Primary
import typings.officeJsPreview.officeJsPreviewStrings.Secondary
import typings.officeJsPreview.officeJsPreviewStrings.SplitByCustomSplit
import typings.officeJsPreview.officeJsPreviewStrings.SplitByPercentValue
import typings.officeJsPreview.officeJsPreviewStrings.SplitByPosition
import typings.officeJsPreview.officeJsPreviewStrings.SplitByValue
import typings.officeJsPreview.officeJsPreviewStrings.Square
import typings.officeJsPreview.officeJsPreviewStrings.Star
import typings.officeJsPreview.officeJsPreviewStrings.ThreePhaseColor
import typings.officeJsPreview.officeJsPreviewStrings.Triangle
import typings.officeJsPreview.officeJsPreviewStrings.TwoPhaseColor
import typings.officeJsPreview.officeJsPreviewStrings.Values
import typings.officeJsPreview.officeJsPreviewStrings.X
import typings.officeJsPreview.officeJsPreviewStrings.XValues
import typings.officeJsPreview.officeJsPreviewStrings.YValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a series in a chart.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartSeries extends ClientObject {
  
  /**
    *
    * Specifies the group for the specified series.
    *
    * [Api set: ExcelApi 1.8]
    */
  var axisGroup: ChartAxisGroup | Primary | Secondary = js.native
  
  /**
    *
    * Encapsulates the bin options for histogram charts and pareto charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  val binOptions: ChartBinOptions = js.native
  
  /**
    *
    * Encapsulates the options for the box and whisker charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  val boxwhiskerOptions: ChartBoxwhiskerOptions = js.native
  
  /**
    *
    * This can be an integer value from 0 (zero) to 300, representing the percentage of the default size. This property only applies to bubble charts.
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
  var chartType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 83 */ js.Any = js.native
  
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
    * Deletes the chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  def delete(): Unit = js.native
  
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
    * Specifies the explosion value for a pie-chart or doughnut-chart slice. Returns 0 (zero) if there's no explosion (the tip of the slice is in the center of the pie).
    *
    * [Api set: ExcelApi 1.8]
    */
  var explosion: Double = js.native
  
  /**
    *
    * Specifies if the series is filtered. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var filtered: Boolean = js.native
  
  /**
    *
    * Specifies the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts. Can be a value from 0 through 360.
    *
    * [Api set: ExcelApi 1.8]
    */
  var firstSliceAngle: Double = js.native
  
  /**
    *
    * Represents the formatting of a chart series, which includes fill and line formatting.
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
    * Gets the values from a single dimension of the chart series. These could be either category values or data values, depending on the dimension specified and how the data is mapped for the chart series.
    *
    * [Api set: ExcelApi 1.12]
    *
    * @param dimension the dimension of axis where the data from
    */
  def getDimensionValues(dimension: ChartSeriesDimension): ClientResult[js.Array[String]] = js.native
  @JSName("getDimensionValues")
  def getDimensionValues_BubbleSizes(dimension: BubbleSizes): ClientResult[js.Array[String]] = js.native
  /**
    * Gets the values from a single dimension of the chart series. These could be either category values or data values, depending on the dimension specified and how the data is mapped for the chart series.
    *
    * [Api set: ExcelApi 1.12]
    *
    * @param dimension the dimension of axis where the data from
    */
  @JSName("getDimensionValues")
  def getDimensionValues_Categories(dimension: Categories): ClientResult[js.Array[String]] = js.native
  @JSName("getDimensionValues")
  def getDimensionValues_Values(dimension: Values): ClientResult[js.Array[String]] = js.native
  @JSName("getDimensionValues")
  def getDimensionValues_XValues(dimension: XValues): ClientResult[js.Array[String]] = js.native
  @JSName("getDimensionValues")
  def getDimensionValues_YValues(dimension: YValues): ClientResult[js.Array[String]] = js.native
  
  /**
    *
    * Specifies the color for maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumColor: String = js.native
  
  /**
    *
    * Specifies the type for maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumType: ChartGradientStyleType | ExtremeValue | Number | Percent = js.native
  
  /**
    *
    * Specifies the maximum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumValue: Double = js.native
  
  /**
    *
    * Specifies the color for midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointColor: String = js.native
  
  /**
    *
    * Specifies the type for midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointType: ChartGradientStyleType | ExtremeValue | Number | Percent = js.native
  
  /**
    *
    * Specifies the midpoint value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointValue: Double = js.native
  
  /**
    *
    * Specifies the color for minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumColor: String = js.native
  
  /**
    *
    * Specifies the type for minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumType: ChartGradientStyleType | ExtremeValue | Number | Percent = js.native
  
  /**
    *
    * Specifies the minimum value of a region map chart series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumValue: Double = js.native
  
  /**
    *
    * Specifies the series gradient style of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var gradientStyle: ChartGradientStyle | TwoPhaseColor | ThreePhaseColor = js.native
  
  /**
    *
    * Specifies if the series has data labels.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabels: Boolean = js.native
  
  /**
    *
    * Specifies the fill color for negative data points in a series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var invertColor: String = js.native
  
  /**
    *
    * True if Excel inverts the pattern in the item when it corresponds to a negative number.
    *
    * [Api set: ExcelApi 1.8]
    */
  var invertIfNegative: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartSeries = js.native
  def load(options: ChartSeriesLoadOptions): ChartSeries = js.native
  def load(propertyNamesAndPaths: Expand): ChartSeries = js.native
  def load(propertyNames: String): ChartSeries = js.native
  def load(propertyNames: js.Array[String]): ChartSeries = js.native
  
  /**
    *
    * Encapsulates the options for a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  val mapOptions: ChartMapOptions = js.native
  
  /**
    *
    * Specifies the markers background color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: String = js.native
  
  /**
    *
    * Specifies the markers foreground color of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: String = js.native
  
  /**
    *
    * Specifies the marker size of a chart series.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: Double = js.native
  
  /**
    *
    * Specifies the marker style of a chart series. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture = js.native
  
  /**
    *
    * Specifies the name of a series in a chart. The name's length should not be greater than 255 characters.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: String = js.native
  
  /**
    *
    * Specifies how bars and columns are positioned. Can be a value between –100 and 100. Applies only to 2-D bar and 2-D column charts.
    *
    * [Api set: ExcelApi 1.8]
    */
  var overlap: Double = js.native
  
  /**
    *
    * Specifies the series parent label strategy area for a treemap chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var parentLabelStrategy: ChartParentLabelStrategy | None | Banner | Overlapping = js.native
  
  /**
    *
    * Specifies the plot order of a chart series within the chart group.
    *
    * [Api set: ExcelApi 1.7]
    */
  var plotOrder: Double = js.native
  
  /**
    *
    * Returns a collection of all points in the series.
    *
    * [Api set: ExcelApi 1.1]
    */
  val points: ChartPointsCollection = js.native
  
  /**
    *
    * Specifies the size of the secondary section of either a pie-of-pie chart or a bar-of-pie chart, as a percentage of the size of the primary pie. Can be a value from 5 to 200.
    *
    * [Api set: ExcelApi 1.8]
    */
  var secondPlotSize: Double = js.native
  
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
    * Sets the bubble sizes for a chart series. Only works for bubble charts.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param sourceData The Range object corresponding to the source data.
    */
  def setBubbleSizes(sourceData: Range): Unit = js.native
  
  /**
    * Sets the values for a chart series. For scatter chart, it means Y axis values.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param sourceData The Range object corresponding to the source data.
    */
  def setValues(sourceData: Range): Unit = js.native
  
  /**
    * Sets the values of the X axis for a chart series. Only works for scatter charts.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param sourceData The Range object corresponding to the source data.
    */
  def setXAxisValues(sourceData: Range): Unit = js.native
  
  /**
    *
    * Specifies whether connector lines are shown in waterfall charts.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showConnectorLines: Boolean = js.native
  
  /**
    *
    * Specifies whether leader lines are displayed for each data label in the series.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showLeaderLines: Boolean = js.native
  
  /**
    *
    * Specifies if the series has a shadow.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: Boolean = js.native
  
  /**
    *
    * Specifies if the series is smooth. Only applicable to line and scatter charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var smooth: Boolean = js.native
  
  /**
    *
    * Specifies the way the two sections of either a pie-of-pie chart or a bar-of-pie chart are split.
    *
    * [Api set: ExcelApi 1.8]
    */
  var splitType: ChartSplitType | SplitByPosition | SplitByValue | SplitByPercentValue | SplitByCustomSplit = js.native
  
  /**
    *
    * Specifies the threshold value that separates two sections of either a pie-of-pie chart or a bar-of-pie chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var splitValue: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartSeries object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartSeriesData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartSeriesData = js.native
  
  /**
    *
    * The collection of trendlines in the series.
    *
    * [Api set: ExcelApi 1.7]
    */
  val trendlines: ChartTrendlineCollection = js.native
  
  /**
    *
    * True if Excel assigns a different color or pattern to each data marker. The chart must contain only one series.
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
}
