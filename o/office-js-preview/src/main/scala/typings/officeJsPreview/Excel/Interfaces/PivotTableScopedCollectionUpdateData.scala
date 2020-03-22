package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotTableScopedCollection object, for use in `pivotTableScopedCollection.set({ ... })`. */
trait PivotTableScopedCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[PivotTableData]] = js.undefined
}

object PivotTableScopedCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[PivotTableData] = null): PivotTableScopedCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTableScopedCollectionUpdateData]
  }
}

