package typings.officeJs.OneNote

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OneNote.Interfaces.NotebookData
import typings.officeJs.OneNote.Interfaces.NotebookLoadOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a OneNote notebook. Notebooks contain section groups and sections.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait Notebook
  extends StObject
     with ClientObject {
  
  /**
    * Adds a new section to the end of the notebook.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param name The name of the new section.
    */
  def addSection(name: String): Section = js.native
  
  /**
    * Adds a new section group to the end of the notebook.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param name The name of the new section.
    */
  def addSectionGroup(name: String): SectionGroup = js.native
  
  /**
    * The url of the site where this notebook is located. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val baseUrl: String = js.native
  
  /**
    * The client url of the notebook. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val clientUrl: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Notebook: RequestContext = js.native
  
  /**
    * Gets the REST API ID.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def getRestApiId(): ClientResult[String] = js.native
  
  /**
    * Gets the ID of the notebook. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    * True if the notebook is not created by the user (i.e., 'Misplaced Sections'). Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.2]
    */
  val isVirtual: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Notebook = js.native
  def load(options: NotebookLoadOptions): Notebook = js.native
  def load(propertyNamesAndPaths: Expand): Notebook = js.native
  def load(propertyNames: String): Notebook = js.native
  def load(propertyNames: js.Array[String]): Notebook = js.native
  
  /**
    * Gets the name of the notebook. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val name: String = js.native
  
  /**
    * The section groups in the notebook. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val sectionGroups: SectionGroupCollection = js.native
  
  /**
    * The sections of the notebook. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val sections: SectionCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.Notebook object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.NotebookData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): NotebookData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Notebook = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Notebook = js.native
}
