package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartPointsCollection object, for use in `chartPointsCollection.set({ ... })`. */
trait ChartPointsCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ChartPointData]] = js.undefined
}

object ChartPointsCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[ChartPointData] = null): ChartPointsCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPointsCollectionUpdateData]
  }
}

