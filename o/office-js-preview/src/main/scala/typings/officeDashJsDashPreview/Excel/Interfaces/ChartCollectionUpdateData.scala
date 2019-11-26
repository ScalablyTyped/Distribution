package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartCollection object, for use in `chartCollection.set({ ... })`. */
trait ChartCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ChartData]] = js.undefined
}

object ChartCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[ChartData] = null): ChartCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCollectionUpdateData]
  }
}

