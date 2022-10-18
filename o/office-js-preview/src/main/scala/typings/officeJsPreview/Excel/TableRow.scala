package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.TableRowData
import typings.officeJsPreview.Excel.Interfaces.TableRowLoadOptions
import typings.officeJsPreview.Excel.Interfaces.TableRowUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a row in a table.
  
  Note that unlike ranges or columns, which will adjust if new rows or columns are added before them,
  a `TableRow` object represents the physical location of the table row, but not the data.
  That is, if the data is sorted or if new rows are added, a table row will continue
  to point at the index for which it was created.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait TableRow
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableRow: RequestContext = js.native
  
  /**
    * Deletes the row from the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def delete(): Unit = js.native
  
  /**
    * Returns the range object associated with the entire row.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def getRange(): Range = js.native
  
  /**
    * Returns the index number of the row within the rows collection of the table. Zero-indexed.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val index: Double = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableRow = js.native
  def load(options: TableRowLoadOptions): TableRow = js.native
  def load(propertyNamesAndPaths: Expand): TableRow = js.native
  def load(propertyNames: String): TableRow = js.native
  def load(propertyNames: js.Array[String]): TableRow = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: TableRowUpdateData): Unit = js.native
  def set(properties: TableRowUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TableRow): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TableRow object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableRowData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TableRowData = js.native
  
  /**
    * Represents the raw values of the specified range. The data returned could be a string, number, or boolean. Cells that contain an error will return the error string.
    If the returned value starts with a plus ("+"), minus ("-"), or equal sign ("="), Excel interprets this value as a formula.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var values: js.Array[js.Array[Any]] = js.native
  
  /**
    * A JSON representation of the values in the cells in this table row.
    Unlike `TableRow.values`, `TableRow.valuesAsJson` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the en-US locale.  To retrieve data in the user's display locale, use `TableRow.valuesAsJsonLocal`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valuesAsJson: js.Array[js.Array[CellValue]] = js.native
  
  /**
    * A JSON representation of the values in the cells in this table row.
    Unlike `TableRow.values`, `TableRow.valuesAsJsonLocal` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the user's display locale.  To retrieve data independent of locale, use `TableRow.valuesAsJson`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var valuesAsJsonLocal: js.Array[js.Array[CellValue]] = js.native
}
