package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.ChartData
import typings.officeJsPreview.Excel.Interfaces.ChartLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ChartUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.EventHandlers
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Auto
import typings.officeJsPreview.officeJsPreviewStrings.Columns
import typings.officeJsPreview.officeJsPreviewStrings.Fill
import typings.officeJsPreview.officeJsPreviewStrings.Fit
import typings.officeJsPreview.officeJsPreviewStrings.FitAndCenter
import typings.officeJsPreview.officeJsPreviewStrings.Interplotted
import typings.officeJsPreview.officeJsPreviewStrings.NotPlotted
import typings.officeJsPreview.officeJsPreviewStrings.Rows
import typings.officeJsPreview.officeJsPreviewStrings.Zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a chart object in a workbook.
  To learn more about the chart object model, see {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-charts | Work with charts using the Excel JavaScript API}.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait Chart
  extends StObject
     with ClientObject {
  
  /**
    * Activates the chart in the Excel UI.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  def activate(): Unit = js.native
  
  /**
    * Represents chart axes.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val axes: ChartAxes = js.native
  
  /**
    * Specifies a chart category label level enumeration constant, referring to the level of the source category labels.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var categoryLabelLevel: Double = js.native
  
  /**
    * Specifies the type of the chart. See `Excel.ChartType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var chartType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 83, starting with typings.officeJsPreview.Excel.ChartType, typings.officeJsPreview.officeJsPreviewStrings.Invalid, typings.officeJsPreview.officeJsPreviewStrings.ColumnClustered */ Any = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Chart: RequestContext = js.native
  
  /**
    * Represents the data labels on the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val dataLabels: ChartDataLabels = js.native
  
  /**
    * Deletes the chart object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def delete(): Unit = js.native
  
  /**
    * Specifies the way that blank cells are plotted on a chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var displayBlanksAs: ChartDisplayBlanksAs | NotPlotted | Zero | Interplotted = js.native
  
  /**
    * Encapsulates the format properties for the chart area.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartAreaFormat = js.native
  
  /**
    * Gets the data source of the whole chart. If the data range is empty, this method will return the `EmptyChartSeries` error.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getDataRange(): ClientResult[String] = js.native
  
  /**
    * Gets the data source of the whole chart. If the data range is empty, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getDataRangeOrNullObject(): ClientResult[String] = js.native
  
  /**
    * Gets the data table on the chart. If the chart doesn't allow a data table, it will throw an exception.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  def getDataTable(): ChartDataTable = js.native
  
  /**
    * Gets the data table on the chart. If the chart doesn't allow a data table, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  def getDataTableOrNullObject(): ChartDataTable = js.native
  
  /**
    * Renders the chart as a base64-encoded image by scaling the chart to fit the specified dimensions.
    The aspect ratio is preserved as part of the resizing.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    *
    * @param height Optional. The desired height of the resulting image.
    * @param width Optional. The desired width of the resulting image.
    * @param fittingMode Optional. The method used to scale the chart to the specified dimensions (if both height and width are set).
    */
  def getImage(): ClientResult[String] = js.native
  def getImage(width: Double): ClientResult[String] = js.native
  def getImage(width: Double, height: Double): ClientResult[String] = js.native
  def getImage(width: Double, height: Double, fittingMode: Fit | FitAndCenter | Fill): ClientResult[String] = js.native
  def getImage(width: Double, height: Double, fittingMode: ImageFittingMode): ClientResult[String] = js.native
  def getImage(width: Double, height: Unit, fittingMode: Fit | FitAndCenter | Fill): ClientResult[String] = js.native
  def getImage(width: Double, height: Unit, fittingMode: ImageFittingMode): ClientResult[String] = js.native
  def getImage(width: Unit, height: Double): ClientResult[String] = js.native
  def getImage(width: Unit, height: Double, fittingMode: Fit | FitAndCenter | Fill): ClientResult[String] = js.native
  def getImage(width: Unit, height: Double, fittingMode: ImageFittingMode): ClientResult[String] = js.native
  def getImage(width: Unit, height: Unit, fittingMode: Fit | FitAndCenter | Fill): ClientResult[String] = js.native
  def getImage(width: Unit, height: Unit, fittingMode: ImageFittingMode): ClientResult[String] = js.native
  
  /**
    * Specifies the height, in points, of the chart object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var height: Double = js.native
  
  /**
    * The unique ID of chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val id: String = js.native
  
  /**
    * The distance, in points, from the left side of the chart to the worksheet origin.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var left: Double = js.native
  
  /**
    * Represents the legend for the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val legend: ChartLegend = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Chart = js.native
  def load(options: ChartLoadOptions): Chart = js.native
  def load(propertyNamesAndPaths: Expand): Chart = js.native
  def load(propertyNames: String): Chart = js.native
  def load(propertyNames: js.Array[String]): Chart = js.native
  
  /**
    * Specifies the name of a chart object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var name: String = js.native
  
  /**
    * Occurs when the chart is activated.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onActivated: EventHandlers[ChartActivatedEventArgs] = js.native
  
  /**
    * Occurs when the chart is deactivated.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onDeactivated: EventHandlers[ChartDeactivatedEventArgs] = js.native
  
  /**
    * Encapsulates the options for a pivot chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val pivotOptions: ChartPivotOptions = js.native
  
  /**
    * Represents the plot area for the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val plotArea: ChartPlotArea = js.native
  
  /**
    * Specifies the way columns or rows are used as data series on the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var plotBy: ChartPlotBy | Rows | Columns = js.native
  
  /**
    * True if only visible cells are plotted. False if both visible and hidden cells are plotted.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var plotVisibleOnly: Boolean = js.native
  
  /**
    * Represents either a single series or collection of series in the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val series: ChartSeriesCollection = js.native
  
  /**
    * Specifies a chart series name level enumeration constant, referring to the level of the source series names.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var seriesNameLevel: Double = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Chart): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartUpdateData): Unit = js.native
  def set(properties: ChartUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Resets the source data for the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param sourceData The range object corresponding to the source data.
    * @param seriesBy Specifies the way columns or rows are used as data series on the chart. Can be one of the following: Auto (default), Rows, and Columns. See `Excel.ChartSeriesBy` for details.
    */
  def setData(sourceData: Range): Unit = js.native
  def setData(sourceData: Range, seriesBy: Auto | Columns | Rows): Unit = js.native
  def setData(sourceData: Range, seriesBy: ChartSeriesBy): Unit = js.native
  
  def setPosition(startCell: String): Unit = js.native
  def setPosition(startCell: String, endCell: String): Unit = js.native
  def setPosition(startCell: String, endCell: Range): Unit = js.native
  /**
    * Positions the chart relative to cells on the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param startCell The start cell. This is where the chart will be moved to. The start cell is the top-left or top-right cell, depending on the user's right-to-left display settings.
    * @param endCell Optional. The end cell. If specified, the chart's width and height will be set to fully cover up this cell/range.
    */
  def setPosition(startCell: Range): Unit = js.native
  def setPosition(startCell: Range, endCell: String): Unit = js.native
  def setPosition(startCell: Range, endCell: Range): Unit = js.native
  
  /**
    * Specifies whether to display all field buttons on a PivotChart.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showAllFieldButtons: Boolean = js.native
  
  /**
    * Specifies whether to show the data labels when the value is greater than the maximum value on the value axis.
    If the value axis becomes smaller than the size of the data points, you can use this property to set whether to show the data labels.
    This property applies to 2-D charts only.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showDataLabelsOverMaximum: Boolean = js.native
  
  /**
    * Specifies the chart style for the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var style: Double = js.native
  
  /**
    * Represents the title of the specified chart, including the text, visibility, position, and formatting of the title.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val title: ChartTitle = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Chart object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartData = js.native
  
  /**
    * Specifies the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var top: Double = js.native
  
  /**
    * Specifies the width, in points, of the chart object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var width: Double = js.native
  
  /**
    * The worksheet containing the current chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  val worksheet: Worksheet = js.native
}
