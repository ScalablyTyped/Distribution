package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeViewCollection object, for use in "rangeViewCollection.set({ ... })". */
trait RangeViewCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[RangeViewData]] = js.undefined
}

object RangeViewCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[RangeViewData] = null): RangeViewCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[RangeViewCollectionUpdateData]
  }
}

