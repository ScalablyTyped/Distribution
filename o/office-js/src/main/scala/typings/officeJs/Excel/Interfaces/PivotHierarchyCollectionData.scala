package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `pivotHierarchyCollection.toJSON()`. */
trait PivotHierarchyCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[PivotHierarchyData]] = js.undefined
}

object PivotHierarchyCollectionData {
  @scala.inline
  def apply(items: js.Array[PivotHierarchyData] = null): PivotHierarchyCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotHierarchyCollectionData]
  }
}

