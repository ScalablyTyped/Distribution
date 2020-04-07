package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a comment in the workbook.
  *
  * [Api set: ExcelApi 1.10]
  */
trait CommentLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the email of the comment's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorEmail: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the name of the comment's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorName: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the comment's content. The string is plain text.
    *
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the creation time of the comment. Returns null if the comment was converted from a note, since the comment does not have a creation date.
    *
    * [Api set: ExcelApi 1.10]
    */
  var creationDate: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the comment identifier. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the entities (e.g. people) that are mentioned in comments.
    *
    * [Api set: ExcelApiOnline 1.1]
    */
  var mentions: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the rich comment content (e.g. mentions in comments). This string is not meant to be displayed to end-users. Your add-in should only use this to parse rich comment content.
    *
    * [Api set: ExcelApiOnline 1.1]
    */
  var richContent: js.UndefOr[Boolean] = js.undefined
}

object CommentLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    authorEmail: js.UndefOr[Boolean] = js.undefined,
    authorName: js.UndefOr[Boolean] = js.undefined,
    content: js.UndefOr[Boolean] = js.undefined,
    creationDate: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    mentions: js.UndefOr[Boolean] = js.undefined,
    richContent: js.UndefOr[Boolean] = js.undefined
  ): CommentLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(authorEmail)) __obj.updateDynamic("authorEmail")(authorEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(authorName)) __obj.updateDynamic("authorName")(authorName.asInstanceOf[js.Any])
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(creationDate)) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(mentions)) __obj.updateDynamic("mentions")(mentions.asInstanceOf[js.Any])
    if (!js.isUndefined(richContent)) __obj.updateDynamic("richContent")(richContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentLoadOptions]
  }
}

