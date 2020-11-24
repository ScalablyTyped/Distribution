package typings.officeJsPreview.Word

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.Word.Interfaces.ParagraphData
import typings.officeJsPreview.Word.Interfaces.ParagraphLoadOptions
import typings.officeJsPreview.Word.Interfaces.ParagraphUpdateData
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.anon.IgnorePunct
import typings.officeJsPreview.officeJsPreviewStrings.After
import typings.officeJsPreview.officeJsPreviewStrings.Before
import typings.officeJsPreview.officeJsPreviewStrings.Centered
import typings.officeJsPreview.officeJsPreviewStrings.Content
import typings.officeJsPreview.officeJsPreviewStrings.End
import typings.officeJsPreview.officeJsPreviewStrings.Justified
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Line
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.Next
import typings.officeJsPreview.officeJsPreviewStrings.Page
import typings.officeJsPreview.officeJsPreviewStrings.Replace
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.SectionContinuous
import typings.officeJsPreview.officeJsPreviewStrings.SectionEven
import typings.officeJsPreview.officeJsPreviewStrings.SectionNext
import typings.officeJsPreview.officeJsPreviewStrings.SectionOdd
import typings.officeJsPreview.officeJsPreviewStrings.Select
import typings.officeJsPreview.officeJsPreviewStrings.Start
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.officeJsPreview.officeJsPreviewStrings.Whole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a single paragraph in a selection, range, content control, or document body.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait Paragraph extends ClientObject {
  
  /**
    *
    * Gets or sets the alignment for a paragraph. The value can be 'left', 'centered', 'right', or 'justified'.
    *
    * [Api set: WordApi 1.1]
    */
  var alignment: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified = js.native
  
  /**
    * Lets the paragraph join an existing list at the specified level. Fails if the paragraph cannot join the list or if the paragraph is already a list item.
    *
    * [Api set: WordApi 1.3]
    *
    * @param listId Required. The ID of an existing list.
    * @param level Required. The level in the list.
    */
  def attachToList(listId: Double, level: Double): List = js.native
  
  /**
    * Clears the contents of the paragraph object. The user can perform the undo operation on the cleared content.
    *
    * [Api set: WordApi 1.1]
    */
  def clear(): Unit = js.native
  
  /**
    *
    * Gets the collection of content control objects in the paragraph. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val contentControls: ContentControlCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Paragraph: RequestContext = js.native
  
  /**
    * Deletes the paragraph and its content from the document.
    *
    * [Api set: WordApi 1.1]
    */
  def delete(): Unit = js.native
  
  /**
    * Moves this paragraph out of its list, if the paragraph is a list item.
    *
    * [Api set: WordApi 1.3]
    */
  def detachFromList(): Unit = js.native
  
  /**
    *
    * Gets or sets the value, in points, for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * [Api set: WordApi 1.1]
    */
  var firstLineIndent: Double = js.native
  
  /**
    *
    * Gets the text format of the paragraph. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val font: Font = js.native
  
  /**
    * Gets an HTML representation of the paragraph object. When rendered in a web page or HTML viewer, the formatting will be a close, but not exact, match for of the formatting of the document. This method does not return the exact same HTML for the same document on different platforms (Windows, Mac, Word for the web, etc.). If you need exact fidelity, or consistency across platforms, use `Paragraph.getOoxml()` and convert the returned XML to HTML.
    *
    * [Api set: WordApi 1.1]
    */
  def getHtml(): ClientResult[String] = js.native
  
  /**
    * Gets the next paragraph. Throws an error if the paragraph is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNext(): Paragraph = js.native
  
  /**
    * Gets the next paragraph. Returns a null object if the paragraph is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNextOrNullObject(): Paragraph = js.native
  
  /**
    * Gets the Office Open XML (OOXML) representation of the paragraph object.
    *
    * [Api set: WordApi 1.1]
    */
  def getOoxml(): ClientResult[String] = js.native
  
  /**
    * Gets the previous paragraph. Throws an error if the paragraph is the first one.
    *
    * [Api set: WordApi 1.3]
    */
  def getPrevious(): Paragraph = js.native
  
  /**
    * Gets the previous paragraph. Returns a null object if the paragraph is the first one.
    *
    * [Api set: WordApi 1.3]
    */
  def getPreviousOrNullObject(): Paragraph = js.native
  
  /**
    * Gets the whole paragraph, or the starting or ending point of the paragraph, as a range.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rangeLocation Optional. The range location can be 'Whole', 'Start', 'End', 'After', or 'Content'.
    */
  def getRange(): Range = js.native
  def getRange(rangeLocation: RangeLocation): Range = js.native
  @JSName("getRange")
  def getRange_After(rangeLocation: After): Range = js.native
  @JSName("getRange")
  def getRange_Before(rangeLocation: Before): Range = js.native
  @JSName("getRange")
  def getRange_Content(rangeLocation: Content): Range = js.native
  @JSName("getRange")
  def getRange_End(rangeLocation: End): Range = js.native
  @JSName("getRange")
  def getRange_Start(rangeLocation: Start): Range = js.native
  @JSName("getRange")
  def getRange_Whole(rangeLocation: Whole): Range = js.native
  
  /**
    * Gets the text ranges in the paragraph by using punctuation marks and/or other ending marks.
    *
    * [Api set: WordApi 1.3]
    *
    * @param endingMarks Required. The punctuation marks and/or other ending marks as an array of strings.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
    */
  def getTextRanges(endingMarks: js.Array[String]): RangeCollection = js.native
  def getTextRanges(endingMarks: js.Array[String], trimSpacing: Boolean): RangeCollection = js.native
  
  /**
    *
    * Gets the collection of InlinePicture objects in the paragraph. The collection does not include floating images. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val inlinePictures: InlinePictureCollection = js.native
  
  /**
    * Inserts a break at the specified location in the main document.
    *
    * [Api set: WordApi 1.1]
    *
    * @param breakType Required. The break type to add to the document.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertBreak(breakType: BreakType, insertLocation: InsertLocation): Unit = js.native
  def insertBreak(breakType: Line, insertLocation: After): Unit = js.native
  def insertBreak(breakType: Line, insertLocation: Before): Unit = js.native
  def insertBreak(breakType: Line, insertLocation: End): Unit = js.native
  def insertBreak(breakType: Line, insertLocation: Replace): Unit = js.native
  def insertBreak(breakType: Line, insertLocation: Start): Unit = js.native
  def insertBreak(breakType: Next, insertLocation: After): Unit = js.native
  def insertBreak(breakType: Next, insertLocation: Before): Unit = js.native
  def insertBreak(breakType: Next, insertLocation: End): Unit = js.native
  def insertBreak(breakType: Next, insertLocation: Replace): Unit = js.native
  def insertBreak(breakType: Next, insertLocation: Start): Unit = js.native
  def insertBreak(breakType: Page, insertLocation: After): Unit = js.native
  /**
    * Inserts a break at the specified location in the main document.
    *
    * [Api set: WordApi 1.1]
    *
    * @param breakType Required. The break type to add to the document.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertBreak(breakType: Page, insertLocation: Before): Unit = js.native
  def insertBreak(breakType: Page, insertLocation: End): Unit = js.native
  def insertBreak(breakType: Page, insertLocation: Replace): Unit = js.native
  def insertBreak(breakType: Page, insertLocation: Start): Unit = js.native
  def insertBreak(breakType: SectionContinuous, insertLocation: After): Unit = js.native
  def insertBreak(breakType: SectionContinuous, insertLocation: Before): Unit = js.native
  def insertBreak(breakType: SectionContinuous, insertLocation: End): Unit = js.native
  def insertBreak(breakType: SectionContinuous, insertLocation: Replace): Unit = js.native
  def insertBreak(breakType: SectionContinuous, insertLocation: Start): Unit = js.native
  def insertBreak(breakType: SectionEven, insertLocation: After): Unit = js.native
  def insertBreak(breakType: SectionEven, insertLocation: Before): Unit = js.native
  def insertBreak(breakType: SectionEven, insertLocation: End): Unit = js.native
  def insertBreak(breakType: SectionEven, insertLocation: Replace): Unit = js.native
  def insertBreak(breakType: SectionEven, insertLocation: Start): Unit = js.native
  def insertBreak(breakType: SectionNext, insertLocation: After): Unit = js.native
  def insertBreak(breakType: SectionNext, insertLocation: Before): Unit = js.native
  def insertBreak(breakType: SectionNext, insertLocation: End): Unit = js.native
  def insertBreak(breakType: SectionNext, insertLocation: Replace): Unit = js.native
  def insertBreak(breakType: SectionNext, insertLocation: Start): Unit = js.native
  def insertBreak(breakType: SectionOdd, insertLocation: After): Unit = js.native
  def insertBreak(breakType: SectionOdd, insertLocation: Before): Unit = js.native
  def insertBreak(breakType: SectionOdd, insertLocation: End): Unit = js.native
  def insertBreak(breakType: SectionOdd, insertLocation: Replace): Unit = js.native
  def insertBreak(breakType: SectionOdd, insertLocation: Start): Unit = js.native
  
  /**
    * Wraps the paragraph object with a rich text content control.
    *
    * [Api set: WordApi 1.1]
    */
  def insertContentControl(): ContentControl = js.native
  
  /**
    * Inserts a document into the paragraph at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  def insertFileFromBase64(base64File: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_After(base64File: String, insertLocation: After): Range = js.native
  /**
    * Inserts a document into the paragraph at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Before(base64File: String, insertLocation: Before): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_End(base64File: String, insertLocation: End): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Replace(base64File: String, insertLocation: Replace): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Start(base64File: String, insertLocation: Start): Range = js.native
  
  /**
    * Inserts HTML into the paragraph at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted in the paragraph.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  def insertHtml(html: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertHtml")
  def insertHtml_After(html: String, insertLocation: After): Range = js.native
  /**
    * Inserts HTML into the paragraph at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted in the paragraph.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  @JSName("insertHtml")
  def insertHtml_Before(html: String, insertLocation: Before): Range = js.native
  @JSName("insertHtml")
  def insertHtml_End(html: String, insertLocation: End): Range = js.native
  @JSName("insertHtml")
  def insertHtml_Replace(html: String, insertLocation: Replace): Range = js.native
  @JSName("insertHtml")
  def insertHtml_Start(html: String, insertLocation: Start): Range = js.native
  
  /**
    * Inserts a picture into the paragraph at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: InsertLocation): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_After(base64EncodedImage: String, insertLocation: After): InlinePicture = js.native
  /**
    * Inserts a picture into the paragraph at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Before(base64EncodedImage: String, insertLocation: Before): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_End(base64EncodedImage: String, insertLocation: End): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Replace(base64EncodedImage: String, insertLocation: Replace): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Start(base64EncodedImage: String, insertLocation: Start): InlinePicture = js.native
  
  /**
    * Inserts OOXML into the paragraph at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted in the paragraph.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  def insertOoxml(ooxml: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_After(ooxml: String, insertLocation: After): Range = js.native
  /**
    * Inserts OOXML into the paragraph at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted in the paragraph.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  @JSName("insertOoxml")
  def insertOoxml_Before(ooxml: String, insertLocation: Before): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_End(ooxml: String, insertLocation: End): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_Replace(ooxml: String, insertLocation: Replace): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_Start(ooxml: String, insertLocation: Start): Range = js.native
  
  /**
    * Inserts a paragraph at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertParagraph(paragraphText: String, insertLocation: InsertLocation): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_After(paragraphText: String, insertLocation: After): Paragraph = js.native
  /**
    * Inserts a paragraph at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  @JSName("insertParagraph")
  def insertParagraph_Before(paragraphText: String, insertLocation: Before): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_End(paragraphText: String, insertLocation: End): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Replace(paragraphText: String, insertLocation: Replace): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Start(paragraphText: String, insertLocation: Start): Paragraph = js.native
  
  /**
    * Inserts a table with the specified number of rows and columns.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: InsertLocation): Table = js.native
  def insertTable(
    rowCount: Double,
    columnCount: Double,
    insertLocation: InsertLocation,
    values: js.Array[js.Array[String]]
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_After(rowCount: Double, columnCount: Double, insertLocation: After): Table = js.native
  @JSName("insertTable")
  def insertTable_After(rowCount: Double, columnCount: Double, insertLocation: After, values: js.Array[js.Array[String]]): Table = js.native
  /**
    * Inserts a table with the specified number of rows and columns.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  @JSName("insertTable")
  def insertTable_Before(rowCount: Double, columnCount: Double, insertLocation: Before): Table = js.native
  @JSName("insertTable")
  def insertTable_Before(rowCount: Double, columnCount: Double, insertLocation: Before, values: js.Array[js.Array[String]]): Table = js.native
  @JSName("insertTable")
  def insertTable_End(rowCount: Double, columnCount: Double, insertLocation: End): Table = js.native
  @JSName("insertTable")
  def insertTable_End(rowCount: Double, columnCount: Double, insertLocation: End, values: js.Array[js.Array[String]]): Table = js.native
  @JSName("insertTable")
  def insertTable_Replace(rowCount: Double, columnCount: Double, insertLocation: Replace): Table = js.native
  @JSName("insertTable")
  def insertTable_Replace(rowCount: Double, columnCount: Double, insertLocation: Replace, values: js.Array[js.Array[String]]): Table = js.native
  @JSName("insertTable")
  def insertTable_Start(rowCount: Double, columnCount: Double, insertLocation: Start): Table = js.native
  @JSName("insertTable")
  def insertTable_Start(rowCount: Double, columnCount: Double, insertLocation: Start, values: js.Array[js.Array[String]]): Table = js.native
  
  /**
    * Inserts text into the paragraph at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  def insertText(text: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertText")
  def insertText_After(text: String, insertLocation: After): Range = js.native
  /**
    * Inserts text into the paragraph at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  @JSName("insertText")
  def insertText_Before(text: String, insertLocation: Before): Range = js.native
  @JSName("insertText")
  def insertText_End(text: String, insertLocation: End): Range = js.native
  @JSName("insertText")
  def insertText_Replace(text: String, insertLocation: Replace): Range = js.native
  @JSName("insertText")
  def insertText_Start(text: String, insertLocation: Start): Range = js.native
  
  /**
    *
    * Indicates the paragraph is the last one inside its parent body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val isLastParagraph: Boolean = js.native
  
  /**
    *
    * Checks whether the paragraph is a list item. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val isListItem: Boolean = js.native
  
  /**
    *
    * Gets or sets the left indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var leftIndent: Double = js.native
  
  /**
    *
    * Gets or sets the line spacing, in points, for the specified paragraph. In the Word UI, this value is divided by 12.
    *
    * [Api set: WordApi 1.1]
    */
  var lineSpacing: Double = js.native
  
  /**
    *
    * Gets or sets the amount of spacing, in grid lines, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitAfter: Double = js.native
  
  /**
    *
    * Gets or sets the amount of spacing, in grid lines, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitBefore: Double = js.native
  
  /**
    *
    * Gets the List to which this paragraph belongs. Throws an error if the paragraph is not in a list. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val list: List = js.native
  
  /**
    *
    * Gets the ListItem for the paragraph. Throws an error if the paragraph is not part of a list. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val listItem: ListItem = js.native
  
  /**
    *
    * Gets the ListItem for the paragraph. Returns a null object if the paragraph is not part of a list. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val listItemOrNullObject: ListItem = js.native
  
  /**
    *
    * Gets the List to which this paragraph belongs. Returns a null object if the paragraph is not in a list. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val listOrNullObject: List = js.native
  
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
    *
    * Gets or sets the outline level for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var outlineLevel: Double = js.native
  
  /**
    *
    * Gets the parent body of the paragraph. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentBody: Body = js.native
  
  /**
    *
    * Gets the content control that contains the paragraph. Throws an error if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val parentContentControl: ContentControl = js.native
  
  /**
    *
    * Gets the content control that contains the paragraph. Returns a null object if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  
  /**
    *
    * Gets the table that contains the paragraph. Throws an error if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  
  /**
    *
    * Gets the table cell that contains the paragraph. Throws an error if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableCell: TableCell = js.native
  
  /**
    *
    * Gets the table cell that contains the paragraph. Returns a null object if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableCellOrNullObject: TableCell = js.native
  
  /**
    *
    * Gets the table that contains the paragraph. Returns a null object if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableOrNullObject: Table = js.native
  
  /**
    *
    * Gets or sets the right indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var rightIndent: Double = js.native
  
  /**
    * Performs a search with the specified SearchOptions on the scope of the paragraph object. The search results are a collection of range objects.
    *
    * [Api set: WordApi 1.1]
    *
    * @param searchText Required. The search text.
    * @param searchOptions Optional. Options for the search.
    */
  def search(searchText: String): RangeCollection = js.native
  def search(searchText: String, searchOptions: SearchOptions): RangeCollection = js.native
  def search(searchText: String, searchOptions: IgnorePunct): RangeCollection = js.native
  
  /**
    * Selects and navigates the Word UI to the paragraph.
    *
    * [Api set: WordApi 1.1]
    *
    * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
    */
  def select(): Unit = js.native
  def select(selectionMode: SelectionMode): Unit = js.native
  @JSName("select")
  def select_End(selectionMode: End): Unit = js.native
  @JSName("select")
  def select_Select(selectionMode: Select): Unit = js.native
  @JSName("select")
  def select_Start(selectionMode: Start): Unit = js.native
  
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.Paragraph): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ParagraphUpdateData): Unit = js.native
  def set(properties: ParagraphUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Paragraph): Unit = js.native
  
  /**
    *
    * Gets or sets the spacing, in points, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceAfter: Double = js.native
  
  /**
    *
    * Gets or sets the spacing, in points, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceBefore: Double = js.native
  
  /**
    * Splits the paragraph into child ranges by using delimiters.
    *
    * [Api set: WordApi 1.3]
    *
    * @param delimiters Required. The delimiters as an array of strings.
    * @param trimDelimiters Optional. Indicates whether to trim delimiters from the ranges in the range collection. Default is false which indicates that the delimiters are included in the ranges returned in the range collection.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
    */
  def split(delimiters: js.Array[String]): RangeCollection = js.native
  def split(delimiters: js.Array[String], trimDelimiters: js.UndefOr[scala.Nothing], trimSpacing: Boolean): RangeCollection = js.native
  def split(delimiters: js.Array[String], trimDelimiters: Boolean): RangeCollection = js.native
  def split(delimiters: js.Array[String], trimDelimiters: Boolean, trimSpacing: Boolean): RangeCollection = js.native
  
  /**
    * Starts a new list with this paragraph. Fails if the paragraph is already a list item.
    *
    * [Api set: WordApi 1.3]
    */
  def startNewList(): List = js.native
  
  /**
    *
    * Gets or sets the style name for the paragraph. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: String = js.native
  
  /**
    *
    * Gets or sets the built-in style name for the paragraph. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 149 */ js.Any = js.native
  
  /**
    *
    * Gets the level of the paragraph's table. It returns 0 if the paragraph is not in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val tableNestingLevel: Double = js.native
  
  /**
    *
    * Gets the text of the paragraph. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val text: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Paragraph object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.ParagraphData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ParagraphData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Paragraph = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Paragraph = js.native
}
