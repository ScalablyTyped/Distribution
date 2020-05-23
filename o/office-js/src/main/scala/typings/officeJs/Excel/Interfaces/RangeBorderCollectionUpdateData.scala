package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RangeBorderCollection object, for use in `rangeBorderCollection.set({ ... })`. */
trait RangeBorderCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[RangeBorderData]] = js.undefined
  /**
    *
    * Specifies a double that lightens or darkens a color for Range Borders, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the entire border collections don't have uniform tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Double] = js.undefined
}

object RangeBorderCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[RangeBorderData] = null, tintAndShade: js.UndefOr[Double] = js.undefined): RangeBorderCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(tintAndShade)) __obj.updateDynamic("tintAndShade")(tintAndShade.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeBorderCollectionUpdateData]
  }
}

