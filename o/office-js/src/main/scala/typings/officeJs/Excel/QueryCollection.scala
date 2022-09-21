package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.Excel.Interfaces.QueryCollectionData
import typings.officeJs.Excel.Interfaces.QueryCollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the collection of queries in the workbook.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
@js.native
trait QueryCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_QueryCollection: RequestContext = js.native
  
  /**
    * Gets the number of queries in the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a query from the collection based on its name.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    *
    * @param key The name of the query case-insensitive.
    * @returns The query with the given name. If there is no query by that name, then an error is thrown.
    */
  def getItem(key: String): Query = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Query] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): QueryCollection = js.native
  def load(options: QueryCollectionLoadOptions & CollectionLoadOptions): QueryCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): QueryCollection = js.native
  def load(propertyNames: String): QueryCollection = js.native
  def load(propertyNames: js.Array[String]): QueryCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.QueryCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.QueryCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): QueryCollectionData = js.native
}
