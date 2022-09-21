package typings.officeJsPreview.Word

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.EventHandlers
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.Word.InsertLocation.after
import typings.officeJsPreview.Word.InsertLocation.before
import typings.officeJsPreview.Word.InsertLocation.end
import typings.officeJsPreview.Word.InsertLocation.replace
import typings.officeJsPreview.Word.InsertLocation.start
import typings.officeJsPreview.Word.Interfaces.ContentControlData
import typings.officeJsPreview.Word.Interfaces.ContentControlLoadOptions
import typings.officeJsPreview.Word.Interfaces.ContentControlUpdateData
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.anon.IgnorePunct
import typings.officeJsPreview.officeJsPreviewStrings.After
import typings.officeJsPreview.officeJsPreviewStrings.Before
import typings.officeJsPreview.officeJsPreviewStrings.BoundingBox
import typings.officeJsPreview.officeJsPreviewStrings.BuildingBlockGallery
import typings.officeJsPreview.officeJsPreviewStrings.CheckBox
import typings.officeJsPreview.officeJsPreviewStrings.ComboBox
import typings.officeJsPreview.officeJsPreviewStrings.Content
import typings.officeJsPreview.officeJsPreviewStrings.Current
import typings.officeJsPreview.officeJsPreviewStrings.DatePicker
import typings.officeJsPreview.officeJsPreviewStrings.DropDownList
import typings.officeJsPreview.officeJsPreviewStrings.End
import typings.officeJsPreview.officeJsPreviewStrings.Hidden
import typings.officeJsPreview.officeJsPreviewStrings.Line
import typings.officeJsPreview.officeJsPreviewStrings.Next
import typings.officeJsPreview.officeJsPreviewStrings.Original
import typings.officeJsPreview.officeJsPreviewStrings.Page
import typings.officeJsPreview.officeJsPreviewStrings.Picture
import typings.officeJsPreview.officeJsPreviewStrings.PlainText
import typings.officeJsPreview.officeJsPreviewStrings.PlainTextInline
import typings.officeJsPreview.officeJsPreviewStrings.PlainTextParagraph
import typings.officeJsPreview.officeJsPreviewStrings.RepeatingSection
import typings.officeJsPreview.officeJsPreviewStrings.Replace
import typings.officeJsPreview.officeJsPreviewStrings.RichText
import typings.officeJsPreview.officeJsPreviewStrings.RichTextInline
import typings.officeJsPreview.officeJsPreviewStrings.RichTextParagraphs
import typings.officeJsPreview.officeJsPreviewStrings.RichTextTable
import typings.officeJsPreview.officeJsPreviewStrings.RichTextTableCell
import typings.officeJsPreview.officeJsPreviewStrings.RichTextTableRow
import typings.officeJsPreview.officeJsPreviewStrings.SectionContinuous
import typings.officeJsPreview.officeJsPreviewStrings.SectionEven
import typings.officeJsPreview.officeJsPreviewStrings.SectionNext
import typings.officeJsPreview.officeJsPreviewStrings.SectionOdd
import typings.officeJsPreview.officeJsPreviewStrings.Select
import typings.officeJsPreview.officeJsPreviewStrings.Start
import typings.officeJsPreview.officeJsPreviewStrings.Tags
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.officeJsPreview.officeJsPreviewStrings.Whole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a content control. Content controls are bounded and potentially labeled regions in a document that serve as containers for specific types of content. Individual content controls may contain contents such as images, tables, or paragraphs of formatted text. Currently, only rich text content controls are supported.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@js.native
trait ContentControl
  extends StObject
     with ClientObject {
  
  /**
    * Gets or sets the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var appearance: ContentControlAppearance | BoundingBox | Tags | Hidden = js.native
  
  /**
    * Gets or sets a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var cannotDelete: Boolean = js.native
  
  /**
    * Gets or sets a value that indicates whether the user can edit the contents of the content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var cannotEdit: Boolean = js.native
  
  /**
    * Clears the contents of the content control. The user can perform the undo operation on the cleared content.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def clear(): Unit = js.native
  
  /**
    * Gets or sets the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var color: String = js.native
  
  /**
    * Gets the collection of content control objects in the content control. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val contentControls: ContentControlCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ContentControl: RequestContext = js.native
  
  /**
    * Deletes the content control and its content. If keepContent is set to true, the content is not deleted.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param keepContent Required. Indicates whether the content should be deleted with the content control. If keepContent is set to true, the content is not deleted.
    */
  def delete(keepContent: Boolean): Unit = js.native
  
  /**
    * Gets the collection of endnotes in the contentcontrol. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  val endnotes: NoteItemCollection = js.native
  
  /**
    * Gets the collection of field objects in the contentcontrol. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  val fields: FieldCollection = js.native
  
  /**
    * Gets the text format of the content control. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val font: Font = js.native
  
  /**
    * Gets the collection of footnotes in the contentcontrol. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  val footnotes: NoteItemCollection = js.native
  
  /**
    * Gets comments associated with the content control.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  def getComments(): CommentCollection = js.native
  
  /**
    * Gets an HTML representation of the content control object. When rendered in a web page or HTML viewer, the formatting will be a close, but not exact, match for of the formatting of the document. This method does not return the exact same HTML for the same document on different platforms (Windows, Mac, Word on the web, etc.). If you need exact fidelity, or consistency across platforms, use `ContentControl.getOoxml()` and convert the returned XML to HTML.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def getHtml(): ClientResult[String] = js.native
  
  /**
    * Gets the Office Open XML (OOXML) representation of the content control object.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def getOoxml(): ClientResult[String] = js.native
  
  /**
    * Gets the whole content control, or the starting or ending point of the content control, as a range.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param rangeLocation Optional. The range location must be 'Whole', 'Start', 'End', 'Before', 'After', or 'Content'.
    */
  def getRange(): Range = js.native
  def getRange(rangeLocation: Whole | Start | End | Before | After | Content): Range = js.native
  def getRange(rangeLocation: RangeLocation): Range = js.native
  
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
    * Gets the text ranges in the content control by using punctuation marks and/or other ending marks.
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
    * Gets an integer that represents the content control identifier. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val id: Double = js.native
  
  /**
    * Gets the collection of inlinePicture objects in the content control. The collection does not include floating images. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val inlinePictures: InlinePictureCollection = js.native
  
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: Start | End | Before | After
  ): Unit = js.native
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: after
  ): Unit = js.native
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: before
  ): Unit = js.native
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: end
  ): Unit = js.native
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: start
  ): Unit = js.native
  def insertBreak(breakType: BreakType, insertLocation: Start | End | Before | After): Unit = js.native
  def insertBreak(breakType: BreakType, insertLocation: after): Unit = js.native
  def insertBreak(breakType: BreakType, insertLocation: before): Unit = js.native
  def insertBreak(breakType: BreakType, insertLocation: end): Unit = js.native
  /**
    * Inserts a break at the specified location in the main document. This method cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param breakType Required. Type of break.
    * @param insertLocation Required. The value must be 'Start', 'End', 'Before', or 'After'.
    */
  def insertBreak(breakType: BreakType, insertLocation: start): Unit = js.native
  
  def insertFileFromBase64(base64File: String, insertLocation: Replace | Start | End): Range = js.native
  def insertFileFromBase64(base64File: String, insertLocation: end): Range = js.native
  /**
    * Inserts a document into the content control at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value must be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  def insertFileFromBase64(base64File: String, insertLocation: replace): Range = js.native
  def insertFileFromBase64(base64File: String, insertLocation: start): Range = js.native
  
  def insertHtml(html: String, insertLocation: Replace | Start | End): Range = js.native
  def insertHtml(html: String, insertLocation: end): Range = js.native
  /**
    * Inserts HTML into the content control at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted in to the content control.
    * @param insertLocation Required. The value must be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  def insertHtml(html: String, insertLocation: replace): Range = js.native
  def insertHtml(html: String, insertLocation: start): Range = js.native
  
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: Replace | Start | End): InlinePicture = js.native
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: end): InlinePicture = js.native
  /**
    * Inserts an inline picture into the content control at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted in the content control.
    * @param insertLocation Required. The value must be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: replace): InlinePicture = js.native
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: start): InlinePicture = js.native
  
  def insertOoxml(ooxml: String, insertLocation: Replace | Start | End): Range = js.native
  def insertOoxml(ooxml: String, insertLocation: end): Range = js.native
  /**
    * Inserts OOXML into the content control at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted in to the content control.
    * @param insertLocation Required. The value must be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  def insertOoxml(ooxml: String, insertLocation: replace): Range = js.native
  def insertOoxml(ooxml: String, insertLocation: start): Range = js.native
  
  def insertParagraph(paragraphText: String, insertLocation: Start | End | Before | After): Paragraph = js.native
  def insertParagraph(paragraphText: String, insertLocation: after): Paragraph = js.native
  def insertParagraph(paragraphText: String, insertLocation: before): Paragraph = js.native
  def insertParagraph(paragraphText: String, insertLocation: end): Paragraph = js.native
  /**
    * Inserts a paragraph at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value must be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
    */
  def insertParagraph(paragraphText: String, insertLocation: start): Paragraph = js.native
  
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: Start | End | Before | After): Table = js.native
  def insertTable(
    rowCount: Double,
    columnCount: Double,
    insertLocation: Start | End | Before | After,
    values: js.Array[js.Array[String]]
  ): Table = js.native
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: after): Table = js.native
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: after, values: js.Array[js.Array[String]]): Table = js.native
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: before): Table = js.native
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: before, values: js.Array[js.Array[String]]): Table = js.native
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: end): Table = js.native
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: end, values: js.Array[js.Array[String]]): Table = js.native
  /**
    * Inserts a table with the specified number of rows and columns into, or next to, a content control.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param insertLocation Required. The value must be 'Start', 'End', 'Before', or 'After'. 'Before' and 'After' cannot be used with 'RichTextTable', 'RichTextTableRow' and 'RichTextTableCell' content controls.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: start): Table = js.native
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: start, values: js.Array[js.Array[String]]): Table = js.native
  
  def insertText(text: String, insertLocation: Replace | Start | End): Range = js.native
  def insertText(text: String, insertLocation: end): Range = js.native
  /**
    * Inserts text into the content control at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param text Required. The text to be inserted in to the content control.
    * @param insertLocation Required. The value must be 'Replace', 'Start', or 'End'. 'Replace' cannot be used with 'RichTextTable' and 'RichTextTableRow' content controls.
    */
  def insertText(text: String, insertLocation: replace): Range = js.native
  def insertText(text: String, insertLocation: start): Range = js.native
  
  /**
    * Gets the collection of list objects in the content control. Read-only.
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
  def load(): ContentControl = js.native
  def load(options: ContentControlLoadOptions): ContentControl = js.native
  def load(propertyNamesAndPaths: Expand): ContentControl = js.native
  def load(propertyNames: String): ContentControl = js.native
  def load(propertyNames: js.Array[String]): ContentControl = js.native
  
  /**
    * Occurs when data within the content control are changed. To get the new text, load this content control in the handler. To get the old text, do not load it.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onDataChanged: EventHandlers[ContentControlEventArgs] = js.native
  
  /**
    * Occurs when the content control is deleted. Do not load this content control in the handler, otherwise you won't be able to get its original properties.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onDeleted: EventHandlers[ContentControlEventArgs] = js.native
  
  /**
    * Occurs when selection within the content control is changed.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onSelectionChanged: EventHandlers[ContentControlEventArgs] = js.native
  
  /**
    * Gets the collection of paragraph objects in the content control. Read-only. **Important**: For requirement sets 1.1 and 1.2, paragraphs in tables wholly contained within this content control are not returned. From requirement set 1.3, paragraphs in such tables are also returned.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val paragraphs: ParagraphCollection = js.native
  
  /**
    * Gets the parent body of the content control. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentBody: Body = js.native
  
  /**
    * Gets the content control that contains the content control. Throws an error if there isn't a parent content control. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val parentContentControl: ContentControl = js.native
  
  /**
    * Gets the content control that contains the content control. Returns a null object if there isn't a parent content control. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  
  /**
    * Gets the table that contains the content control. Throws an error if it is not contained in a table. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  
  /**
    * Gets the table cell that contains the content control. Throws an error if it is not contained in a table cell. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableCell: TableCell = js.native
  
  /**
    * Gets the table cell that contains the content control. Returns a null object if it is not contained in a table cell. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableCellOrNullObject: TableCell = js.native
  
  /**
    * Gets the table that contains the content control. Returns a null object if it is not contained in a table. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableOrNullObject: Table = js.native
  
  /**
    * Gets or sets the placeholder text of the content control. Dimmed text will be displayed when the content control is empty.
    * **Note**: The set operation for this property is not supported in Word on the web.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var placeholderText: String = js.native
  
  /**
    * Gets or sets a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var removeWhenEdited: Boolean = js.native
  
  /**
    * Performs a search with the specified SearchOptions on the scope of the content control object. The search results are a collection of range objects.
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
    * Selects the content control. This causes Word to scroll to the selection.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param selectionMode Optional. The selection mode must be 'Select', 'Start', or 'End'. 'Select' is the default.
    */
  def select(): Unit = js.native
  def select(selectionMode: Select | Start | End): Unit = js.native
  def select(selectionMode: SelectionMode): Unit = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ContentControl): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ContentControlUpdateData): Unit = js.native
  def set(properties: ContentControlUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Splits the content control into child ranges by using delimiters.
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
    * Gets or sets the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var style: String = js.native
  
  /**
    * Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 149 */ Any = js.native
  
  /**
    * Gets the content control subtype. The subtype can be 'RichTextInline', 'RichTextParagraphs', 'RichTextTableCell', 'RichTextTableRow' and 'RichTextTable' for rich text content controls. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val subtype: ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText = js.native
  
  /**
    * Gets the collection of table objects in the content control. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val tables: TableCollection = js.native
  
  /**
    * Gets or sets a tag to identify a content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var tag: String = js.native
  
  /**
    * Gets the text of the content control. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val text: String = js.native
  
  /**
    * Gets or sets the title for a content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var title: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.ContentControl object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.ContentControlData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ContentControlData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): ContentControl = js.native
  
  /**
    * Gets the content control type. Only rich text content controls are supported currently. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val `type`: ContentControlType | Unknown_ | RichTextInline | RichTextParagraphs | RichTextTableCell | RichTextTableRow | RichTextTable | PlainTextInline | PlainTextParagraph | Picture | BuildingBlockGallery | CheckBox | ComboBox | DropDownList | DatePicker | RepeatingSection | RichText | PlainText = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): ContentControl = js.native
}
