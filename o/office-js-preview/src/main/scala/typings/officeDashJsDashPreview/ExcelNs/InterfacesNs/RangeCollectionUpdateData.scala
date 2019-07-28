package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeCollection object, for use in "rangeCollection.set({ ... })". */
trait RangeCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[RangeData]] = js.undefined
}

object RangeCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[RangeData] = null): RangeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[RangeCollectionUpdateData]
  }
}

