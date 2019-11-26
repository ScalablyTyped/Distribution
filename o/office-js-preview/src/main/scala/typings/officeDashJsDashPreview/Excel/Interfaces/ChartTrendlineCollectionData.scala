package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartTrendlineCollection.toJSON()`. */
trait ChartTrendlineCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ChartTrendlineData]] = js.undefined
}

object ChartTrendlineCollectionData {
  @scala.inline
  def apply(items: js.Array[ChartTrendlineData] = null): ChartTrendlineCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTrendlineCollectionData]
  }
}

