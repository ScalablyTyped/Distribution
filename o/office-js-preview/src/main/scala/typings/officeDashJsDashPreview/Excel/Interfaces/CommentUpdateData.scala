package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Comment object, for use in `comment.set({ ... })`. */
trait CommentUpdateData extends js.Object {
  /**
    *
    * Gets or sets the comment's content. The string is plain text.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var content: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the comment thread status. A value of "true" means the comment thread is in the resolved state.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
}

object CommentUpdateData {
  @scala.inline
  def apply(content: String = null, resolved: js.UndefOr[Boolean] = js.undefined): CommentUpdateData = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(resolved)) __obj.updateDynamic("resolved")(resolved)
    __obj.asInstanceOf[CommentUpdateData]
  }
}

