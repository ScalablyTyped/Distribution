package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pivotTableScopedCollection.toJSON()`. */
trait PivotTableScopedCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[PivotTableData]] = js.undefined
}

object PivotTableScopedCollectionData {
  @scala.inline
  def apply(items: js.Array[PivotTableData] = null): PivotTableScopedCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTableScopedCollectionData]
  }
}

