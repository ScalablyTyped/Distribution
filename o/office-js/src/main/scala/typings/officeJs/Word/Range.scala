package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Word.InsertLocation.before
import typings.officeJs.Word.Interfaces.RangeData
import typings.officeJs.Word.Interfaces.RangeLoadOptions
import typings.officeJs.Word.Interfaces.RangeUpdateData
import typings.officeJs.Word.RangeLocation.after
import typings.officeJs.Word.RangeLocation.content
import typings.officeJs.Word.RangeLocation.end
import typings.officeJs.Word.RangeLocation.start
import typings.officeJs.Word.RangeLocation.whole
import typings.officeJs.anon.Expand
import typings.officeJs.anon.IgnorePunct
import typings.officeJs.officeJsStrings.After
import typings.officeJs.officeJsStrings.Before
import typings.officeJs.officeJsStrings.Content
import typings.officeJs.officeJsStrings.Current
import typings.officeJs.officeJsStrings.End
import typings.officeJs.officeJsStrings.Line
import typings.officeJs.officeJsStrings.Next
import typings.officeJs.officeJsStrings.Original
import typings.officeJs.officeJsStrings.Page
import typings.officeJs.officeJsStrings.Replace
import typings.officeJs.officeJsStrings.SectionContinuous
import typings.officeJs.officeJsStrings.SectionEven
import typings.officeJs.officeJsStrings.SectionNext
import typings.officeJs.officeJsStrings.SectionOdd
import typings.officeJs.officeJsStrings.Select
import typings.officeJs.officeJsStrings.Start
import typings.officeJs.officeJsStrings.Whole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a contiguous area in a document.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@js.native
trait Range
  extends StObject
     with ClientObject {
  
  /**
    * Clears the contents of the range object. The user can perform the undo operation on the cleared content.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def clear(): Unit = js.native
  
  /**
    * Compares this range's location with another range's location.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param range Required. The range to compare with this range.
    */
  def compareLocationWith(range: Range): ClientResult[LocationRelation] = js.native
  
  /**
    * Gets the collection of content control objects in the range.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val contentControls: ContentControlCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Range: RequestContext = js.native
  
  /**
    * Deletes the range and its content from the document.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the collection of endnotes in the range.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  val endnotes: NoteItemCollection = js.native
  
  /**
    * Returns a new range that extends from this range in either direction to cover another range. This range is not changed. Throws an `ItemNotFound` error if the two ranges do not have a union.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param range Required. Another range.
    */
  def expandTo(range: Range): Range = js.native
  
  /**
    * Returns a new range that extends from this range in either direction to cover another range. This range is not changed. If the two ranges do not have a union, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param range Required. Another range.
    */
  def expandToOrNullObject(range: Range): Range = js.native
  
  /**
    * Gets the collection of field objects in the range.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val fields: FieldCollection = js.native
  
  /**
    * Gets the text format of the range. Use this to get and set font name, size, color, and other properties.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val font: Font = js.native
  
  /**
    * Gets the collection of footnotes in the range.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  val footnotes: NoteItemCollection = js.native
  
  /**
    * Gets the names all bookmarks in or overlapping the range. A bookmark is hidden if its name starts with the underscore character.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * @param includeHidden Optional. Indicates whether to include hidden bookmarks. Default is false which indicates that the hidden bookmarks are excluded.
    * @param includeAdjacent Optional. Indicates whether to include bookmarks that are adjacent to the range. Default is false which indicates that the adjacent bookmarks are excluded.
    */
  def getBookmarks(): ClientResult[js.Array[String]] = js.native
  def getBookmarks(includeHidden: Boolean): ClientResult[js.Array[String]] = js.native
  def getBookmarks(includeHidden: Boolean, includeAdjacent: Boolean): ClientResult[js.Array[String]] = js.native
  def getBookmarks(includeHidden: Unit, includeAdjacent: Boolean): ClientResult[js.Array[String]] = js.native
  
  /**
    * Gets comments associated with the range.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    * @returns
    */
  def getComments(): CommentCollection = js.native
  
  /**
    * Gets an HTML representation of the range object. When rendered in a web page or HTML viewer, the formatting will be a close, but not exact, match for of the formatting of the document. This method does not return the exact same HTML for the same document on different platforms (Windows, Mac, Word on the web, etc.). If you need exact fidelity, or consistency across platforms, use `Range.getOoxml()` and convert the returned XML to HTML.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def getHtml(): ClientResult[String] = js.native
  
  /**
    * Gets hyperlink child ranges within the range.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getHyperlinkRanges(): RangeCollection = js.native
  
  /**
    * Gets the next text range by using punctuation marks and/or other ending marks. Throws an `ItemNotFound` error if this text range is the last one.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param endingMarks Required. The punctuation marks and/or other ending marks as an array of strings.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the returned range. Default is false which indicates that spacing characters at the start and end of the range are included.
    */
  def getNextTextRange(endingMarks: js.Array[String]): Range = js.native
  def getNextTextRange(endingMarks: js.Array[String], trimSpacing: Boolean): Range = js.native
  
  /**
    * Gets the next text range by using punctuation marks and/or other ending marks. If this text range is the last one, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param endingMarks Required. The punctuation marks and/or other ending marks as an array of strings.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the returned range. Default is false which indicates that spacing characters at the start and end of the range are included.
    */
  def getNextTextRangeOrNullObject(endingMarks: js.Array[String]): Range = js.native
  def getNextTextRangeOrNullObject(endingMarks: js.Array[String], trimSpacing: Boolean): Range = js.native
  
  /**
    * Gets the OOXML representation of the range object.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def getOoxml(): ClientResult[String] = js.native
  
  /**
    * Clones the range, or gets the starting or ending point of the range as a new range.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param rangeLocation Optional. The range location must be 'Whole', 'Start', 'End', 'After', or 'Content'.
    */
  def getRange(): Range = js.native
  def getRange(rangeLocation: Whole | Start | End | After | Content): Range = js.native
  def getRange(rangeLocation: after): Range = js.native
  def getRange(rangeLocation: content): Range = js.native
  def getRange(rangeLocation: end): Range = js.native
  def getRange(rangeLocation: start): Range = js.native
  def getRange(rangeLocation: whole): Range = js.native
  
  /**
    * Gets reviewed text based on ChangeTrackingVersion selection.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * @param changeTrackingVersion Optional. The value must be 'Original' or 'Current'. The default is 'Current'.
    */
  def getReviewedText(): ClientResult[String] = js.native
  def getReviewedText(changeTrackingVersion: Original | Current): ClientResult[String] = js.native
  def getReviewedText(changeTrackingVersion: ChangeTrackingVersion): ClientResult[String] = js.native
  
  /**
    * Gets the text child ranges in the range by using punctuation marks and/or other ending marks.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param endingMarks Required. The punctuation marks and/or other ending marks as an array of strings.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
    */
  def getTextRanges(endingMarks: js.Array[String]): RangeCollection = js.native
  def getTextRanges(endingMarks: js.Array[String], trimSpacing: Boolean): RangeCollection = js.native
  
  /**
    * Gets the first hyperlink in the range, or sets a hyperlink on the range. All hyperlinks in the range are deleted when you set a new hyperlink on the range. Use a '#' to separate the address part from the optional location part.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var hyperlink: String = js.native
  
  /**
    * Gets the collection of inline picture objects in the range.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    */
  val inlinePictures: InlinePictureCollection = js.native
  
  /**
    * Inserts a bookmark on the range. If a bookmark of the same name exists somewhere, it is deleted first.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * @param name Required. The bookmark name, which is case-insensitive. If the name starts with an underscore character, the bookmark is an hidden one.
    */
  def insertBookmark(name: String): Unit = js.native
  
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: Before | After
  ): Unit = js.native
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: typings.officeJs.Word.InsertLocation.after
  ): Unit = js.native
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: before
  ): Unit = js.native
  def insertBreak(breakType: BreakType, insertLocation: Before | After): Unit = js.native
  def insertBreak(breakType: BreakType, insertLocation: typings.officeJs.Word.InsertLocation.after): Unit = js.native
  /**
    * Inserts a break at the specified location in the main document.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param breakType Required. The break type to add.
    * @param insertLocation Required. The value must be 'Before' or 'After'.
    */
  def insertBreak(breakType: BreakType, insertLocation: before): Unit = js.native
  
  /**
    * Insert a comment on the range.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * @param commentText Required. The comment text to be inserted.
    * @returns comment object
    */
  def insertComment(commentText: String): Comment = js.native
  
  /**
    * Wraps the range object with a rich text content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def insertContentControl(): ContentControl = js.native
  
  /**
    * Inserts an endnote. The endnote reference is placed after the range.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    *
    * @param insertText Optional. Text to be inserted into the endnote body. The default is "".
    */
  def insertEndnote(): NoteItem = js.native
  def insertEndnote(insertText: String): NoteItem = js.native
  
  def insertFileFromBase64(base64File: String, insertLocation: Replace | Start | End | Before | After): Range = js.native
  def insertFileFromBase64(
    base64File: String,
    insertLocation: Replace | Start | End | Before | After,
    asNewParagraph: Boolean
  ): Range = js.native
  /**
    * Inserts a document at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value must be 'Replace', 'Start', 'End', 'Before', or 'After'.
    * @param asNewParagraph Optional. Indicates whether to insert the content as new paragraphs. Default is false which indicates that the base64 content is merged as inline text into the existing paragraph.
    */
  def insertFileFromBase64(base64File: String, insertLocation: InsertLocation): Range = js.native
  def insertFileFromBase64(base64File: String, insertLocation: InsertLocation, asNewParagraph: Boolean): Range = js.native
  
  /**
    * Inserts a footnote. The footnote reference is placed after the range.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    *
    * @param insertText Optional. Text to be inserted into the footnote body. The default is "".
    */
  def insertFootnote(): NoteItem = js.native
  def insertFootnote(insertText: String): NoteItem = js.native
  
  def insertHtml(html: String, insertLocation: Replace | Start | End | Before | After): Range = js.native
  /**
    * Inserts HTML at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted.
    * @param insertLocation Required. The value must be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  def insertHtml(html: String, insertLocation: InsertLocation): Range = js.native
  
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: Replace | Start | End | Before | After): InlinePicture = js.native
  /**
    * Inserts a picture at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted.
    * @param insertLocation Required. The value must be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: InsertLocation): InlinePicture = js.native
  
  def insertOoxml(ooxml: String, insertLocation: Replace | Start | End | Before | After): Range = js.native
  def insertOoxml(ooxml: String, insertLocation: Replace | Start | End | Before | After, asNewParagraph: Boolean): Range = js.native
  /**
    * Inserts OOXML at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted.
    * @param insertLocation Required. The value must be 'Replace', 'Start', 'End', 'Before', or 'After'.
    * @param asNewParagraph Optional. Indicates whether to insert the OOXML as new paragraphs. Default is false which indicates that the OOXML is merged as inline text into the existing paragraph.
    */
  def insertOoxml(ooxml: String, insertLocation: InsertLocation): Range = js.native
  def insertOoxml(ooxml: String, insertLocation: InsertLocation, asNewParagraph: Boolean): Range = js.native
  
  def insertParagraph(paragraphText: String, insertLocation: Before | After): Paragraph = js.native
  def insertParagraph(paragraphText: String, insertLocation: typings.officeJs.Word.InsertLocation.after): Paragraph = js.native
  /**
    * Inserts a paragraph at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value must be 'Before' or 'After'.
    */
  def insertParagraph(paragraphText: String, insertLocation: before): Paragraph = js.native
  
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: Before | After): Table = js.native
  def insertTable(
    rowCount: Double,
    columnCount: Double,
    insertLocation: Before | After,
    values: js.Array[js.Array[String]]
  ): Table = js.native
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: typings.officeJs.Word.InsertLocation.after): Table = js.native
  def insertTable(
    rowCount: Double,
    columnCount: Double,
    insertLocation: typings.officeJs.Word.InsertLocation.after,
    values: js.Array[js.Array[String]]
  ): Table = js.native
  /**
    * Inserts a table with the specified number of rows and columns.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param insertLocation Required. The value must be 'Before' or 'After'.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: before): Table = js.native
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: before, values: js.Array[js.Array[String]]): Table = js.native
  
  def insertText(text: String, insertLocation: Replace | Start | End | Before | After): Range = js.native
  /**
    * Inserts text at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value must be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  def insertText(text: String, insertLocation: InsertLocation): Range = js.native
  
  /**
    * Returns a new range as the intersection of this range with another range. This range is not changed. Throws an `ItemNotFound` error if the two ranges are not overlapped or adjacent.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param range Required. Another range.
    */
  def intersectWith(range: Range): Range = js.native
  
  /**
    * Returns a new range as the intersection of this range with another range. This range is not changed. If the two ranges are not overlapped or adjacent, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param range Required. Another range.
    */
  def intersectWithOrNullObject(range: Range): Range = js.native
  
  /**
    * Checks whether the range length is zero.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val isEmpty: Boolean = js.native
  
  /**
    * Gets the collection of list objects in the range.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val lists: ListCollection = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Range = js.native
  def load(options: RangeLoadOptions): Range = js.native
  def load(propertyNamesAndPaths: Expand): Range = js.native
  def load(propertyNames: String): Range = js.native
  def load(propertyNames: js.Array[String]): Range = js.native
  
  /**
    * Gets the collection of paragraph objects in the range. **Important**: For requirement sets 1.1 and 1.2, paragraphs in tables wholly contained within this range are not returned. From requirement set 1.3, paragraphs in such tables are also returned.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val paragraphs: ParagraphCollection = js.native
  
  /**
    * Gets the parent body of the range.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentBody: Body = js.native
  
  /**
    * Gets the content control that contains the range. Throws an `ItemNotFound` error if there isn't a parent content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val parentContentControl: ContentControl = js.native
  
  /**
    * Gets the content control that contains the range. If there isn't a parent content control, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  
  /**
    * Gets the table that contains the range. Throws an `ItemNotFound` error if it is not contained in a table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  
  /**
    * Gets the table cell that contains the range. Throws an `ItemNotFound` error if it is not contained in a table cell.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableCell: TableCell = js.native
  
  /**
    * Gets the table cell that contains the range. If it is not contained in a table cell, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableCellOrNullObject: TableCell = js.native
  
  /**
    * Gets the table that contains the range. If it is not contained in a table, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableOrNullObject: Table = js.native
  
  /**
    * Performs a search with the specified SearchOptions on the scope of the range object. The search results are a collection of range objects.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param searchText Required. The search text.
    * @param searchOptions Optional. Options for the search.
    */
  def search(searchText: String): RangeCollection = js.native
  def search(searchText: String, searchOptions: SearchOptions): RangeCollection = js.native
  def search(searchText: String, searchOptions: IgnorePunct): RangeCollection = js.native
  
  /**
    * Selects and navigates the Word UI to the range.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param selectionMode Optional. The selection mode must be 'Select', 'Start', or 'End'. 'Select' is the default.
    */
  def select(): Unit = js.native
  def select(selectionMode: Select | Start | End): Unit = js.native
  def select(selectionMode: SelectionMode): Unit = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RangeUpdateData): Unit = js.native
  def set(properties: RangeUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Range): Unit = js.native
  
  /**
    * Splits the range into child ranges by using delimiters.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param delimiters Required. The delimiters as an array of strings.
    * @param multiParagraphs Optional. Indicates whether a returned child range can cover multiple paragraphs. Default is false which indicates that the paragraph boundaries are also used as delimiters.
    * @param trimDelimiters Optional. Indicates whether to trim delimiters from the ranges in the range collection. Default is false which indicates that the delimiters are included in the ranges returned in the range collection.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
    */
  def split(delimiters: js.Array[String]): RangeCollection = js.native
  def split(delimiters: js.Array[String], multiParagraphs: Boolean): RangeCollection = js.native
  def split(delimiters: js.Array[String], multiParagraphs: Boolean, trimDelimiters: Boolean): RangeCollection = js.native
  def split(
    delimiters: js.Array[String],
    multiParagraphs: Boolean,
    trimDelimiters: Boolean,
    trimSpacing: Boolean
  ): RangeCollection = js.native
  def split(delimiters: js.Array[String], multiParagraphs: Boolean, trimDelimiters: Unit, trimSpacing: Boolean): RangeCollection = js.native
  def split(delimiters: js.Array[String], multiParagraphs: Unit, trimDelimiters: Boolean): RangeCollection = js.native
  def split(delimiters: js.Array[String], multiParagraphs: Unit, trimDelimiters: Boolean, trimSpacing: Boolean): RangeCollection = js.native
  def split(delimiters: js.Array[String], multiParagraphs: Unit, trimDelimiters: Unit, trimSpacing: Boolean): RangeCollection = js.native
  
  /**
    * Gets or sets the style name for the range. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var style: String = js.native
  
  /**
    * Gets or sets the built-in style name for the range. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 149 */ Any = js.native
  
  /**
    * Gets the collection of table objects in the range.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val tables: TableCollection = js.native
  
  /**
    * Gets the text of the range.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val text: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Range object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.RangeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): Range = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Range = js.native
}
