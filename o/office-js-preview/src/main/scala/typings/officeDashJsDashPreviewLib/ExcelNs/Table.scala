package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an Excel table.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.Table")
@js.native
class Table ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents the AutoFilter object of the table. Read-Only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val autoFilter: AutoFilter = js.native
  /**
    *
    * Represents a collection of all the columns in the table. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val columns: TableColumnCollection = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Table: RequestContext = js.native
  /**
    *
    * Indicates whether the first column contains special formatting.
    *
    * [Api set: ExcelApi 1.3]
    */
  var highlightFirstColumn: scala.Boolean = js.native
  /**
    *
    * Indicates whether the last column contains special formatting.
    *
    * [Api set: ExcelApi 1.3]
    */
  var highlightLastColumn: scala.Boolean = js.native
  /**
    *
    * Returns a value that uniquely identifies the table in a given workbook. The value of the identifier remains the same even when the table is renamed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val id: java.lang.String = js.native
  /**
    *
    * Returns a numeric id.
    *
    * [Api set: ExcelApi 1.8]
    */
  val legacyId: java.lang.String = js.native
  /**
    *
    * Name of the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: java.lang.String = js.native
  /**
    *
    * Occurs when data in cells changes on a specific table.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onChanged: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[TableChangedEventArgs] = js.native
  /**
    *
    * Occurs when filter is applied on a specific table.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onFiltered: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[TableFilteredEventArgs] = js.native
  /**
    *
    * Occurs when the selection changes on a specific table.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onSelectionChanged: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[TableSelectionChangedEventArgs] = js.native
  /**
    *
    * Represents a collection of all the rows in the table. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val rows: TableRowCollection = js.native
  /**
    *
    * Indicates whether the columns show banded formatting in which odd columns are highlighted differently from even ones to make reading the table easier.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showBandedColumns: scala.Boolean = js.native
  /**
    *
    * Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make reading the table easier.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showBandedRows: scala.Boolean = js.native
  /**
    *
    * Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showFilterButton: scala.Boolean = js.native
  /**
    *
    * Indicates whether the header row is visible or not. This value can be set to show or remove the header row.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showHeaders: scala.Boolean = js.native
  /**
    *
    * Indicates whether the total row is visible or not. This value can be set to show or remove the total row.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showTotals: scala.Boolean = js.native
  /**
    *
    * Represents the sorting for the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val sort: TableSort = js.native
  /**
    *
    * Constant value that represents the Table style. Possible values are: TableStyleLight1 thru TableStyleLight21, TableStyleMedium1 thru TableStyleMedium28, TableStyleStyleDark1 thru TableStyleStyleDark11. A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: java.lang.String = js.native
  /**
    *
    * The worksheet containing the current table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val worksheet: Worksheet = js.native
  /**
    *
    * Clears all the filters currently applied on the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  def clearFilters(): scala.Unit = js.native
  /**
    *
    * Changes the table to use the default table style.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def clearStyle(): scala.Unit = js.native
  /**
    *
    * Converts the table into a normal range of cells. All data is preserved.
    *
    * [Api set: ExcelApi 1.2]
    */
  def convertToRange(): Range = js.native
  /**
    *
    * Deletes the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  def delete(): scala.Unit = js.native
  /**
    *
    * Gets the range object associated with the data body of the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getDataBodyRange(): Range = js.native
  /**
    *
    * Gets the range object associated with header row of the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getHeaderRowRange(): Range = js.native
  /**
    *
    * Gets the range object associated with the entire table.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getRange(): Range = js.native
  /**
    *
    * Gets the range object associated with totals row of the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getTotalRowRange(): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.Table` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.Table` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Table` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Table = js.native
  def load(option: java.lang.String): Table = js.native
  def load(option: js.Array[java.lang.String]): Table = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): Table = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.TableLoadOptions): Table = js.native
  /**
    *
    * Reapplies all the filters currently on the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  def reapplyFilters(): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.Table): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.TableUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.TableUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Table): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Table object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.TableData = js.native
}

