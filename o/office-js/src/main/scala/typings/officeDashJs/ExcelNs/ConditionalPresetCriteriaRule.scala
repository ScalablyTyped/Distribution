package typings.officeDashJs.ExcelNs

import typings.officeDashJs.officeDashJsStrings.AboveAverage
import typings.officeDashJs.officeDashJsStrings.BelowAverage
import typings.officeDashJs.officeDashJsStrings.Blanks
import typings.officeDashJs.officeDashJsStrings.DuplicateValues
import typings.officeDashJs.officeDashJsStrings.EqualOrAboveAverage
import typings.officeDashJs.officeDashJsStrings.EqualOrBelowAverage
import typings.officeDashJs.officeDashJsStrings.Errors
import typings.officeDashJs.officeDashJsStrings.Invalid
import typings.officeDashJs.officeDashJsStrings.LastMonth
import typings.officeDashJs.officeDashJsStrings.LastSevenDays
import typings.officeDashJs.officeDashJsStrings.LastWeek
import typings.officeDashJs.officeDashJsStrings.NextMonth
import typings.officeDashJs.officeDashJsStrings.NextWeek
import typings.officeDashJs.officeDashJsStrings.NonBlanks
import typings.officeDashJs.officeDashJsStrings.NonErrors
import typings.officeDashJs.officeDashJsStrings.OneStdDevAboveAverage
import typings.officeDashJs.officeDashJsStrings.OneStdDevBelowAverage
import typings.officeDashJs.officeDashJsStrings.ThisMonth
import typings.officeDashJs.officeDashJsStrings.ThisWeek
import typings.officeDashJs.officeDashJsStrings.ThreeStdDevAboveAverage
import typings.officeDashJs.officeDashJsStrings.ThreeStdDevBelowAverage
import typings.officeDashJs.officeDashJsStrings.Today
import typings.officeDashJs.officeDashJsStrings.Tomorrow
import typings.officeDashJs.officeDashJsStrings.TwoStdDevAboveAverage
import typings.officeDashJs.officeDashJsStrings.TwoStdDevBelowAverage
import typings.officeDashJs.officeDashJsStrings.UniqueValues
import typings.officeDashJs.officeDashJsStrings.Yesterday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Preset Criteria Conditional Format Rule
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalPresetCriteriaRule extends js.Object {
  /**
    *
    * The criterion of the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
}

object ConditionalPresetCriteriaRule {
  @scala.inline
  def apply(
    criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
  ): ConditionalPresetCriteriaRule = {
    val __obj = js.Dynamic.literal(criterion = criterion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConditionalPresetCriteriaRule]
  }
}

