package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a chart object in a workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.Chart")
@js.native
class Chart ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents chart axes. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val axes: ChartAxes = js.native
  /**
    *
    * Returns or sets a ChartCategoryLabelLevel enumeration constant referring to
    the level of where the category labels are being sourced from. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var categoryLabelLevel: scala.Double = js.native
  /**
    *
    * Represents the type of the chart. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 83 */ js.Any = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Chart: RequestContext = js.native
  /**
    *
    * Represents the datalabels on the chart. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val dataLabels: ChartDataLabels = js.native
  /**
    *
    * Returns or sets the way that blank cells are plotted on a chart. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var displayBlanksAs: ChartDisplayBlanksAs | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NotPlotted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Zero | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Interplotted = js.native
  /**
    *
    * Encapsulates the format properties for the chart area. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartAreaFormat = js.native
  /**
    *
    * Represents the height, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var height: scala.Double = js.native
  /**
    *
    * The unique id of chart. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val id: java.lang.String = js.native
  /**
    *
    * The distance, in points, from the left side of the chart to the worksheet origin.
    *
    * [Api set: ExcelApi 1.1]
    */
  var left: scala.Double = js.native
  /**
    *
    * Represents the legend for the chart. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val legend: ChartLegend = js.native
  /**
    *
    * Represents the name of a chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: java.lang.String = js.native
  /**
    *
    * Occurs when the chart is activated.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onActivated: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[ChartActivatedEventArgs] = js.native
  /**
    *
    * Occurs when the chart is deactivated.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onDeactivated: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[ChartDeactivatedEventArgs] = js.native
  /**
    *
    * Encapsulates the options for the pivot chart. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val pivotOptions: ChartPivotOptions = js.native
  /**
    *
    * Represents the plotArea for the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  val plotArea: ChartPlotArea = js.native
  /**
    *
    * Returns or sets the way columns or rows are used as data series on the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotBy: ChartPlotBy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Rows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Columns = js.native
  /**
    *
    * True if only visible cells are plotted. False if both visible and hidden cells are plotted. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotVisibleOnly: scala.Boolean = js.native
  /**
    *
    * Represents either a single series or collection of series in the chart. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val series: ChartSeriesCollection = js.native
  /**
    *
    * Returns or sets a ChartSeriesNameLevel enumeration constant referring to
    the level of where the series names are being sourced from. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var seriesNameLevel: scala.Double = js.native
  /**
    *
    * Represents whether to display all field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showAllFieldButtons: scala.Boolean = js.native
  /**
    *
    * Represents whether to to show the data labels when the value is greater than the maximum value on the value axis.
    If value axis became smaller than the size of data points, you can use this property to set whether to show the data labels.
    This property applies to 2-D charts only.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showDataLabelsOverMaximum: scala.Boolean = js.native
  /**
    *
    * Returns or sets the chart style for the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var style: scala.Double = js.native
  /**
    *
    * Represents the title of the specified chart, including the text, visibility, position, and formating of the title. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val title: ChartTitle = js.native
  /**
    *
    * Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
    *
    * [Api set: ExcelApi 1.1]
    */
  var top: scala.Double = js.native
  /**
    *
    * Represents the width, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var width: scala.Double = js.native
  /**
    *
    * The worksheet containing the current chart. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val worksheet: Worksheet = js.native
  /**
    *
    * Activate the chart in the Excel UI.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def activate(): scala.Unit = js.native
  /**
    *
    * Deletes the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  def delete(): scala.Unit = js.native
  /**
    *
    * Renders the chart as a base64-encoded image by scaling the chart to fit the specified dimensions.
    The aspect ratio is preserved as part of the resizing.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @param height (Optional) The desired height of the resulting image.
    * @param width (Optional) The desired width of the resulting image.
    * @param fittingMode (Optional) The method used to scale the chart to the specified to the specified dimensions (if both height and width are set).
    */
  def getImage(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  def getImage(width: scala.Double): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  def getImage(width: scala.Double, height: scala.Double): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  def getImage(width: scala.Double, height: scala.Double, fittingMode: ImageFittingMode): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  @JSName("getImage")
  def getImage_Fill(
    width: scala.Double,
    height: scala.Double,
    fittingMode: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Fill
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  @JSName("getImage")
  def getImage_Fit(
    width: scala.Double,
    height: scala.Double,
    fittingMode: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Fit
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  @JSName("getImage")
  def getImage_FitAndCenter(
    width: scala.Double,
    height: scala.Double,
    fittingMode: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FitAndCenter
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.Chart` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.Chart` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Chart` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Chart = js.native
  def load(option: java.lang.String): Chart = js.native
  def load(option: js.Array[java.lang.String]): Chart = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Select): Chart = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartLoadOptions): Chart = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Chart): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.Chart): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
    *
    * Resets the source data for the chart.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param sourceData The range object corresponding to the source data.
    * @param seriesBy Specifies the way columns or rows are used as data series on the chart. Can be one of the following: Auto (default), Rows, and Columns. See Excel.ChartSeriesBy for details.
    */
  def setData(sourceData: Range): scala.Unit = js.native
  def setData(sourceData: Range, seriesBy: ChartSeriesBy): scala.Unit = js.native
  @JSName("setData")
  def setData_Auto(sourceData: Range, seriesBy: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Auto): scala.Unit = js.native
  @JSName("setData")
  def setData_Columns(sourceData: Range, seriesBy: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Columns): scala.Unit = js.native
  @JSName("setData")
  def setData_Rows(sourceData: Range, seriesBy: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Rows): scala.Unit = js.native
  def setPosition(startCell: java.lang.String): scala.Unit = js.native
  def setPosition(startCell: java.lang.String, endCell: java.lang.String): scala.Unit = js.native
  def setPosition(startCell: java.lang.String, endCell: Range): scala.Unit = js.native
  /**
    *
    * Positions the chart relative to cells on the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param startCell The start cell. This is where the chart will be moved to. The start cell is the top-left or top-right cell, depending on the user's right-to-left display settings.
    * @param endCell (Optional) The end cell. If specified, the chart's width and height will be set to fully cover up this cell/range.
    */
  def setPosition(startCell: Range): scala.Unit = js.native
  def setPosition(startCell: Range, endCell: java.lang.String): scala.Unit = js.native
  def setPosition(startCell: Range, endCell: Range): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Chart object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartData = js.native
}

