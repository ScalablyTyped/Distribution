package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Between
import typings.officeJs.officeJsStrings.EqualTo
import typings.officeJs.officeJsStrings.GreaterThan
import typings.officeJs.officeJsStrings.GreaterThanOrEqualTo
import typings.officeJs.officeJsStrings.LessThan
import typings.officeJs.officeJsStrings.LessThanOrEqualTo
import typings.officeJs.officeJsStrings.NotBetween
import typings.officeJs.officeJsStrings.NotEqualTo
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Date data validation criteria.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait DateTimeDataValidation extends js.Object {
  /**
    *
    * Specifies the right-hand operand when the operator property is set to a binary operator such as GreaterThan (the left-hand operand is the value the user tries to enter in the cell). With the ternary operators Between and NotBetween, specifies the lower bound operand.
    When setting the value, it can be passed in as a Date, a Range object, or a string formula (where the string is either a stringified date/time in ISO8601 format, a cell reference like "=A1", or a formula like "=MIN(A1, B1)").
    When retrieving the value, it will always be returned as a string formula, for example: "=10", "=A1", "=SUM(A1:B5)", etc.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula1: String | Date | Range = js.native
  /**
    *
    * With the ternary operators Between and NotBetween, specifies the upper bound operand. Is not used with the binary operators, such as GreaterThan.
    When setting the value, it can be passed in as a Date, a Range object, or a string (where the string is either a stringified date/time in ISO8601 format, a cell reference like "=A1", or a formula like "=MIN(A1, B1)").
    When retrieving the value, it will always be returned as a string formula, for example: "=10", "=A1", "=SUM(A1:B5)", etc.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula2: js.UndefOr[String | Date | Range] = js.native
  /**
    *
    * The operator to use for validating the data.
    *
    * [Api set: ExcelApi 1.8]
    */
  var operator: DataValidationOperator | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqualTo | LessThanOrEqualTo = js.native
}

object DateTimeDataValidation {
  @scala.inline
  def apply(
    formula1: String | Date | Range,
    operator: DataValidationOperator | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqualTo | LessThanOrEqualTo
  ): DateTimeDataValidation = {
    val __obj = js.Dynamic.literal(formula1 = formula1.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeDataValidation]
  }
  @scala.inline
  implicit class DateTimeDataValidationOps[Self <: DateTimeDataValidation] (val x: Self) extends AnyVal {
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
    def setFormula1(value: String | Date | Range): Self = this.set("formula1", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(
      value: DataValidationOperator | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqualTo | LessThanOrEqualTo
    ): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormula2(value: String | Date | Range): Self = this.set("formula2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormula2: Self = this.set("formula2", js.undefined)
  }
  
}

