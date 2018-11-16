package typings
package officeDashJsLib.OneNoteNs

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
class Paragraph ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Gets the ID of the Paragraph object. Read-only.
           *
           * [Api set: OneNoteApi 1.1]
           */
  val id: java.lang.String = js.native
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
  val `type`: ParagraphType | officeDashJsLib.officeDashJsLibStrings.RichText | officeDashJsLib.officeDashJsLibStrings.Image | officeDashJsLib.officeDashJsLibStrings.Table | officeDashJsLib.officeDashJsLibStrings.Ink | officeDashJsLib.officeDashJsLibStrings.Other = js.native
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
    `type`: officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.ToDo | officeDashJsLib.officeDashJsLibStrings.Important | officeDashJsLib.officeDashJsLibStrings.Question | officeDashJsLib.officeDashJsLibStrings.Contact | officeDashJsLib.officeDashJsLibStrings.Address | officeDashJsLib.officeDashJsLibStrings.PhoneNumber | officeDashJsLib.officeDashJsLibStrings.Website | officeDashJsLib.officeDashJsLibStrings.Idea | officeDashJsLib.officeDashJsLibStrings.Critical | officeDashJsLib.officeDashJsLibStrings.ToDoPriority1 | officeDashJsLib.officeDashJsLibStrings.ToDoPriority2,
    status: officeDashJsLib.officeDashJsLibStrings.Completed
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
    `type`: officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.ToDo | officeDashJsLib.officeDashJsLibStrings.Important | officeDashJsLib.officeDashJsLibStrings.Question | officeDashJsLib.officeDashJsLibStrings.Contact | officeDashJsLib.officeDashJsLibStrings.Address | officeDashJsLib.officeDashJsLibStrings.PhoneNumber | officeDashJsLib.officeDashJsLibStrings.Website | officeDashJsLib.officeDashJsLibStrings.Idea | officeDashJsLib.officeDashJsLibStrings.Critical | officeDashJsLib.officeDashJsLibStrings.ToDoPriority1 | officeDashJsLib.officeDashJsLibStrings.ToDoPriority2,
    status: officeDashJsLib.officeDashJsLibStrings.Disabled
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
    `type`: officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.ToDo | officeDashJsLib.officeDashJsLibStrings.Important | officeDashJsLib.officeDashJsLibStrings.Question | officeDashJsLib.officeDashJsLibStrings.Contact | officeDashJsLib.officeDashJsLibStrings.Address | officeDashJsLib.officeDashJsLibStrings.PhoneNumber | officeDashJsLib.officeDashJsLibStrings.Website | officeDashJsLib.officeDashJsLibStrings.Idea | officeDashJsLib.officeDashJsLibStrings.Critical | officeDashJsLib.officeDashJsLibStrings.ToDoPriority1 | officeDashJsLib.officeDashJsLibStrings.ToDoPriority2,
    status: officeDashJsLib.officeDashJsLibStrings.Normal
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
    `type`: officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.ToDo | officeDashJsLib.officeDashJsLibStrings.Important | officeDashJsLib.officeDashJsLibStrings.Question | officeDashJsLib.officeDashJsLibStrings.Contact | officeDashJsLib.officeDashJsLibStrings.Address | officeDashJsLib.officeDashJsLibStrings.PhoneNumber | officeDashJsLib.officeDashJsLibStrings.Website | officeDashJsLib.officeDashJsLibStrings.Idea | officeDashJsLib.officeDashJsLibStrings.Critical | officeDashJsLib.officeDashJsLibStrings.ToDoPriority1 | officeDashJsLib.officeDashJsLibStrings.ToDoPriority2,
    status: officeDashJsLib.officeDashJsLibStrings.OutlookTask
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
    `type`: officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.ToDo | officeDashJsLib.officeDashJsLibStrings.Important | officeDashJsLib.officeDashJsLibStrings.Question | officeDashJsLib.officeDashJsLibStrings.Contact | officeDashJsLib.officeDashJsLibStrings.Address | officeDashJsLib.officeDashJsLibStrings.PhoneNumber | officeDashJsLib.officeDashJsLibStrings.Website | officeDashJsLib.officeDashJsLibStrings.Idea | officeDashJsLib.officeDashJsLibStrings.Critical | officeDashJsLib.officeDashJsLibStrings.ToDoPriority1 | officeDashJsLib.officeDashJsLibStrings.ToDoPriority2,
    status: officeDashJsLib.officeDashJsLibStrings.TaskNotSyncedYet
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
    `type`: officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.ToDo | officeDashJsLib.officeDashJsLibStrings.Important | officeDashJsLib.officeDashJsLibStrings.Question | officeDashJsLib.officeDashJsLibStrings.Contact | officeDashJsLib.officeDashJsLibStrings.Address | officeDashJsLib.officeDashJsLibStrings.PhoneNumber | officeDashJsLib.officeDashJsLibStrings.Website | officeDashJsLib.officeDashJsLibStrings.Idea | officeDashJsLib.officeDashJsLibStrings.Critical | officeDashJsLib.officeDashJsLibStrings.ToDoPriority1 | officeDashJsLib.officeDashJsLibStrings.ToDoPriority2,
    status: officeDashJsLib.officeDashJsLibStrings.TaskRemoved
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
    `type`: officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.ToDo | officeDashJsLib.officeDashJsLibStrings.Important | officeDashJsLib.officeDashJsLibStrings.Question | officeDashJsLib.officeDashJsLibStrings.Contact | officeDashJsLib.officeDashJsLibStrings.Address | officeDashJsLib.officeDashJsLibStrings.PhoneNumber | officeDashJsLib.officeDashJsLibStrings.Website | officeDashJsLib.officeDashJsLibStrings.Idea | officeDashJsLib.officeDashJsLibStrings.Critical | officeDashJsLib.officeDashJsLibStrings.ToDoPriority1 | officeDashJsLib.officeDashJsLibStrings.ToDoPriority2,
    status: officeDashJsLib.officeDashJsLibStrings.Unknown
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
  def delete(): scala.Unit = js.native
  /**
           *
           * Get list information of paragraph
           *
           * [Api set: OneNoteApi 1.1]
           */
  def getParagraphInfo(): officeDashJsLib.OfficeExtensionNs.ClientResult[ParagraphInfo] = js.native
  /**
           *
           * Inserts the specified HTML content
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param insertLocation The location of new contents relative to the current Paragraph.
           * @param html An HTML string that describes the visual presentation of the content. See {@link https://docs.microsoft.com/office/dev/add-ins/onenote/onenote-add-ins-page-content#supported-html | Supported HTML} for the OneNote add-ins JavaScript API.
           */
  def insertHtmlAsSibling(insertLocation: InsertLocation, html: java.lang.String): scala.Unit = js.native
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
  def insertHtmlAsSibling_After(insertLocation: officeDashJsLib.officeDashJsLibStrings.After, html: java.lang.String): scala.Unit = js.native
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
  def insertHtmlAsSibling_Before(insertLocation: officeDashJsLib.officeDashJsLibStrings.Before, html: java.lang.String): scala.Unit = js.native
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
  def insertImageAsSibling(
    insertLocation: InsertLocation,
    base64EncodedImage: java.lang.String,
    width: scala.Double,
    height: scala.Double
  ): Image = js.native
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
  def insertImageAsSibling_After(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.After,
    base64EncodedImage: java.lang.String,
    width: scala.Double,
    height: scala.Double
  ): Image = js.native
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
  def insertImageAsSibling_Before(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Before,
    base64EncodedImage: java.lang.String,
    width: scala.Double,
    height: scala.Double
  ): Image = js.native
  /**
           *
           * Inserts the paragraph text at the specifiec insert location.
           *
           * [Api set: OneNoteApi 1.1]
           *
           * @param insertLocation The location of the table relative to the current Paragraph.
           * @param paragraphText HTML string to append.
           */
  def insertRichTextAsSibling(insertLocation: InsertLocation, paragraphText: java.lang.String): RichText = js.native
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
  def insertRichTextAsSibling_After(insertLocation: officeDashJsLib.officeDashJsLibStrings.After, paragraphText: java.lang.String): RichText = js.native
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
  def insertRichTextAsSibling_Before(insertLocation: officeDashJsLib.officeDashJsLibStrings.Before, paragraphText: java.lang.String): RichText = js.native
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
  def insertTableAsSibling(insertLocation: InsertLocation, rowCount: scala.Double, columnCount: scala.Double): Table = js.native
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
  def insertTableAsSibling(
    insertLocation: InsertLocation,
    rowCount: scala.Double,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
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
  def insertTableAsSibling_After(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.After,
    rowCount: scala.Double,
    columnCount: scala.Double
  ): Table = js.native
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
  def insertTableAsSibling_After(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.After,
    rowCount: scala.Double,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
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
  def insertTableAsSibling_Before(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Before,
    rowCount: scala.Double,
    columnCount: scala.Double
  ): Table = js.native
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
  def insertTableAsSibling_Before(
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Before,
    rowCount: scala.Double,
    columnCount: scala.Double,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
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
  def load(option: java.lang.String): Paragraph = js.native
  def load(option: js.Array[java.lang.String]): Paragraph = js.native
  def load(option: officeDashJsLib.Anon_Select): Paragraph = js.native
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
  def load(option: officeDashJsLib.OneNoteNs.InterfacesNs.ParagraphLoadOptions): Paragraph = js.native
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
  def set(properties: officeDashJsLib.OneNoteNs.InterfacesNs.ParagraphUpdateData): scala.Unit = js.native
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
  def set(
    properties: officeDashJsLib.OneNoteNs.InterfacesNs.ParagraphUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Paragraph): scala.Unit = js.native
  def toJSON(): officeDashJsLib.OneNoteNs.InterfacesNs.ParagraphData = js.native
  /**
           * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
           */
  def track(): Paragraph = js.native
  /**
           * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
           */
  def untrack(): Paragraph = js.native
}

