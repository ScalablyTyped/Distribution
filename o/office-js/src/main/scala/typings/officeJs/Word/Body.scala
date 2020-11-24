package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Word.Interfaces.BodyData
import typings.officeJs.Word.Interfaces.BodyLoadOptions
import typings.officeJs.Word.Interfaces.BodyUpdateData
import typings.officeJs.anon.Expand
import typings.officeJs.anon.IgnorePunct
import typings.officeJs.officeJsStrings.After
import typings.officeJs.officeJsStrings.Before
import typings.officeJs.officeJsStrings.Content
import typings.officeJs.officeJsStrings.End
import typings.officeJs.officeJsStrings.Footer
import typings.officeJs.officeJsStrings.Header
import typings.officeJs.officeJsStrings.Line
import typings.officeJs.officeJsStrings.MainDoc
import typings.officeJs.officeJsStrings.Next
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the body of a document or a section.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait Body extends ClientObject {
  
  /**
    * Clears the contents of the body object. The user can perform the undo operation on the cleared content.
    *
    * [Api set: WordApi 1.1]
    */
  def clear(): Unit = js.native
  
  /**
    *
    * Gets the collection of rich text content control objects in the body. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val contentControls: ContentControlCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Body: RequestContext = js.native
  
  /**
    *
    * Gets the text format of the body. Use this to get and set font name, size, color and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val font: Font = js.native
  
  /**
    * Gets an HTML representation of the body object. When rendered in a web page or HTML viewer, the formatting will be a close, but not exact, match for of the formatting of the document. This method does not return the exact same HTML for the same document on different platforms (Windows, Mac, Word for the web, etc.). If you need exact fidelity, or consistency across platforms, use `Body.getOoxml()` and convert the returned XML to HTML.
    *
    * [Api set: WordApi 1.1]
    */
  def getHtml(): ClientResult[String] = js.native
  
  /**
    * Gets the OOXML (Office Open XML) representation of the body object.
    *
    * [Api set: WordApi 1.1]
    */
  def getOoxml(): ClientResult[String] = js.native
  
  /**
    * Gets the whole body, or the starting or ending point of the body, as a range.
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
    * Gets the collection of InlinePicture objects in the body. The collection does not include floating images. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val inlinePictures: InlinePictureCollection = js.native
  
  /**
    * Inserts a break at the specified location in the main document.
    *
    * [Api set: WordApi 1.1]
    *
    * @param breakType Required. The break type to add to the body.
    * @param insertLocation Required. The value can be 'Start' or 'End'.
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
    * @param breakType Required. The break type to add to the body.
    * @param insertLocation Required. The value can be 'Start' or 'End'.
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
    * Wraps the body object with a Rich Text content control.
    *
    * [Api set: WordApi 1.1]
    */
  def insertContentControl(): ContentControl = js.native
  
  /**
    * Inserts a document into the body at the specified location.
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
    * Inserts a document into the body at the specified location.
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
    * Inserts HTML at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted in the document.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  def insertHtml(html: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertHtml")
  def insertHtml_After(html: String, insertLocation: After): Range = js.native
  /**
    * Inserts HTML at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted in the document.
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
    * Inserts a picture into the body at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted in the body.
    * @param insertLocation Required. The value can be 'Start' or 'End'.
    */
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: InsertLocation): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_After(base64EncodedImage: String, insertLocation: After): InlinePicture = js.native
  /**
    * Inserts a picture into the body at the specified location.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted in the body.
    * @param insertLocation Required. The value can be 'Start' or 'End'.
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
    * Inserts OOXML at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', or 'End'.
    */
  def insertOoxml(ooxml: String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_After(ooxml: String, insertLocation: After): Range = js.native
  /**
    * Inserts OOXML at the specified location.
    *
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted.
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
    * @param insertLocation Required. The value can be 'Start' or 'End'.
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
    * @param insertLocation Required. The value can be 'Start' or 'End'.
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
    * @param insertLocation Required. The value can be 'Start' or 'End'.
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
    * @param insertLocation Required. The value can be 'Start' or 'End'.
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
    * Inserts text into the body at the specified location.
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
    * Inserts text into the body at the specified location.
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
    * Gets the collection of list objects in the body. Read-only.
    *
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
    *
    * Gets the collection of paragraph objects in the body. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val paragraphs: ParagraphCollection = js.native
  
  /**
    *
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. Throws an error if there isn't a parent body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentBody: Body = js.native
  
  /**
    *
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. Returns a null object if there isn't a parent body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentBodyOrNullObject: Body = js.native
  
  /**
    *
    * Gets the content control that contains the body. Throws an error if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val parentContentControl: ContentControl = js.native
  
  /**
    *
    * Gets the content control that contains the body. Returns a null object if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  
  /**
    *
    * Gets the parent section of the body. Throws an error if there isn't a parent section. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentSection: Section = js.native
  
  /**
    *
    * Gets the parent section of the body. Returns a null object if there isn't a parent section. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentSectionOrNullObject: Section = js.native
  
  /**
    * Performs a search with the specified SearchOptions on the scope of the body object. The search results are a collection of range objects.
    *
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
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Body): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.Body): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: BodyUpdateData): Unit = js.native
  def set(properties: BodyUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    *
    * Gets or sets the style name for the body. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: String = js.native
  
  /**
    *
    * Gets or sets the built-in style name for the body. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 149 */ js.Any = js.native
  
  /**
    *
    * Gets the collection of table objects in the body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val tables: TableCollection = js.native
  
  /**
    *
    * Gets the text of the body. Use the insertText method to insert text. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val text: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Body object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.BodyData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): BodyData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Body = js.native
  
  /**
    *
    * Gets the type of the body. The type can be 'MainDoc', 'Section', 'Header', 'Footer', or 'TableCell'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val `type`: BodyType | Unknown_ | MainDoc | typings.officeJs.officeJsStrings.Section | Header | Footer | typings.officeJs.officeJsStrings.TableCell = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Body = js.native
}
