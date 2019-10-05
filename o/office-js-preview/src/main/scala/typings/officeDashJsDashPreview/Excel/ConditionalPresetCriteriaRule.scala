package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.AboveAverage
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BelowAverage
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Blanks
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DuplicateValues
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EqualOrAboveAverage
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.EqualOrBelowAverage
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Errors
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Invalid
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LastMonth
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LastSevenDays
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.LastWeek
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NextMonth
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NextWeek
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NonBlanks
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.NonErrors
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.OneStdDevAboveAverage
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.OneStdDevBelowAverage
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThisMonth
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThisWeek
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeStdDevAboveAverage
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeStdDevBelowAverage
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Today
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Tomorrow
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TwoStdDevAboveAverage
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TwoStdDevBelowAverage
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.UniqueValues
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Yesterday
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

