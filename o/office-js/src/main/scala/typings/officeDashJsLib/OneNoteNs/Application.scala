package typings
package officeDashJsLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the top-level object that contains all globally addressable OneNote objects such as notebooks, the active notebook, and the active section.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.Application")
@js.native
class Application ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets the collection of notebooks that are open in the OneNote application instance. In OneNote Online, only one notebook at a time is open in the application instance. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val notebooks: NotebookCollection = js.native
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
  def getWindowSize(): officeDashJsLib.OfficeExtensionNs.ClientResult[js.Array[scala.Double]] = js.native
  def insertHtmlAtCurrentPosition(html: java.lang.String): scala.Unit = js.native
  def isViewingDeletedNotes(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Boolean] = js.native
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
  def load(option: java.lang.String): Application = js.native
  def load(option: js.Array[java.lang.String]): Application = js.native
  def load(option: officeDashJsLib.Anon_Select): Application = js.native
  def load(option: officeDashJsLib.OneNoteNs.InterfacesNs.ApplicationLoadOptions): Application = js.native
  /**
    *
    * Opens the specified page in the application instance.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param page The page to open.
    */
  def navigateToPage(page: Page): scala.Unit = js.native
  /**
    *
    * Gets the specified page, and opens it in the application instance.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param url The client url of the page to open.
    */
  def navigateToPageWithClientUrl(url: java.lang.String): Page = js.native
  def toJSON(): officeDashJsLib.OneNoteNs.InterfacesNs.ApplicationData = js.native
}

