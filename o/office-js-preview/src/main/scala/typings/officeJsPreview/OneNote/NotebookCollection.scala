package typings.officeJsPreview.OneNote

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.OneNote.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.OneNote.Interfaces.NotebookCollectionData
import typings.officeJsPreview.OneNote.Interfaces.NotebookCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of notebooks.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait NotebookCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_NotebookCollection: RequestContext = js.native
  
  /**
    * Returns the number of notebooks in the collection. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val count: Double = js.native
  
  /**
    * Gets the collection of notebooks with the specified name that are open in the application instance.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param name The name of the notebook.
    */
  def getByName(name: String): NotebookCollection = js.native
  
  def getItem(index: String): Notebook = js.native
  /**
    * Gets a notebook by ID or by its index in the collection. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param index The ID of the notebook, or the index location of the notebook in the collection.
    */
  def getItem(index: Double): Notebook = js.native
  
  /**
    * Gets a notebook on its position in the collection.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): Notebook = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Notebook] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NotebookCollection = js.native
  def load(options: NotebookCollectionLoadOptions & CollectionLoadOptions): NotebookCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): NotebookCollection = js.native
  def load(propertyNames: String): NotebookCollection = js.native
  def load(propertyNames: js.Array[String]): NotebookCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `OneNote.NotebookCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.NotebookCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): NotebookCollectionData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): NotebookCollection = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): NotebookCollection = js.native
}
