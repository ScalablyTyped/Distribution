package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotItemCollection object, for use in "pivotItemCollection.set({ ... })". */
trait PivotItemCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[PivotItemData]] = js.undefined
}

object PivotItemCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[PivotItemData] = null): PivotItemCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[PivotItemCollectionUpdateData]
  }
}

