package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartTrendlineCollection object, for use in `chartTrendlineCollection.set({ ... })`. */
trait ChartTrendlineCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ChartTrendlineData]] = js.undefined
}

object ChartTrendlineCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[ChartTrendlineData] = null): ChartTrendlineCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTrendlineCollectionUpdateData]
  }
}

