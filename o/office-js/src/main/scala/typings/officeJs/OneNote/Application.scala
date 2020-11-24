package typings.officeJs.OneNote

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OneNote.Interfaces.ApplicationData
import typings.officeJs.OneNote.Interfaces.ApplicationLoadOptions
import typings.officeJs.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the top-level object that contains all globally addressable OneNote objects such as notebooks, the active notebook, and the active section.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait Application extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Application: RequestContext = js.native
  
  /**
    *
    * Gets the active notebook if one exists. If no notebook is active, throws ItemNotFound.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveNotebook(): Notebook = js.native
  
  /**
    *
    * Gets the active notebook if one exists. If no notebook is active, returns null.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveNotebookOrNull(): Notebook = js.native
  
  /**
    *
    * Gets the active outline if one exists, If no outline is active, throws ItemNotFound.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveOutline(): Outline = js.native
  
  /**
    *
    * Gets the active outline if one exists, otherwise returns null.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveOutlineOrNull(): Outline = js.native
  
  /**
    *
    * Gets the active page if one exists. If no page is active, throws ItemNotFound.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getActivePage(): Page = js.native
  
  /**
    *
    * Gets the active page if one exists. If no page is active, returns null.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getActivePageOrNull(): Page = js.native
  
  /**
    *
    * Gets the active Paragraph if one exists, If no Paragraph is active, throws ItemNotFound.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveParagraph(): Paragraph = js.native
  
  /**
    *
    * Gets the active Paragraph if one exists, otherwise returns null.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveParagraphOrNull(): Paragraph = js.native
  
  /**
    *
    * Gets the active section if one exists. If no section is active, throws ItemNotFound.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveSection(): Section = js.native
  
  /**
    *
    * Gets the active section if one exists. If no section is active, returns null.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getActiveSectionOrNull(): Section = js.native
  
  def getWindowSize(): ClientResult[js.Array[Double]] = js.native
  
  def insertHtmlAtCurrentPosition(html: String): Unit = js.native
  
  def isViewingDeletedNotes(): ClientResult[Boolean] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.Application` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.Application` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.Application` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Application = js.native
  def load(option: String): Application = js.native
  def load(option: js.Array[String]): Application = js.native
  def load(option: ApplicationLoadOptions): Application = js.native
  def load(option: Expand): Application = js.native
  
  /**
    *
    * Opens the specified page in the application instance.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param page The page to open.
    */
  def navigateToPage(page: Page): Unit = js.native
  
  /**
    *
    * Gets the specified page, and opens it in the application instance.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param url The client url of the page to open.
    */
  def navigateToPageWithClientUrl(url: String): Page = js.native
  
  /**
    *
    * Gets the collection of notebooks that are open in the OneNote application instance. In OneNote on the web, only one notebook at a time is open in the application instance. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val notebooks: NotebookCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.Application object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.ApplicationData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ApplicationData = js.native
}
