package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.CommentCollectionData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.CommentCollectionLoadOptions
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientResult
import typings.officeDashJsDashPreview.OfficeExtensionNs.LoadOption
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Plain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of comment objects that are part of the workbook.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.CommentCollection")
@js.native
class CommentCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CommentCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Comment] = js.native
  def add(content: String, cellAddress: String): Comment = js.native
  def add(content: String, cellAddress: String, contentType: ContentType): Comment = js.native
  /**
    *
    * Creates a new comment (comment thread) with the given content on the given cell. An `InvalidArgument` error is thrown if the provided range is larger than one cell.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param content The comment content.
    * @param cellAddress The cell to which the comment is added. This can be a Range object or a string. If it's a string, it must contain the full address, including the sheet name. An `InvalidArgument` error is thrown if the provided range is larger than one cell.
    * @param contentType Optional. The type of the comment content
    */
  def add(content: String, cellAddress: Range): Comment = js.native
  def add(content: String, cellAddress: Range, contentType: ContentType): Comment = js.native
  @JSName("add")
  def add_Plain(content: String, cellAddress: String, contentType: Plain): Comment = js.native
  @JSName("add")
  def add_Plain(content: String, cellAddress: Range, contentType: Plain): Comment = js.native
  /**
    *
    * Gets the number of comments in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets a comment from the collection based on its ID. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param commentId The identifier for the comment.
    */
  def getItem(commentId: String): Comment = js.native
  /**
    *
    * Gets a comment from the collection based on its position.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): Comment = js.native
  def getItemByCell(cellAddress: String): Comment = js.native
  /**
    *
    * Gets the comment from the specifed cell.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param cellAddress The cell which the comment is on. This can be a Range object or a string. If it's a string, it must contain the full address, including the sheet name. An `InvalidArgument` error is thrown if the provided range is larger than one cell.
    */
  def getItemByCell(cellAddress: Range): Comment = js.native
  /**
    *
    * Gets a comment related to its reply ID in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param replyId The identifier of comment reply.
    */
  def getItemByReplyId(replyId: String): Comment = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.CommentCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.CommentCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.CommentCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CommentCollection = js.native
  def load(option: CommentCollectionLoadOptions with CollectionLoadOptions): CommentCollection = js.native
  def load(option: String): CommentCollection = js.native
  def load(option: js.Array[String]): CommentCollection = js.native
  def load(option: LoadOption): CommentCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.CommentCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CommentCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): CommentCollectionData = js.native
}

