package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the FormatProtection object, for use in `formatProtection.set({ ... })`. */
trait FormatProtectionUpdateData extends js.Object {
  /**
    *
    * Indicates if Excel hides the formula for the cells in the range. A null value indicates that the entire range doesn't have uniform formula hidden setting.
    *
    * [Api set: ExcelApi 1.2]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Indicates if Excel locks the cells in the object. A null value indicates that the entire range doesn't have uniform lock setting.
    *
    * [Api set: ExcelApi 1.2]
    */
  var locked: js.UndefOr[Boolean] = js.undefined
}

object FormatProtectionUpdateData {
  @scala.inline
  def apply(formulaHidden: js.UndefOr[Boolean] = js.undefined, locked: js.UndefOr[Boolean] = js.undefined): FormatProtectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(formulaHidden)) __obj.updateDynamic("formulaHidden")(formulaHidden)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    __obj.asInstanceOf[FormatProtectionUpdateData]
  }
}

