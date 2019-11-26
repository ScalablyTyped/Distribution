package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the CommentReply object, for use in `commentReply.set({ ... })`. */
trait CommentReplyUpdateData extends js.Object {
  /**
    *
    * Gets or sets the comment reply's content. The string is plain text.
    *
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[String] = js.undefined
}

object CommentReplyUpdateData {
  @scala.inline
  def apply(content: String = null): CommentReplyUpdateData = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentReplyUpdateData]
  }
}

