package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookFormatProtection extends Entity {
  /**
    * Indicates if Excel hides the formula for the cells in the range. A null value indicates that the entire range doesn't
    * have uniform formula hidden setting.
    */
  var formulaHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if Excel locks the cells in the object. A null value indicates that the entire range doesn't have uniform
    * lock setting.
    */
  var locked: js.UndefOr[Boolean] = js.undefined
}

object WorkbookFormatProtection {
  @scala.inline
  def apply(
    formulaHidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    locked: js.UndefOr[Boolean] = js.undefined
  ): WorkbookFormatProtection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(formulaHidden)) __obj.updateDynamic("formulaHidden")(formulaHidden)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    __obj.asInstanceOf[WorkbookFormatProtection]
  }
}

