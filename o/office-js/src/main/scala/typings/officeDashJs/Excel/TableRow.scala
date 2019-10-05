package typings.officeDashJs.Excel

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.Excel.Interfaces.TableRowData
import typings.officeDashJs.Excel.Interfaces.TableRowLoadOptions
import typings.officeDashJs.Excel.Interfaces.TableRowUpdateData
import typings.officeDashJs.OfficeExtension.ClientObject
import typings.officeDashJs.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a row in a table.
  
  Note that unlike Ranges or Columns, which will adjust if new rows/columns are added before them,
  a TableRow object represent the physical location of the table row, but not the data.
  That is, if the data is sorted or if new rows are added, a table row will continue
  to point at the index for which it was created.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.TableRow")
@js.native
class TableRow () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableRow: RequestContext = js.native
  /**
    *
    * Returns the index number of the row within the rows collection of the table. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val index: Double = js.native
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.Array[js.Array[_]] = js.native
  /**
    *
    * Deletes the row from the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  def delete(): Unit = js.native
  /**
    *
    * Returns the range object associated with the entire row.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getRange(): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableRow = js.native
  def load(options: TableRowLoadOptions): TableRow = js.native
  def load(propertyNamesAndPaths: Anon_Expand): TableRow = js.native
  def load(propertyNames: String): TableRow = js.native
  def load(propertyNames: js.Array[String]): TableRow = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.TableRow): void`
    *
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
}

