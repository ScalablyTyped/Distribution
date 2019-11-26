package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartSeriesCollection.toJSON()`. */
trait ChartSeriesCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ChartSeriesData]] = js.undefined
}

object ChartSeriesCollectionData {
  @scala.inline
  def apply(items: js.Array[ChartSeriesData] = null): ChartSeriesCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesCollectionData]
  }
}

