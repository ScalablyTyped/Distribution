package typings.officeDashJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the CommentCollection object, for use in "commentCollection.set({ ... })". */
trait CommentCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[CommentData]] = js.undefined
}

object CommentCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[CommentData] = null): CommentCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentCollectionUpdateData]
  }
}

