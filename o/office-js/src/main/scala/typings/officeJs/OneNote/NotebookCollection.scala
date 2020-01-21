package typings.officeJs.OneNote

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.LoadOption
import typings.officeJs.OneNote.Interfaces.CollectionLoadOptions
import typings.officeJs.OneNote.Interfaces.NotebookCollectionData
import typings.officeJs.OneNote.Interfaces.NotebookCollectionLoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of notebooks.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.NotebookCollection")
@js.native
class NotebookCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_NotebookCollection: RequestContext = js.native
  /**
    *
    * Returns the number of notebooks in the collection. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val count: Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Notebook] = js.native
  /**
    *
    * Gets the collection of notebooks with the specified name that are open in the application instance.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param name The name of the notebook.
    */
  def getByName(name: String): NotebookCollection = js.native
  def getItem(index: String): Notebook = js.native
  /**
    *
    * Gets a notebook by ID or by its index in the collection. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param index The ID of the notebook, or the index location of the notebook in the collection.
    */
  def getItem(index: Double): Notebook = js.native
  /**
    *
    * Gets a notebook on its position in the collection.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): Notebook = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.NotebookCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.NotebookCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.NotebookCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NotebookCollection = js.native
  def load(option: NotebookCollectionLoadOptions with CollectionLoadOptions): NotebookCollection = js.native
  def load(option: String): NotebookCollection = js.native
  def load(option: js.Array[String]): NotebookCollection = js.native
  def load(option: LoadOption): NotebookCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `OneNote.NotebookCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.NotebookCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): NotebookCollectionData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): NotebookCollection = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): NotebookCollection = js.native
}

