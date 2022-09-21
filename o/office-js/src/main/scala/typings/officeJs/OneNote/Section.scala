package typings.officeJs.OneNote

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OneNote.Interfaces.SectionData
import typings.officeJs.OneNote.Interfaces.SectionLoadOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.After
import typings.officeJs.officeJsStrings.Before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a OneNote section. Sections can contain pages.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait Section
  extends StObject
     with ClientObject {
  
  /**
    * Adds a new page to the end of the section.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param title The title of the new page.
    */
  def addPage(title: String): Page = js.native
  
  /**
    * The client url of the section. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val clientUrl: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Section: RequestContext = js.native
  
  /**
    * Copies this section to specified notebook.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param destinationNotebook The notebook to copy this section to.
    */
  def copyToNotebook(destinationNotebook: Notebook): Section = js.native
  
  /**
    * Copies this section to specified section group.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param destinationSectionGroup The section group to copy this section to.
    */
  def copyToSectionGroup(destinationSectionGroup: SectionGroup): Section = js.native
  
  /**
    * Gets the REST API ID.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def getRestApiId(): ClientResult[String] = js.native
  
  /**
    * Gets the ID of the section. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    * Inserts a new section before or after the current section.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param location The location of the new section relative to the current section.
    * @param title The name of the new section.
    */
  def insertSectionAsSibling(location: Before | After, title: String): Section = js.native
  /**
    * Inserts a new section before or after the current section.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param location The location of the new section relative to the current section.
    * @param title The name of the new section.
    */
  def insertSectionAsSibling(location: InsertLocation, title: String): Section = js.native
  
  /**
    * True if this section is encrypted with a password. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.2]
    */
  val isEncrypted: Boolean = js.native
  
  /**
    * True if this section is locked. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.2]
    */
  val isLocked: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Section = js.native
  def load(options: SectionLoadOptions): Section = js.native
  def load(propertyNamesAndPaths: Expand): Section = js.native
  def load(propertyNames: String): Section = js.native
  def load(propertyNames: js.Array[String]): Section = js.native
  
  /**
    * Gets the name of the section. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val name: String = js.native
  
  /**
    * Gets the notebook that contains the section. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val notebook: Notebook = js.native
  
  /**
    * The collection of pages in the section. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val pages: PageCollection = js.native
  
  /**
    * Gets the section group that contains the section. Throws ItemNotFound if the section is a direct child of the notebook. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val parentSectionGroup: SectionGroup = js.native
  
  /**
    * Gets the section group that contains the section. Returns null if the section is a direct child of the notebook. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val parentSectionGroupOrNull: SectionGroup = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.Section object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.SectionData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): SectionData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Section = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Section = js.native
  
  /**
    * The web url of the page. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val webUrl: String = js.native
}
