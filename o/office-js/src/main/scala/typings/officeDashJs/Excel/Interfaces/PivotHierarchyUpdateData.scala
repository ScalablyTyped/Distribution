package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotHierarchy object, for use in `pivotHierarchy.set({ ... })`. */
trait PivotHierarchyUpdateData extends js.Object {
  /**
    *
    * Name of the PivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
}

object PivotHierarchyUpdateData {
  @scala.inline
  def apply(name: String = null): PivotHierarchyUpdateData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PivotHierarchyUpdateData]
  }
}

