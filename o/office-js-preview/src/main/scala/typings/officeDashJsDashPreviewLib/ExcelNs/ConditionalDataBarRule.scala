package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  var `type`: ConditionalFormatRuleType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LowestValue | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.HighestValue | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Number | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Formula | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percentile
}

object ConditionalDataBarRule {
  @scala.inline
  def apply(
    `type`: ConditionalFormatRuleType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LowestValue | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.HighestValue | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Number | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Formula | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percentile,
    formula: java.lang.String = null
  ): ConditionalDataBarRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula)
    __obj.asInstanceOf[ConditionalDataBarRule]
  }
}

