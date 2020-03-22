package typings.officeJsPreview.Excel

import typings.officeJsPreview.AnonExpand
import typings.officeJsPreview.Excel.Interfaces.TableData
import typings.officeJsPreview.Excel.Interfaces.TableLoadOptions
import typings.officeJsPreview.Excel.Interfaces.TableUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.EventHandlers
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an Excel table.
  To learn more about the table object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-tables | Work with tables using the Excel JavaScript API}.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.Table")
@js.native
class Table () extends ClientObject {
  /**
    *
    * Represents the AutoFilter object of the table. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
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
  var highlightFirstColumn: Boolean = js.native
  /**
    *
    * Indicates whether the last column contains special formatting.
    *
    * [Api set: ExcelApi 1.3]
    */
  var highlightLastColumn: Boolean = js.native
  /**
    *
    * Returns a value that uniquely identifies the table in a given workbook. The value of the identifier remains the same even when the table is renamed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val id: String = js.native
  /**
    *
    * Returns a numeric id.
    *
    * [Api set: ExcelApi 1.8]
    */
  val legacyId: String = js.native
  /**
    *
    * Name of the table.
    
    The set name of the table must follow the guidelines specified in the {@link https://support.office.com/article/Rename-an-Excel-table-FBF49A4F-82A3-43EB-8BA2-44D21233B114 | Rename an Excel table} article.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: String = js.native
  /**
    *
    * Occurs when data in cells changes on a specific table.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onChanged: EventHandlers[TableChangedEventArgs] = js.native
  /**
    *
    * Occurs when filter is applied on a specific table.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onFiltered: EventHandlers[TableFilteredEventArgs] = js.native
  /**
    *
    * Occurs when the selection changes on a specific table.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onSelectionChanged: EventHandlers[TableSelectionChangedEventArgs] = js.native
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
  var showBandedColumns: Boolean = js.native
  /**
    *
    * Indicates whether the rows show banded formatting in which odd rows are highlighted differently from even ones to make reading the table easier.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showBandedRows: Boolean = js.native
  /**
    *
    * Indicates whether the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row.
    *
    * [Api set: ExcelApi 1.3]
    */
  var showFilterButton: Boolean = js.native
  /**
    *
    * Indicates whether the header row is visible or not. This value can be set to show or remove the header row.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showHeaders: Boolean = js.native
  /**
    *
    * Indicates whether the total row is visible or not. This value can be set to show or remove the total row.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showTotals: Boolean = js.native
  /**
    *
    * Represents the sorting for the table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val sort: TableSort = js.native
  /**
    *
    * Constant value that represents the Table style. Possible values are: "TableStyleLight1" through "TableStyleLight21", "TableStyleMedium1" through "TableStyleMedium28", "TableStyleDark1" through "TableStyleDark11". A custom user-defined style present in the workbook can also be specified.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: String = js.native
  /**
    *
    * The style applied to the Table.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val tableStyle: TableStyle = js.native
  /**
    *
    * The worksheet containing the current table. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val worksheet: Worksheet = js.native
  /**
    * Clears all the filters currently applied on the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  def clearFilters(): Unit = js.native
  /**
    * Changes the table to use the default table style.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def clearStyle(): Unit = js.native
  /**
    * Converts the table into a normal range of cells. All data is preserved.
    *
    * [Api set: ExcelApi 1.2]
    */
  def convertToRange(): Range = js.native
  /**
    * Deletes the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  def delete(): Unit = js.native
  /**
    * Gets the range object associated with the data body of the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getDataBodyRange(): Range = js.native
  /**
    * Gets the range object associated with header row of the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getHeaderRowRange(): Range = js.native
  /**
    * Gets the range object associated with the entire table.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getRange(): Range = js.native
  /**
    * Gets the range object associated with totals row of the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getTotalRowRange(): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Table = js.native
  def load(options: TableLoadOptions): Table = js.native
  def load(propertyNamesAndPaths: AnonExpand): Table = js.native
  def load(propertyNames: String): Table = js.native
  def load(propertyNames: js.Array[String]): Table = js.native
  /**
    * Reapplies all the filters currently on the table.
    *
    * [Api set: ExcelApi 1.2]
    */
  def reapplyFilters(): Unit = js.native
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
  def set(properties: TableUpdateData): Unit = js.native
  def set(properties: TableUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Table): Unit = js.native
  /**
    * Sets the style applied to the slicer.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param style The style to apply to the PivotTable. An `InvalidArgumentException` is thrown if a string is provided that does not match the name of any style.
    */
  def setStyle(style: String): Unit = js.native
  def setStyle(style: BuiltInTableStyle): Unit = js.native
  def setStyle(style: PivotTableStyle): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Table object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableData = js.native
}

