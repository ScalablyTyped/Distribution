package typings.officeDashJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the CommentCollection for a given Shape.
  *
  * [Api set:  1.1]
  */
trait CommentCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: A string that specifies the name of the author of the comment.
    *
    * [Api set:  1.1]
    */
  var author: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: A string that specifies the date when the comment was created.
    *
    * [Api set:  1.1]
    */
  var date: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: A string that contains the comment text.
    *
    * [Api set:  1.1]
    */
  var text: js.UndefOr[Boolean] = js.undefined
}

object CommentCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    author: js.UndefOr[Boolean] = js.undefined,
    date: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined
  ): CommentCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(author)) __obj.updateDynamic("author")(author)
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date)
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CommentCollectionLoadOptions]
  }
}

