package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "commentReply.toJSON()". */
trait CommentReplyData extends js.Object {
  /**
    *
    * Get author email of the comment reply.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var authorEmail: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Get author name of the comment reply.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var authorName: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Get or set the content.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Get creation time of the comment reply.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var creationDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    *
    * Represents the comment reply identifier. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents whether it is a comment thread or reply. Always return false here. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isParent: js.UndefOr[scala.Boolean] = js.undefined
}

object CommentReplyData {
  @scala.inline
  def apply(
    authorEmail: java.lang.String = null,
    authorName: java.lang.String = null,
    content: java.lang.String = null,
    creationDate: stdLib.Date = null,
    id: java.lang.String = null,
    isParent: js.UndefOr[scala.Boolean] = js.undefined
  ): CommentReplyData = {
    val __obj = js.Dynamic.literal()
    if (authorEmail != null) __obj.updateDynamic("authorEmail")(authorEmail)
    if (authorName != null) __obj.updateDynamic("authorName")(authorName)
    if (content != null) __obj.updateDynamic("content")(content)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isParent)) __obj.updateDynamic("isParent")(isParent)
    __obj.asInstanceOf[CommentReplyData]
  }
}

