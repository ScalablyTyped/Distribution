package typings.officeJs.Visio

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import typings.officeJs.Visio.Interfaces.CollectionLoadOptions
import typings.officeJs.Visio.Interfaces.HyperlinkCollectionData
import typings.officeJs.Visio.Interfaces.HyperlinkCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Hyperlink Collection.
  *
  * [Api set:  1.1]
  */
@js.native
trait HyperlinkCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_HyperlinkCollection: RequestContext = js.native
  
  /**
    *
    * Gets the number of hyperlinks.
    *
    * [Api set:  1.1]
    */
  def getCount(): ClientResult[Double] = js.native
  
  def getItem(Key: String): Hyperlink = js.native
  /**
    *
    * Gets a Hyperlink using its key (name or Id).
    *
    * [Api set:  1.1]
    *
    * @param Key Key is the name or index of the Hyperlink to be retrieved.
    */
  def getItem(Key: Double): Hyperlink = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Hyperlink] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): HyperlinkCollection = js.native
  def load(options: HyperlinkCollectionLoadOptions & CollectionLoadOptions): HyperlinkCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): HyperlinkCollection = js.native
  def load(propertyNames: String): HyperlinkCollection = js.native
  def load(propertyNames: js.Array[String]): HyperlinkCollection = js.native
  
  /**
    * Set mock data
    */
  def setMockData(data: HyperlinkCollectionData): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Visio.HyperlinkCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.HyperlinkCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): HyperlinkCollectionData = js.native
}
