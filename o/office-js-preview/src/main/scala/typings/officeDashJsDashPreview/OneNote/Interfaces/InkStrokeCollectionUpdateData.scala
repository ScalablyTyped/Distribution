package typings.officeDashJsDashPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkStrokeCollection object, for use in "inkStrokeCollection.set({ ... })". */
trait InkStrokeCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[InkStrokeData]] = js.undefined
}

object InkStrokeCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[InkStrokeData] = null): InkStrokeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkStrokeCollectionUpdateData]
  }
}

