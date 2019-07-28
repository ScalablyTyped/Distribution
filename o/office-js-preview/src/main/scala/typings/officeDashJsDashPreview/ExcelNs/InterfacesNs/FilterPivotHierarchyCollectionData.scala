package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "filterPivotHierarchyCollection.toJSON()". */
trait FilterPivotHierarchyCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[FilterPivotHierarchyData]] = js.undefined
}

object FilterPivotHierarchyCollectionData {
  @scala.inline
  def apply(items: js.Array[FilterPivotHierarchyData] = null): FilterPivotHierarchyCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[FilterPivotHierarchyCollectionData]
  }
}

