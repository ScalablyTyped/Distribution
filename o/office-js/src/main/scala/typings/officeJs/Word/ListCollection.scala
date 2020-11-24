package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.LoadOption
import typings.officeJs.Word.Interfaces.CollectionLoadOptions
import typings.officeJs.Word.Interfaces.ListCollectionData
import typings.officeJs.Word.Interfaces.ListCollectionLoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Contains a collection of {@link Word.List} objects.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait ListCollection extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ListCollection: RequestContext = js.native
  
  /**
    * Gets a list by its identifier. Throws an error if there isn't a list with the identifier in this collection.
    *
    * [Api set: WordApi 1.3]
    *
    * @param id Required. A list identifier.
    */
  def getById(id: Double): List = js.native
  
  /**
    * Gets a list by its identifier. Returns a null object if there isn't a list with the identifier in this collection.
    *
    * [Api set: WordApi 1.3]
    *
    * @param id Required. A list identifier.
    */
  def getByIdOrNullObject(id: Double): List = js.native
  
  /**
    * Gets the first list in this collection. Throws an error if this collection is empty.
    *
    * [Api set: WordApi 1.3]
    */
  def getFirst(): List = js.native
  
  /**
    * Gets the first list in this collection. Returns a null object if this collection is empty.
    *
    * [Api set: WordApi 1.3]
    */
  def getFirstOrNullObject(): List = js.native
  
  /**
    * Gets a list object by its index in the collection.
    *
    * [Api set: WordApi 1.3]
    *
    * @param index A number that identifies the index location of a list object.
    */
  def getItem(index: Double): List = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[List] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ListCollection = js.native
  def load(options: ListCollectionLoadOptions with CollectionLoadOptions): ListCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): ListCollection = js.native
  def load(propertyNames: String): ListCollection = js.native
  def load(propertyNames: js.Array[String]): ListCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Word.ListCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.ListCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ListCollectionData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): ListCollection = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): ListCollection = js.native
}
