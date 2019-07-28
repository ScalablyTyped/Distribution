package typings.officeDashJs.ExcelNs

import typings.officeDashJs.officeDashJsStrings.Formula
import typings.officeDashJs.officeDashJsStrings.GreaterThan
import typings.officeDashJs.officeDashJsStrings.GreaterThanOrEqual
import typings.officeDashJs.officeDashJsStrings.Invalid
import typings.officeDashJs.officeDashJsStrings.Number
import typings.officeDashJs.officeDashJsStrings.Percent
import typings.officeDashJs.officeDashJsStrings.Percentile
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
  var formula: String
  /**
    *
    * GreaterThan or GreaterThanOrEqual for each of the rule type for the Icon conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalIconCriterionOperator | Invalid | GreaterThan | GreaterThanOrEqual
  /**
    *
    * What the icon conditional formula should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatIconRuleType | Invalid | Number | Percent | Formula | Percentile
}

object ConditionalIconCriterion {
  @scala.inline
  def apply(
    formula: String,
    operator: ConditionalIconCriterionOperator | Invalid | GreaterThan | GreaterThanOrEqual,
    `type`: ConditionalFormatIconRuleType | Invalid | Number | Percent | Formula | Percentile,
    customIcon: Icon = null
  ): ConditionalIconCriterion = {
    val __obj = js.Dynamic.literal(formula = formula, operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (customIcon != null) __obj.updateDynamic("customIcon")(customIcon)
    __obj.asInstanceOf[ConditionalIconCriterion]
  }
}

