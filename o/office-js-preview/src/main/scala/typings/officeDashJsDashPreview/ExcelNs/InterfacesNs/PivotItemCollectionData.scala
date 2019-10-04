package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pivotItemCollection.toJSON()`. */
trait PivotItemCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[PivotItemData]] = js.undefined
}

object PivotItemCollectionData {
  @scala.inline
  def apply(items: js.Array[PivotItemData] = null): PivotItemCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[PivotItemCollectionData]
  }
}

