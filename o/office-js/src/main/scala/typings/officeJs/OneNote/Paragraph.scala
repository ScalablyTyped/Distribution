package typings.officeJs.OneNote

import typings.officeJs.AnonExpand
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.OneNote.Interfaces.ParagraphData
import typings.officeJs.OneNote.Interfaces.ParagraphLoadOptions
import typings.officeJs.OneNote.Interfaces.ParagraphUpdateData
import typings.officeJs.officeJsStrings.Address
import typings.officeJs.officeJsStrings.After
import typings.officeJs.officeJsStrings.Before
import typings.officeJs.officeJsStrings.Completed
import typings.officeJs.officeJsStrings.Contact
import typings.officeJs.officeJsStrings.Critical
import typings.officeJs.officeJsStrings.Disabled
import typings.officeJs.officeJsStrings.Idea
import typings.officeJs.officeJsStrings.Important
import typings.officeJs.officeJsStrings.Ink
import typings.officeJs.officeJsStrings.Normal
import typings.officeJs.officeJsStrings.Other
import typings.officeJs.officeJsStrings.OutlookTask
import typings.officeJs.officeJsStrings.PhoneNumber
import typings.officeJs.officeJsStrings.Question
import typings.officeJs.officeJsStrings.TaskNotSyncedYet
import typings.officeJs.officeJsStrings.TaskRemoved
import typings.officeJs.officeJsStrings.ToDo
import typings.officeJs.officeJsStrings.ToDoPriority1
import typings.officeJs.officeJsStrings.ToDoPriority2
import typings.officeJs.officeJsStrings.Unknown_
import typings.officeJs.officeJsStrings.Website
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A container for the visible content on a page. A Paragraph can contain any one ParagraphType type of content.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.Paragraph")
@js.native
class Paragraph () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Paragraph: RequestContext = js.native
  /**
    *
    * Gets the ID of the Paragraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val id: String = js.native
  /**
    *
    * Gets the Image object in the Paragraph. Throws an exception if ParagraphType is not Image. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val image: Image = js.native
  /**
    *
    * Gets the Ink collection in the Paragraph. Throws an exception if ParagraphType is not Ink. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val inkWords: InkWordCollection = js.native
  /**
    *
    * Gets the Outline object that contains the Paragraph. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val outline: Outline = js.native
  /**
    *
    * The collection of paragraphs under this paragraph. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val paragraphs: ParagraphCollection = js.native
  /**
    *
    * Gets the parent paragraph object. Throws if a parent paragraph does not exist. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val parentParagraph: Paragraph = js.native
  /**
    *
    * Gets the parent paragraph object. Returns null if a parent paragraph does not exist. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val parentParagraphOrNull: Paragraph = js.native
  /**
    *
    * Gets the TableCell object that contains the Paragraph if one exists. If parent is not a TableCell, throws ItemNotFound. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val parentTableCell: TableCell = js.native
  /**
    *
    * Gets the TableCell object that contains the Paragraph if one exists. If parent is not a TableCell, returns null. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val parentTableCellOrNull: TableCell = js.native
  /**
    *
    * Gets the RichText object in the Paragraph. Throws an exception if ParagraphType is not RichText. Read-only
    *
    * [Api set: OneNoteApi 1.1]
    */
  val richText: RichText = js.native
  /**
    *
    * Gets the Table object in the Paragraph. Throws an exception if ParagraphType is not Table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val table: Table = js.native
  /**
    *
    * Gets the type of the Paragraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val `type`: ParagraphType | typings.officeJs.officeJsStrings.RichText | typings.officeJs.officeJsStrings.Image | typings.officeJs.officeJsStrings.Table | Ink | Other = js.native
  def addNoteTag(
    `type`: Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2,
    status: Completed
  ): NoteTag = js.native
  def addNoteTag(
    `type`: Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2,
    status: Disabled
  ): NoteTag = js.native
  def addNoteTag(
    `type`: Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2,
    status: Normal
  ): NoteTag = js.native
  def addNoteTag(
    `type`: Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2,
    status: OutlookTask
  ): NoteTag = js.native
  def addNoteTag(
    `type`: Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2,
    status: TaskNotSyncedYet
  ): NoteTag = js.native
  def addNoteTag(
    `type`: Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2,
    status: TaskRemoved
  ): NoteTag = js.native
  /**
    *
    * Add NoteTag to the paragraph.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param type The type of the NoteTag.
    * @param status The status of the NoteTag.
    */
  def addNoteTag(
    `type`: Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2,
    status: Unknown_
  ): NoteTag = js.native
  /**
    *
    * Add NoteTag to the paragraph.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param type The type of the NoteTag.
    * @param status The status of the NoteTag.
    */
  def addNoteTag(`type`: NoteTagType, status: NoteTagStatus): NoteTag = js.native
  /**
    *
    * Deletes the paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  def delete(): Unit = js.native
  /**
    *
    * Get list information of paragraph
    *
    * [Api set: OneNoteApi 1.1]
    */
  def getParagraphInfo(): ClientResult[ParagraphInfo] = js.native
  /**
    *
    * Inserts the specified HTML content
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of new contents relative to the current Paragraph.
    * @param html An HTML string that describes the visual presentation of the content. See {@link https://docs.microsoft.com/office/dev/add-ins/onenote/onenote-add-ins-page-content#supported-html | Supported HTML} for the OneNote add-ins JavaScript API.
    */
  def insertHtmlAsSibling(insertLocation: InsertLocation, html: String): Unit = js.native
  @JSName("insertHtmlAsSibling")
  def insertHtmlAsSibling_After(insertLocation: After, html: String): Unit = js.native
  /**
    *
    * Inserts the specified HTML content
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of new contents relative to the current Paragraph.
    * @param html An HTML string that describes the visual presentation of the content. See {@link https://docs.microsoft.com/office/dev/add-ins/onenote/onenote-add-ins-page-content#supported-html | Supported HTML} for the OneNote add-ins JavaScript API.
    */
  @JSName("insertHtmlAsSibling")
  def insertHtmlAsSibling_Before(insertLocation: Before, html: String): Unit = js.native
  /**
    *
    * Inserts the image at the specified insert location..
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of the table relative to the current Paragraph.
    * @param base64EncodedImage HTML string to append.
    * @param width Optional. Width in the unit of Points. The default value is null and image width will be respected.
    * @param height Optional. Height in the unit of Points. The default value is null and image height will be respected.
    */
  def insertImageAsSibling(insertLocation: InsertLocation, base64EncodedImage: String, width: Double, height: Double): Image = js.native
  @JSName("insertImageAsSibling")
  def insertImageAsSibling_After(insertLocation: After, base64EncodedImage: String, width: Double, height: Double): Image = js.native
  /**
    *
    * Inserts the image at the specified insert location..
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of the table relative to the current Paragraph.
    * @param base64EncodedImage HTML string to append.
    * @param width Optional. Width in the unit of Points. The default value is null and image width will be respected.
    * @param height Optional. Height in the unit of Points. The default value is null and image height will be respected.
    */
  @JSName("insertImageAsSibling")
  def insertImageAsSibling_Before(insertLocation: Before, base64EncodedImage: String, width: Double, height: Double): Image = js.native
  /**
    *
    * Inserts the paragraph text at the specifiec insert location.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of the table relative to the current Paragraph.
    * @param paragraphText HTML string to append.
    */
  def insertRichTextAsSibling(insertLocation: InsertLocation, paragraphText: String): RichText = js.native
  @JSName("insertRichTextAsSibling")
  def insertRichTextAsSibling_After(insertLocation: After, paragraphText: String): RichText = js.native
  /**
    *
    * Inserts the paragraph text at the specifiec insert location.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of the table relative to the current Paragraph.
    * @param paragraphText HTML string to append.
    */
  @JSName("insertRichTextAsSibling")
  def insertRichTextAsSibling_Before(insertLocation: Before, paragraphText: String): RichText = js.native
  /**
    *
    * Adds a table with the specified number of rows and columns before or after the current paragraph.
    *
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
  @JSName("insertTableAsSibling")
  def insertTableAsSibling_After(insertLocation: After, rowCount: Double, columnCount: Double): Table = js.native
  @JSName("insertTableAsSibling")
  def insertTableAsSibling_After(insertLocation: After, rowCount: Double, columnCount: Double, values: js.Array[js.Array[String]]): Table = js.native
  /**
    *
    * Adds a table with the specified number of rows and columns before or after the current paragraph.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param insertLocation The location of the table relative to the current Paragraph.
    * @param rowCount The number of rows in the table.
    * @param columnCount The number of columns in the table.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  @JSName("insertTableAsSibling")
  def insertTableAsSibling_Before(insertLocation: Before, rowCount: Double, columnCount: Double): Table = js.native
  @JSName("insertTableAsSibling")
  def insertTableAsSibling_Before(insertLocation: Before, rowCount: Double, columnCount: Double, values: js.Array[js.Array[String]]): Table = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.Paragraph` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.Paragraph` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.Paragraph` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Paragraph = js.native
  def load(option: String): Paragraph = js.native
  def load(option: js.Array[String]): Paragraph = js.native
  def load(option: AnonExpand): Paragraph = js.native
  def load(option: ParagraphLoadOptions): Paragraph = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: OneNote.Paragraph): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ParagraphUpdateData): Unit = js.native
  def set(properties: ParagraphUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Paragraph): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original OneNote.Paragraph object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `OneNote.Interfaces.ParagraphData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ParagraphData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Paragraph = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): Paragraph = js.native
}

