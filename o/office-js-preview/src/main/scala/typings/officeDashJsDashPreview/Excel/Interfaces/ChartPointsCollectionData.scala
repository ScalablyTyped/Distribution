package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartPointsCollection.toJSON()`. */
trait ChartPointsCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ChartPointData]] = js.undefined
}

object ChartPointsCollectionData {
  @scala.inline
  def apply(items: js.Array[ChartPointData] = null): ChartPointsCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ChartPointsCollectionData]
  }
}

