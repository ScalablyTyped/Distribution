package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pivotTableStyleCollection.toJSON()". */
trait PivotTableStyleCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[PivotTableStyleData]] = js.undefined
}

object PivotTableStyleCollectionData {
  @scala.inline
  def apply(items: js.Array[PivotTableStyleData] = null): PivotTableStyleCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[PivotTableStyleCollectionData]
  }
}

