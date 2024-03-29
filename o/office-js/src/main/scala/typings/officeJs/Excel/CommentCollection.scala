package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.Excel.Interfaces.CommentCollectionData
import typings.officeJs.Excel.Interfaces.CommentCollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.EventHandlers
import typings.officeJs.OfficeExtension.LoadOption
import typings.officeJs.officeJsStrings.Mention
import typings.officeJs.officeJsStrings.Plain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of comment objects that are part of the workbook.
  *
  * @remarks
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait CommentCollection
  extends StObject
     with ClientObject {
  
  def add(cellAddress: String, content: String): Comment = js.native
  def add(cellAddress: String, content: String, contentType: Plain | Mention): Comment = js.native
  def add(cellAddress: String, content: String, contentType: ContentType): Comment = js.native
  def add(cellAddress: String, content: CommentRichContent): Comment = js.native
  def add(cellAddress: String, content: CommentRichContent, contentType: Plain | Mention): Comment = js.native
  def add(cellAddress: String, content: CommentRichContent, contentType: ContentType): Comment = js.native
  def add(cellAddress: Range, content: String): Comment = js.native
  def add(cellAddress: Range, content: String, contentType: Plain | Mention): Comment = js.native
  def add(cellAddress: Range, content: String, contentType: ContentType): Comment = js.native
  /**
    * Creates a new comment with the given content on the given cell. An `InvalidArgument` error is thrown if the provided range is larger than one cell.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @param cellAddress The cell to which the comment is added. This can be a `Range` object or a string. If it's a string, it must contain the full address, including the sheet name. An `InvalidArgument` error is thrown if the provided range is larger than one cell.
    * @param content The comment's content. This can be either a string or `CommentRichContent` object. Strings are used for plain text. `CommentRichContent` objects allow for other comment features, such as mentions. [Api set: ExcelApi 1.10 for string, 1.11 for CommentRichContent object]
    * @param contentType Optional. The type of content contained within the comment. The default value is enum `ContentType.Plain`. [Api set: ExcelApi 1.10 for Enum ContentType.Plain, 1.11 for Enum ContentType.Mention]
    */
  def add(cellAddress: Range, content: CommentRichContent): Comment = js.native
  def add(cellAddress: Range, content: CommentRichContent, contentType: Plain | Mention): Comment = js.native
  def add(cellAddress: Range, content: CommentRichContent, contentType: ContentType): Comment = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CommentCollection: RequestContext = js.native
  
  /**
    * Gets the number of comments in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a comment from the collection based on its ID.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @param commentId The identifier for the comment.
    */
  def getItem(commentId: String): Comment = js.native
  
  /**
    * Gets a comment from the collection based on its position.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): Comment = js.native
  
  def getItemByCell(cellAddress: String): Comment = js.native
  /**
    * Gets the comment from the specified cell.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @param cellAddress The cell which the comment is on. This can be a `Range` object or a string. If it's a string, it must contain the full address, including the sheet name. An `InvalidArgument` error is thrown if the provided range is larger than one cell.
    */
  def getItemByCell(cellAddress: Range): Comment = js.native
  
  /**
    * Gets the comment to which the given reply is connected.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @param replyId The identifier of comment reply.
    */
  def getItemByReplyId(replyId: String): Comment = js.native
  
  /**
    * Gets a comment from the collection based on its ID.
    If the comment object does not exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties  | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    *
    * @param commentId The identifier for the comment.
    */
  def getItemOrNullObject(commentId: String): Comment = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Comment] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CommentCollection = js.native
  def load(options: CommentCollectionLoadOptions & CollectionLoadOptions): CommentCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): CommentCollection = js.native
  def load(propertyNames: String): CommentCollection = js.native
  def load(propertyNames: js.Array[String]): CommentCollection = js.native
  
  /**
    * Occurs when the comments are added.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    *
    * @eventproperty
    */
  val onAdded: EventHandlers[CommentAddedEventArgs] = js.native
  
  /**
    * Occurs when comments or replies in a comment collection are changed, including when replies are deleted.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    *
    * @eventproperty
    */
  val onChanged: EventHandlers[CommentChangedEventArgs] = js.native
  
  /**
    * Occurs when comments are deleted in the comment collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    *
    * @eventproperty
    */
  val onDeleted: EventHandlers[CommentDeletedEventArgs] = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.CommentCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CommentCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): CommentCollectionData = js.native
}
