package typings.officeDashJs.Excel.Interfaces

import typings.officeDashJs.Excel.Subtotals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PivotField object, for use in `pivotField.set({ ... })`. */
trait PivotFieldUpdateData extends js.Object {
  /**
    *
    * Name of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Determines whether to show all items of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAllItems: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Subtotals of the PivotField.
    *
    * [Api set: ExcelApi 1.8]
    */
  var subtotals: js.UndefOr[Subtotals] = js.undefined
}

object PivotFieldUpdateData {
  @scala.inline
  def apply(name: String = null, showAllItems: js.UndefOr[Boolean] = js.undefined, subtotals: Subtotals = null): PivotFieldUpdateData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(showAllItems)) __obj.updateDynamic("showAllItems")(showAllItems.asInstanceOf[js.Any])
    if (subtotals != null) __obj.updateDynamic("subtotals")(subtotals.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotFieldUpdateData]
  }
}

