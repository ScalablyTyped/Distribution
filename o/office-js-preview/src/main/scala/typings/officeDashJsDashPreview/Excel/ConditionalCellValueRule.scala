package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Between
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EqualTo
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.GreaterThan
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.GreaterThanOrEqual
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Invalid
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LessThan
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LessThanOrEqual
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NotBetween
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NotEqualTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a cell value conditional format rule.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalCellValueRule extends js.Object {
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula1: String
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula2: js.UndefOr[String] = js.undefined
  /**
    *
    * The operator of the text conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual
}

object ConditionalCellValueRule {
  @scala.inline
  def apply(
    formula1: String,
    operator: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual,
    formula2: String = null
  ): ConditionalCellValueRule = {
    val __obj = js.Dynamic.literal(formula1 = formula1, operator = operator.asInstanceOf[js.Any])
    if (formula2 != null) __obj.updateDynamic("formula2")(formula2)
    __obj.asInstanceOf[ConditionalCellValueRule]
  }
}

