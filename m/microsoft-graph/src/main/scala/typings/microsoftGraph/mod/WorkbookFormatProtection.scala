package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookFormatProtection extends Entity {
  /**
    * Indicates if Excel hides the formula for the cells in the range. A null value indicates that the entire range doesn't
    * have uniform formula hidden setting.
    */
  var formulaHidden: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if Excel locks the cells in the object. A null value indicates that the entire range doesn't have uniform
    * lock setting.
    */
  var locked: js.UndefOr[Boolean] = js.native
}

object WorkbookFormatProtection {
  @scala.inline
  def apply(): WorkbookFormatProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFormatProtection]
  }
  @scala.inline
  implicit class WorkbookFormatProtectionOps[Self <: WorkbookFormatProtection] (val x: Self) extends AnyVal {
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

