package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  var formula1: java.lang.String
  /**
    *
    * The formula, if required, to evaluate the conditional format rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula2: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The operator of the text conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalCellValueOperator | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Between | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NotBetween | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EqualTo | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NotEqualTo | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GreaterThan | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LessThan | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GreaterThanOrEqual | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LessThanOrEqual
}

object ConditionalCellValueRule {
  @scala.inline
  def apply(
    formula1: java.lang.String,
    operator: ConditionalCellValueOperator | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Between | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NotBetween | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EqualTo | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NotEqualTo | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GreaterThan | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LessThan | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GreaterThanOrEqual | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LessThanOrEqual,
    formula2: java.lang.String = null
  ): ConditionalCellValueRule = {
    val __obj = js.Dynamic.literal(formula1 = formula1, operator = operator.asInstanceOf[js.Any])
    if (formula2 != null) __obj.updateDynamic("formula2")(formula2)
    __obj.asInstanceOf[ConditionalCellValueRule]
  }
}

