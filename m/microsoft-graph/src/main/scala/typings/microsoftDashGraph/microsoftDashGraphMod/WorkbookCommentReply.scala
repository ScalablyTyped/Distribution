package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookCommentReply extends Entity {
  var content: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
}

object WorkbookCommentReply {
  @scala.inline
  def apply(content: String = null, contentType: String = null, id: String = null): WorkbookCommentReply = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[WorkbookCommentReply]
  }
}

