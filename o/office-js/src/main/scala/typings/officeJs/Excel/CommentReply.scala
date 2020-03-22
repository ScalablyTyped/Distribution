package typings.officeJs.Excel

import typings.officeJs.AnonExpand
import typings.officeJs.Excel.Interfaces.CommentReplyData
import typings.officeJs.Excel.Interfaces.CommentReplyLoadOptions
import typings.officeJs.Excel.Interfaces.CommentReplyUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a comment reply in the workbook.
  *
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.CommentReply")
@js.native
class CommentReply () extends ClientObject {
  /**
    *
    * Gets the email of the comment reply's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  val authorEmail: String = js.native
  /**
    *
    * Gets the name of the comment reply's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  val authorName: String = js.native
  /**
    *
    * Gets or sets the comment reply's content. The string is plain text.
    *
    * [Api set: ExcelApi 1.10]
    */
  var content: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CommentReply: RequestContext = js.native
  /**
    *
    * Gets the creation time of the comment reply.
    *
    * [Api set: ExcelApi 1.10]
    */
  val creationDate: Date = js.native
  /**
    *
    * Represents the comment reply identifier. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  val id: String = js.native
  /**
    *
    * Gets the entities (e.g. people) that are mentioned in comments.
    *
    * [Api set: ExcelApiOnline 1.1]
    */
  val mentions: js.Array[CommentMention] = js.native
  /**
    *
    * Gets the rich comment content (e.g. mentions in comments). This string is not meant to be displayed to end-users. Your add-in should only use this to parse rich comment content.
    *
    * [Api set: ExcelApiOnline 1.1]
    */
  val richContent: String = js.native
  /**
    * Deletes the comment reply.
    *
    * [Api set: ExcelApi 1.10]
    */
  def delete(): Unit = js.native
  /**
    * Gets the cell where this comment reply is located.
    *
    * [Api set: ExcelApi 1.10]
    */
  def getLocation(): Range = js.native
  /**
    * Gets the parent comment of this reply.
    *
    * [Api set: ExcelApi 1.10]
    */
  def getParentComment(): Comment = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CommentReply = js.native
  def load(options: CommentReplyLoadOptions): CommentReply = js.native
  def load(propertyNamesAndPaths: AnonExpand): CommentReply = js.native
  def load(propertyNames: String): CommentReply = js.native
  def load(propertyNames: js.Array[String]): CommentReply = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: CommentReply): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.CommentReply): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: CommentReplyUpdateData): Unit = js.native
  def set(properties: CommentReplyUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.CommentReply object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CommentReplyData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): CommentReplyData = js.native
  /**
    * Updates the comment content with a specially formatted string and a list of mentions.
    *
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param contentWithMentions The content for the comment. This contains a specially formatted string and a list of mentions that will be parsed into the string when displayed by Excel.
    */
  def updateMentions(contentWithMentions: CommentRichContent): Unit = js.native
}

