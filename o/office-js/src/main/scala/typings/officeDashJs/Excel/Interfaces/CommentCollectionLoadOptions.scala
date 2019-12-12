package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of comment objects that are part of the workbook.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait CommentCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the email of the comment's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorEmail: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the name of the comment's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorName: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the comment's content. The string is plain text.
    *
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the creation time of the comment. Returns null if the comment was converted from a note, since the comment does not have a creation date.
    *
    * [Api set: ExcelApi 1.10]
    */
  var creationDate: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the comment identifier. Read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[Boolean] = js.native
}

