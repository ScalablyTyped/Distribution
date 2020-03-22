package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.TableRowCollectionData
import typings.officeJsPreview.Excel.Interfaces.TableRowCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the rows that are part of the table.
  
  Note that unlike Ranges or Columns, which will adjust if new rows/columns are added before them,
  a TableRow object represent the physical location of the table row, but not the data.
  That is, if the data is sorted or if new rows are added, a table row will continue
  to point at the index for which it was created.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.TableRowCollection")
@js.native
class TableRowCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableRowCollection: RequestContext = js.native
  /**
    *
    * Returns the number of rows in the table. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[TableRow] = js.native
  /**
    * Adds one or more rows to the table. The return object will be the top of the newly added row(s).
    
    Note that unlike Ranges or Columns, which will adjust if new rows/columns are added before them,
    a TableRow object represent the physical location of the table row, but not the data.
    That is, if the data is sorted or if new rows are added, a table row will continue
    to point at the index for which it was created.
    *
    * [Api set: ExcelApi 1.1 for adding a single row; 1.4 allows adding of multiple rows.]
    *
    * @param index Optional. Specifies the relative position of the new row. If null or -1, the addition happens at the end. Any rows below the inserted row are shifted downwards. Zero-indexed.
    * @param values Optional. A 2-dimensional array of unformatted values of the table row.
    */
  def add(): TableRow = js.native
  def add(index: Double): TableRow = js.native
  def add(index: Double, values: String): TableRow = js.native
  def add(index: Double, values: js.Array[js.Array[Boolean | String | Double]]): TableRow = js.native
  def add(index: Double, values: Boolean): TableRow = js.native
  def add(index: Double, values: Double): TableRow = js.native
  /**
    * Gets the number of rows in the table.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    * Gets a row based on its position in the collection.
    
    Note that unlike Ranges or Columns, which will adjust if new rows/columns are added before them,
    a TableRow object represent the physical location of the table row, but not the data.
    That is, if the data is sorted or if new rows are added, a table row will continue
    to point at the index for which it was created.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): TableRow = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableRowCollection = js.native
  def load(options: TableRowCollectionLoadOptions with CollectionLoadOptions): TableRowCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): TableRowCollection = js.native
  def load(propertyNames: String): TableRowCollection = js.native
  def load(propertyNames: js.Array[String]): TableRowCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.TableRowCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableRowCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TableRowCollectionData = js.native
}

