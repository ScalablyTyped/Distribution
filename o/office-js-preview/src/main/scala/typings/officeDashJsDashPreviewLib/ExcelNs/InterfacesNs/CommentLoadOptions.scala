package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a cell comment object in the workbook.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CommentLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Get author email of the comment.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var authorEmail: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Get author name of the comment.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var authorName: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Get or set the content.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var content: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Get creation time of the comment. Will return null if the comment is converted from note, as in this case, the comment will not has created date.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var creationDate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the comment identifier. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents whether it is a comment thread or reply. Always return true here. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isParent: js.UndefOr[scala.Boolean] = js.undefined
}

object CommentLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    authorEmail: js.UndefOr[scala.Boolean] = js.undefined,
    authorName: js.UndefOr[scala.Boolean] = js.undefined,
    content: js.UndefOr[scala.Boolean] = js.undefined,
    creationDate: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    isParent: js.UndefOr[scala.Boolean] = js.undefined
  ): CommentLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(authorEmail)) __obj.updateDynamic("authorEmail")(authorEmail)
    if (!js.isUndefined(authorName)) __obj.updateDynamic("authorName")(authorName)
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(creationDate)) __obj.updateDynamic("creationDate")(creationDate)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isParent)) __obj.updateDynamic("isParent")(isParent)
    __obj.asInstanceOf[CommentLoadOptions]
  }
}

