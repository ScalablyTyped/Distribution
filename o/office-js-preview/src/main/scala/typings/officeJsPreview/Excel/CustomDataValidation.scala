package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Custom data validation criteria.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait CustomDataValidation extends js.Object {
  /**
    *
    * A custom data validation formula. This creates special input rules, such as preventing duplicates, or limiting the total in a range of cells.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: String = js.native
}

object CustomDataValidation {
  @scala.inline
  def apply(formula: String): CustomDataValidation = {
    val __obj = js.Dynamic.literal(formula = formula.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDataValidation]
  }
  @scala.inline
  implicit class CustomDataValidationOps[Self <: CustomDataValidation] (val x: Self) extends AnyVal {
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
    def setFormula(value: String): Self = this.set("formula", value.asInstanceOf[js.Any])
  }
  
}

