package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Between
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EqualTo
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.GreaterThan
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.GreaterThanOrEqualTo
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LessThan
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LessThanOrEqualTo
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NotBetween
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NotEqualTo
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
trait DateTimeDataValidation extends js.Object {
  /**
    *
    * Specifies the right-hand operand when the operator property is set to a binary operator such as GreaterThan (the left-hand operand is the value the user tries to enter in the cell). With the ternary operators Between and NotBetween, specifies the lower bound operand.
    When setting the value, it can be passed in as a Date, a Range object, or a string formula (where the string is either a stringified date/time in ISO8601 format, a cell reference like "=A1", or a formula like "=MIN(A1, B1)").
    When retrieving the value, it will always be returned as a string formula, for example: "=10", "=A1", "=SUM(A1:B5)", etc.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula1: String | Date | Range
  /**
    *
    * With the ternary operators Between and NotBetween, specifies the upper bound operand. Is not used with the binary operators, such as GreaterThan.
    When setting the value, it can be passed in as a Date, a Range object, or a string (where the string is either a stringified date/time in ISO8601 format, a cell reference like "=A1", or a formula like "=MIN(A1, B1)").
    When retrieving the value, it will always be returned as a string formula, for example: "=10", "=A1", "=SUM(A1:B5)", etc.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula2: js.UndefOr[String | Date | Range] = js.undefined
  /**
    *
    * The operator to use for validating the data.
    *
    * [Api set: ExcelApi 1.8]
    */
  var operator: DataValidationOperator | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqualTo | LessThanOrEqualTo
}

object DateTimeDataValidation {
  @scala.inline
  def apply(
    formula1: String | Date | Range,
    operator: DataValidationOperator | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqualTo | LessThanOrEqualTo,
    formula2: String | Date | Range = null
  ): DateTimeDataValidation = {
    val __obj = js.Dynamic.literal(formula1 = formula1.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    if (formula2 != null) __obj.updateDynamic("formula2")(formula2.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeDataValidation]
  }
}

