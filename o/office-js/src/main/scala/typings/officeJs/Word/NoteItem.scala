package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Word.Interfaces.NoteItemData
import typings.officeJs.Word.Interfaces.NoteItemLoadOptions
import typings.officeJs.Word.Interfaces.NoteItemUpdateData
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Endnote
import typings.officeJs.officeJsStrings.Footnote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a footnote or endnote.
  *
  * @remarks
  * [Api set: WordApiOnline 1.1]
  */
@js.native
trait NoteItem
  extends StObject
     with ClientObject {
  
  /**
    * Represents the body object of the note item. It's the portion of the text within the footnote or endnote.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  val body: Body = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_NoteItem: RequestContext = js.native
  
  /**
    * Deletes the note item.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the next note item of the same type. Throws an `ItemNotFound` error if this note item is the last one.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  def getNext(): NoteItem = js.native
  
  /**
    * Gets the next note item of the same type. If this note item is the last one, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  def getNextOrNullObject(): NoteItem = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NoteItem = js.native
  def load(options: NoteItemLoadOptions): NoteItem = js.native
  def load(propertyNamesAndPaths: Expand): NoteItem = js.native
  def load(propertyNames: String): NoteItem = js.native
  def load(propertyNames: js.Array[String]): NoteItem = js.native
  
  /**
    * Represents a footnote or endnote reference in the main document.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  val reference: Range = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: NoteItemUpdateData): Unit = js.native
  def set(properties: NoteItemUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: NoteItem): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.NoteItem object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.NoteItemData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): NoteItemData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): NoteItem = js.native
  
  /**
    * Represents the note item type: footnote or endnote.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  val `type`: NoteItemType | Footnote | Endnote = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): NoteItem = js.native
}
