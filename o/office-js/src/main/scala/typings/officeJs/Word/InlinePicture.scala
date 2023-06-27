package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Word.InsertLocation.after
import typings.officeJs.Word.InsertLocation.before
import typings.officeJs.Word.InsertLocation.replace
import typings.officeJs.Word.Interfaces.InlinePictureData
import typings.officeJs.Word.Interfaces.InlinePictureLoadOptions
import typings.officeJs.Word.Interfaces.InlinePictureUpdateData
import typings.officeJs.Word.RangeLocation.end
import typings.officeJs.Word.RangeLocation.start
import typings.officeJs.Word.RangeLocation.whole
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.After
import typings.officeJs.officeJsStrings.Before
import typings.officeJs.officeJsStrings.End
import typings.officeJs.officeJsStrings.Line
import typings.officeJs.officeJsStrings.Next
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
  * Represents an inline picture.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@js.native
trait InlinePicture
  extends StObject
     with ClientObject {
  
  /**
    * Specifies a string that represents the alternative text associated with the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var altTextDescription: String = js.native
  
  /**
    * Specifies a string that contains the title for the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var altTextTitle: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_InlinePicture: RequestContext = js.native
  
  /**
    * Deletes the inline picture from the document.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the Base64-encoded string representation of the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def getBase64ImageSrc(): ClientResult[String] = js.native
  
  /**
    * Gets the next inline image. Throws an `ItemNotFound` error if this inline image is the last one.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getNext(): InlinePicture = js.native
  
  /**
    * Gets the next inline image. If this inline image is the last one, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  def getNextOrNullObject(): InlinePicture = js.native
  
  /**
    * Gets the picture, or the starting or ending point of the picture, as a range.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param rangeLocation Optional. The range location must be 'Whole', 'Start', or 'End'.
    */
  def getRange(): Range = js.native
  def getRange(rangeLocation: Whole | Start | End): Range = js.native
  def getRange(rangeLocation: end): Range = js.native
  def getRange(rangeLocation: start): Range = js.native
  def getRange(rangeLocation: whole): Range = js.native
  
  /**
    * Specifies a number that describes the height of the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var height: Double = js.native
  
  /**
    * Specifies a hyperlink on the image. Use a '#' to separate the address part from the optional location part.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var hyperlink: String = js.native
  
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: Before | After
  ): Unit = js.native
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: after
  ): Unit = js.native
  def insertBreak(
    breakType: Page | Next | SectionNext | SectionContinuous | SectionEven | SectionOdd | Line,
    insertLocation: before
  ): Unit = js.native
  def insertBreak(breakType: BreakType, insertLocation: Before | After): Unit = js.native
  def insertBreak(breakType: BreakType, insertLocation: after): Unit = js.native
  /**
    * Inserts a break at the specified location in the main document.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    *
    * @param breakType Required. The break type to add.
    * @param insertLocation Required. The value must be 'Before' or 'After'.
    */
  def insertBreak(breakType: BreakType, insertLocation: before): Unit = js.native
  
  /**
    * Wraps the inline picture with a rich text content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  def insertContentControl(): ContentControl = js.native
  
  def insertFileFromBase64(base64File: String, insertLocation: Before | After): Range = js.native
  def insertFileFromBase64(base64File: String, insertLocation: after): Range = js.native
  /**
    * Inserts a document at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    *
    * @param base64File Required. The Base64-encoded content of a .docx file.
    * @param insertLocation Required. The value must be 'Before' or 'After'.
    */
  def insertFileFromBase64(base64File: String, insertLocation: before): Range = js.native
  
  def insertHtml(html: String, insertLocation: Before | After): Range = js.native
  def insertHtml(html: String, insertLocation: after): Range = js.native
  /**
    * Inserts HTML at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    *
    * @param html Required. The HTML to be inserted.
    * @param insertLocation Required. The value must be 'Before' or 'After'.
    */
  def insertHtml(html: String, insertLocation: before): Range = js.native
  
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: Replace | Before | After): InlinePicture = js.native
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: after): InlinePicture = js.native
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: before): InlinePicture = js.native
  /**
    * Inserts an inline picture at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The Base64-encoded image to be inserted.
    * @param insertLocation Required. The value must be 'Replace', 'Before', or 'After'.
    */
  def insertInlinePictureFromBase64(base64EncodedImage: String, insertLocation: replace): InlinePicture = js.native
  
  def insertOoxml(ooxml: String, insertLocation: Before | After): Range = js.native
  def insertOoxml(ooxml: String, insertLocation: after): Range = js.native
  /**
    * Inserts OOXML at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    *
    * @param ooxml Required. The OOXML to be inserted.
    * @param insertLocation Required. The value must be 'Before' or 'After'.
    */
  def insertOoxml(ooxml: String, insertLocation: before): Range = js.native
  
  def insertParagraph(paragraphText: String, insertLocation: Before | After): Paragraph = js.native
  def insertParagraph(paragraphText: String, insertLocation: after): Paragraph = js.native
  /**
    * Inserts a paragraph at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value must be 'Before' or 'After'.
    */
  def insertParagraph(paragraphText: String, insertLocation: before): Paragraph = js.native
  
  def insertText(text: String, insertLocation: Before | After): Range = js.native
  def insertText(text: String, insertLocation: after): Range = js.native
  /**
    * Inserts text at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value must be 'Before' or 'After'.
    */
  def insertText(text: String, insertLocation: before): Range = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): InlinePicture = js.native
  def load(options: InlinePictureLoadOptions): InlinePicture = js.native
  def load(propertyNamesAndPaths: Expand): InlinePicture = js.native
  def load(propertyNames: String): InlinePicture = js.native
  def load(propertyNames: js.Array[String]): InlinePicture = js.native
  
  /**
    * Specifies a value that indicates whether the inline image retains its original proportions when you resize it.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var lockAspectRatio: Boolean = js.native
  
  /**
    * Gets the parent paragraph that contains the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    */
  val paragraph: Paragraph = js.native
  
  /**
    * Gets the content control that contains the inline image. Throws an `ItemNotFound` error if there isn't a parent content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  val parentContentControl: ContentControl = js.native
  
  /**
    * Gets the content control that contains the inline image. If there isn't a parent content control, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  
  /**
    * Gets the table that contains the inline image. Throws an `ItemNotFound` error if it is not contained in a table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  
  /**
    * Gets the table cell that contains the inline image. Throws an `ItemNotFound` error if it is not contained in a table cell.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableCell: TableCell = js.native
  
  /**
    * Gets the table cell that contains the inline image. If it is not contained in a table cell, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableCellOrNullObject: TableCell = js.native
  
  /**
    * Gets the table that contains the inline image. If it is not contained in a table, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val parentTableOrNullObject: Table = js.native
  
  /**
    * Selects the inline picture. This causes Word to scroll to the selection.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    *
    * @param selectionMode Optional. The selection mode must be 'Select', 'Start', or 'End'. 'Select' is the default.
    */
  def select(): Unit = js.native
  def select(selectionMode: Select | Start | End): Unit = js.native
  def select(selectionMode: SelectionMode): Unit = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: InlinePicture): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: InlinePictureUpdateData): Unit = js.native
  def set(properties: InlinePictureUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.InlinePicture object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.InlinePictureData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): InlinePictureData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): InlinePicture = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): InlinePicture = js.native
  
  /**
    * Specifies a number that describes the width of the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var width: Double = js.native
}
