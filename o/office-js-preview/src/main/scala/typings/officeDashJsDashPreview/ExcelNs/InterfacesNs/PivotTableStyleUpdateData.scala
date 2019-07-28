package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotTableStyle object, for use in "pivotTableStyle.set({ ... })". */
trait PivotTableStyleUpdateData extends js.Object {
  /**
    *
    * Gets the name of the PivotTableStyle.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[String] = js.undefined
}

object PivotTableStyleUpdateData {
  @scala.inline
  def apply(name: String = null): PivotTableStyleUpdateData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PivotTableStyleUpdateData]
  }
}

