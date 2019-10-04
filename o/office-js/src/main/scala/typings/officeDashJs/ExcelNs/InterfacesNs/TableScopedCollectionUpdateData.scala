package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableScopedCollection object, for use in `tableScopedCollection.set({ ... })`. */
trait TableScopedCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[TableData]] = js.undefined
}

object TableScopedCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[TableData] = null): TableScopedCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[TableScopedCollectionUpdateData]
  }
}

