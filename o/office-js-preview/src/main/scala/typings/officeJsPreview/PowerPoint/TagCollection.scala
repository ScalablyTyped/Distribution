package typings.officeJsPreview.PowerPoint

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.PowerPoint.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.PowerPoint.Interfaces.TagCollectionData
import typings.officeJsPreview.PowerPoint.Interfaces.TagCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the collection of tags.
  *
  * @remarks
  * [Api set: PowerPointApi 1.3]
  */
@js.native
trait TagCollection
  extends StObject
     with ClientObject {
  
  /**
    * Adds a new tag at the end of the collection. If the `key` already exists in the collection, the value of the existing tag will be replaced with the given `value`.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param key The unique ID of a tag, which is unique within this `TagCollection`. 'key' parameter is case-insensitive, but it is always capitalized when saved in the document.
    * @param value The value of the tag.
    */
  def add(key: String, value: String): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TagCollection: RequestContext = js.native
  
  /**
    * Deletes the tag with the given `key` in this collection. Does nothing if the `key` does not exist.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param key The unique ID of a tag, which is unique within this `TagCollection`. `key` parameter is case-insensitive.
    */
  def delete(key: String): Unit = js.native
  
  /**
    * Gets the number of tags in the collection.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    * @returns The number of tags in the collection.
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a tag using its unique ID. An error is thrown if the tag does not exist.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param key The ID of the tag.
    * @returns The tag with the unique ID. If such a tag does not exist, an error is thrown.
    */
  def getItem(key: String): Tag = js.native
  
  /**
    * Gets a tag using its zero-based index in the collection. An error is thrown if the index is out of range.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param index The index of the tag in the collection.
    * @returns The tag at the given index. An error is thrown if index is out of range.
    */
  def getItemAt(index: Double): Tag = js.native
  
  /**
    * Gets a tag using its unique ID. If such a tag does not exist, an object with an `isNullObject` property set to true is returned.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param key The ID of the tag.
    * @returns The tag with the unique ID. If such a tag does not exist, an object with an `isNullObject` property set to true is returned.
    */
  def getItemOrNullObject(key: String): Tag = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Tag] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TagCollection = js.native
  def load(options: TagCollectionLoadOptions & CollectionLoadOptions): TagCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): TagCollection = js.native
  def load(propertyNames: String): TagCollection = js.native
  def load(propertyNames: js.Array[String]): TagCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `PowerPoint.TagCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.TagCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TagCollectionData = js.native
}
