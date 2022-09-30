package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Word.Interfaces.DocumentCreatedData
import typings.officeJs.Word.Interfaces.DocumentCreatedLoadOptions
import typings.officeJs.Word.Interfaces.DocumentCreatedUpdateData
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The DocumentCreated object is the top level object created by Application.CreateDocument. A DocumentCreated object is a special Document object.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
@js.native
trait DocumentCreated
  extends StObject
     with ClientObject {
  
  /**
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.3]
    */
  val body: Body = js.native
  
  /**
    * Gets the collection of content control objects in the document. This includes content controls in the body of the document, headers, footers, textboxes, etc.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.3]
    */
  val contentControls: ContentControlCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DocumentCreated: RequestContext = js.native
  
  /**
    * Gets the custom XML parts in the document.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.4]
    */
  val customXmlParts: CustomXmlPartCollection = js.native
  
  /**
    * Deletes a bookmark, if it exists, from the document.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.4]
    *
    * @param name Required. The bookmark name, which is case-insensitive.
    */
  def deleteBookmark(name: String): Unit = js.native
  
  /**
    * Gets a bookmark's range. Throws an `ItemNotFound` error if the bookmark does not exist.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.4]
    *
    * @param name Required. The bookmark name, which is case-insensitive.
    */
  def getBookmarkRange(name: String): Range = js.native
  
  /**
    * Gets a bookmark's range. If the bookmark does not exist, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.4]
    *
    * @param name Required. The bookmark name, which is case-insensitive.
    */
  def getBookmarkRangeOrNullObject(name: String): Range = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DocumentCreated = js.native
  def load(options: DocumentCreatedLoadOptions): DocumentCreated = js.native
  def load(propertyNamesAndPaths: Expand): DocumentCreated = js.native
  def load(propertyNames: String): DocumentCreated = js.native
  def load(propertyNames: js.Array[String]): DocumentCreated = js.native
  
  /**
    * Opens the document.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def open(): Unit = js.native
  
  /**
    * Gets the properties of the document.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.3]
    */
  val properties: DocumentProperties = js.native
  
  /**
    * Saves the document. This uses the Word default file naming convention if the document has not been saved before.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.3]
    */
  def save(): Unit = js.native
  
  /**
    * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.3]
    */
  val saved: Boolean = js.native
  
  /**
    * Gets the collection of section objects in the document.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.3]
    */
  val sections: SectionCollection = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: DocumentCreated): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: DocumentCreatedUpdateData): Unit = js.native
  def set(properties: DocumentCreatedUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Gets the add-in's settings in the document.
    *
    * @remarks
    * [Api set: WordApiHiddenDocument 1.4]
    */
  val settings: SettingCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.DocumentCreated object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.DocumentCreatedData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DocumentCreatedData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): DocumentCreated = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): DocumentCreated = js.native
}
