package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartSeriesCollection object, for use in `chartSeriesCollection.set({ ... })`. */
trait ChartSeriesCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ChartSeriesData]] = js.undefined
}

object ChartSeriesCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[ChartSeriesData] = null): ChartSeriesCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesCollectionUpdateData]
  }
}

