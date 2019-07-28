package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Comment object, for use in "comment.set({ ... })". */
trait CommentUpdateData extends js.Object {
  /**
    *
    * Gets or sets the comment's content. The string is plain text.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var content: js.UndefOr[String] = js.undefined
}

object CommentUpdateData {
  @scala.inline
  def apply(content: String = null): CommentUpdateData = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[CommentUpdateData]
  }
}

