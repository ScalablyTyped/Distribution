package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotField object, for use in "pivotField.set({ ... })". */
trait PivotFieldUpdateData extends js.Object {
  /**
    *
    * Name of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Determines whether to show all items of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAllItems: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Subtotals of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotals: js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.Subtotals] = js.undefined
}

object PivotFieldUpdateData {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    showAllItems: js.UndefOr[scala.Boolean] = js.undefined,
    subtotals: officeDashJsDashPreviewLib.ExcelNs.Subtotals = null
  ): PivotFieldUpdateData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(showAllItems)) __obj.updateDynamic("showAllItems")(showAllItems)
    if (subtotals != null) __obj.updateDynamic("subtotals")(subtotals)
    __obj.asInstanceOf[PivotFieldUpdateData]
  }
}

