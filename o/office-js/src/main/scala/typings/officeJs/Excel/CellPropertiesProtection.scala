package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the `format.protection` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.protection` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesProtection extends js.Object {
  /**
    *
    * Represents the `format.protection.formulaHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the `format.protection.locked` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var locked: js.UndefOr[Boolean] = js.undefined
}

object CellPropertiesProtection {
  @scala.inline
  def apply(formulaHidden: js.UndefOr[Boolean] = js.undefined, locked: js.UndefOr[Boolean] = js.undefined): CellPropertiesProtection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(formulaHidden)) __obj.updateDynamic("formulaHidden")(formulaHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellPropertiesProtection]
  }
}

