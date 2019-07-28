package typings.officeDashJs.ExcelNs

import typings.officeDashJs.officeDashJsStrings.Between
import typings.officeDashJs.officeDashJsStrings.EqualTo
import typings.officeDashJs.officeDashJsStrings.GreaterThan
import typings.officeDashJs.officeDashJsStrings.GreaterThanOrEqual
import typings.officeDashJs.officeDashJsStrings.Invalid
import typings.officeDashJs.officeDashJsStrings.LessThan
import typings.officeDashJs.officeDashJsStrings.LessThanOrEqual
import typings.officeDashJs.officeDashJsStrings.NotBetween
import typings.officeDashJs.officeDashJsStrings.NotEqualTo
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

