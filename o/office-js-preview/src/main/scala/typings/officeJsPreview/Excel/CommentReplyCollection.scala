package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.CommentReplyCollectionData
import typings.officeJsPreview.Excel.Interfaces.CommentReplyCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.officeJsPreviewStrings.Mention
import typings.officeJsPreview.officeJsPreviewStrings.Plain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of comment reply objects that are part of the comment.
  *
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.CommentReplyCollection")
@js.native
class CommentReplyCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CommentReplyCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[CommentReply] = js.native
  def add(content: String): CommentReply = js.native
  def add(content: String, contentType: ContentType): CommentReply = js.native
  /**
    * Creates a comment reply for comment.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param content The comment's content. This can be either a string or Interface CommentRichContent (e.g. for comments with mentions). [Api set: ExcelApi 1.10 for string, ExcelApiOnline 1.1 for CommentRichContent object]
    * @param contentType Optional. The type of content contained within the comment. The default value is enum `ContentType.Plain`. [Api set: ExcelApi 1.10 for Enum ContentType.Plain, ExcelApiOnline 1.1 for Enum ContentType.Mention]
    */
  def add(content: CommentRichContent): CommentReply = js.native
  def add(content: CommentRichContent, contentType: ContentType): CommentReply = js.native
  @JSName("add")
  def add_Mention(content: String, contentType: Mention): CommentReply = js.native
  @JSName("add")
  def add_Mention(content: CommentRichContent, contentType: Mention): CommentReply = js.native
  @JSName("add")
  def add_Plain(content: String, contentType: Plain): CommentReply = js.native
  @JSName("add")
  def add_Plain(content: CommentRichContent, contentType: Plain): CommentReply = js.native
  /**
    * Gets the number of comment replies in the collection.
    *
    * [Api set: ExcelApi 1.10]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    * Returns a comment reply identified by its ID. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param commentReplyId The identifier for the comment reply.
    */
  def getItem(commentReplyId: String): CommentReply = js.native
  /**
    * Gets a comment reply based on its position in the collection.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param index The index value of the comment reply to be retrieved. The collection uses zero-based indexing.
    */
  def getItemAt(index: Double): CommentReply = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CommentReplyCollection = js.native
  def load(options: CommentReplyCollectionLoadOptions with CollectionLoadOptions): CommentReplyCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): CommentReplyCollection = js.native
  def load(propertyNames: String): CommentReplyCollection = js.native
  def load(propertyNames: js.Array[String]): CommentReplyCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.CommentReplyCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CommentReplyCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): CommentReplyCollectionData = js.native
}

