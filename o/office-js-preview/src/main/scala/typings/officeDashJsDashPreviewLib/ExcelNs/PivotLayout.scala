package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the visual layout of the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.PivotLayout")
@js.native
class PivotLayout ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Specifies whether formatting will be automatically formatted when it’s refreshed or when fields are moved
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var autoFormat: scala.Boolean = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotLayout: RequestContext = js.native
  /**
    *
    * Specifies whether the field list can be shown in the UI.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var enableFieldList: scala.Boolean = js.native
  /**
    *
    * This property indicates the PivotLayoutType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var layoutType: PivotLayoutType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Compact | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Tabular | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Outline = js.native
  /**
    *
    * Specifies whether formatting is preserved when the report is refreshed or recalculated by operations such as pivoting, sorting, or changing page field items.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var preserveFormatting: scala.Boolean = js.native
  /**
    *
    * Specifies whether the PivotTable report shows grand totals for columns.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showColumnGrandTotals: scala.Boolean = js.native
  /**
    *
    * Specifies whether the PivotTable report shows grand totals for rows.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRowGrandTotals: scala.Boolean = js.native
  /**
    *
    * This property indicates the SubtotalLocationType of all fields on the PivotTable. If fields have different states, this will be null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotalLocation: SubtotalLocationType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AtTop | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AtBottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Off = js.native
  def getCell(
    dataHierarchy: java.lang.String,
    rowItems: js.Array[PivotItem | java.lang.String],
    columnItems: js.Array[PivotItem | java.lang.String]
  ): Range = js.native
  /**
    *
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
    rowItems: js.Array[PivotItem | java.lang.String],
    columnItems: js.Array[PivotItem | java.lang.String]
  ): Range = js.native
  /**
    *
    * Returns the range where the PivotTable's column labels reside.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getColumnLabelRange(): Range = js.native
  /**
    *
    * Returns the range where the PivotTable's data values reside.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getDataBodyRange(): Range = js.native
  def getDataHierarchy(cell: java.lang.String): DataPivotHierarchy = js.native
  /**
    *
    * Gets the DataHierarchy that is used to calculate the value in a specified range within the PivotTable.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param cell A single cell within the PivotTable data body.
    * @returns The DataPivotHierarchy object used to calculate the value in the specified cell.
    */
  def getDataHierarchy(cell: Range): DataPivotHierarchy = js.native
  /**
    *
    * Returns the range of the PivotTable's filter area.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getFilterAxisRange(): Range = js.native
  def getPivotItems(axis: PivotAxis, cell: java.lang.String): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[PivotItem]] = js.native
  /**
    *
    * Gets the PivotItems from an axis that make up the value in a specified range within the PivotTable.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param axis The axis from which to get the PivotItems. Must be either "row" or "column."
    * @param cell A single cell within the PivotTable's data body.
    * @returns A collection of PivotItems that are used to calculate the values in the specified row.
    */
  def getPivotItems(axis: PivotAxis, cell: Range): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Column(axis: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Column, cell: java.lang.String): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Column(axis: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Column, cell: Range): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Data(axis: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Data, cell: java.lang.String): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Data(axis: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Data, cell: Range): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Filter(axis: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Filter, cell: java.lang.String): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Filter(axis: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Filter, cell: Range): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Row(axis: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Row, cell: java.lang.String): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Row(axis: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Row, cell: Range): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[PivotItem]] = js.native
  @JSName("getPivotItems")
  def getPivotItems_Unknown(axis: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown, cell: java.lang.String): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[PivotItem]] = js.native
  /**
    *
    * Gets the PivotItems from an axis that make up the value in a specified range within the PivotTable.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @param axis The axis from which to get the PivotItems. Must be either "row" or "column."
    * @param cell A single cell within the PivotTable's data body.
    * @returns A collection of PivotItems that are used to calculate the values in the specified row.
    */
  @JSName("getPivotItems")
  def getPivotItems_Unknown(axis: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown, cell: Range): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[PivotItem]] = js.native
  /**
    *
    * Returns the range the PivotTable exists on, excluding the filter area.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRange(): Range = js.native
  /**
    *
    * Returns the range where the PivotTable's row labels reside.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getRowLabelRange(): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.PivotLayout` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.PivotLayout` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.PivotLayout` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotLayout = js.native
  def load(option: java.lang.String): PivotLayout = js.native
  def load(option: js.Array[java.lang.String]): PivotLayout = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): PivotLayout = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PivotLayoutLoadOptions): PivotLayout = js.native
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
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PivotLayoutUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PivotLayoutUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PivotLayout): scala.Unit = js.native
  def setAutoSortOnCell(cell: java.lang.String, sortBy: SortBy): scala.Unit = js.native
  /**
    *
    * Sets the PivotTable to automatically sort using the specified cell to automatically select all necessary criteria and context. This behaves identically to applying an autosort from the UI.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param cell A single cell to use get the criteria from for applying the autosort.
    * @param sortBy The direction of the sort.
    */
  def setAutoSortOnCell(cell: Range, sortBy: SortBy): scala.Unit = js.native
  @JSName("setAutoSortOnCell")
  def setAutoSortOnCell_Ascending(
    cell: java.lang.String,
    sortBy: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ascending
  ): scala.Unit = js.native
  /**
    *
    * Sets the PivotTable to automatically sort using the specified cell to automatically select all necessary criteria and context. This behaves identically to applying an autosort from the UI.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @param cell A single cell to use get the criteria from for applying the autosort.
    * @param sortBy The direction of the sort.
    */
  @JSName("setAutoSortOnCell")
  def setAutoSortOnCell_Ascending(cell: Range, sortBy: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Ascending): scala.Unit = js.native
  @JSName("setAutoSortOnCell")
  def setAutoSortOnCell_Descending(
    cell: java.lang.String,
    sortBy: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Descending
  ): scala.Unit = js.native
  @JSName("setAutoSortOnCell")
  def setAutoSortOnCell_Descending(cell: Range, sortBy: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Descending): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.PivotLayout object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotLayoutData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PivotLayoutData = js.native
}

