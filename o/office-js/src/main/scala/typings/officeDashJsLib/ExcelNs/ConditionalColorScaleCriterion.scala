package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a Color Scale Criterion which contains a type, value, and a color.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalColorScaleCriterion extends js.Object {
  /**
    *
    * HTML color code representation of the color scale color. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * A number, a formula, or null (if Type is LowestValue).
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * What the criterion conditional formula should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatColorCriterionType | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.LowestValue | officeDashJsLib.officeDashJsLibStrings.HighestValue | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Percent | officeDashJsLib.officeDashJsLibStrings.Formula | officeDashJsLib.officeDashJsLibStrings.Percentile
}

object ConditionalColorScaleCriterion {
  @scala.inline
  def apply(
    `type`: ConditionalFormatColorCriterionType | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.LowestValue | officeDashJsLib.officeDashJsLibStrings.HighestValue | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Percent | officeDashJsLib.officeDashJsLibStrings.Formula | officeDashJsLib.officeDashJsLibStrings.Percentile,
    color: java.lang.String = null,
    formula: java.lang.String = null
  ): ConditionalColorScaleCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    __obj.asInstanceOf[ConditionalColorScaleCriterion]
  }
}

