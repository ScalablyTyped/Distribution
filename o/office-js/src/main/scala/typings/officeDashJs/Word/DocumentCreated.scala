package typings.officeDashJs.Word

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.OfficeExtension.ClientObject
import typings.officeDashJs.OfficeExtension.UpdateOptions
import typings.officeDashJs.Word.Interfaces.DocumentCreatedData
import typings.officeDashJs.Word.Interfaces.DocumentCreatedLoadOptions
import typings.officeDashJs.Word.Interfaces.DocumentCreatedUpdateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * The DocumentCreated object is the top level object created by Application.CreateDocument. A DocumentCreated object is a special Document object.
  *
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.DocumentCreated")
@js.native
class DocumentCreated () extends ClientObject {
  /**
    *
    * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc.. Read-only.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  val body: Body = js.native
  /**
    *
    * Gets the collection of content control objects in the document. This includes content controls in the body of the document, headers, footers, textboxes, etc.. Read-only.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  val contentControls: ContentControlCollection = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DocumentCreated: RequestContext = js.native
  /**
    *
    * Gets the properties of the document. Read-only.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  val properties: DocumentProperties = js.native
  /**
    *
    * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved. Read-only.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  val saved: Boolean = js.native
  /**
    *
    * Gets the collection of section objects in the document. Read-only.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  val sections: SectionCollection = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.DocumentCreated` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.DocumentCreated` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.DocumentCreated` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DocumentCreated = js.native
  def load(option: String): DocumentCreated = js.native
  def load(option: js.Array[String]): DocumentCreated = js.native
  def load(option: Anon_Expand): DocumentCreated = js.native
  def load(option: DocumentCreatedLoadOptions): DocumentCreated = js.native
  /**
    *
    * Opens the document.
    *
    * [Api set: WordApi 1.3]
    */
  def open(): Unit = js.native
  /**
    *
    * Saves the document. This uses the Word default file naming convention if the document has not been saved before.
    *
    * [Api set: WordApiHiddenDocument 1.3]
    */
  def save(): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: DocumentCreated): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.DocumentCreated): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: DocumentCreatedUpdateData): Unit = js.native
  def set(properties: DocumentCreatedUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.DocumentCreated object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.DocumentCreatedData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DocumentCreatedData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): DocumentCreated = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): DocumentCreated = js.native
}

