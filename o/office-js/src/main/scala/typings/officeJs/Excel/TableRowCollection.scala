package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.Excel.Interfaces.TableRowCollectionData
import typings.officeJs.Excel.Interfaces.TableRowCollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of all the rows that are part of the table.
  
  Note that unlike ranges or columns, which will adjust if new rows or columns are added before them,
  a `TableRow` object represents the physical location of the table row, but not the data.
  That is, if the data is sorted or if new rows are added, a table row will continue
  to point at the index for which it was created.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait TableRowCollection
  extends StObject
     with ClientObject {
  
  /**
    * Adds one or more rows to the table. The return object will be the top of the newly added row(s).
    
    Note that unlike ranges or columns, which will adjust if new rows or columns are added before them,
    a `TableRow` object represents the physical location of the table row, but not the data.
    That is, if the data is sorted or if new rows are added, a table row will continue
    to point at the index for which it was created.
    *
    * @remarks
    * [Api set: ExcelApi 1.1 for adding a single row; 1.4 allows adding of multiple rows; 1.15 for adding `alwaysInsert` parameter.]
    *
    * @param index Optional. Specifies the relative position of the new row. If null or -1, the addition happens at the end. Any rows below the inserted row are shifted downwards. Zero-indexed.
    * @param values Optional. A 2D array of unformatted values of the table row.
    * @param alwaysInsert Optional. Specifies whether the new rows will be inserted into the table when new rows are added. If `true`, the new rows will be inserted into the table. If `false`, the new rows will be added below the table. Default is `true`.
    */
  def add(): TableRow = js.native
  def add(index: Double): TableRow = js.native
  def add(index: Double, values: String): TableRow = js.native
  def add(index: Double, values: String, alwaysInsert: Boolean): TableRow = js.native
  def add(index: Double, values: js.Array[js.Array[Boolean | String | Double]]): TableRow = js.native
  def add(index: Double, values: js.Array[js.Array[Boolean | String | Double]], alwaysInsert: Boolean): TableRow = js.native
  def add(index: Double, values: Boolean): TableRow = js.native
  def add(index: Double, values: Boolean, alwaysInsert: Boolean): TableRow = js.native
  def add(index: Double, values: Double): TableRow = js.native
  def add(index: Double, values: Double, alwaysInsert: Boolean): TableRow = js.native
  def add(index: Double, values: Unit, alwaysInsert: Boolean): TableRow = js.native
  def add(index: Unit, values: String): TableRow = js.native
  def add(index: Unit, values: String, alwaysInsert: Boolean): TableRow = js.native
  def add(index: Unit, values: js.Array[js.Array[Boolean | String | Double]]): TableRow = js.native
  def add(index: Unit, values: js.Array[js.Array[Boolean | String | Double]], alwaysInsert: Boolean): TableRow = js.native
  def add(index: Unit, values: Boolean): TableRow = js.native
  def add(index: Unit, values: Boolean, alwaysInsert: Boolean): TableRow = js.native
  def add(index: Unit, values: Double): TableRow = js.native
  def add(index: Unit, values: Double, alwaysInsert: Boolean): TableRow = js.native
  def add(index: Unit, values: Unit, alwaysInsert: Boolean): TableRow = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableRowCollection: RequestContext = js.native
  
  /**
    * Returns the number of rows in the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
  
  /**
    * Delete multiple rows from a table.
    These rows don't need to be sequential. This method will throw the `InvalidArgument` error if a chosen row has already been deleted or doesn't exist.
    This method will throw the `InsertDeleteConflict` error if the table on which the method is called has a filter applied.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param rows An array of row index numbers or row objects to delete from the table.
    */
  def deleteRows(rows: js.Array[Double | TableRow]): Unit = js.native
  
  /**
    * Delete a specified number of rows from a table, starting at a given index.
    This method will throw the `InsertDeleteConflict` error if the table on which the method is called has a filter applied.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param index The index value of the row to be deleted. Note: Row indexes update each time that a preceding row in the table is deleted, after each delete operation. Ensure that the index of the row that you want to delete hasn't changed between the time that you determined the value and the time that you run the operation.
    * @param count Number of rows to delete. By default, a single row will be deleted.
    */
  def deleteRowsAt(index: Double): Unit = js.native
  def deleteRowsAt(index: Double, count: Double): Unit = js.native
  
  /**
    * Gets the number of rows in the table.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a row based on its position in the collection.
    
    Note that unlike ranges or columns, which will adjust if new rows or columns are added before them,
    a `TableRow` object represents the physical location of the table row, but not the data.
    That is, if the data is sorted or if new rows are added, a table row will continue
    to point at the index for which it was created.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): TableRow = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[TableRow] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableRowCollection = js.native
  def load(options: TableRowCollectionLoadOptions & CollectionLoadOptions): TableRowCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): TableRowCollection = js.native
  def load(propertyNames: String): TableRowCollection = js.native
  def load(propertyNames: js.Array[String]): TableRowCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.TableRowCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableRowCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TableRowCollectionData = js.native
}
