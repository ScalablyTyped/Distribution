package typings.officeDashJs.WordNs

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.Anon_IgnorePunct
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.ClientResult
import typings.officeDashJs.OfficeExtensionNs.UpdateOptions
import typings.officeDashJs.WordNs.InterfacesNs.RangeData
import typings.officeDashJs.WordNs.InterfacesNs.RangeLoadOptions
import typings.officeDashJs.WordNs.InterfacesNs.RangeUpdateData
import typings.officeDashJs.officeDashJsStrings.After
import typings.officeDashJs.officeDashJsStrings.Before
import typings.officeDashJs.officeDashJsStrings.Content
import typings.officeDashJs.officeDashJsStrings.End
import typings.officeDashJs.officeDashJsStrings.Line
import typings.officeDashJs.officeDashJsStrings.Next
import typings.officeDashJs.officeDashJsStrings.Page
import typings.officeDashJs.officeDashJsStrings.Replace
import typings.officeDashJs.officeDashJsStrings.SectionContinuous
import typings.officeDashJs.officeDashJsStrings.SectionEven
import typings.officeDashJs.officeDashJsStrings.SectionNext
import typings.officeDashJs.officeDashJsStrings.SectionOdd
import typings.officeDashJs.officeDashJsStrings.Select
import typings.officeDashJs.officeDashJsStrings.Start
import typings.officeDashJs.officeDashJsStrings.Whole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a contiguous area in a document.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.Range")
@js.native
class Range () extends ClientObject {
  /**
    *
    * Gets the collection of content control objects in the range. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val contentControls: ContentControlCollection = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Range: RequestContext = js.native
  /**
    *
    * Gets the text format of the range. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val font: Font = js.native
  /**
    *
    * Gets the first hyperlink in the range, or sets a hyperlink on the range. All hyperlinks in the range are deleted when you set a new hyperlink on the range. Use a '#' to separate the address part from the optional location part.
    *
    * [Api set: WordApi 1.3]
    */
  var hyperlink: String = js.native
  /**
    *
    * Gets the collection of inline picture objects in the range. Read-only.
    *
    * [Api set: WordApi 1.2]
    */
  val inlinePictures: InlinePictureCollection = js.native
  /**
    *
    * Checks whether the range length is zero. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val isEmpty: Boolean = js.native
  /**
    *
    * Gets the collection of list objects in the range. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val lists: ListCollection = js.native
  /**
    *
    * Gets the collection of paragraph objects in the range. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val paragraphs: ParagraphCollection = js.native
  /**
    *
    * Gets the parent body of the range. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentBody: Body = js.native
  /**
    *
    * Gets the content control that contains the range. Throws an error if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val parentContentControl: ContentControl = js.native
  /**
    *
    * Gets the content control that contains the range. Returns a null object if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  /**
    *
    * Gets the table that contains the range. Throws an error if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  /**
    *
    * Gets the table cell that contains the range. Throws an error if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableCell: TableCell = js.native
  /**
    *
    * Gets the table cell that contains the range. Returns a null object if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableCellOrNullObject: TableCell = js.native
  /**
    *
    * Gets the table that contains the range. Returns a null object if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableOrNullObject: Table = js.native
  /**
    *
    * Gets or sets the style name for the range. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: String = js.native
  /**
    *
    * Gets or sets the built-in style name for the range. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 149 */ js.Any = js.native
  /**
    *
    * Gets the collection of table objects in the range. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val tables: TableCollection = js.native
  /**
    *
    * Gets the text of the range. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val text: String = js.native
  /**
    *
    * Clears the contents of the range object. The user can perform the undo operation on the cleared content.
    *
    * [Api set: WordApi 1.1]
    */
  def clear(): Unit = js.native
  /**
    *
    * Compares this range's location with another range's location.
    *
    * [Api set: WordApi 1.3]
    *
    * @param range Required. The range to compare with this range.
    */
  def compareLocationWith(range: Range): ClientResult[LocationRelation] = js.native
  /**
    *
    * Deletes the range and its content from the document.
    *
    * [Api set: WordApi 1.1]
    */
  def delete(): Unit = js.native
  /**
    *
    * Returns a new range that extends from this range in either direction to cover another range. This range is not changed. Throws an error if the two ranges do not have a union.
    *
    * [Api set: WordApi 1.3]
    *
    * @param range Required. Another range.
    */
  def expandTo(range: Range): Range = js.native
  /**
    *
    * Returns a new range that extends from this range in either direction to cover another range. This range is not changed. Returns a null object if the two ranges do not have a union.
    *
    * [Api set: WordApi 1.3]
    *
    * @param range Required. Another range.
    */
  def expandToOrNullObject(range: Range): Range = js.native
  /**
    *
    * Gets an HTML representation of the range object. When rendered in a web page or HTML viewer, the formatting will be a close, but not exact, match for of the formatting of the document. This method does not return the exact same HTML for the same document on different platforms (Windows, Mac, Word for the web, etc.). If you need exact fidelity, or consistency across platforms, use `Range.getOoxml()` and convert the returned XML to HTML.
    *
    * [Api set: WordApi 1.1]
    */
  def getHtml(): ClientResult[String] = js.native
  /**
    *
    * Gets hyperlink child ranges within the range.
    *
    * [Api set: WordApi 1.3]
    */
  def getHyperlinkRanges(): RangeCollection = js.native
  /**
    *
    * Gets the next text range by using punctuation marks and/or other ending marks. Throws an error if this text range is the last one.
    *
    * [Api set: WordApi 1.3]
    *
    * @param endingMarks Required. The punctuation marks and/or other ending marks as an array of strings.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the returned range. Default is false which indicates that spacing characters at the start and end of the range are included.
    */
  def getNextTextRange(endingMarks: js.Array[String]): Range = js.native
  def getNextTextRange(endingMarks: js.Array[String], trimSpacing: Boolean): Range = js.native
  /**
    *
    * Gets the next text range by using punctuation marks and/or other ending marks. Returns a null object if this text range is the last one.
    *
    * [Api set: WordApi 1.3]
    *
    * @param endingMarks Required. The punctuation marks and/or other ending marks as an array of strings.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the returned range. Default is false which indicates that spacing characters at the start and end of the range are included.
    */
  def getNextTextRangeOrNullObject(endingMarks: js.Array[String]): Range = js.native
  def getNextTextRangeOrNullObject(endingMarks: js.Array[String], trimSpacing: Boolean): Range = js.native
  /**
    *
    * Gets the OOXML representation of the range object.
    *
    * [Api set: WordApi 1.1]
    */
  def getOoxml(): ClientResult[String] = js.native
  /**
    *
    * Clones the range, or gets the starting or ending point of the range as a new range.
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
    *
    * Gets the text child ranges in the range by using punctuation marks and/or other ending marks.
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
    * Inserts a break at the specified location in the main document.
    *
    * [Api set: WordApi 1.1]
    *
    * @param breakType Required. The break type to add.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: Before | After | Start | End | Replace
  ): Unit = js.native
  /**
    *
    * Inserts a break at the specified location in the main document.
    *
    * [Api set: WordApi 1.1]
    *
    * @param breakType Required. The break type to add.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertBreak(breakType: BreakType, insertLocation: InsertLocation): Unit = js.native
  /**
    *
    * Wraps the range object with a rich text content control.
    *
    * [Api set: WordApi 1.1]
    */
  def insertContentControl(): ContentControl = js.native
  /**
    *
    * Inserts a document at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  def insertFileFromBase64(base64File: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_After(base64File: String, insertLocation: After): Range = js.native
  /**
    *
    * Inserts a document at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
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
    *
    * Inserts HTML at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  def insertHtml(html: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertHtml")
  def insertHtml_After(html: String, insertLocation: After): Range = js.native
  /**
    *
    * Inserts HTML at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
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
    *
    * Inserts a picture at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: InsertLocation): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_After(base64EncodedImage: String, insertLocation: After): InlinePicture = js.native
  /**
    *
    * Inserts a picture at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
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
    *
    * Inserts OOXML at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  def insertOoxml(ooxml: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_After(ooxml: String, insertLocation: After): Range = js.native
  /**
    *
    * Inserts OOXML at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
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
    *
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
    *
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
    *
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
    *
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
    *
    * Inserts text at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  def insertText(text: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertText")
  def insertText_After(text: String, insertLocation: After): Range = js.native
  /**
    *
    * Inserts text at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
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
    * Returns a new range as the intersection of this range with another range. This range is not changed. Throws an error if the two ranges are not overlapped or adjacent.
    *
    * [Api set: WordApi 1.3]
    *
    * @param range Required. Another range.
    */
  def intersectWith(range: Range): Range = js.native
  /**
    *
    * Returns a new range as the intersection of this range with another range. This range is not changed. Returns a null object if the two ranges are not overlapped or adjacent.
    *
    * [Api set: WordApi 1.3]
    *
    * @param range Required. Another range.
    */
  def intersectWithOrNullObject(range: Range): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.Range` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.Range` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.Range` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Range = js.native
  def load(option: String): Range = js.native
  def load(option: js.Array[String]): Range = js.native
  def load(option: Anon_Expand): Range = js.native
  def load(option: RangeLoadOptions): Range = js.native
  /**
    *
    * Performs a search with the specified SearchOptions on the scope of the range object. The search results are a collection of range objects.
    *
    * [Api set: WordApi 1.1]
    *
    * @param searchText Required. The search text.
    * @param searchOptions Optional. Options for the search.
    */
  def search(searchText: String): RangeCollection = js.native
  def search(searchText: String, searchOptions: Anon_IgnorePunct): RangeCollection = js.native
  def search(searchText: String, searchOptions: SearchOptions): RangeCollection = js.native
  /**
    *
    * Selects and navigates the Word UI to the range.
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
    * `set(properties: Word.Range): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: RangeUpdateData): Unit = js.native
  def set(properties: RangeUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Range): Unit = js.native
  /**
    *
    * Splits the range into child ranges by using delimiters.
    *
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
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Range object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.RangeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): RangeData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Range = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): Range = js.native
}

