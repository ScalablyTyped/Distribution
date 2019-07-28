package typings.officeDashJs.ExcelNs

import typings.officeDashJs.officeDashJsStrings.BottomItems
import typings.officeDashJs.officeDashJsStrings.BottomPercent
import typings.officeDashJs.officeDashJsStrings.Invalid
import typings.officeDashJs.officeDashJsStrings.TopItems
import typings.officeDashJs.officeDashJsStrings.TopPercent
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
  var rank: Double
  /**
    *
    * Format values based on the top or bottom rank.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalTopBottomCriterionType | Invalid | TopItems | TopPercent | BottomItems | BottomPercent
}

object ConditionalTopBottomRule {
  @scala.inline
  def apply(
    rank: Double,
    `type`: ConditionalTopBottomCriterionType | Invalid | TopItems | TopPercent | BottomItems | BottomPercent
  ): ConditionalTopBottomRule = {
    val __obj = js.Dynamic.literal(rank = rank)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalTopBottomRule]
  }
}

