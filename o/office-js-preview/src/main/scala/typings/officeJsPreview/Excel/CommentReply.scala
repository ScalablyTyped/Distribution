package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CommentReplyData
import typings.officeJsPreview.Excel.Interfaces.CommentReplyLoadOptions
import typings.officeJsPreview.Excel.Interfaces.CommentReplyUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Mention
import typings.officeJsPreview.officeJsPreviewStrings.Plain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a comment reply in the workbook.
  *
  * @remarks
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait CommentReply
  extends StObject
     with ClientObject {
  
  /**
    * Assigns the task attached to the comment to the given user as the sole assignee. If there is no task, one will be created.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param assignee The assignee's user identity information.
    */
  def assignTask(assignee: EmailIdentity): DocumentTask = js.native
  
  /**
    * Gets the email of the comment reply's author.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  val authorEmail: String = js.native
  
  /**
    * Gets the name of the comment reply's author.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  val authorName: String = js.native
  
  /**
    * The comment reply's content. The string is plain text.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  var content: String = js.native
  
  /**
    * The content type of the reply.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  val contentType: ContentType | Plain | Mention = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CommentReply: RequestContext = js.native
  
  /**
    * Gets the creation time of the comment reply.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  val creationDate: js.Date = js.native
  
  /**
    * Deletes the comment reply.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the cell where this comment reply is located.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  def getLocation(): Range = js.native
  
  /**
    * Gets the parent comment of this reply.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  def getParentComment(): Comment = js.native
  
  /**
    * Gets the task associated with this comment reply's thread. If there is no task for the comment thread, an `ItemNotFound` exception is thrown.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getTask(): DocumentTask = js.native
  
  /**
    * Gets the task associated with this comment reply's thread. If there is no task for the comment thread, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getTaskOrNullObject(): DocumentTask = js.native
  
  /**
    * Specifies the comment reply identifier.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CommentReply = js.native
  def load(options: CommentReplyLoadOptions): CommentReply = js.native
  def load(propertyNamesAndPaths: Expand): CommentReply = js.native
  def load(propertyNames: String): CommentReply = js.native
  def load(propertyNames: js.Array[String]): CommentReply = js.native
  
  /**
    * The entities (e.g., people) that are mentioned in comments.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  val mentions: js.Array[CommentMention] = js.native
  
  /**
    * The comment reply status. A value of `true` means the reply is in the resolved state.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  val resolved: Boolean = js.native
  
  /**
    * The rich comment content (e.g., mentions in comments). This string is not meant to be displayed to end-users. Your add-in should only use this to parse rich comment content.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    */
  val richContent: String = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: CommentReply): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
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
    * @remarks
    * [Api set: ExcelApi 1.11]
    *
    * @param contentWithMentions The content for the comment. This contains a specially formatted string and a list of mentions that will be parsed into the string when displayed by Excel.
    */
  def updateMentions(contentWithMentions: CommentRichContent): Unit = js.native
}
