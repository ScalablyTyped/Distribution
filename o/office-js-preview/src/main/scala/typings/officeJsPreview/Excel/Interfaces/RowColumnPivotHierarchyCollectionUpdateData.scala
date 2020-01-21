package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RowColumnPivotHierarchyCollection object, for use in `rowColumnPivotHierarchyCollection.set({ ... })`. */
trait RowColumnPivotHierarchyCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.undefined
}

object RowColumnPivotHierarchyCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[RowColumnPivotHierarchyData] = null): RowColumnPivotHierarchyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowColumnPivotHierarchyCollectionUpdateData]
  }
}

