package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a comment reply in the workbook.
  *
  * [Api set: ExcelApi 1.10]
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
    * [Api set: ExcelApi 1.10]
    */
  var authorEmail: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the name of the comment reply's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorName: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The comment reply's content. The string is plain text.
    *
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The content type of the reply.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var contentType: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the creation time of the comment reply.
    *
    * [Api set: ExcelApi 1.10]
    */
  var creationDate: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the comment reply identifier.
    *
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The entities (e.g., people) that are mentioned in comments.
    *
    * [Api set: ExcelApi 1.11]
    */
  var mentions: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The comment reply status. A value of "true" means the reply is in the resolved state.
    *
    * [Api set: ExcelApi 1.11]
    */
  var resolved: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The rich comment content (e.g., mentions in comments). This string is not meant to be displayed to end-users. Your add-in should only use this to parse rich comment content.
    *
    * [Api set: ExcelApi 1.11]
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
    contentType: js.UndefOr[Boolean] = js.undefined,
    creationDate: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    mentions: js.UndefOr[Boolean] = js.undefined,
    resolved: js.UndefOr[Boolean] = js.undefined,
    richContent: js.UndefOr[Boolean] = js.undefined
  ): CommentReplyLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(authorEmail)) __obj.updateDynamic("authorEmail")(authorEmail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(authorName)) __obj.updateDynamic("authorName")(authorName.get.asInstanceOf[js.Any])
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.get.asInstanceOf[js.Any])
    if (!js.isUndefined(contentType)) __obj.updateDynamic("contentType")(contentType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(creationDate)) __obj.updateDynamic("creationDate")(creationDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mentions)) __obj.updateDynamic("mentions")(mentions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolved)) __obj.updateDynamic("resolved")(resolved.get.asInstanceOf[js.Any])
    if (!js.isUndefined(richContent)) __obj.updateDynamic("richContent")(richContent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentReplyLoadOptions]
  }
}

