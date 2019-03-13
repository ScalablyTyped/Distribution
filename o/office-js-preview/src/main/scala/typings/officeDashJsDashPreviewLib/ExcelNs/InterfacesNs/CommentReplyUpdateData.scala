package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the CommentReply object, for use in "commentReply.set({ ... })". */
trait CommentReplyUpdateData extends js.Object {
  /**
    *
    * Get or set the content.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
}

object CommentReplyUpdateData {
  @scala.inline
  def apply(content: java.lang.String = null): CommentReplyUpdateData = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[CommentReplyUpdateData]
  }
}

