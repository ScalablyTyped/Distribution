package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.CommentMention
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `commentReply.toJSON()`. */
trait CommentReplyData extends js.Object {
  /**
    *
    * Gets the email of the comment reply's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorEmail: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the name of the comment reply's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorName: js.UndefOr[String] = js.undefined
  /**
    *
    * The comment reply's content. The string is plain text.
    *
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the creation time of the comment reply.
    *
    * [Api set: ExcelApi 1.10]
    */
  var creationDate: js.UndefOr[Date] = js.undefined
  /**
    *
    * Specifies the comment reply identifier.
    *
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * The entities (e.g., people) that are mentioned in comments.
    *
    * [Api set: ExcelApi 1.11]
    */
  var mentions: js.UndefOr[js.Array[CommentMention]] = js.undefined
  /**
    *
    * The comment reply status. A value of "true" means the reply is in the resolved state.
    *
    * [Api set: ExcelApi 1.11]
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The rich comment content (e.g., mentions in comments). This string is not meant to be displayed to end-users. Your add-in should only use this to parse rich comment content.
    *
    * [Api set: ExcelApi 1.11]
    */
  var richContent: js.UndefOr[String] = js.undefined
}

object CommentReplyData {
  @scala.inline
  def apply(
    authorEmail: String = null,
    authorName: String = null,
    content: String = null,
    creationDate: Date = null,
    id: String = null,
    mentions: js.Array[CommentMention] = null,
    resolved: js.UndefOr[Boolean] = js.undefined,
    richContent: String = null
  ): CommentReplyData = {
    val __obj = js.Dynamic.literal()
    if (authorEmail != null) __obj.updateDynamic("authorEmail")(authorEmail.asInstanceOf[js.Any])
    if (authorName != null) __obj.updateDynamic("authorName")(authorName.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mentions != null) __obj.updateDynamic("mentions")(mentions.asInstanceOf[js.Any])
    if (!js.isUndefined(resolved)) __obj.updateDynamic("resolved")(resolved.get.asInstanceOf[js.Any])
    if (richContent != null) __obj.updateDynamic("richContent")(richContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentReplyData]
  }
}

