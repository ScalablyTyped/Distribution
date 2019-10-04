package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the FilterPivotHierarchyCollection object, for use in `filterPivotHierarchyCollection.set({ ... })`. */
trait FilterPivotHierarchyCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[FilterPivotHierarchyData]] = js.undefined
}

object FilterPivotHierarchyCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[FilterPivotHierarchyData] = null): FilterPivotHierarchyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[FilterPivotHierarchyCollectionUpdateData]
  }
}

