package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pivotTableCollection.toJSON()`. */
trait PivotTableCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[PivotTableData]] = js.undefined
}

object PivotTableCollectionData {
  @scala.inline
  def apply(items: js.Array[PivotTableData] = null): PivotTableCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[PivotTableCollectionData]
  }
}

