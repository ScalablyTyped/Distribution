package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Between
import typings.officeJs.officeJsStrings.EqualTo
import typings.officeJs.officeJsStrings.GreaterThan
import typings.officeJs.officeJsStrings.GreaterThanOrEqual
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.LessThan
import typings.officeJs.officeJsStrings.LessThanOrEqual
import typings.officeJs.officeJsStrings.NotBetween
import typings.officeJs.officeJsStrings.NotEqualTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a cell value conditional format rule.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalCellValueRule extends js.Object {
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula1: String = js.native
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula2: js.UndefOr[String] = js.native
  /**
    *
    * The operator of the cell value conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual = js.native
}

object ConditionalCellValueRule {
  @scala.inline
  def apply(
    formula1: String,
    operator: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual
  ): ConditionalCellValueRule = {
    val __obj = js.Dynamic.literal(formula1 = formula1.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalCellValueRule]
  }
  @scala.inline
  implicit class ConditionalCellValueRuleOps[Self <: ConditionalCellValueRule] (val x: Self) extends AnyVal {
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
    def setFormula1(value: String): Self = this.set("formula1", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(
      value: ConditionalCellValueOperator | Invalid | Between | NotBetween | EqualTo | NotEqualTo | GreaterThan | LessThan | GreaterThanOrEqual | LessThanOrEqual
    ): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormula2(value: String): Self = this.set("formula2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormula2: Self = this.set("formula2", js.undefined)
  }
  
}

