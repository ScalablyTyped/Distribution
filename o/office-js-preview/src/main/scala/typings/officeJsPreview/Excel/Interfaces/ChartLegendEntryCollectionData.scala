package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartLegendEntryCollection.toJSON()`. */
trait ChartLegendEntryCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ChartLegendEntryData]] = js.undefined
}

object ChartLegendEntryCollectionData {
  @scala.inline
  def apply(items: js.Array[ChartLegendEntryData] = null): ChartLegendEntryCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendEntryCollectionData]
  }
}

