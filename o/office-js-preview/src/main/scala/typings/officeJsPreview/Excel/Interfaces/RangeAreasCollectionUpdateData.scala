package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeAreasCollection object, for use in `rangeAreasCollection.set({ ... })`. */
trait RangeAreasCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[RangeAreasData]] = js.undefined
}

object RangeAreasCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[RangeAreasData] = null): RangeAreasCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeAreasCollectionUpdateData]
  }
}

