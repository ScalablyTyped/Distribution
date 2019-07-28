package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableStyleCollection object, for use in "tableStyleCollection.set({ ... })". */
trait TableStyleCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[TableStyleData]] = js.undefined
}

object TableStyleCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[TableStyleData] = null): TableStyleCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[TableStyleCollectionUpdateData]
  }
}

