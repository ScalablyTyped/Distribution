package typings.officeDashJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkWordCollection object, for use in "inkWordCollection.set({ ... })". */
trait InkWordCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[InkWordData]] = js.undefined
}

object InkWordCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[InkWordData] = null): InkWordCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkWordCollectionUpdateData]
  }
}

