package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookCommentReply extends Entity {
  // The content of a comment reply.
  var content: js.UndefOr[String] = js.undefined
  // Indicates the type for the comment reply.
  var contentType: js.UndefOr[String] = js.undefined
}

object WorkbookCommentReply {
  @scala.inline
  def apply(content: String = null, contentType: String = null, id: String = null): WorkbookCommentReply = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookCommentReply]
  }
}

