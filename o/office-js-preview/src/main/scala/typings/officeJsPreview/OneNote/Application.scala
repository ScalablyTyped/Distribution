package typings.officeJsPreview.OneNote

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.OneNote.Interfaces.ApplicationData
import typings.officeJsPreview.OneNote.Interfaces.ApplicationLoadOptions
import typings.officeJsPreview.OneNote.Interfaces.ApplicationUpdateData
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the top-level object that contains all globally addressable OneNote objects such as notebooks, the active notebook, and the active section.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait Application
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Application: RequestContext = js.native
  
  /**
    * Gets the active notebook if one exists. If no notebook is active, throws ItemNotFound.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveNotebook(): Notebook = js.native
  
  /**
    * Gets the active notebook if one exists. If no notebook is active, returns null.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveNotebookOrNull(): Notebook = js.native
  
  /**
    * Gets the active outline if one exists, If no outline is active, throws ItemNotFound.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveOutline(): Outline = js.native
  
  /**
    * Gets the active outline if one exists, otherwise returns null.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveOutlineOrNull(): Outline = js.native
  
  /**
    * Gets the active page if one exists. If no page is active, throws ItemNotFound.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def getActivePage(): Page = js.native
  
  /**
    * Gets the active page if one exists. If no page is active, returns null.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def getActivePageOrNull(): Page = js.native
  
  /**
    * Gets the active Paragraph if one exists, If no Paragraph is active, throws ItemNotFound.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveParagraph(): Paragraph = js.native
  
  /**
    * Gets the active Paragraph if one exists, otherwise returns null.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveParagraphOrNull(): Paragraph = js.native
  
  /**
    * Gets the active section if one exists. If no section is active, throws ItemNotFound.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveSection(): Section = js.native
  
  /**
    * Gets the active section if one exists. If no section is active, returns null.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveSectionOrNull(): Section = js.native
  
  /**
    * Gets the currently selected ink strokes.
    *
    * @remarks
    * [Api set: OneNoteApi 1.9]
    */
  def getSelectedInkStrokes(): InkStrokeCollection = js.native
  
  def getWindowSize(): ClientResult[js.Array[Double]] = js.native
  
  def insertHtmlAtCurrentPosition(html: String): Unit = js.native
  
  def isViewingDeletedNotes(): ClientResult[Boolean] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Application = js.native
  def load(options: ApplicationLoadOptions): Application = js.native
  def load(propertyNamesAndPaths: Expand): Application = js.native
  def load(propertyNames: String): Application = js.native
  def load(propertyNames: js.Array[String]): Application = js.native
  
  /**
    * Opens the specified page in the application instance.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param page The page to open.
    */
  def navigateToPage(page: Page): Unit = js.native
  
  /**
    * Gets the specified page, and opens it in the application instance.
    Navigation may still not be carried out when no fails. Caller should validate the returned page if so desired.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param url The client url of the page to open.
    */
  def navigateToPageWithClientUrl(url: String): Page = js.native
  
  /**
    * Gets the collection of notebooks that are open in the OneNote application instance. In OneNote Online, only one notebook at a time is open in the application instance. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val notebooks: NotebookCollection = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Application): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ApplicationUpdateData): Unit = js.native
  def set(properties: ApplicationUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.Application object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.ApplicationData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ApplicationData = js.native
}
