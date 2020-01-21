package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartLegendEntryCollection object, for use in `chartLegendEntryCollection.set({ ... })`. */
trait ChartLegendEntryCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[ChartLegendEntryData]] = js.undefined
}

object ChartLegendEntryCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[ChartLegendEntryData] = null): ChartLegendEntryCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendEntryCollectionUpdateData]
  }
}

