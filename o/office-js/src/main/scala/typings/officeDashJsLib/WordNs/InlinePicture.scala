package typings
package officeDashJsLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an inline picture.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.InlinePicture")
@js.native
class InlinePicture ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets or sets a string that represents the alternative text associated with the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextDescription: java.lang.String = js.native
  /**
    *
    * Gets or sets a string that contains the title for the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextTitle: java.lang.String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_InlinePicture: RequestContext = js.native
  /**
    *
    * Gets or sets a number that describes the height of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var height: scala.Double = js.native
  /**
    *
    * Gets or sets a hyperlink on the image. Use a '#' to separate the address part from the optional location part.
    *
    * [Api set: WordApi 1.1]
    */
  var hyperlink: java.lang.String = js.native
  /**
    *
    * Gets or sets a value that indicates whether the inline image retains its original proportions when you resize it.
    *
    * [Api set: WordApi 1.1]
    */
  var lockAspectRatio: scala.Boolean = js.native
  /**
    *
    * Gets the parent paragraph that contains the inline image. Read-only.
    *
    * [Api set: WordApi 1.2]
    */
  val paragraph: Paragraph = js.native
  /**
    *
    * Gets the content control that contains the inline image. Throws if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val parentContentControl: ContentControl = js.native
  /**
    *
    * Gets the content control that contains the inline image. Returns a null object if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  /**
    *
    * Gets the table that contains the inline image. Throws if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  /**
    *
    * Gets the table cell that contains the inline image. Throws if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableCell: TableCell = js.native
  /**
    *
    * Gets the table cell that contains the inline image. Returns a null object if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableCellOrNullObject: TableCell = js.native
  /**
    *
    * Gets the table that contains the inline image. Returns a null object if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableOrNullObject: Table = js.native
  /**
    *
    * Gets or sets a number that describes the width of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var width: scala.Double = js.native
  /**
    *
    * Deletes the inline picture from the document.
    *
    * [Api set: WordApi 1.2]
    */
  def delete(): scala.Unit = js.native
  /**
    *
    * Gets the base64 encoded string representation of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  def getBase64ImageSrc(): officeDashJsLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
    *
    * Gets the next inline image. Throws if this inline image is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNext(): InlinePicture = js.native
  /**
    *
    * Gets the next inline image. Returns a null object if this inline image is the last one.
    *
    * [Api set: WordApi 1.3]
    */
  def getNextOrNullObject(): InlinePicture = js.native
  /**
    *
    * Gets the picture, or the starting or ending point of the picture, as a range.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rangeLocation Optional. The range location can be 'Whole', 'Start', or 'End'.
    */
  def getRange(): Range = js.native
  def getRange(rangeLocation: RangeLocation): Range = js.native
  @JSName("getRange")
  def getRange_After(rangeLocation: officeDashJsLib.officeDashJsLibStrings.After): Range = js.native
  @JSName("getRange")
  def getRange_Before(rangeLocation: officeDashJsLib.officeDashJsLibStrings.Before): Range = js.native
  @JSName("getRange")
  def getRange_Content(rangeLocation: officeDashJsLib.officeDashJsLibStrings.Content): Range = js.native
  @JSName("getRange")
  def getRange_End(rangeLocation: officeDashJsLib.officeDashJsLibStrings.End): Range = js.native
  @JSName("getRange")
  def getRange_Start(rangeLocation: officeDashJsLib.officeDashJsLibStrings.Start): Range = js.native
  @JSName("getRange")
  def getRange_Whole(rangeLocation: officeDashJsLib.officeDashJsLibStrings.Whole): Range = js.native
  /**
    *
    * Inserts a break at the specified location in the main document. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param breakType Required. The break type to add.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertBreak(
    breakType: officeDashJsLib.officeDashJsLibStrings.Page | officeDashJsLib.officeDashJsLibStrings.Next | officeDashJsLib.officeDashJsLibStrings.SectionNext | officeDashJsLib.officeDashJsLibStrings.SectionContinuous | officeDashJsLib.officeDashJsLibStrings.SectionEven | officeDashJsLib.officeDashJsLibStrings.SectionOdd | officeDashJsLib.officeDashJsLibStrings.Line,
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Before | officeDashJsLib.officeDashJsLibStrings.After | officeDashJsLib.officeDashJsLibStrings.Start | officeDashJsLib.officeDashJsLibStrings.End | officeDashJsLib.officeDashJsLibStrings.Replace
  ): scala.Unit = js.native
  /**
    *
    * Inserts a break at the specified location in the main document. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param breakType Required. The break type to add.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertBreak(breakType: BreakType, insertLocation: InsertLocation): scala.Unit = js.native
  /**
    *
    * Wraps the inline picture with a rich text content control.
    *
    * [Api set: WordApi 1.1]
    */
  def insertContentControl(): ContentControl = js.native
  /**
    *
    * Inserts a document at the specified location. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertFileFromBase64(base64File: java.lang.String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_After(base64File: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.After): Range = js.native
  /**
    *
    * Inserts a document at the specified location. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Before(base64File: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Before): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_End(base64File: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.End): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Replace(base64File: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Start(base64File: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Start): Range = js.native
  /**
    *
    * Inserts HTML at the specified location. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param html Required. The HTML to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertHtml(html: java.lang.String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertHtml")
  def insertHtml_After(html: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.After): Range = js.native
  /**
    *
    * Inserts HTML at the specified location. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param html Required. The HTML to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  @JSName("insertHtml")
  def insertHtml_Before(html: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Before): Range = js.native
  @JSName("insertHtml")
  def insertHtml_End(html: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.End): Range = js.native
  @JSName("insertHtml")
  def insertHtml_Replace(html: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace): Range = js.native
  @JSName("insertHtml")
  def insertHtml_Start(html: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Start): Range = js.native
  /**
    *
    * Inserts an inline picture at the specified location. The insertLocation value can be 'Replace', 'Before', or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Before', or 'After'.
    */
  def insertInlinePictureFromBase64(base64EncodedImage: java.lang.String, insertLocation: InsertLocation): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_After(base64EncodedImage: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.After): InlinePicture = js.native
  /**
    *
    * Inserts an inline picture at the specified location. The insertLocation value can be 'Replace', 'Before', or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Before', or 'After'.
    */
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Before(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Before
  ): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_End(base64EncodedImage: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.End): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Replace(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace
  ): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Start(base64EncodedImage: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Start): InlinePicture = js.native
  /**
    *
    * Inserts OOXML at the specified location.  The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param ooxml Required. The OOXML to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertOoxml(ooxml: java.lang.String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_After(ooxml: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.After): Range = js.native
  /**
    *
    * Inserts OOXML at the specified location.  The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param ooxml Required. The OOXML to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  @JSName("insertOoxml")
  def insertOoxml_Before(ooxml: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Before): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_End(ooxml: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.End): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_Replace(ooxml: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_Start(ooxml: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Start): Range = js.native
  /**
    *
    * Inserts a paragraph at the specified location. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertParagraph(paragraphText: java.lang.String, insertLocation: InsertLocation): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_After(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.After): Paragraph = js.native
  /**
    *
    * Inserts a paragraph at the specified location. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  @JSName("insertParagraph")
  def insertParagraph_Before(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Before): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_End(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.End): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Replace(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Start(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Start): Paragraph = js.native
  /**
    *
    * Inserts text at the specified location. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertText(text: java.lang.String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertText")
  def insertText_After(text: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.After): Range = js.native
  /**
    *
    * Inserts text at the specified location. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  @JSName("insertText")
  def insertText_Before(text: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Before): Range = js.native
  @JSName("insertText")
  def insertText_End(text: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.End): Range = js.native
  @JSName("insertText")
  def insertText_Replace(text: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace): Range = js.native
  @JSName("insertText")
  def insertText_Start(text: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Start): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.InlinePicture` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.InlinePicture` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.InlinePicture` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): InlinePicture = js.native
  def load(option: java.lang.String): InlinePicture = js.native
  def load(option: js.Array[java.lang.String]): InlinePicture = js.native
  def load(option: officeDashJsLib.Anon_Expand): InlinePicture = js.native
  def load(option: officeDashJsLib.WordNs.InterfacesNs.InlinePictureLoadOptions): InlinePicture = js.native
  /**
    *
    * Selects the inline picture. This causes Word to scroll to the selection.
    *
    * [Api set: WordApi 1.2]
    *
    * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
    */
  def select(): scala.Unit = js.native
  def select(selectionMode: SelectionMode): scala.Unit = js.native
  @JSName("select")
  def select_End(selectionMode: officeDashJsLib.officeDashJsLibStrings.End): scala.Unit = js.native
  @JSName("select")
  def select_Select(selectionMode: officeDashJsLib.officeDashJsLibStrings.Select): scala.Unit = js.native
  @JSName("select")
  def select_Start(selectionMode: officeDashJsLib.officeDashJsLibStrings.Start): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: InlinePicture): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.InlinePicture): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.WordNs.InterfacesNs.InlinePictureUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.WordNs.InterfacesNs.InlinePictureUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  def toJSON(): officeDashJsLib.WordNs.InterfacesNs.InlinePictureData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): InlinePicture = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): InlinePicture = js.native
}

