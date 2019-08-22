package typings.officeDashJs.WordNs

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.UpdateOptions
import typings.officeDashJs.WordNs.InterfacesNs.DocumentPropertiesData
import typings.officeDashJs.WordNs.InterfacesNs.DocumentPropertiesLoadOptions
import typings.officeDashJs.WordNs.InterfacesNs.DocumentPropertiesUpdateData
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents document properties.
  *
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.DocumentProperties")
@js.native
class DocumentProperties () extends ClientObject {
  /**
    *
    * Gets the application name of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  val applicationName: String = js.native
  /**
    *
    * Gets or sets the author of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var author: String = js.native
  /**
    *
    * Gets or sets the category of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var category: String = js.native
  /**
    *
    * Gets or sets the comments of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var comments: String = js.native
  /**
    *
    * Gets or sets the company of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var company: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DocumentProperties: RequestContext = js.native
  /**
    *
    * Gets the creation date of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  val creationDate: Date = js.native
  /**
    *
    * Gets the collection of custom properties of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  val customProperties: CustomPropertyCollection = js.native
  /**
    *
    * Gets or sets the format of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var format: String = js.native
  /**
    *
    * Gets or sets the keywords of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var keywords: String = js.native
  /**
    *
    * Gets the last author of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  val lastAuthor: String = js.native
  /**
    *
    * Gets the last print date of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  val lastPrintDate: Date = js.native
  /**
    *
    * Gets the last save time of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  val lastSaveTime: Date = js.native
  /**
    *
    * Gets or sets the manager of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var manager: String = js.native
  /**
    *
    * Gets the revision number of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  val revisionNumber: String = js.native
  /**
    *
    * Gets security settings of the document. Read only. Some are access restrictions on the file on disk. Others are Document Protection settings. Some possible values are 0 = File on disk is read/write; 1 = Protect Document: File is encrypted and requires a password to open; 2 = Protect Document: Always Open as Read-Only; 3 = Protect Document: Both #1 and #2; 4 = File on disk is read only; 5 = Both #1 and #4; 6 = Both #2 and #4; 7 = All of #1, #2, and #4; 8 = Protect Document: Restrict Edit to read-only; 9 = Both #1 and #8; 10 = Both #2 and #8; 11 = All of #1, #2, and #8; 12 = Both #4 and #8; 13 = All of #1, #4, and #8; 14 = All of #2, #4, and #8; 15 = All of #1, #2, #4, and #8.
    *
    * [Api set: WordApi 1.3]
    */
  val security: Double = js.native
  /**
    *
    * Gets or sets the subject of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var subject: String = js.native
  /**
    *
    * Gets the template of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  val template: String = js.native
  /**
    *
    * Gets or sets the title of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var title: String = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.DocumentProperties` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.DocumentProperties` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.DocumentProperties` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DocumentProperties = js.native
  def load(option: String): DocumentProperties = js.native
  def load(option: js.Array[String]): DocumentProperties = js.native
  def load(option: Anon_Expand): DocumentProperties = js.native
  def load(option: DocumentPropertiesLoadOptions): DocumentProperties = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: DocumentProperties): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.DocumentProperties): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: DocumentPropertiesUpdateData): Unit = js.native
  def set(properties: DocumentPropertiesUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.DocumentProperties object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.DocumentPropertiesData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DocumentPropertiesData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): DocumentProperties = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): DocumentProperties = js.native
}

