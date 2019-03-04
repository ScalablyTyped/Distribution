package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  var operator: ConditionalIconCriterionOperator | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GreaterThan | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GreaterThanOrEqual
  /**
    *
    * What the icon conditional formula should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatIconRuleType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Number | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Formula | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percentile
}

object ConditionalIconCriterion {
  @scala.inline
  def apply(
    formula: java.lang.String,
    operator: ConditionalIconCriterionOperator | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GreaterThan | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GreaterThanOrEqual,
    `type`: ConditionalFormatIconRuleType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Number | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Formula | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percentile,
    customIcon: Icon = null
  ): ConditionalIconCriterion = {
    val __obj = js.Dynamic.literal(formula = formula, operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (customIcon != null) __obj.updateDynamic("customIcon")(customIcon)
    __obj.asInstanceOf[ConditionalIconCriterion]
  }
}

