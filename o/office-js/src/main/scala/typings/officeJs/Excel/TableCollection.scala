package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.Excel.Interfaces.TableCollectionData
import typings.officeJs.Excel.Interfaces.TableCollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.EventHandlers
import typings.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of all the tables that are part of the workbook or worksheet, depending on how it was reached.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait TableCollection
  extends StObject
     with ClientObject {
  
  def add(address: String, hasHeaders: Boolean): Table = js.native
  /**
    * Create a new table. The range object or source address determines the worksheet under which the table will be added. If the table cannot be added (e.g., because the address is invalid, or the table would overlap with another table), an error will be thrown.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param address A Range object, or a string address or name of the range representing the data source. If the address does not contain a sheet name, the currently-active sheet is used. [Api set: ExcelApi 1.1 / 1.3.  Prior to ExcelApi 1.3, this parameter must be a string. Starting with Excel Api 1.3, this parameter may be a Range object or a string.]
    * @param hasHeaders Boolean value that indicates whether the data being imported has column labels. If the source does not contain headers (i.e,. when this property set to false), Excel will automatically generate header shifting the data down by one row.
    */
  def add(address: Range, hasHeaders: Boolean): Table = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableCollection: RequestContext = js.native
  
  /**
    *
    * Returns the number of tables in the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
  
  /**
    * Gets the number of tables in the collection.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a table by Name or ID.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param key Name or ID of the table to be retrieved.
    */
  def getItem(key: String): Table = js.native
  
  /**
    * Gets a table based on its position in the collection.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): Table = js.native
  
  /**
    * Gets a table by Name or ID. If the table does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param key Name or ID of the table to be retrieved.
    */
  def getItemOrNullObject(key: String): Table = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Table] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableCollection = js.native
  def load(options: TableCollectionLoadOptions & CollectionLoadOptions): TableCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): TableCollection = js.native
  def load(propertyNames: String): TableCollection = js.native
  def load(propertyNames: js.Array[String]): TableCollection = js.native
  
  /**
    *
    * Occurs when new table is added in a workbook.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onAdded: EventHandlers[TableAddedEventArgs] = js.native
  
  /**
    *
    * Occurs when data changes on any table in a workbook, or a worksheet.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onChanged: EventHandlers[TableChangedEventArgs] = js.native
  
  /**
    *
    * Occurs when the specified table is deleted in a workbook.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onDeleted: EventHandlers[TableDeletedEventArgs] = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.TableCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TableCollectionData = js.native
}
