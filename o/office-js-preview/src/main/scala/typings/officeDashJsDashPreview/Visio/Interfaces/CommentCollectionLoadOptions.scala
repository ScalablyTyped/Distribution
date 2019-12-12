package typings.officeDashJsDashPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the CommentCollection for a given Shape.
  *
  * [Api set:  1.1]
  */
@js.native
trait CommentCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: A string that specifies the name of the author of the comment.
    *
    * [Api set:  1.1]
    */
  var author: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: A string that specifies the date when the comment was created.
    *
    * [Api set:  1.1]
    */
  var date: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: A string that contains the comment text.
    *
    * [Api set:  1.1]
    */
  var text: js.UndefOr[Boolean] = js.native
}

