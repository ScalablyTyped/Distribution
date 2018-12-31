package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a single paragraph in a selection, range, content control, or document body.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.Paragraph")
@js.native
class Paragraph ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets or sets the alignment for a paragraph. The value can be 'left', 'centered', 'right', or 'justified'.
    *
    * [Api set: WordApi 1.1]
    */
  var alignment: Alignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mixed | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Unknown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Centered | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justified = js.native
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
    *
    * Gets or sets the value, in points, for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * [Api set: WordApi 1.1]
    */
  var firstLineIndent: scala.Double = js.native
  /**
    *
    * Gets the text format of the paragraph. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val font: Font = js.native
  /**
    *
    * Gets the collection of InlinePicture objects in the paragraph. The collection does not include floating images. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val inlinePictures: InlinePictureCollection = js.native
  /**
    *
    * Indicates the paragraph is the last one inside its parent body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val isLastParagraph: scala.Boolean = js.native
  /**
    *
    * Checks whether the paragraph is a list item. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val isListItem: scala.Boolean = js.native
  /**
    *
    * Gets or sets the left indent value, in points, for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var leftIndent: scala.Double = js.native
  /**
    *
    * Gets or sets the line spacing, in points, for the specified paragraph. In the Word UI, this value is divided by 12.
    *
    * [Api set: WordApi 1.1]
    */
  var lineSpacing: scala.Double = js.native
  /**
    *
    * Gets or sets the amount of spacing, in grid lines, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitAfter: scala.Double = js.native
  /**
    *
    * Gets or sets the amount of spacing, in grid lines, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var lineUnitBefore: scala.Double = js.native
  /**
    *
    * Gets the List to which this paragraph belongs. Throws if the paragraph is not in a list. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val list: List = js.native
  /**
    *
    * Gets the ListItem for the paragraph. Throws if the paragraph is not part of a list. Read-only.
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
    *
    * Gets or sets the outline level for the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var outlineLevel: scala.Double = js.native
  /**
    *
    * Gets the parent body of the paragraph. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentBody: Body = js.native
  /**
    *
    * Gets the content control that contains the paragraph. Throws if there isn't a parent content control. Read-only.
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
    * Gets the table that contains the paragraph. Throws if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  /**
    *
    * Gets the table cell that contains the paragraph. Throws if it is not contained in a table cell. Read-only.
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
  var rightIndent: scala.Double = js.native
  /**
    *
    * Gets or sets the spacing, in points, after the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceAfter: scala.Double = js.native
  /**
    *
    * Gets or sets the spacing, in points, before the paragraph.
    *
    * [Api set: WordApi 1.1]
    */
  var spaceBefore: scala.Double = js.native
  /**
    *
    * Gets or sets the style name for the paragraph. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: java.lang.String = js.native
  /**
    *
    * Gets or sets the built-in style name for the paragraph. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 149 */ js.Any = js.native
  /**
    *
    * Gets the level of the paragraph's table. It returns 0 if the paragraph is not in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val tableNestingLevel: scala.Double = js.native
  /**
    *
    * Gets the text of the paragraph. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val text: java.lang.String = js.native
  /**
    *
    * Lets the paragraph join an existing list at the specified level. Fails if the paragraph cannot join the list or if the paragraph is already a list item.
    *
    * [Api set: WordApi 1.3]
    *
    * @param listId Required. The ID of an existing list.
    * @param level Required. The level in the list.
    */
  def attachToList(listId: scala.Double, level: scala.Double): List = js.native
  /**
    *
    * Clears the contents of the paragraph object. The user can perform the undo operation on the cleared content.
    *
    * [Api set: WordApi 1.1]
    */
  def clear(): scala.Unit = js.native
  /**
    *
    * Deletes the paragraph and its content from the document.
    *
    * [Api set: WordApi 1.1]
    */
  def delete(): scala.Unit = js.native
  /**
    *
    * Moves this paragraph out of its list, if the paragraph is a list item.
    *
    * [Api set: WordApi 1.3]
    */
  def detachFromList(): scala.Unit = js.native
  /**
    *
    * Gets an HTML representation of the paragraph object. When rendered in a web page or HTML viewer, the formatting will be a close, but not exact, match for of the formatting of the document. This method does not return the exact same HTML for the same document on different platforms (Windows, Mac, Word Online, etc.). If you need exact fidelity, or consistency across platforms, use `Paragraph.getOoxml()` and convert the returned XML to HTML.
    *
    * [Api set: WordApi 1.1]
    */
  def getHtml(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
    *
    * Gets the next paragraph. Throws if the paragraph is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNext(): Paragraph = js.native
  /**
    *
    * Gets the next paragraph. Returns a null object if the paragraph is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNextOrNullObject(): Paragraph = js.native
  /**
    *
    * Gets the Office Open XML (OOXML) representation of the paragraph object.
    *
    * [Api set: WordApi 1.1]
    */
  def getOoxml(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
    *
    * Gets the previous paragraph. Throws if the paragraph is the first one.
    *
    * [Api set: WordApi 1.3]
    */
  def getPrevious(): Paragraph = js.native
  /**
    *
    * Gets the previous paragraph. Returns a null object if the paragraph is the first one.
    *
    * [Api set: WordApi 1.3]
    */
  def getPreviousOrNullObject(): Paragraph = js.native
  /**
    *
    * Gets the whole paragraph, or the starting or ending point of the paragraph, as a range.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rangeLocation Optional. The range location can be 'Whole', 'Start', 'End', 'After', or 'Content'.
    */
  def getRange(): Range = js.native
  def getRange(rangeLocation: RangeLocation): Range = js.native
  @JSName("getRange")
  def getRange_After(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After): Range = js.native
  @JSName("getRange")
  def getRange_Before(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before): Range = js.native
  @JSName("getRange")
  def getRange_Content(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Content): Range = js.native
  @JSName("getRange")
  def getRange_End(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End): Range = js.native
  @JSName("getRange")
  def getRange_Start(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start): Range = js.native
  @JSName("getRange")
  def getRange_Whole(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Whole): Range = js.native
  /**
    *
    * Gets the text ranges in the paragraph by using punctuation marks and/or other ending marks.
    *
    * [Api set: WordApi 1.3]
    *
    * @param endingMarks Required. The punctuation marks and/or other ending marks as an array of strings.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
    */
  def getTextRanges(endingMarks: js.Array[java.lang.String]): RangeCollection = js.native
  def getTextRanges(endingMarks: js.Array[java.lang.String], trimSpacing: scala.Boolean): RangeCollection = js.native
  /**
    *
    * Inserts a break at the specified location in the main document. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param breakType Required. The break type to add to the document.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertBreak(
    breakType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Page | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Next | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SectionNext | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SectionContinuous | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SectionEven | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SectionOdd | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Line,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): scala.Unit = js.native
  /**
    *
    * Inserts a break at the specified location in the main document. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param breakType Required. The break type to add to the document.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertBreak(breakType: BreakType, insertLocation: InsertLocation): scala.Unit = js.native
  /**
    *
    * Wraps the paragraph object with a rich text content control.
    *
    * [Api set: WordApi 1.1]
    */
  def insertContentControl(): ContentControl = js.native
  /**
    *
    * Inserts a document into the paragraph at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  def insertFileFromBase64(base64File: java.lang.String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_After(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Range = js.native
  /**
    *
    * Inserts a document into the paragraph at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Before(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_End(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Replace(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Start(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Range = js.native
  /**
    *
    * Inserts HTML into the paragraph at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted in the paragraph.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  def insertHtml(html: java.lang.String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertHtml")
  def insertHtml_After(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Range = js.native
  /**
    *
    * Inserts HTML into the paragraph at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted in the paragraph.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  @JSName("insertHtml")
  def insertHtml_Before(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Range = js.native
  @JSName("insertHtml")
  def insertHtml_End(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Range = js.native
  @JSName("insertHtml")
  def insertHtml_Replace(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Range = js.native
  @JSName("insertHtml")
  def insertHtml_Start(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Range = js.native
  /**
    *
    * Inserts a picture into the paragraph at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  def insertInlinePictureFromBase64(base64EncodedImage: java.lang.String, insertLocation: InsertLocation): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_After(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): InlinePicture = js.native
  /**
    *
    * Inserts a picture into the paragraph at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Before(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_End(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Replace(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Start(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): InlinePicture = js.native
  /**
    *
    * Inserts OOXML into the paragraph at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted in the paragraph.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  def insertOoxml(ooxml: java.lang.String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_After(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Range = js.native
  /**
    *
    * Inserts OOXML into the paragraph at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted in the paragraph.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  @JSName("insertOoxml")
  def insertOoxml_Before(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_End(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_Replace(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_Start(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Range = js.native
  /**
    *
    * Inserts a paragraph at the specified location. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertParagraph(paragraphText: java.lang.String, insertLocation: InsertLocation): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_After(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Paragraph = js.native
  /**
    *
    * Inserts a paragraph at the specified location. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  @JSName("insertParagraph")
  def insertParagraph_Before(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_End(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Replace(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Start(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Paragraph = js.native
  /**
    *
    * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def insertTable(rowCount: scala.Double, columnCount: scala.Double, insertLocation: InsertLocation): Table = js.native
  def insertTable(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: InsertLocation,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_After(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_After(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
    *
    * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  @JSName("insertTable")
  def insertTable_Before(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_Before(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_End(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_End(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_Replace(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_Replace(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_Start(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_Start(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
    *
    * Inserts text into the paragraph at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  def insertText(text: java.lang.String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertText")
  def insertText_After(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Range = js.native
  /**
    *
    * Inserts text into the paragraph at the specified location. The insertLocation value can be 'Replace', 'Start', or 'End'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  @JSName("insertText")
  def insertText_Before(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Range = js.native
  @JSName("insertText")
  def insertText_End(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Range = js.native
  @JSName("insertText")
  def insertText_Replace(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Range = js.native
  @JSName("insertText")
  def insertText_Start(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.Paragraph` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.Paragraph` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.Paragraph` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Paragraph = js.native
  def load(option: java.lang.String): Paragraph = js.native
  def load(option: js.Array[java.lang.String]): Paragraph = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Select): Paragraph = js.native
  def load(option: officeDashJsDashPreviewLib.WordNs.InterfacesNs.ParagraphLoadOptions): Paragraph = js.native
  /**
    *
    * Performs a search with the specified SearchOptions on the scope of the paragraph object. The search results are a collection of range objects.
    *
    * [Api set: WordApi 1.1]
    *
    * @param searchText Required. The search text.
    * @param searchOptions Optional. Options for the search.
    */
  def search(searchText: java.lang.String): RangeCollection = js.native
  def search(searchText: java.lang.String, searchOptions: officeDashJsDashPreviewLib.Anon_MatchSuffix): RangeCollection = js.native
  def search(searchText: java.lang.String, searchOptions: SearchOptions): RangeCollection = js.native
  /**
    *
    * Selects and navigates the Word UI to the paragraph.
    *
    * [Api set: WordApi 1.1]
    *
    * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
    */
  def select(): scala.Unit = js.native
  def select(selectionMode: SelectionMode): scala.Unit = js.native
  @JSName("select")
  def select_End(selectionMode: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End): scala.Unit = js.native
  @JSName("select")
  def select_Select(selectionMode: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Select): scala.Unit = js.native
  @JSName("select")
  def select_Start(selectionMode: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start): scala.Unit = js.native
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
  def set(properties: officeDashJsDashPreviewLib.WordNs.InterfacesNs.ParagraphUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.WordNs.InterfacesNs.ParagraphUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Paragraph): scala.Unit = js.native
  /**
    *
    * Splits the paragraph into child ranges by using delimiters.
    *
    * [Api set: WordApi 1.3]
    *
    * @param delimiters Required. The delimiters as an array of strings.
    * @param trimDelimiters Optional. Indicates whether to trim delimiters from the ranges in the range collection. Default is false which indicates that the delimiters are included in the ranges returned in the range collection.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
    */
  def split(delimiters: js.Array[java.lang.String]): RangeCollection = js.native
  def split(delimiters: js.Array[java.lang.String], trimDelimiters: scala.Boolean): RangeCollection = js.native
  def split(delimiters: js.Array[java.lang.String], trimDelimiters: scala.Boolean, trimSpacing: scala.Boolean): RangeCollection = js.native
  /**
    *
    * Starts a new list with this paragraph. Fails if the paragraph is already a list item.
    *
    * [Api set: WordApi 1.3]
    */
  def startNewList(): List = js.native
  def toJSON(): officeDashJsDashPreviewLib.WordNs.InterfacesNs.ParagraphData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Paragraph = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): Paragraph = js.native
}

