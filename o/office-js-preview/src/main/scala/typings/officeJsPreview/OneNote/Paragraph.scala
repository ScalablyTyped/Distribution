package typings.officeJsPreview.OneNote

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.OneNote.Interfaces.ParagraphData
import typings.officeJsPreview.OneNote.Interfaces.ParagraphLoadOptions
import typings.officeJsPreview.OneNote.Interfaces.ParagraphUpdateData
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Address
import typings.officeJsPreview.officeJsPreviewStrings.After
import typings.officeJsPreview.officeJsPreviewStrings.Before
import typings.officeJsPreview.officeJsPreviewStrings.Completed
import typings.officeJsPreview.officeJsPreviewStrings.Contact
import typings.officeJsPreview.officeJsPreviewStrings.Critical
import typings.officeJsPreview.officeJsPreviewStrings.Disabled
import typings.officeJsPreview.officeJsPreviewStrings.Idea
import typings.officeJsPreview.officeJsPreviewStrings.Important
import typings.officeJsPreview.officeJsPreviewStrings.Ink
import typings.officeJsPreview.officeJsPreviewStrings.Normal
import typings.officeJsPreview.officeJsPreviewStrings.Other
import typings.officeJsPreview.officeJsPreviewStrings.OutlookTask
import typings.officeJsPreview.officeJsPreviewStrings.PhoneNumber
import typings.officeJsPreview.officeJsPreviewStrings.Question
import typings.officeJsPreview.officeJsPreviewStrings.TaskNotSyncedYet
import typings.officeJsPreview.officeJsPreviewStrings.TaskRemoved
import typings.officeJsPreview.officeJsPreviewStrings.ToDo
import typings.officeJsPreview.officeJsPreviewStrings.ToDoPriority1
import typings.officeJsPreview.officeJsPreviewStrings.ToDoPriority2
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.officeJsPreview.officeJsPreviewStrings.Website
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A container for the visible content on a page. A Paragraph can contain any one ParagraphType type of content.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait Paragraph
  extends StObject
     with ClientObject {
  
  /**
    * Add NoteTag to the paragraph.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param type The type of the NoteTag.
    * @param status The status of the NoteTag.
    */
  def addNoteTag(
    `type`: Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2,
    status: Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
  ): NoteTag = js.native
  /**
    * Add NoteTag to the paragraph.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param type The type of the NoteTag.
    * @param status The status of the NoteTag.
    */
  def addNoteTag(`type`: NoteTagType, status: NoteTagStatus): NoteTag = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Paragraph: RequestContext = js.native
  
  /**
    * Deletes the paragraph
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def delete(): Unit = js.native
  
  /**
    * Get list information of paragraph
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  def getParagraphInfo(): ClientResult[ParagraphInfo] = js.native
  
  /**
    * Gets the ID of the Paragraph object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  
  /**
    * Gets the Image object in the Paragraph. Throws an exception if ParagraphType is not Image. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val image: Image = js.native
  
  /**
    * Gets the Ink collection in the Paragraph. Throws an exception if ParagraphType is not Ink. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val inkWords: InkWordCollection = js.native
  
  /**
    * Inserts the specified HTML content
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of new contents relative to the current Paragraph.
    * @param html An HTML string that describes the visual presentation of the content. See {@link https://docs.microsoft.com/office/dev/add-ins/onenote/onenote-add-ins-page-content#supported-html | Supported HTML} for the OneNote add-ins JavaScript API.
    */
  def insertHtmlAsSibling(insertLocation: Before | After, html: String): Unit = js.native
  /**
    * Inserts the specified HTML content
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of new contents relative to the current Paragraph.
    * @param html An HTML string that describes the visual presentation of the content. See {@link https://docs.microsoft.com/office/dev/add-ins/onenote/onenote-add-ins-page-content#supported-html | Supported HTML} for the OneNote add-ins JavaScript API.
    */
  def insertHtmlAsSibling(insertLocation: InsertLocation, html: String): Unit = js.native
  
  /**
    * Inserts the image at the specified insert location..
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of the table relative to the current Paragraph.
    * @param base64EncodedImage HTML string to append.
    * @param width Optional. Width in the unit of Points. The default value is null and image width will be respected.
    * @param height Optional. Height in the unit of Points. The default value is null and image height will be respected.
    */
  def insertImageAsSibling(insertLocation: Before | After, base64EncodedImage: String, width: Double, height: Double): Image = js.native
  /**
    * Inserts the image at the specified insert location..
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of the table relative to the current Paragraph.
    * @param base64EncodedImage HTML string to append.
    * @param width Optional. Width in the unit of Points. The default value is null and image width will be respected.
    * @param height Optional. Height in the unit of Points. The default value is null and image height will be respected.
    */
  def insertImageAsSibling(insertLocation: InsertLocation, base64EncodedImage: String, width: Double, height: Double): Image = js.native
  
  /**
    * Inserts the paragraph text at the specifiec insert location.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of the table relative to the current Paragraph.
    * @param paragraphText HTML string to append.
    */
  def insertRichTextAsSibling(insertLocation: Before | After, paragraphText: String): RichText = js.native
  /**
    * Inserts the paragraph text at the specifiec insert location.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of the table relative to the current Paragraph.
    * @param paragraphText HTML string to append.
    */
  def insertRichTextAsSibling(insertLocation: InsertLocation, paragraphText: String): RichText = js.native
  
  /**
    * Adds a table with the specified number of rows and columns before or after the current paragraph.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of the table relative to the current Paragraph.
    * @param rowCount The number of rows in the table.
    * @param columnCount The number of columns in the table.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def insertTableAsSibling(insertLocation: Before | After, rowCount: Double, columnCount: Double): Table = js.native
  def insertTableAsSibling(
    insertLocation: Before | After,
    rowCount: Double,
    columnCount: Double,
    values: js.Array[js.Array[String]]
  ): Table = js.native
  /**
    * Adds a table with the specified number of rows and columns before or after the current paragraph.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of the table relative to the current Paragraph.
    * @param rowCount The number of rows in the table.
    * @param columnCount The number of columns in the table.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def insertTableAsSibling(insertLocation: InsertLocation, rowCount: Double, columnCount: Double): Table = js.native
  def insertTableAsSibling(
    insertLocation: InsertLocation,
    rowCount: Double,
    columnCount: Double,
    values: js.Array[js.Array[String]]
  ): Table = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Paragraph = js.native
  def load(options: ParagraphLoadOptions): Paragraph = js.native
  def load(propertyNamesAndPaths: Expand): Paragraph = js.native
  def load(propertyNames: String): Paragraph = js.native
  def load(propertyNames: js.Array[String]): Paragraph = js.native
  
  /**
    * Gets the Outline object that contains the Paragraph. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val outline: Outline = js.native
  
  /**
    * The collection of paragraphs under this paragraph. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val paragraphs: ParagraphCollection = js.native
  
  /**
    * Gets the parent paragraph object. Throws if a parent paragraph does not exist. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val parentParagraph: Paragraph = js.native
  
  /**
    * Gets the parent paragraph object. Returns null if a parent paragraph does not exist. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val parentParagraphOrNull: Paragraph = js.native
  
  /**
    * Gets the TableCell object that contains the Paragraph if one exists. If parent is not a TableCell, throws ItemNotFound. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val parentTableCell: TableCell = js.native
  
  /**
    * Gets the TableCell object that contains the Paragraph if one exists. If parent is not a TableCell, returns null. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val parentTableCellOrNull: TableCell = js.native
  
  /**
    * Gets the RichText object in the Paragraph. Throws an exception if ParagraphType is not RichText. Read-only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val richText: RichText = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ParagraphUpdateData): Unit = js.native
  def set(properties: ParagraphUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Paragraph): Unit = js.native
  
  /**
    * Gets the Table object in the Paragraph. Throws an exception if ParagraphType is not Table. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val table: Table = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.Paragraph object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.ParagraphData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ParagraphData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Paragraph = js.native
  
  /**
    * Gets the type of the Paragraph object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  val `type`: ParagraphType | typings.officeJsPreview.officeJsPreviewStrings.RichText | typings.officeJsPreview.officeJsPreviewStrings.Image | typings.officeJsPreview.officeJsPreviewStrings.Table | Ink | Other = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Paragraph = js.native
}
