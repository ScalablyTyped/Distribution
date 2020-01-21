package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PageBreakCollection object, for use in `pageBreakCollection.set({ ... })`. */
trait PageBreakCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[PageBreakData]] = js.undefined
}

object PageBreakCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[PageBreakData] = null): PageBreakCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageBreakCollectionUpdateData]
  }
}

