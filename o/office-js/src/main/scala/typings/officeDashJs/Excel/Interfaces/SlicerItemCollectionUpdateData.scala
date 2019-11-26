package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the SlicerItemCollection object, for use in `slicerItemCollection.set({ ... })`. */
trait SlicerItemCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[SlicerItemData]] = js.undefined
}

object SlicerItemCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[SlicerItemData] = null): SlicerItemCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlicerItemCollectionUpdateData]
  }
}

