package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.ChartSeriesData
import typings.officeJs.Excel.Interfaces.ChartSeriesLoadOptions
import typings.officeJs.Excel.Interfaces.ChartSeriesUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.Banner
import typings.officeJs.officeJsStrings.BubbleSizes
import typings.officeJs.officeJsStrings.Categories
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
import typings.officeJs.officeJsStrings.Values
import typings.officeJs.officeJsStrings.X
import typings.officeJs.officeJsStrings.XValues
import typings.officeJs.officeJsStrings.YValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a series in a chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartSeries
  extends StObject
     with ClientObject {
  
  /**
    * Specifies the group for the specified series.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var axisGroup: ChartAxisGroup | Primary | Secondary = js.native
  
  /**
    * Encapsulates the bin options for histogram charts and pareto charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val binOptions: ChartBinOptions = js.native
  
  /**
    * Encapsulates the options for the box and whisker charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val boxwhiskerOptions: ChartBoxwhiskerOptions = js.native
  
  /**
    * This can be an integer value from 0 (zero) to 300, representing the percentage of the default size. This property only applies to bubble charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var bubbleScale: Double = js.native
  
  /**
    * Represents the chart type of a series. See `Excel.ChartType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var chartType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 83 */ Any = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartSeries: RequestContext = js.native
  
  /**
    * Represents a collection of all data labels in the series.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val dataLabels: ChartDataLabels = js.native
  
  /**
    * Deletes the chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  def delete(): Unit = js.native
  
  /**
    * Represents the doughnut hole size of a chart series. Only valid on doughnut and doughnut exploded charts.
    Throws an `InvalidArgument` error on invalid charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var doughnutHoleSize: Double = js.native
  
  /**
    * Specifies the explosion value for a pie-chart or doughnut-chart slice. Returns 0 (zero) if there's no explosion (the tip of the slice is in the center of the pie).
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var explosion: Double = js.native
  
  /**
    * Specifies if the series is filtered. Not applicable for surface charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var filtered: Boolean = js.native
  
  /**
    * Specifies the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts. Can be a value from 0 through 360.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var firstSliceAngle: Double = js.native
  
  /**
    * Represents the formatting of a chart series, which includes fill and line formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartSeriesFormat = js.native
  
  /**
    * Represents the gap width of a chart series. Only valid on bar and column charts, as well as
    specific classes of line and pie charts. Throws an invalid argument exception on invalid charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var gapWidth: Double = js.native
  
  /**
    * Gets the string representation of the data source of the chart series. The string representation could be information such as a cell address.
    *
    * @remarks
    * [Api set: ExcelApi 1.15]
    *
    * @param dimension The dimension of the axis where the data is from.
    */
  def getDimensionDataSourceString(dimension: Categories | Values | XValues | YValues | BubbleSizes): ClientResult[String] = js.native
  /**
    * Gets the string representation of the data source of the chart series. The string representation could be information such as a cell address.
    *
    * @remarks
    * [Api set: ExcelApi 1.15]
    *
    * @param dimension The dimension of the axis where the data is from.
    */
  def getDimensionDataSourceString(dimension: ChartSeriesDimension): ClientResult[String] = js.native
  
  /**
    * Gets the data source type of the chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.15]
    *
    * @param dimension The dimension of the axis where the data is from.
    */
  def getDimensionDataSourceType(dimension: Categories | Values | XValues | YValues | BubbleSizes): ClientResult[ChartDataSourceType] = js.native
  /**
    * Gets the data source type of the chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.15]
    *
    * @param dimension The dimension of the axis where the data is from.
    */
  def getDimensionDataSourceType(dimension: ChartSeriesDimension): ClientResult[ChartDataSourceType] = js.native
  
  /**
    * Gets the values from a single dimension of the chart series. These could be either category values or data values, depending on the dimension specified and how the data is mapped for the chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    *
    * @param dimension The dimension of the axis where the data is from.
    */
  def getDimensionValues(dimension: Categories | Values | XValues | YValues | BubbleSizes): ClientResult[js.Array[String]] = js.native
  /**
    * Gets the values from a single dimension of the chart series. These could be either category values or data values, depending on the dimension specified and how the data is mapped for the chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    *
    * @param dimension The dimension of the axis where the data is from.
    */
  def getDimensionValues(dimension: ChartSeriesDimension): ClientResult[js.Array[String]] = js.native
  
  /**
    * Specifies the color for maximum value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumColor: String = js.native
  
  /**
    * Specifies the type for maximum value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumType: ChartGradientStyleType | ExtremeValue | Number | Percent = js.native
  
  /**
    * Specifies the maximum value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMaximumValue: Double = js.native
  
  /**
    * Specifies the color for the midpoint value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointColor: String = js.native
  
  /**
    * Specifies the type for the midpoint value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointType: ChartGradientStyleType | ExtremeValue | Number | Percent = js.native
  
  /**
    * Specifies the midpoint value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMidpointValue: Double = js.native
  
  /**
    * Specifies the color for the minimum value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumColor: String = js.native
  
  /**
    * Specifies the type for the minimum value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumType: ChartGradientStyleType | ExtremeValue | Number | Percent = js.native
  
  /**
    * Specifies the minimum value of a region map chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientMinimumValue: Double = js.native
  
  /**
    * Specifies the series gradient style of a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var gradientStyle: ChartGradientStyle | TwoPhaseColor | ThreePhaseColor = js.native
  
  /**
    * Specifies if the series has data labels.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabels: Boolean = js.native
  
  /**
    * Specifies the fill color for negative data points in a series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var invertColor: String = js.native
  
  /**
    * True if Excel inverts the pattern in the item when it corresponds to a negative number.
    *
    * @remarks
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
    * Encapsulates the options for a region map chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val mapOptions: ChartMapOptions = js.native
  
  /**
    * Specifies the marker background color of a chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: String = js.native
  
  /**
    * Specifies the marker foreground color of a chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: String = js.native
  
  /**
    * Specifies the marker size of a chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: Double = js.native
  
  /**
    * Specifies the marker style of a chart series. See `Excel.ChartMarkerStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture = js.native
  
  /**
    * Specifies the name of a series in a chart. The name's length should not be greater than 255 characters.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var name: String = js.native
  
  /**
    * Specifies how bars and columns are positioned. Can be a value between –100 and 100. Applies only to 2-D bar and 2-D column charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var overlap: Double = js.native
  
  /**
    * Specifies the series parent label strategy area for a treemap chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var parentLabelStrategy: ChartParentLabelStrategy | None | Banner | Overlapping = js.native
  
  /**
    * Specifies the plot order of a chart series within the chart group.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var plotOrder: Double = js.native
  
  /**
    * Returns a collection of all points in the series.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val points: ChartPointsCollection = js.native
  
  /**
    * Specifies the size of the secondary section of either a pie-of-pie chart or a bar-of-pie chart, as a percentage of the size of the primary pie. Can be a value from 5 to 200.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var secondPlotSize: Double = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartSeries): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartSeriesUpdateData): Unit = js.native
  def set(properties: ChartSeriesUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Sets the bubble sizes for a chart series. Only works for bubble charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param sourceData The `Range` object corresponding to the source data.
    */
  def setBubbleSizes(sourceData: Range): Unit = js.native
  
  /**
    * Sets the values for a chart series. For scatter charts, it refers to y-axis values.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param sourceData The `Range` object corresponding to the source data.
    */
  def setValues(sourceData: Range): Unit = js.native
  
  /**
    * Sets the values of the x-axis for a chart series. Only works for scatter charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param sourceData The `Range` object corresponding to the source data.
    */
  def setXAxisValues(sourceData: Range): Unit = js.native
  
  /**
    * Specifies whether connector lines are shown in waterfall charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showConnectorLines: Boolean = js.native
  
  /**
    * Specifies whether leader lines are displayed for each data label in the series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showLeaderLines: Boolean = js.native
  
  /**
    * Specifies if the series has a shadow.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: Boolean = js.native
  
  /**
    * Specifies if the series is smooth. Only applicable to line and scatter charts.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var smooth: Boolean = js.native
  
  /**
    * Specifies the way the two sections of either a pie-of-pie chart or a bar-of-pie chart are split.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var splitType: ChartSplitType | SplitByPosition | SplitByValue | SplitByPercentValue | SplitByCustomSplit = js.native
  
  /**
    * Specifies the threshold value that separates two sections of either a pie-of-pie chart or a bar-of-pie chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var splitValue: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartSeries object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartSeriesData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartSeriesData = js.native
  
  /**
    * The collection of trendlines in the series.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val trendlines: ChartTrendlineCollection = js.native
  
  /**
    * True if Excel assigns a different color or pattern to each data marker. The chart must contain only one series.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var varyByCategories: Boolean = js.native
  
  /**
    * Represents the error bar object of a chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val xErrorBars: ChartErrorBars = js.native
  
  /**
    * Represents the error bar object of a chart series.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val yErrorBars: ChartErrorBars = js.native
}
