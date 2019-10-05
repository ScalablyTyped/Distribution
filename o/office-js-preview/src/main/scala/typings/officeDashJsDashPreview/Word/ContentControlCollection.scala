package typings.officeDashJsDashPreview.Word

import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.OfficeExtension.LoadOption
import typings.officeDashJsDashPreview.Word.Interfaces.CollectionLoadOptions
import typings.officeDashJsDashPreview.Word.Interfaces.ContentControlCollectionData
import typings.officeDashJsDashPreview.Word.Interfaces.ContentControlCollectionLoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of {@link Word.ContentControl} objects. Content controls are bounded and potentially labeled regions in a document that serve as containers for specific types of content. Individual content controls may contain contents such as images, tables, or paragraphs of formatted text. Currently, only rich text content controls are supported.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.ContentControlCollection")
@js.native
class ContentControlCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ContentControlCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ContentControl] = js.native
  /**
    *
    * Gets a content control by its identifier. Throws an error if there isn't a content control with the identifier in this collection.
    *
    * [Api set: WordApi 1.1]
    *
    * @param id Required. A content control identifier.
    */
  def getById(id: Double): ContentControl = js.native
  /**
    *
    * Gets a content control by its identifier. Returns a null object if there isn't a content control with the identifier in this collection.
    *
    * [Api set: WordApi 1.3]
    *
    * @param id Required. A content control identifier.
    */
  def getByIdOrNullObject(id: Double): ContentControl = js.native
  /**
    *
    * Gets the content controls that have the specified tag.
    *
    * [Api set: WordApi 1.1]
    *
    * @param tag Required. A tag set on a content control.
    */
  def getByTag(tag: String): ContentControlCollection = js.native
  /**
    *
    * Gets the content controls that have the specified title.
    *
    * [Api set: WordApi 1.1]
    *
    * @param title Required. The title of a content control.
    */
  def getByTitle(title: String): ContentControlCollection = js.native
  /**
    *
    * Gets the content controls that have the specified types and/or subtypes.
    *
    * [Api set: WordApi 1.3]
    *
    * @param types Required. An array of content control types and/or subtypes.
    */
  def getByTypes(types: js.Array[ContentControlType]): ContentControlCollection = js.native
  /**
    *
    * Gets the first content control in this collection. Throws an error if this collection is empty.
    *
    * [Api set: WordApi 1.3]
    */
  def getFirst(): ContentControl = js.native
  /**
    *
    * Gets the first content control in this collection. Returns a null object if this collection is empty.
    *
    * [Api set: WordApi 1.3]
    */
  def getFirstOrNullObject(): ContentControl = js.native
  /**
    *
    * Gets a content control by its index in the collection.
    *
    * [Api set: WordApi 1.1]
    *
    * @param index The index.
    */
  def getItem(index: Double): ContentControl = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.ContentControlCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.ContentControlCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.ContentControlCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ContentControlCollection = js.native
  def load(option: ContentControlCollectionLoadOptions with CollectionLoadOptions): ContentControlCollection = js.native
  def load(option: String): ContentControlCollection = js.native
  def load(option: js.Array[String]): ContentControlCollection = js.native
  def load(option: LoadOption): ContentControlCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Word.ContentControlCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.ContentControlCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ContentControlCollectionData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): ContentControlCollection = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): ContentControlCollection = js.native
}

