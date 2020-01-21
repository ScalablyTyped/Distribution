package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookComment extends Entity {
  // The content of comment.
  var content: js.UndefOr[String] = js.undefined
  // Indicates the type for the comment.
  var contentType: js.UndefOr[String] = js.undefined
  // Read-only. Nullable.
  var replies: js.UndefOr[js.Array[WorkbookCommentReply]] = js.undefined
}

object WorkbookComment {
  @scala.inline
  def apply(
    content: String = null,
    contentType: String = null,
    id: String = null,
    replies: js.Array[WorkbookCommentReply] = null
  ): WorkbookComment = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookComment]
  }
}

