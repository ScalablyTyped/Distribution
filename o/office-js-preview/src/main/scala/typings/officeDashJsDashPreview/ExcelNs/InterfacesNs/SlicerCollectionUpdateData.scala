package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the SlicerCollection object, for use in `slicerCollection.set({ ... })`. */
trait SlicerCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[SlicerData]] = js.undefined
}

object SlicerCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[SlicerData] = null): SlicerCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[SlicerCollectionUpdateData]
  }
}

