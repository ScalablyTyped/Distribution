package typings.officeJsPreview.Visio

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.Visio.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Visio.Interfaces.PageCollectionData
import typings.officeJsPreview.Visio.Interfaces.PageCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of Page objects that are part of the document.
  *
  * [Api set:  1.1]
  */
@js.native
trait PageCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PageCollection: RequestContext = js.native
  
  /**
    *
    * Gets the number of pages in the collection.
    *
    * [Api set:  1.1]
    */
  def getCount(): ClientResult[Double] = js.native
  
  def getItem(key: String): Page = js.native
  /**
    *
    * Gets a page using its key (name or Id).
    *
    * [Api set:  1.1]
    *
    * @param key Key is the name or Id of the page to be retrieved.
    */
  def getItem(key: Double): Page = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Page] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageCollection = js.native
  def load(options: PageCollectionLoadOptions & CollectionLoadOptions): PageCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): PageCollection = js.native
  def load(propertyNames: String): PageCollection = js.native
  def load(propertyNames: js.Array[String]): PageCollection = js.native
  
  /**
    * Set mock data
    */
  def setMockData(data: PageCollectionData): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Visio.PageCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.PageCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): PageCollectionData = js.native
}
