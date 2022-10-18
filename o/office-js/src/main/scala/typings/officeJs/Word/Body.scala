package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Word.InsertLocation.replace
import typings.officeJs.Word.Interfaces.BodyData
import typings.officeJs.Word.Interfaces.BodyLoadOptions
import typings.officeJs.Word.Interfaces.BodyUpdateData
import typings.officeJs.Word.RangeLocation.after
import typings.officeJs.Word.RangeLocation.content
import typings.officeJs.Word.RangeLocation.end
import typings.officeJs.Word.RangeLocation.start
import typings.officeJs.Word.RangeLocation.whole
import typings.officeJs.anon.Expand
import typings.officeJs.anon.IgnorePunct
import typings.officeJs.officeJsStrings.After
import typings.officeJs.officeJsStrings.Content
import typings.officeJs.officeJsStrings.Current
import typings.officeJs.officeJsStrings.End
import typings.officeJs.officeJsStrings.Endnote
import typings.officeJs.officeJsStrings.Footer
import typings.officeJs.officeJsStrings.Footnote
import typings.officeJs.officeJsStrings.Header
import typings.officeJs.officeJsStrings.Line
import typings.officeJs.officeJsStrings.MainDoc
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
import typings.officeJs.officeJsStrings.Unknown_
import typings.officeJs.officeJsStrings.Whole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the body of a document or a section.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@js.native
trait Body
  extends StObject
     with ClientObject {
  
  /**
    * Clears the contents of the body object. The user can perform the undo operation on the cleared content.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def clear(): Unit = js.native
  
  /**
    * Gets the collection of rich text content control objects in the body.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val contentControls: ContentControlCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Body: RequestContext = js.native
  
  /**
    * Gets the collection of endnotes in the body.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  val endnotes: NoteItemCollection = js.native
  
  /**
    * Gets the collection of field objects in the body.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  val fields: FieldCollection = js.native
  
  /**
    * Gets the text format of the body. Use this to get and set font name, size, color and other properties.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val font: Font = js.native
  
  /**
    * Gets the collection of footnotes in the body.
    *
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  val footnotes: NoteItemCollection = js.native
  
  /**
    * Gets comments associated with the body.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  def getComments(): CommentCollection = js.native
  
  /**
    * Gets an HTML representation of the body object. When rendered in a web page or HTML viewer, the formatting will be a close, but not exact, match for of the formatting of the document. This method does not return the exact same HTML for the same document on different platforms (Windows, Mac, Word on the web, etc.). If you need exact fidelity, or consistency across platforms, use `Body.getOoxml()` and convert the returned XML to HTML.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def getHtml(): ClientResult[String] = js.native
  
  /**
    * Gets the OOXML (Office Open XML) representation of the body object.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def getOoxml(): ClientResult[String] = js.native
  
  /**
    * Gets the whole body, or the starting or ending point of the body, as a range.
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
    * Gets the collection of InlinePicture objects in the body. The collection does not include floating images.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val inlinePictures: InlinePictureCollection = js.native
  
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: Start | End
  ): Unit = js.native
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: typings.officeJs.Word.InsertLocation.end
  ): Unit = js.native
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: typings.officeJs.Word.InsertLocation.start
  ): Unit = js.native
  def insertBreak(breakType: BreakType, insertLocation: Start | End): Unit = js.native
  def insertBreak(breakType: BreakType, insertLocation: typings.officeJs.Word.InsertLocation.end): Unit = js.native
  /**
    * Inserts a break at the specified location in the main document.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param breakType Required. The break type to add to the body.
    * @param insertLocation Required. The value must be 'Start' or 'End'.
    */
  def insertBreak(breakType: BreakType, insertLocation: typings.officeJs.Word.InsertLocation.start): Unit = js.native
  
  /**
    * Wraps the body object with a Rich Text content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def insertContentControl(): ContentControl = js.native
  
  def insertFileFromBase64(base64File: String, insertLocation: Replace | Start | End): Range = js.native
  def insertFileFromBase64(base64File: String, insertLocation: Replace | Start | End, asNewParagraph: Boolean): Range = js.native
  def insertFileFromBase64(base64File: String, insertLocation: typings.officeJs.Word.InsertLocation.end): Range = js.native
  def insertFileFromBase64(
    base64File: String,
    insertLocation: typings.officeJs.Word.InsertLocation.end,
    asNewParagraph: Boolean
  ): Range = js.native
  /**
    * Inserts a document into the body at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value must be 'Replace', 'Start', or 'End'.
    * @param asNewParagraph Optional. Indicates whether to insert the content as new paragraphs. Default is false which indicates that the base64 content is merged as inline text into the existing paragraph.
    */
  def insertFileFromBase64(base64File: String, insertLocation: replace): Range = js.native
  def insertFileFromBase64(base64File: String, insertLocation: replace, asNewParagraph: Boolean): Range = js.native
  def insertFileFromBase64(base64File: String, insertLocation: typings.officeJs.Word.InsertLocation.start): Range = js.native
  def insertFileFromBase64(
    base64File: String,
    insertLocation: typings.officeJs.Word.InsertLocation.start,
    asNewParagraph: Boolean
  ): Range = js.native
  
  def insertHtml(html: String, insertLocation: Replace | Start | End): Range = js.native
  def insertHtml(html: String, insertLocation: typings.officeJs.Word.InsertLocation.end): Range = js.native
  /**
    * Inserts HTML at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted in the document.
    * @param insertLocation Required. The value must be 'Replace', 'Start', or 'End'.
    */
  def insertHtml(html: String, insertLocation: replace): Range = js.native
  def insertHtml(html: String, insertLocation: typings.officeJs.Word.InsertLocation.start): Range = js.native
  
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: Start | End): InlinePicture = js.native
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: typings.officeJs.Word.InsertLocation.end): InlinePicture = js.native
  /**
    * Inserts a picture into the body at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted in the body.
    * @param insertLocation Required. The value must be 'Start' or 'End'.
    */
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: typings.officeJs.Word.InsertLocation.start): InlinePicture = js.native
  
  def insertOoxml(ooxml: String, insertLocation: Replace | Start | End): Range = js.native
  def insertOoxml(ooxml: String, insertLocation: Replace | Start | End, asNewParagraph: Boolean): Range = js.native
  def insertOoxml(ooxml: String, insertLocation: typings.officeJs.Word.InsertLocation.end): Range = js.native
  def insertOoxml(ooxml: String, insertLocation: typings.officeJs.Word.InsertLocation.end, asNewParagraph: Boolean): Range = js.native
  /**
    * Inserts OOXML at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted.
    * @param insertLocation Required. The value must be 'Replace', 'Start', or 'End'.
    * @param asNewParagraph Optional. Indicates whether to insert the OOXML as new paragraphs. Default is false which indicates that the OOXML is merged as inline text into the existing paragraph.
    */
  def insertOoxml(ooxml: String, insertLocation: replace): Range = js.native
  def insertOoxml(ooxml: String, insertLocation: replace, asNewParagraph: Boolean): Range = js.native
  def insertOoxml(ooxml: String, insertLocation: typings.officeJs.Word.InsertLocation.start): Range = js.native
  def insertOoxml(ooxml: String, insertLocation: typings.officeJs.Word.InsertLocation.start, asNewParagraph: Boolean): Range = js.native
  
  def insertParagraph(paragraphText: String, insertLocation: Start | End): Paragraph = js.native
  def insertParagraph(paragraphText: String, insertLocation: typings.officeJs.Word.InsertLocation.end): Paragraph = js.native
  /**
    * Inserts a paragraph at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value must be 'Start' or 'End'.
    */
  def insertParagraph(paragraphText: String, insertLocation: typings.officeJs.Word.InsertLocation.start): Paragraph = js.native
  
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: Start | End): Table = js.native
  def insertTable(
    rowCount: Double,
    columnCount: Double,
    insertLocation: Start | End,
    values: js.Array[js.Array[String]]
  ): Table = js.native
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: typings.officeJs.Word.InsertLocation.end): Table = js.native
  def insertTable(
    rowCount: Double,
    columnCount: Double,
    insertLocation: typings.officeJs.Word.InsertLocation.end,
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
    * @param insertLocation Required. The value must be 'Start' or 'End'.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def insertTable(rowCount: Double, columnCount: Double, insertLocation: typings.officeJs.Word.InsertLocation.start): Table = js.native
  def insertTable(
    rowCount: Double,
    columnCount: Double,
    insertLocation: typings.officeJs.Word.InsertLocation.start,
    values: js.Array[js.Array[String]]
  ): Table = js.native
  
  def insertText(text: String, insertLocation: Replace | Start | End): Range = js.native
  def insertText(text: String, insertLocation: typings.officeJs.Word.InsertLocation.end): Range = js.native
  /**
    * Inserts text into the body at the specified location.
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
    * Gets the collection of list objects in the body.
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
  def load(): Body = js.native
  def load(options: BodyLoadOptions): Body = js.native
  def load(propertyNamesAndPaths: Expand): Body = js.native
  def load(propertyNames: String): Body = js.native
  def load(propertyNames: js.Array[String]): Body = js.native
  
  /**
    * Gets the collection of paragraph objects in the body. **Important**: Paragraphs in tables are not returned for requirement sets 1.1 and 1.2. From requirement set 1.3, paragraphs in tables are also returned.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val paragraphs: ParagraphCollection = js.native
  
  /**
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. Throws an `ItemNotFound` error if there isn't a parent body.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentBody: Body = js.native
  
  /**
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. If there isn't a parent body, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentBodyOrNullObject: Body = js.native
  
  /**
    * Gets the content control that contains the body. Throws an `ItemNotFound` error if there isn't a parent content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val parentContentControl: ContentControl = js.native
  
  /**
    * Gets the content control that contains the body. If there isn't a parent content control, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  
  /**
    * Gets the parent section of the body. Throws an `ItemNotFound` error if there isn't a parent section.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentSection: Section = js.native
  
  /**
    * Gets the parent section of the body. If there isn't a parent section, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentSectionOrNullObject: Section = js.native
  
  /**
    * Performs a search with the specified SearchOptions on the scope of the body object. The search results are a collection of range objects.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    *
    * @param searchText Required. The search text. Can be a maximum of 255 characters.
    * @param searchOptions Optional. Options for the search.
    */
  def search(searchText: String): RangeCollection = js.native
  def search(searchText: String, searchOptions: SearchOptions): RangeCollection = js.native
  def search(searchText: String, searchOptions: IgnorePunct): RangeCollection = js.native
  
  /**
    * Selects the body and navigates the Word UI to it.
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
  def set(properties: Body): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: BodyUpdateData): Unit = js.native
  def set(properties: BodyUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Gets or sets the style name for the body. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var style: String = js.native
  
  /**
    * Gets or sets the built-in style name for the body. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 149, starting with typings.officeJs.Word.Style, typings.officeJs.officeJsStrings.Other, typings.officeJs.officeJsStrings.Normal */ Any = js.native
  
  /**
    * Gets the collection of table objects in the body.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val tables: TableCollection = js.native
  
  /**
    * Gets the text of the body. Use the insertText method to insert text.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val text: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Body object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.BodyData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): BodyData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): Body = js.native
  
  /**
    * Gets the type of the body. The type can be 'MainDoc', 'Section', 'Header', 'Footer', or 'TableCell'. Additional types ‘Footnote’, ‘Endnote’, and ‘NoteItem’ are supported in WordApiOnline 1.1 and later.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val `type`: BodyType | Unknown_ | MainDoc | typings.officeJs.officeJsStrings.Section | Header | Footer | typings.officeJs.officeJsStrings.TableCell | Footnote | Endnote | typings.officeJs.officeJsStrings.NoteItem = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Body = js.native
}
