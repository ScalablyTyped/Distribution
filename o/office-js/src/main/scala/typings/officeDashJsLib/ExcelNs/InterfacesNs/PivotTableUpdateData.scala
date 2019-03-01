package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotTable object, for use in "pivotTable.set({ ... })". */
trait PivotTableUpdateData extends js.Object {
  /**
    *
    * Name of the PivotTable.
    *
    * [Api set: ExcelApi 1.3]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object PivotTableUpdateData {
  @scala.inline
  def apply(name: java.lang.String = null): PivotTableUpdateData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PivotTableUpdateData]
  }
}

