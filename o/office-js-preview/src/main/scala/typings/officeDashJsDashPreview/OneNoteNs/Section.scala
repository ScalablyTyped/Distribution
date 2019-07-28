package typings.officeDashJsDashPreview.OneNoteNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientResult
import typings.officeDashJsDashPreview.OneNoteNs.InterfacesNs.SectionData
import typings.officeDashJsDashPreview.OneNoteNs.InterfacesNs.SectionLoadOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.After
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Before
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a OneNote section. Sections can contain pages.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.Section")
@js.native
class Section () extends ClientObject {
  /**
    *
    * The client url of the section. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val clientUrl: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Section: RequestContext = js.native
  /**
    *
    * Gets the ID of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  /**
    *
    * True if this section is encrypted with a password. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  val isEncrypted: Boolean = js.native
  /**
    *
    * True if this section is locked. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  val isLocked: Boolean = js.native
  /**
    *
    * Gets the name of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val name: String = js.native
  /**
    *
    * Gets the notebook that contains the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val notebook: Notebook = js.native
  /**
    *
    * The collection of pages in the section. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val pages: PageCollection = js.native
  /**
    *
    * Gets the section group that contains the section. Throws ItemNotFound if the section is a direct child of the notebook. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val parentSectionGroup: SectionGroup = js.native
  /**
    *
    * Gets the section group that contains the section. Returns null if the section is a direct child of the notebook. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val parentSectionGroupOrNull: SectionGroup = js.native
  /**
    *
    * The web url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val webUrl: String = js.native
  /**
    *
    * Adds a new page to the end of the section.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param title The title of the new page.
    */
  def addPage(title: String): Page = js.native
  /**
    *
    * Copies this section to specified notebook.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param destinationNotebook The notebook to copy this section to.
    */
  def copyToNotebook(destinationNotebook: Notebook): Section = js.native
  /**
    *
    * Copies this section to specified section group.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param destinationSectionGroup The section group to copy this section to.
    */
  def copyToSectionGroup(destinationSectionGroup: SectionGroup): Section = js.native
  /**
    *
    * Gets the REST API ID.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getRestApiId(): ClientResult[String] = js.native
  /**
    *
    * Inserts a new section before or after the current section.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param location The location of the new section relative to the current section.
    * @param title The name of the new section.
    */
  def insertSectionAsSibling(location: InsertLocation, title: String): Section = js.native
  @JSName("insertSectionAsSibling")
  def insertSectionAsSibling_After(location: After, title: String): Section = js.native
  /**
    *
    * Inserts a new section before or after the current section.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param location The location of the new section relative to the current section.
    * @param title The name of the new section.
    */
  @JSName("insertSectionAsSibling")
  def insertSectionAsSibling_Before(location: Before, title: String): Section = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.Section` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.Section` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.Section` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Section = js.native
  def load(option: String): Section = js.native
  def load(option: js.Array[String]): Section = js.native
  def load(option: Anon_Expand): Section = js.native
  def load(option: SectionLoadOptions): Section = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.Section object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.SectionData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): SectionData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Section = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): Section = js.native
}

