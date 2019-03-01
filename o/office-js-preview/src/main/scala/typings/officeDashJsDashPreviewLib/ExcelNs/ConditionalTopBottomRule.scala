package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the rule of the top/bottom conditional format.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalTopBottomRule extends js.Object {
  /**
    *
    * The rank between 1 and 1000 for numeric ranks or 1 and 100 for percent ranks.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rank: scala.Double
  /**
    *
    * Format values based on the top or bottom rank.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalTopBottomCriterionType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TopItems | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TopPercent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BottomItems | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BottomPercent
}

object ConditionalTopBottomRule {
  @scala.inline
  def apply(
    rank: scala.Double,
    `type`: ConditionalTopBottomCriterionType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TopItems | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TopPercent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BottomItems | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BottomPercent
  ): ConditionalTopBottomRule = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("rank")(rank)
    __obj.asInstanceOf[ConditionalTopBottomRule]
  }
}

