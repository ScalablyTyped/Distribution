package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "commentReply.toJSON()". */
trait CommentReplyData extends js.Object {
  /**
    *
    * Gets the email of the comment reply's author.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var authorEmail: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the name of the comment reply's author.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var authorName: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the comment reply's content. The string is plain text.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the creation time of the comment reply.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var creationDate: js.UndefOr[Date] = js.undefined
  /**
    *
    * Represents the comment reply identifier. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[String] = js.undefined
}

object CommentReplyData {
  @scala.inline
  def apply(
    authorEmail: String = null,
    authorName: String = null,
    content: String = null,
    creationDate: Date = null,
    id: String = null
  ): CommentReplyData = {
    val __obj = js.Dynamic.literal()
    if (authorEmail != null) __obj.updateDynamic("authorEmail")(authorEmail)
    if (authorName != null) __obj.updateDynamic("authorName")(authorName)
    if (content != null) __obj.updateDynamic("content")(content)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[CommentReplyData]
  }
}

