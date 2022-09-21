package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Word.InsertLocation.before
import typings.officeJs.Word.InsertLocation.replace
import typings.officeJs.Word.Interfaces.ParagraphData
import typings.officeJs.Word.Interfaces.ParagraphLoadOptions
import typings.officeJs.Word.Interfaces.ParagraphUpdateData
import typings.officeJs.Word.RangeLocation.after
import typings.officeJs.Word.RangeLocation.content
import typings.officeJs.Word.RangeLocation.end
import typings.officeJs.Word.RangeLocation.start
import typings.officeJs.Word.RangeLocation.whole
import typings.officeJs.anon.Expand
import typings.officeJs.anon.IgnorePunct
import typings.officeJs.officeJsStrings.After
import typings.officeJs.officeJsStrings.Before
import typings.officeJs.officeJsStrings.Centered
import typings.officeJs.officeJsStrings.Content
import typings.officeJs.officeJsStrings.Current
import typings.officeJs.officeJsStrings.End
import typings.officeJs.officeJsStrings.Justified
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.Line
import typings.officeJs.officeJsStrings.Mixed
import typings.officeJs.officeJsStrings.Next
import typings.officeJs.officeJsStrings.Original
import typings.officeJs.officeJsStrings.Page
import typings.officeJs.officeJsStrings.Replace
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.SectionContinuous
import typings.officeJs.officeJsStrings.SectionEven
import typings.officeJs.officeJsStrings.SectionNext
import typings.officeJs.officeJsStrings.SectionOdd
import typings.officeJs.officeJsStrings.Select
import typings.officeJs.officeJsStrings.Start
import typings.officeJs.officeJsStrings.Unknown_
import typings.officeJs.officeJsStrings.Whole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single paragraph in a selection, range, content control, or document body.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@js.native
trait Paragraph
  extends StObject
     with ClientObject {
  
  /**
    * Gets or sets the alignment for a paragraph. The value can be 'left', 'centered', 'right', or 'justified'.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var alignment: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified = js.native
  
  /**
    * Lets the paragraph join an existing list at the specified level. Fails if the paragraph cannot join the list or if the paragraph is already a list item.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param listId Required. The ID of an existing list.
    * @param level Required. The level in the list.
    */
  def attachToList(listId: Double, level: Double): List = js.native
  
  /**
    * Clears the contents of the paragraph object. The user can perform the undo operation on the cleared content.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def clear(): Unit = js.native
  
  /**
    * Gets the collection of content control objects in the paragraph. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val contentControls: ContentControlCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Paragraph: RequestContext = js.native
  
  /**
    * Deletes the paragraph and its content from the document.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def delete(): Unit = js.native
  
  /**
    * Moves this paragraph out of its list, if the paragraph is a list item.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def detachFromList(): Unit = js.native
  
  /**
    * Gets the collection of endnotes in the paragraph. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  val endnotes: NoteItemCollection = js.native
  
  /**
    * Gets or sets the value, in points, for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var firstLineIndent: Double = js.native
  
  /**
    * Gets the text format of the paragraph. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val font: Font = js.native
  
  /**
    * Gets the collection of footnotes in the paragraph. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  val footnotes: NoteItemCollection = js.native
  
  /**
    * Gets comments associated with the paragraph.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  def getComments(): CommentCollection = js.native
  
  /**
    * Gets an HTML representation of the paragraph object. When rendered in a web page or HTML viewer, the formatting will be a close, but not exact, match for of the formatting of the document. This method does not return the exact same HTML for the same document on different platforms (Windows, Mac, Word on the web, etc.). If you need exact fidelity, or consistency across platforms, use `Paragraph.getOoxml()` and convert the returned XML to HTML.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def getHtml(): ClientResult[String] = js.native
  
  /**
    * Gets the next paragraph. Throws an error if the paragraph is the last one.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getNext(): Paragraph = js.native
  
  /**
    * Gets the next paragraph. Returns a null object if the paragraph is the last one.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getNextOrNullObject(): Paragraph = js.native
  
  /**
    * Gets the Office Open XML (OOXML) representation of the paragraph object.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def getOoxml(): ClientResult[String] = js.native
  
  /**
    * Gets the previous paragraph. Throws an error if the paragraph is the first one.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getPrevious(): Paragraph = js.native
  
  /**
    * Gets the previous paragraph. Returns a null object if the paragraph is the first one.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getPreviousOrNullObject(): Paragraph = js.native
  
  /**
    * Gets the whole paragraph, or the starting or ending point of the paragraph, as a range.
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
    * [Api set: WordApiOnline 1.1]
    *
    * @param changeTrackingVersion Optional. The value must be 'Original' or 'Current'. The default is 'Current'.
    */
  def getReviewedText(): ClientResult[String] = js.native
  def getReviewedText(changeTrackingVersion: Original | Current): ClientResult[String] = js.native
  def getReviewedText(changeTrackingVersion: ChangeTrackingVersion): ClientResult[String] = js.native
  
  /**
    * Gets the text ranges in the paragraph by using punctuation marks and/or other ending marks.
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
    * Gets the collection of InlinePicture objects in the paragraph. The collection does not include floating images. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val inlinePictures: InlinePictureCollection = js.native
  
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
    * @param breakType Required. The break type to add to the document.
    * @param insertLocation Required. The value must be 'Before' or 'After'.
    */
  def insertBreak(breakType: BreakType, insertLocation: before): Unit = js.native
  
  /**
    * Wraps the paragraph object with a rich text content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def insertContentControl(): ContentControl = js.native
  
  def insertFileFromBase64(base64File: String, insertLocation: Replace | Start | End): Range = js.native
  def insertFileFromBase64(base64File: String, insertLocation: typings.officeJs.Word.InsertLocation.end): Range = js.native
  /**
    * Inserts a document into the paragraph at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value must be 'Replace', 'Start', or 'End'.
    */
  def insertFileFromBase64(base64File: String, insertLocation: replace): Range = js.native
  def insertFileFromBase64(base64File: String, insertLocation: typings.officeJs.Word.InsertLocation.start): Range = js.native
  
  def insertHtml(html: String, insertLocation: Replace | Start | End): Range = js.native
  def insertHtml(html: String, insertLocation: typings.officeJs.Word.InsertLocation.end): Range = js.native
  /**
    * Inserts HTML into the paragraph at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted in the paragraph.
    * @param insertLocation Required. The value must be 'Replace', 'Start', or 'End'.
    */
  def insertHtml(html: String, insertLocation: replace): Range = js.native
  def insertHtml(html: String, insertLocation: typings.officeJs.Word.InsertLocation.start): Range = js.native
  
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: Replace | Start | End): InlinePicture = js.native
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: typings.officeJs.Word.InsertLocation.end): InlinePicture = js.native
  /**
    * Inserts a picture into the paragraph at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted.
    * @param insertLocation Required. The value must be 'Replace', 'Start', or 'End'.
    */
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: replace): InlinePicture = js.native
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: typings.officeJs.Word.InsertLocation.start): InlinePicture = js.native
  
  def insertOoxml(ooxml: String, insertLocation: Replace | Start | End): Range = js.native
  def insertOoxml(ooxml: String, insertLocation: typings.officeJs.Word.InsertLocation.end): Range = js.native
  /**
    * Inserts OOXML into the paragraph at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted in the paragraph.
    * @param insertLocation Required. The value must be 'Replace', 'Start', or 'End'.
    */
  def insertOoxml(ooxml: String, insertLocation: replace): Range = js.native
  def insertOoxml(ooxml: String, insertLocation: typings.officeJs.Word.InsertLocation.start): Range = js.native
  
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
  
  def insertText(text: String, insertLocation: Replace | Start | End): Range = js.native
  def insertText(text: String, insertLocation: typings.officeJs.Word.InsertLocation.end): Range = js.native
  /**
    * Inserts text into the paragraph at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value must be 'Replace', 'Start', or 'End'.
    */
  def insertText(text: String, insertLocation: replace): Range = js.native
  def insertText(text: String, insertLocation: typings.officeJs.Word.InsertLocation.start): Range = js.native
  
  /**
    * Indicates the paragraph is the last one inside its parent body. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val isLastParagraph: Boolean = js.native
  
  /**
    * Checks whether the paragraph is a list item. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val isListItem: Boolean = js.native
  
  /**
    * Gets or sets the left indent value, in points, for the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var leftIndent: Double = js.native
  
  /**
    * Gets or sets the line spacing, in points, for the specified paragraph. In the Word UI, this value is divided by 12.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var lineSpacing: Double = js.native
  
  /**
    * Gets or sets the amount of spacing, in grid lines, after the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var lineUnitAfter: Double = js.native
  
  /**
    * Gets or sets the amount of spacing, in grid lines, before the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var lineUnitBefore: Double = js.native
  
  /**
    * Gets the List to which this paragraph belongs. Throws an error if the paragraph is not in a list. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val list: List = js.native
  
  /**
    * Gets the ListItem for the paragraph. Throws an error if the paragraph is not part of a list. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val listItem: ListItem = js.native
  
  /**
    * Gets the ListItem for the paragraph. Returns a null object if the paragraph is not part of a list. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val listItemOrNullObject: ListItem = js.native
  
  /**
    * Gets the List to which this paragraph belongs. Returns a null object if the paragraph is not in a list. Read-only.
    *
    * @remarks
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
    * Gets or sets the outline level for the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var outlineLevel: Double = js.native
  
  /**
    * Gets the parent body of the paragraph. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentBody: Body = js.native
  
  /**
    * Gets the content control that contains the paragraph. Throws an error if there isn't a parent content control. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val parentContentControl: ContentControl = js.native
  
  /**
    * Gets the content control that contains the paragraph. Returns a null object if there isn't a parent content control. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  
  /**
    * Gets the table that contains the paragraph. Throws an error if it is not contained in a table. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  
  /**
    * Gets the table cell that contains the paragraph. Throws an error if it is not contained in a table cell. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableCell: TableCell = js.native
  
  /**
    * Gets the table cell that contains the paragraph. Returns a null object if it is not contained in a table cell. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableCellOrNullObject: TableCell = js.native
  
  /**
    * Gets the table that contains the paragraph. Returns a null object if it is not contained in a table. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableOrNullObject: Table = js.native
  
  /**
    * Gets or sets the right indent value, in points, for the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var rightIndent: Double = js.native
  
  /**
    * Performs a search with the specified SearchOptions on the scope of the paragraph object. The search results are a collection of range objects.
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
    * Selects and navigates the Word UI to the paragraph.
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
  def set(properties: ParagraphUpdateData): Unit = js.native
  def set(properties: ParagraphUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Paragraph): Unit = js.native
  
  /**
    * Gets or sets the spacing, in points, after the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var spaceAfter: Double = js.native
  
  /**
    * Gets or sets the spacing, in points, before the paragraph.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var spaceBefore: Double = js.native
  
  /**
    * Splits the paragraph into child ranges by using delimiters.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param delimiters Required. The delimiters as an array of strings.
    * @param trimDelimiters Optional. Indicates whether to trim delimiters from the ranges in the range collection. Default is false which indicates that the delimiters are included in the ranges returned in the range collection.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
    */
  def split(delimiters: js.Array[String]): RangeCollection = js.native
  def split(delimiters: js.Array[String], trimDelimiters: Boolean): RangeCollection = js.native
  def split(delimiters: js.Array[String], trimDelimiters: Boolean, trimSpacing: Boolean): RangeCollection = js.native
  def split(delimiters: js.Array[String], trimDelimiters: Unit, trimSpacing: Boolean): RangeCollection = js.native
  
  /**
    * Starts a new list with this paragraph. Fails if the paragraph is already a list item.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def startNewList(): List = js.native
  
  /**
    * Gets or sets the style name for the paragraph. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var style: String = js.native
  
  /**
    * Gets or sets the built-in style name for the paragraph. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 149 */ Any = js.native
  
  /**
    * Gets the level of the paragraph's table. It returns 0 if the paragraph is not in a table. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val tableNestingLevel: Double = js.native
  
  /**
    * Gets the text of the paragraph. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val text: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Paragraph object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.ParagraphData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ParagraphData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): Paragraph = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Paragraph = js.native
}
