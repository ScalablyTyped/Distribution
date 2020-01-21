package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `dataPivotHierarchyCollection.toJSON()`. */
trait DataPivotHierarchyCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[DataPivotHierarchyData]] = js.undefined
}

object DataPivotHierarchyCollectionData {
  @scala.inline
  def apply(items: js.Array[DataPivotHierarchyData] = null): DataPivotHierarchyCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPivotHierarchyCollectionData]
  }
}

