package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableCollection object, for use in "tableCollection.set({ ... })". */
trait TableCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[TableData]] = js.undefined
}

object TableCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[TableData] = null): TableCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[TableCollectionUpdateData]
  }
}

