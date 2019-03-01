package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "comment.toJSON()". */
trait CommentData extends js.Object {
  /**
    *
    * Get/Set the content.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the comment identifier. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents whether it is a comment thread or reply. Always return true here. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isParent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents a collection of reply objects associated with the comment. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var replies: js.UndefOr[js.Array[CommentReplyData]] = js.undefined
}

object CommentData {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    id: java.lang.String = null,
    isParent: js.UndefOr[scala.Boolean] = js.undefined,
    replies: js.Array[CommentReplyData] = null
  ): CommentData = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isParent)) __obj.updateDynamic("isParent")(isParent)
    if (replies != null) __obj.updateDynamic("replies")(replies)
    __obj.asInstanceOf[CommentData]
  }
}

