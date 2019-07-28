package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookComment extends Entity {
  var content: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
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
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (id != null) __obj.updateDynamic("id")(id)
    if (replies != null) __obj.updateDynamic("replies")(replies)
    __obj.asInstanceOf[WorkbookComment]
  }
}

