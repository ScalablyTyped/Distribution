package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableColumnCollection object, for use in `tableColumnCollection.set({ ... })`. */
trait TableColumnCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[TableColumnData]] = js.undefined
}

object TableColumnCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[TableColumnData] = null): TableColumnCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[TableColumnCollectionUpdateData]
  }
}

