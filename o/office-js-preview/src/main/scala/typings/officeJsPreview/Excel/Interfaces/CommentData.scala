package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.CommentMention
import typings.officeJsPreview.Excel.ContentType
import typings.officeJsPreview.officeJsPreviewStrings.Mention
import typings.officeJsPreview.officeJsPreviewStrings.Plain
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `comment.toJSON()`. */
trait CommentData extends js.Object {
  /**
    *
    * Gets the email of the comment's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorEmail: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the name of the comment's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorName: js.UndefOr[String] = js.undefined
  /**
    *
    * The comment's content. The string is plain text.
    *
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the content type of the comment.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var contentType: js.UndefOr[ContentType | Plain | Mention] = js.undefined
  /**
    *
    * Gets the creation time of the comment. Returns null if the comment was converted from a note, since the comment does not have a creation date.
    *
    * [Api set: ExcelApi 1.10]
    */
  var creationDate: js.UndefOr[Date] = js.undefined
  /**
    *
    * Specifies the comment identifier.
    *
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the entities (e.g., people) that are mentioned in comments.
    *
    * [Api set: ExcelApi 1.11]
    */
  var mentions: js.UndefOr[js.Array[CommentMention]] = js.undefined
  /**
    *
    * Represents a collection of reply objects associated with the comment.
    *
    * [Api set: ExcelApi 1.10]
    */
  var replies: js.UndefOr[js.Array[CommentReplyData]] = js.undefined
  /**
    *
    * The comment thread status. A value of "true" means the comment thread is resolved.
    *
    * [Api set: ExcelApi 1.11]
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the rich comment content (e.g., mentions in comments). This string is not meant to be displayed to end-users. Your add-in should only use this to parse rich comment content.
    *
    * [Api set: ExcelApi 1.11]
    */
  var richContent: js.UndefOr[String] = js.undefined
}

object CommentData {
  @scala.inline
  def apply(
    authorEmail: String = null,
    authorName: String = null,
    content: String = null,
    contentType: ContentType | Plain | Mention = null,
    creationDate: Date = null,
    id: String = null,
    mentions: js.Array[CommentMention] = null,
    replies: js.Array[CommentReplyData] = null,
    resolved: js.UndefOr[Boolean] = js.undefined,
    richContent: String = null
  ): CommentData = {
    val __obj = js.Dynamic.literal()
    if (authorEmail != null) __obj.updateDynamic("authorEmail")(authorEmail.asInstanceOf[js.Any])
    if (authorName != null) __obj.updateDynamic("authorName")(authorName.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mentions != null) __obj.updateDynamic("mentions")(mentions.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (!js.isUndefined(resolved)) __obj.updateDynamic("resolved")(resolved.get.asInstanceOf[js.Any])
    if (richContent != null) __obj.updateDynamic("richContent")(richContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentData]
  }
}

