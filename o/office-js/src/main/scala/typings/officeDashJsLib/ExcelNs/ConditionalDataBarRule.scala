package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a rule-type for a Data Bar.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalDataBarRule extends js.Object {
  /**
    *
    * The formula, if required, to evaluate the databar rule on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The type of rule for the databar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatRuleType | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.LowestValue | officeDashJsLib.officeDashJsLibStrings.HighestValue | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Percent | officeDashJsLib.officeDashJsLibStrings.Formula | officeDashJsLib.officeDashJsLibStrings.Percentile
}

object ConditionalDataBarRule {
  @scala.inline
  def apply(
    `type`: ConditionalFormatRuleType | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.LowestValue | officeDashJsLib.officeDashJsLibStrings.HighestValue | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Percent | officeDashJsLib.officeDashJsLibStrings.Formula | officeDashJsLib.officeDashJsLibStrings.Percentile,
    formula: java.lang.String = null
  ): ConditionalDataBarRule = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula)
    __obj.asInstanceOf[ConditionalDataBarRule]
  }
}

