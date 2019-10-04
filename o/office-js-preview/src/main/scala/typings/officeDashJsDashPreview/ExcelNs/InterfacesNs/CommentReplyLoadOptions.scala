package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a comment reply in the workbook.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait CommentReplyLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the email of the comment reply's author.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var authorEmail: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the name of the comment reply's author.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var authorName: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the comment reply's content. The string is plain text.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var content: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the creation time of the comment reply.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var creationDate: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the comment reply identifier. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the entities (e.g. people) that are mentioned in comments.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var mentions: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the comment reply status. A value of "true" means the comment reply is in the resolved state.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the rich comment content (e.g. mentions in comments). This string is not meant to be displayed to end-users. Your add-in should only use this to parse rich comment content.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var richContent: js.UndefOr[Boolean] = js.undefined
}

object CommentReplyLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    authorEmail: js.UndefOr[Boolean] = js.undefined,
    authorName: js.UndefOr[Boolean] = js.undefined,
    content: js.UndefOr[Boolean] = js.undefined,
    creationDate: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    mentions: js.UndefOr[Boolean] = js.undefined,
    resolved: js.UndefOr[Boolean] = js.undefined,
    richContent: js.UndefOr[Boolean] = js.undefined
  ): CommentReplyLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(authorEmail)) __obj.updateDynamic("authorEmail")(authorEmail)
    if (!js.isUndefined(authorName)) __obj.updateDynamic("authorName")(authorName)
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(creationDate)) __obj.updateDynamic("creationDate")(creationDate)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(mentions)) __obj.updateDynamic("mentions")(mentions)
    if (!js.isUndefined(resolved)) __obj.updateDynamic("resolved")(resolved)
    if (!js.isUndefined(richContent)) __obj.updateDynamic("richContent")(richContent)
    __obj.asInstanceOf[CommentReplyLoadOptions]
  }
}

