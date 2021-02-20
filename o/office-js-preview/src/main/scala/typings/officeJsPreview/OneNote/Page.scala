package typings.officeJsPreview.OneNote

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.OneNote.Interfaces.PageData
import typings.officeJsPreview.OneNote.Interfaces.PageLoadOptions
import typings.officeJsPreview.OneNote.Interfaces.PageUpdateData
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.After
import typings.officeJsPreview.officeJsPreviewStrings.Before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a OneNote page.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait Page extends ClientObject {
  
  /**
    *
    * Adds an Outline to the page at the specified position.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param left The left position of the top, left corner of the Outline.
    * @param top The top position of the top, left corner of the Outline.
    * @param html An HTML string that describes the visual presentation of the Outline. See {@link https://docs.microsoft.com/office/dev/add-ins/onenote/onenote-add-ins-page-content#supported-html | Supported HTML} for the OneNote add-ins JavaScript API.
    */
  def addOutline(left: Double, top: Double, html: String): Outline = js.native
  
  /**
    *
    * Return a json string with node id and content in html format.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def analyzePage(): ClientResult[String] = js.native
  
  /**
    *
    * Inserts a new page with translated content.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param translatedContent Translated content of the page
    */
  def applyTranslation(translatedContent: String): Unit = js.native
  
  /**
    *
    * Gets the ClassNotebookPageSource to the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val classNotebookPageSource: String = js.native
  
  /**
    *
    * The client url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val clientUrl: String = js.native
  
  /**
    *
    * The collection of PageContent objects on the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val contents: PageContentCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Page: RequestContext = js.native
  
  /**
    *
    * Copies this page to specified section.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param destinationSection The section to copy this page to.
    */
  def copyToSection(destinationSection: Section): Page = js.native
  
  /**
    *
    * Copies this page to specified section and sets ClassNotebookPageSource.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def copyToSectionAndSetClassNotebookPageSource(destinationSection: Section): Page = js.native
  
  /**
    *
    * Gets the REST API ID.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getRestApiId(): ClientResult[String] = js.native
  
  /**
    *
    * Does the page has content title.
    *
    * [Api set: OneNoteApi 1.1]
    */
  def hasTitleContent(): ClientResult[Boolean] = js.native
  
  /**
    *
    * Gets the ID of the page. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    *
    * Text interpretation for the ink on the page. Returns null if there is no ink analysis information. Read only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val inkAnalysisOrNull: InkAnalysis = js.native
  
  /**
    *
    * Inserts a new page before or after the current page.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param location The location of the new page relative to the current page.
    * @param title The title of the new page.
    */
  def insertPageAsSibling(location: InsertLocation, title: String): Page = js.native
  @JSName("insertPageAsSibling")
  def insertPageAsSibling_After(location: After, title: String): Page = js.native
  /**
    *
    * Inserts a new page before or after the current page.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param location The location of the new page relative to the current page.
    * @param title The title of the new page.
    */
  @JSName("insertPageAsSibling")
  def insertPageAsSibling_Before(location: Before, title: String): Page = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.Page` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.Page` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.Page` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Page = js.native
  def load(option: String): Page = js.native
  def load(option: js.Array[String]): Page = js.native
  def load(option: PageLoadOptions): Page = js.native
  def load(option: Expand): Page = js.native
  
  /**
    *
    * Gets or sets the indentation level of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pageLevel: Double = js.native
  
  /**
    *
    * Gets the section that contains the page. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val parentSection: Section = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: OneNote.Page): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: PageUpdateData): Unit = js.native
  def set(properties: PageUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Page): Unit = js.native
  
  /**
    *
    * Gets or sets the title of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var title: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.Page object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.PageData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PageData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Page = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): Page = js.native
  
  /**
    *
    * The web url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val webUrl: String = js.native
}
