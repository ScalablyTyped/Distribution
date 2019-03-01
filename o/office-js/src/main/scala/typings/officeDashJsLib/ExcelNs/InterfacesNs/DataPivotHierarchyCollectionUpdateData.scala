package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the DataPivotHierarchyCollection object, for use in "dataPivotHierarchyCollection.set({ ... })". */
trait DataPivotHierarchyCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[DataPivotHierarchyData]] = js.undefined
}

object DataPivotHierarchyCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[DataPivotHierarchyData] = null): DataPivotHierarchyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[DataPivotHierarchyCollectionUpdateData]
  }
}

