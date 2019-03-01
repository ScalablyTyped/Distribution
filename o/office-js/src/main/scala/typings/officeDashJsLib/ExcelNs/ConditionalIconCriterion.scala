package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an Icon Criterion which contains a type, value, an Operator, and an optional custom icon, if not using an iconset.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalIconCriterion extends js.Object {
  /**
    *
    * The custom icon for the current criterion if different from the default IconSet, else null will be returned.
    *
    * [Api set: ExcelApi 1.6]
    */
  var customIcon: js.UndefOr[Icon] = js.undefined
  /**
    *
    * A number or a formula depending on the type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: java.lang.String
  /**
    *
    * GreaterThan or GreaterThanOrEqual for each of the rule type for the Icon conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalIconCriterionOperator | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.GreaterThan | officeDashJsLib.officeDashJsLibStrings.GreaterThanOrEqual
  /**
    *
    * What the icon conditional formula should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatIconRuleType | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Percent | officeDashJsLib.officeDashJsLibStrings.Formula | officeDashJsLib.officeDashJsLibStrings.Percentile
}

object ConditionalIconCriterion {
  @scala.inline
  def apply(
    formula: java.lang.String,
    operator: ConditionalIconCriterionOperator | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.GreaterThan | officeDashJsLib.officeDashJsLibStrings.GreaterThanOrEqual,
    `type`: ConditionalFormatIconRuleType | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Percent | officeDashJsLib.officeDashJsLibStrings.Formula | officeDashJsLib.officeDashJsLibStrings.Percentile,
    customIcon: Icon = null
  ): ConditionalIconCriterion = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("formula")(formula)
    __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (customIcon != null) __obj.updateDynamic("customIcon")(customIcon)
    __obj.asInstanceOf[ConditionalIconCriterion]
  }
}

