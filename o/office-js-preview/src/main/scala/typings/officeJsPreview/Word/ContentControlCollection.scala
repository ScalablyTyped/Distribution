package typings.officeJsPreview.Word

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.Word.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Word.Interfaces.ContentControlCollectionData
import typings.officeJsPreview.Word.Interfaces.ContentControlCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of {@link Word.ContentControl} objects. Content controls are bounded and potentially labeled regions in a document that serve as containers for specific types of content. Individual content controls may contain contents such as images, tables, or paragraphs of formatted text. Currently, only rich text and plain text content controls are supported.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@js.native
trait ContentControlCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ContentControlCollection: RequestContext = js.native
  
  /**
    * Gets the content controls that have the specified tracking state.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param changeTrackingStates Required. An array of content control change tracking states.
    */
  def getByChangeTrackingStates(changeTrackingStates: js.Array[ChangeTrackingState]): ContentControlCollection = js.native
  
  /**
    * Gets a content control by its identifier. Throws an `ItemNotFound` error if there isn't a content control with the identifier in this collection.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param id Required. A content control identifier.
    */
  def getById(id: Double): ContentControl = js.native
  
  /**
    * Gets a content control by its identifier. If there isn't a content control with the identifier in this collection, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param id Required. A content control identifier.
    */
  def getByIdOrNullObject(id: Double): ContentControl = js.native
  
  /**
    * Gets the content controls that have the specified tag.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param tag Required. A tag set on a content control.
    */
  def getByTag(tag: String): ContentControlCollection = js.native
  
  /**
    * Gets the content controls that have the specified title.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param title Required. The title of a content control.
    */
  def getByTitle(title: String): ContentControlCollection = js.native
  
  /**
    * Gets the content controls that have the specified types.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param types Required. An array of content control types.
    */
  def getByTypes(types: js.Array[ContentControlType]): ContentControlCollection = js.native
  
  /**
    * Gets the first content control in this collection. Throws an `ItemNotFound` error if this collection is empty.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getFirst(): ContentControl = js.native
  
  /**
    * Gets the first content control in this collection. If this collection is empty, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getFirstOrNullObject(): ContentControl = js.native
  
  /**
    * Gets a content control by its ID.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param id The content control's ID.
    */
  def getItem(id: Double): ContentControl = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ContentControl] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ContentControlCollection = js.native
  def load(options: ContentControlCollectionLoadOptions & CollectionLoadOptions): ContentControlCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): ContentControlCollection = js.native
  def load(propertyNames: String): ContentControlCollection = js.native
  def load(propertyNames: js.Array[String]): ContentControlCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Word.ContentControlCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.ContentControlCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ContentControlCollectionData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): ContentControlCollection = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): ContentControlCollection = js.native
}
