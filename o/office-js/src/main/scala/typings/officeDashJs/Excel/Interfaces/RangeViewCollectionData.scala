package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `rangeViewCollection.toJSON()`. */
trait RangeViewCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[RangeViewData]] = js.undefined
}

object RangeViewCollectionData {
  @scala.inline
  def apply(items: js.Array[RangeViewData] = null): RangeViewCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeViewCollectionData]
  }
}

