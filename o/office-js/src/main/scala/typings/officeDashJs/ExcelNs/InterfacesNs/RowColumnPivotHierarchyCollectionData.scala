package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "rowColumnPivotHierarchyCollection.toJSON()". */
trait RowColumnPivotHierarchyCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.undefined
}

object RowColumnPivotHierarchyCollectionData {
  @scala.inline
  def apply(items: js.Array[RowColumnPivotHierarchyData] = null): RowColumnPivotHierarchyCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[RowColumnPivotHierarchyCollectionData]
  }
}

