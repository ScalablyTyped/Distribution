package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.PivotLayoutData
import typings.officeJsPreview.Excel.Interfaces.PivotLayoutLoadOptions
import typings.officeJsPreview.Excel.Interfaces.PivotLayoutUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Ascending
import typings.officeJsPreview.officeJsPreviewStrings.AtBottom
import typings.officeJsPreview.officeJsPreviewStrings.AtTop
import typings.officeJsPreview.officeJsPreviewStrings.Column
import typings.officeJsPreview.officeJsPreviewStrings.Compact
import typings.officeJsPreview.officeJsPreviewStrings.Data
import typings.officeJsPreview.officeJsPreviewStrings.Descending
import typings.officeJsPreview.officeJsPreviewStrings.Off
import typings.officeJsPreview.officeJsPreviewStrings.Outline
import typings.officeJsPreview.officeJsPreviewStrings.Row
import typings.officeJsPreview.officeJsPreviewStrings.Tabular
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the visual layout of the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait PivotLayout extends ClientObject {
  /**
    *
    * Specifies if formatting will be automatically formatted when it’s refreshed or when fields are moved.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoFormat: Boolean = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotLayout: RequestContext = js.native
  /**
    *
    * Specifies if the field list can be shown in the UI.
    *
    * [Api set: ExcelApi 1.10]
    */
  var enableFieldList: Boolean = js.native
  /**
    *
    * This property indicates the PivotLayoutType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layoutType: PivotLayoutType | Compact | Tabular | Outline = js.native
  /**
    *
    * The style applied to the PivotTable.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val pivotStyle: PivotTableStyle = js.native
  /**
    *
    * Specifies if formatting is preserved when the report is refreshed or recalculated by operations such as pivoting, sorting, or changing page field items.
    *
    * [Api set: ExcelApi 1.9]
    */
  var preserveFormatting: Boolean = js.native
  /**
    *
    * Specifies if the PivotTable report shows grand totals for columns.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showColumnGrandTotals: Boolean = js.native
  /**
    *
    * Specifies if the PivotTable report shows grand totals for rows.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRowGrandTotals: Boolean = js.native
  /**
    *
    * This property indicates the SubtotalLocationType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotalLocation: SubtotalLocationType | AtTop | AtBottom | Off = js.native
  def getCell(
    dataHierarchy: String,
    rowItems: js.Array[PivotItem | String],
    columnItems: js.Array[PivotItem | String]
  ): Range = js.native
  /**
    * Gets a unique cell in the PivotTable based on a data hierarchy and the row and column items of their respective hierarchies. The returned cell is the intersection of the given row and column that contains the data from the given hierarchy. This method is the inverse of calling getPivotItems and getDataHierarchy on a particular cell.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param dataHierarchy The dataHierarchy that provides the data item to find.
    * @param rowItems The PivotItems from the row axis that make up the value to find.
    * @param columnItems The PivotItems from the column axis that make up the value to find.
    * @returns A range specifying a single cell that contains the value specified.
    */
  def getCell(
    dataHierarchy: DataPivotHierarchy,
    rowItems: js.Array[PivotItem | String],
    columnItems: js.Array[PivotItem | String]
  ): Range = js.native
  /**
    * Returns the range where the PivotTable's column labels reside.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getColumnLabelRange(): Range = js.native
  /**
    * Returns the range where the PivotTable's data values reside.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getDataBodyRange(): Range = js.native
  def getDataHierarchy(cell: String): DataPivotHierarchy = js.native
  /**
    * Gets the DataHierarchy that is used to calculate the value in a specified range within the PivotTable.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cell A single cell within the PivotTable data body.
    * @returns The DataPivotHierarchy object used to calculate the value in the specified cell.
    */
  def getDataHierarchy(cell: Range): DataPivotHierarchy = js.native
  /**
    * Returns the range of the PivotTable's filter area.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getFilterAxisRange(): Range = js.native
  def getPivotItems(axis: PivotAxis, cell: String): ClientResult[js.Array[PivotItem]] = js.native
  /**
    * Gets the PivotItems from an axis that make up the value in a specified range within the PivotTable.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param axis The axis from which to get the PivotItems. Must be either "row" or "column."
    * @param cell A single cell within the PivotTable's data body.
    * @returns A collection of PivotItems that are used to calculate the values in the specified row.
    */
  def getPivotItems(axis: PivotAxis, cell: Range): ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Column(axis: Column, cell: String): ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Column(axis: Column, cell: Range): ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Data(axis: Data, cell: String): ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Data(axis: Data, cell: Range): ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Filter(axis: typings.officeJsPreview.officeJsPreviewStrings.Filter, cell: String): ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Filter(axis: typings.officeJsPreview.officeJsPreviewStrings.Filter, cell: Range): ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Row(axis: Row, cell: String): ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Row(axis: Row, cell: Range): ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Unknown(axis: Unknown_, cell: String): ClientResult[js.Array[PivotItem]] = js.native
  /**
    * Gets the PivotItems from an axis that make up the value in a specified range within the PivotTable.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param axis The axis from which to get the PivotItems. Must be either "row" or "column."
    * @param cell A single cell within the PivotTable's data body.
    * @returns A collection of PivotItems that are used to calculate the values in the specified row.
    */
  @JSName("getPivotItems")
  def getPivotItems_Unknown(axis: Unknown_, cell: Range): ClientResult[js.Array[PivotItem]] = js.native
  /**
    * Returns the range the PivotTable exists on, excluding the filter area.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRange(): Range = js.native
  /**
    * Returns the range where the PivotTable's row labels reside.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRowLabelRange(): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotLayout = js.native
  def load(options: PivotLayoutLoadOptions): PivotLayout = js.native
  def load(propertyNamesAndPaths: Expand): PivotLayout = js.native
  def load(propertyNames: String): PivotLayout = js.native
  def load(propertyNames: js.Array[String]): PivotLayout = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.PivotLayout): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PivotLayoutUpdateData): Unit = js.native
  def set(properties: PivotLayoutUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PivotLayout): Unit = js.native
  def setAutoSortOnCell(cell: String, sortBy: SortBy): Unit = js.native
  /**
    * Sets the PivotTable to automatically sort using the specified cell to automatically select all necessary criteria and context. This behaves identically to applying an autosort from the UI.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cell A single cell to use get the criteria from for applying the autosort.
    * @param sortBy The direction of the sort.
    */
  def setAutoSortOnCell(cell: Range, sortBy: SortBy): Unit = js.native
  @JSName("setAutoSortOnCell")
  def setAutoSortOnCell_Ascending(cell: String, sortBy: Ascending): Unit = js.native
  /**
    * Sets the PivotTable to automatically sort using the specified cell to automatically select all necessary criteria and context. This behaves identically to applying an autosort from the UI.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param cell A single cell to use get the criteria from for applying the autosort.
    * @param sortBy The direction of the sort.
    */
  @JSName("setAutoSortOnCell")
  def setAutoSortOnCell_Ascending(cell: Range, sortBy: Ascending): Unit = js.native
  @JSName("setAutoSortOnCell")
  def setAutoSortOnCell_Descending(cell: String, sortBy: Descending): Unit = js.native
  @JSName("setAutoSortOnCell")
  def setAutoSortOnCell_Descending(cell: Range, sortBy: Descending): Unit = js.native
  /**
    * Sets the style applied to the PivotTable.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param style The style to apply to the PivotTable. An `InvalidArgumentException` is thrown if a string is provided that does not match the name of any style.
    */
  def setStyle(style: String): Unit = js.native
  def setStyle(style: BuiltInPivotTableStyle): Unit = js.native
  def setStyle(style: PivotTableStyle): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PivotLayout object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotLayoutData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PivotLayoutData = js.native
}

