package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.TableColumnCollectionData
import typings.officeJsPreview.Excel.Interfaces.TableColumnCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the columns that are part of the table.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.TableColumnCollection")
@js.native
class TableColumnCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableColumnCollection: RequestContext = js.native
  /**
    *
    * Returns the number of columns in the table. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[TableColumn] = js.native
  /**
    *
    * Adds a new column to the table.
    *
    * [Api set: ExcelApi 1.1 requires an index smaller than the total column count; 1.4 allows index to be optional (null or -1) and will append a column at the end; 1.4 allows name parameter at creation time.]
    *
    * @param index Optional. Specifies the relative position of the new column. If null or -1, the addition happens at the end. Columns with a higher index will be shifted to the side. Zero-indexed.
    * @param values Optional. A 2-dimensional array of unformatted values of the table column.
    * @param name Optional. Specifies the name of the new column. If null, the default name will be used.
    */
  def add(): TableColumn = js.native
  def add(index: Double): TableColumn = js.native
  def add(index: Double, values: String): TableColumn = js.native
  def add(index: Double, values: String, name: String): TableColumn = js.native
  def add(index: Double, values: js.Array[js.Array[Boolean | String | Double]]): TableColumn = js.native
  def add(index: Double, values: js.Array[js.Array[Boolean | String | Double]], name: String): TableColumn = js.native
  def add(index: Double, values: Boolean): TableColumn = js.native
  def add(index: Double, values: Boolean, name: String): TableColumn = js.native
  def add(index: Double, values: Double): TableColumn = js.native
  def add(index: Double, values: Double, name: String): TableColumn = js.native
  /**
    *
    * Gets the number of columns in the table.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  def getItem(key: String): TableColumn = js.native
  /**
    *
    * Gets a column object by Name or ID.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param key Column Name or ID.
    */
  def getItem(key: Double): TableColumn = js.native
  /**
    *
    * Gets a column based on its position in the collection.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): TableColumn = js.native
  def getItemOrNullObject(key: String): TableColumn = js.native
  /**
    *
    * Gets a column object by Name or ID. If the column does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param key Column Name or ID.
    */
  def getItemOrNullObject(key: Double): TableColumn = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableColumnCollection = js.native
  def load(options: TableColumnCollectionLoadOptions with CollectionLoadOptions): TableColumnCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): TableColumnCollection = js.native
  def load(propertyNames: String): TableColumnCollection = js.native
  def load(propertyNames: js.Array[String]): TableColumnCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.TableColumnCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableColumnCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TableColumnCollectionData = js.native
}

