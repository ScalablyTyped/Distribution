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
@js.native
trait CellPropertiesProtection extends js.Object {
  /**
    *
    * Represents the `format.protection.formulaHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var formulaHidden: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the `format.protection.locked` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var locked: js.UndefOr[Boolean] = js.native
}

object CellPropertiesProtection {
  @scala.inline
  def apply(): CellPropertiesProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesProtection]
  }
  @scala.inline
  implicit class CellPropertiesProtectionOps[Self <: CellPropertiesProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormulaHidden(value: Boolean): Self = this.set("formulaHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulaHidden: Self = this.set("formulaHidden", js.undefined)
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
  }
  
}

