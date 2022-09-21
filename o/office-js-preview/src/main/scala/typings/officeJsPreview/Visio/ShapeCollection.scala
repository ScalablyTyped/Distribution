package typings.officeJsPreview.Visio

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.Visio.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Visio.Interfaces.ShapeCollectionData
import typings.officeJsPreview.Visio.Interfaces.ShapeCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Shape Collection.
  *
  * [Api set:  1.1]
  */
@js.native
trait ShapeCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeCollection: RequestContext = js.native
  
  /**
    *
    * Gets the number of Shapes in the collection.
    *
    * [Api set:  1.1]
    */
  def getCount(): ClientResult[Double] = js.native
  
  def getItem(key: String): Shape = js.native
  /**
    *
    * Gets a Shape using its key (name or Index).
    *
    * [Api set:  1.1]
    *
    * @param key Key is the Name or Index of the shape to be retrieved.
    */
  def getItem(key: Double): Shape = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Shape] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeCollection = js.native
  def load(options: ShapeCollectionLoadOptions & CollectionLoadOptions): ShapeCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): ShapeCollection = js.native
  def load(propertyNames: String): ShapeCollection = js.native
  def load(propertyNames: js.Array[String]): ShapeCollection = js.native
  
  /**
    * Set mock data
    */
  def setMockData(data: ShapeCollectionData): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Visio.ShapeCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.ShapeCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ShapeCollectionData = js.native
}
