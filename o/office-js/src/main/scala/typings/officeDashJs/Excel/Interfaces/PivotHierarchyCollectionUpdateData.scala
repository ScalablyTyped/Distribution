package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotHierarchyCollection object, for use in `pivotHierarchyCollection.set({ ... })`. */
trait PivotHierarchyCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[PivotHierarchyData]] = js.undefined
}

object PivotHierarchyCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[PivotHierarchyData] = null): PivotHierarchyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[PivotHierarchyCollectionUpdateData]
  }
}

