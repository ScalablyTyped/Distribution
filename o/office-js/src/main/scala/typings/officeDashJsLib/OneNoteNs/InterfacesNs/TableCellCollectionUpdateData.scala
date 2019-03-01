package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableCellCollection object, for use in "tableCellCollection.set({ ... })". */
trait TableCellCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[TableCellData]] = js.undefined
}

object TableCellCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[TableCellData] = null): TableCellCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[TableCellCollectionUpdateData]
  }
}

