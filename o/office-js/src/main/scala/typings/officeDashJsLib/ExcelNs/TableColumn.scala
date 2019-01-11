package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a column in a table.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.TableColumn")
@js.native
class TableColumn ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableColumn: RequestContext = js.native
  /**
    *
    * Retrieve the filter applied to the column. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  val filter: Filter = js.native
  /**
    *
    * Returns a unique key that identifies the column within the table. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val id: scala.Double = js.native
  /**
    *
    * Returns the index number of the column within the columns collection of the table. Zero-indexed. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val index: scala.Double = js.native
  /**
    *
    * Represents the name of the table column.
    *
    * [Api set: ExcelApi 1.1 for getting the name; 1.4 for setting it.]
    */
  var name: java.lang.String = js.native
  /**
    *
    * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
    *
    * [Api set: ExcelApi 1.1]
    */
  var values: js.Array[js.Array[_]] = js.native
  /**
    *
    * Deletes the column from the table.
    *
    * [Api set: ExcelApi 1.1]
    */
  def delete(): scala.Unit = js.native
  /**
    *
    * Gets the range object associated with the data body of the column.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getDataBodyRange(): Range = js.native
  /**
    *
    * Gets the range object associated with the header row of the column.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getHeaderRowRange(): Range = js.native
  /**
    *
    * Gets the range object associated with the entire column.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getRange(): Range = js.native
  /**
    *
    * Gets the range object associated with the totals row of the column.
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
    * `load(option?: string | string[]): Excel.TableColumn` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.TableColumn` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.TableColumn` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableColumn = js.native
  def load(option: java.lang.String): TableColumn = js.native
  def load(option: js.Array[java.lang.String]): TableColumn = js.native
  def load(option: officeDashJsLib.Anon_Expand): TableColumn = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.TableColumnLoadOptions): TableColumn = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.TableColumn): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.TableColumnUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.TableColumnUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: TableColumn): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.TableColumn object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableColumnData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.TableColumnData = js.native
}

