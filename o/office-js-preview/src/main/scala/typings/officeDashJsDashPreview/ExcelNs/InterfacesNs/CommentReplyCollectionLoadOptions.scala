package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of comment reply objects that are part of the comment.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CommentReplyCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the email of the comment reply's author.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var authorEmail: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the name of the comment reply's author.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var authorName: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the comment reply's content. The string is plain text.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var content: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the creation time of the comment reply.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var creationDate: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the comment reply identifier. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[Boolean] = js.undefined
}

object CommentReplyCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    authorEmail: js.UndefOr[Boolean] = js.undefined,
    authorName: js.UndefOr[Boolean] = js.undefined,
    content: js.UndefOr[Boolean] = js.undefined,
    creationDate: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined
  ): CommentReplyCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(authorEmail)) __obj.updateDynamic("authorEmail")(authorEmail)
    if (!js.isUndefined(authorName)) __obj.updateDynamic("authorName")(authorName)
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(creationDate)) __obj.updateDynamic("creationDate")(creationDate)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[CommentReplyCollectionLoadOptions]
  }
}

