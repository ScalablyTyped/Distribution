package typings.officeJsPreview.Word

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.EventHandlers
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.Word.Interfaces.DocumentData
import typings.officeJsPreview.Word.Interfaces.DocumentLoadOptions
import typings.officeJsPreview.Word.Interfaces.DocumentUpdateData
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.anon.IgnorePunct
import typings.officeJsPreview.officeJsPreviewStrings.Off
import typings.officeJsPreview.officeJsPreviewStrings.TrackAll
import typings.officeJsPreview.officeJsPreviewStrings.TrackMineOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Document object is the top level object. A Document object contains one or more sections, content controls, and the body that contains the contents of the document.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@js.native
trait Document
  extends StObject
     with ClientObject {
  
  /**
    * Gets the body object of the main document. The body is the text that excludes headers, footers, footnotes, textboxes, etc. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val body: Body = js.native
  
  /**
    * Gets or sets the ChangeTracking mode.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  var changeTrackingMode: ChangeTrackingMode | Off | TrackAll | TrackMineOnly = js.native
  
  /**
    * Gets the collection of content control objects in the document. This includes content controls in the body of the document, headers, footers, textboxes, etc. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val contentControls: ContentControlCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Document: RequestContext = js.native
  
  /**
    * Gets the custom XML parts in the document. Read-only.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val customXmlParts: CustomXmlPartCollection = js.native
  
  /**
    * Deletes a bookmark, if it exists, from the document.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name Required. The bookmark name, which is case-insensitive.
    */
  def deleteBookmark(name: String): Unit = js.native
  
  /**
    * Gets a bookmark's range. Throws an error if the bookmark does not exist.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name Required. The bookmark name, which is case-insensitive.
    */
  def getBookmarkRange(name: String): Range = js.native
  
  /**
    * Gets a bookmark's range. Returns a null object if the bookmark does not exist.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name Required. The bookmark name, which is case-insensitive.
    */
  def getBookmarkRangeOrNullObject(name: String): Range = js.native
  
  /**
    * Gets the document's endnotes in a single body. Read-only.
    Not implemented in Word on the web.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  def getEndnoteBody(): Body = js.native
  
  /**
    * Gets the document's footnotes in a single body. Read-only.
    Not implemented in Word on the web.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  def getFootnoteBody(): Body = js.native
  
  /**
    * Gets the current selection of the document. Multiple selections are not supported.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def getSelection(): Range = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Document = js.native
  def load(options: DocumentLoadOptions): Document = js.native
  def load(propertyNamesAndPaths: Expand): Document = js.native
  def load(propertyNames: String): Document = js.native
  def load(propertyNames: js.Array[String]): Document = js.native
  
  /**
    * Occurs when a content control is added. Run context.sync() in the handler to get the new content control's properties.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onContentControlAdded: EventHandlers[ContentControlEventArgs] = js.native
  
  /**
    * Gets the properties of the document. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val properties: DocumentProperties = js.native
  
  /**
    * Saves the document. This uses the Word default file naming convention if the document has not been saved before.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def save(): Unit = js.native
  
  /**
    * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val saved: Boolean = js.native
  
  /**
    * Performs a search with the specified search options on the scope of the whole document. The search results are a collection of range objects.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  def search(searchText: String): RangeCollection = js.native
  def search(searchText: String, searchOptions: SearchOptions): RangeCollection = js.native
  def search(searchText: String, searchOptions: IgnorePunct): RangeCollection = js.native
  
  /**
    * Gets the collection of section objects in the document. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val sections: SectionCollection = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Document): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: DocumentUpdateData): Unit = js.native
  def set(properties: DocumentUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Gets the add-in's settings in the document. Read-only.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val settings: SettingCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Document object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.DocumentData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DocumentData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): Document = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Document = js.native
}
