package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Between
import typings.officeJs.officeJsStrings.EqualTo
import typings.officeJs.officeJsStrings.GreaterThan
import typings.officeJs.officeJsStrings.GreaterThanOrEqualTo
import typings.officeJs.officeJsStrings.LessThan
import typings.officeJs.officeJsStrings.LessThanOrEqualTo
import typings.officeJs.officeJsStrings.NotBetween
import typings.officeJs.officeJsStrings.NotEqualTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Basic Type data validation criteria.
  *
  * [Api set: ExcelApi 1.8]
  */
trait BasicDataValidation extends js.Object {
  /**
    *
    * Specifies the right-hand operand when the operator property is set to a binary operator such as GreaterThan (the left-hand operand is the value the user tries to enter in the cell). With the ternary operators Between and NotBetween, specifies the lower bound operand.
    For example, setting formula1 to 10 and operator to GreaterThan means that valid data for the range must be greater than 10.
    When setting the value, it can be passed in as a number, a range object, or a string formula (where the string is either a stringified number, a cell reference like "=A1", or a formula like "=MIN(A1, B1)").
    When retrieving the value, it will always be returned as a string formula, for example: "=10", "=A1", "=SUM(A1:B5)", etc.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula1: String | Double | Range
  /**
    *
    * With the ternary operators Between and NotBetween, specifies the upper bound operand. Is not used with the binary operators, such as GreaterThan.
    When setting the value, it can be passed in as a number, a range object, or a string formula (where the string is either a stringified number, a cell reference like "=A1", or a formula like "=MIN(A1, B1)").
    When retrieving the value, it will always be returned as a string formula, for example: "=10", "=A1", "=SUM(A1:B5)", etc.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula2: js.UndefOr[String | Double | Range] = js.undefined
  /**
    *
    * The operator to use for validating the data.
    *
    * [Api set: ExcelApi 1.8]
    */
  var operator: DataValidationOperator | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqualTo | LessThanOrEqualTo
}

object BasicDataValidation {
  @scala.inline
  def apply(
    formula1: String | Double | Range,
    operator: DataValidationOperator | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqualTo | LessThanOrEqualTo,
    formula2: String | Double | Range = null
  ): BasicDataValidation = {
    val __obj = js.Dynamic.literal(formula1 = formula1.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    if (formula2 != null) __obj.updateDynamic("formula2")(formula2.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicDataValidation]
  }
}

