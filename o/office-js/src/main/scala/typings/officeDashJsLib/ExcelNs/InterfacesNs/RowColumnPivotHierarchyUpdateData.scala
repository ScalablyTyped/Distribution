package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RowColumnPivotHierarchy object, for use in "rowColumnPivotHierarchy.set({ ... })". */
trait RowColumnPivotHierarchyUpdateData extends js.Object {
  /**
    *
    * Name of the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Position of the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[scala.Double] = js.undefined
}

object RowColumnPivotHierarchyUpdateData {
  @scala.inline
  def apply(name: java.lang.String = null, position: scala.Int | scala.Double = null): RowColumnPivotHierarchyUpdateData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowColumnPivotHierarchyUpdateData]
  }
}

