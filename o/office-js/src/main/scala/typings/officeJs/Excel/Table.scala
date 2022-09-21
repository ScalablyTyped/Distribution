package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.TableData
import typings.officeJs.Excel.Interfaces.TableLoadOptions
import typings.officeJs.Excel.Interfaces.TableUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.EventHandlers
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an Excel table.
  To learn more about the table object model, read {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-tables | Work with tables using the Excel JavaScript API}.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait Table
  extends StObject
     with ClientObject {
  
  /**
    * Represents the `AutoFilter` object of the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val autoFilter: AutoFilter = js.native
  
  /**
    * Clears all the filters currently applied on the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  def clearFilters(): Unit = js.native
  
  /**
    * Represents a collection of all the columns in the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val columns: TableColumnCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Table: RequestContext = js.native
  
  /**
    * Converts the table into a normal range of cells. All data is preserved.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  def convertToRange(): Range = js.native
  
  /**
    * Deletes the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the range object associated with the data body of the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def getDataBodyRange(): Range = js.native
  
  /**
    * Gets the range object associated with the header row of the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def getHeaderRowRange(): Range = js.native
  
  /**
    * Gets the range object associated with the entire table.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def getRange(): Range = js.native
  
  /**
    * Gets the range object associated with the totals row of the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def getTotalRowRange(): Range = js.native
  
  /**
    * Specifies if the first column contains special formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var highlightFirstColumn: Boolean = js.native
  
  /**
    * Specifies if the last column contains special formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var highlightLastColumn: Boolean = js.native
  
  /**
    * Returns a value that uniquely identifies the table in a given workbook. The value of the identifier remains the same even when the table is renamed.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val id: String = js.native
  
  /**
    * Returns a numeric ID.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val legacyId: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Table = js.native
  def load(options: TableLoadOptions): Table = js.native
  def load(propertyNamesAndPaths: Expand): Table = js.native
  def load(propertyNames: String): Table = js.native
  def load(propertyNames: js.Array[String]): Table = js.native
  
  /**
    * Name of the table.
    
    The set name of the table must follow the guidelines specified in the {@link https://support.microsoft.com/office/fbf49a4f-82a3-43eb-8ba2-44d21233b114 | Rename an Excel table} article.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var name: String = js.native
  
  /**
    * Occurs when data in cells changes on a specific table.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onChanged: EventHandlers[TableChangedEventArgs] = js.native
  
  /**
    * Occurs when the selection changes on a specific table.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onSelectionChanged: EventHandlers[TableSelectionChangedEventArgs] = js.native
  
  /**
    * Reapplies all the filters currently on the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  def reapplyFilters(): Unit = js.native
  
  def resize(newRange: String): Unit = js.native
  /**
    * Resize the table to the new range. The new range must overlap with the original table range and the headers (or the top of the table) must be in the same row.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    *
    * @param newRange The range object or range address that will be used to determine the new size of the table.
    */
  def resize(newRange: Range): Unit = js.native
  
  /**
    * Represents a collection of all the rows in the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val rows: TableRowCollection = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TableUpdateData): Unit = js.native
  def set(properties: TableUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Table): Unit = js.native
  
  /**
    * Specifies if the columns show banded formatting in which odd columns are highlighted differently from even ones, to make reading the table easier.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var showBandedColumns: Boolean = js.native
  
  /**
    * Specifies if the rows show banded formatting in which odd rows are highlighted differently from even ones, to make reading the table easier.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var showBandedRows: Boolean = js.native
  
  /**
    * Specifies if the filter buttons are visible at the top of each column header. Setting this is only allowed if the table contains a header row.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    */
  var showFilterButton: Boolean = js.native
  
  /**
    * Specifies if the header row is visible. This value can be set to show or remove the header row.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var showHeaders: Boolean = js.native
  
  /**
    * Specifies if the total row is visible. This value can be set to show or remove the total row.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var showTotals: Boolean = js.native
  
  /**
    * Represents the sorting for the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  val sort: TableSort = js.native
  
  /**
    * Constant value that represents the table style. Possible values are: "TableStyleLight1" through "TableStyleLight21", "TableStyleMedium1" through "TableStyleMedium28", "TableStyleDark1" through "TableStyleDark11". A custom user-defined style present in the workbook can also be specified.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var style: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Table object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableData = js.native
  
  /**
    * The worksheet containing the current table.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  val worksheet: Worksheet = js.native
}
