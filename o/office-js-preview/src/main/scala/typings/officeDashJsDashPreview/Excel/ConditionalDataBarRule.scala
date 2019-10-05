package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Formula
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.HighestValue
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Invalid
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LowestValue
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Number
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Percent
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Percentile
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
  var formula: js.UndefOr[String] = js.undefined
  /**
    *
    * The type of rule for the databar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatRuleType | Invalid | Automatic | LowestValue | HighestValue | Number | Percent | Formula | Percentile
}

object ConditionalDataBarRule {
  @scala.inline
  def apply(
    `type`: ConditionalFormatRuleType | Invalid | Automatic | LowestValue | HighestValue | Number | Percent | Formula | Percentile,
    formula: String = null
  ): ConditionalDataBarRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula)
    __obj.asInstanceOf[ConditionalDataBarRule]
  }
}

