package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotTableCollection object, for use in `pivotTableCollection.set({ ... })`. */
trait PivotTableCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[PivotTableData]] = js.undefined
}

object PivotTableCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[PivotTableData] = null): PivotTableCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTableCollectionUpdateData]
  }
}

