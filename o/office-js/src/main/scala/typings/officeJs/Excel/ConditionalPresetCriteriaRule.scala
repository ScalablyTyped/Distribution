package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.AboveAverage
import typings.officeJs.officeJsStrings.BelowAverage
import typings.officeJs.officeJsStrings.Blanks
import typings.officeJs.officeJsStrings.DuplicateValues
import typings.officeJs.officeJsStrings.EqualOrAboveAverage
import typings.officeJs.officeJsStrings.EqualOrBelowAverage
import typings.officeJs.officeJsStrings.Errors
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.LastMonth
import typings.officeJs.officeJsStrings.LastSevenDays
import typings.officeJs.officeJsStrings.LastWeek
import typings.officeJs.officeJsStrings.NextMonth
import typings.officeJs.officeJsStrings.NextWeek
import typings.officeJs.officeJsStrings.NonBlanks
import typings.officeJs.officeJsStrings.NonErrors
import typings.officeJs.officeJsStrings.OneStdDevAboveAverage
import typings.officeJs.officeJsStrings.OneStdDevBelowAverage
import typings.officeJs.officeJsStrings.ThisMonth
import typings.officeJs.officeJsStrings.ThisWeek
import typings.officeJs.officeJsStrings.ThreeStdDevAboveAverage
import typings.officeJs.officeJsStrings.ThreeStdDevBelowAverage
import typings.officeJs.officeJsStrings.Today
import typings.officeJs.officeJsStrings.Tomorrow
import typings.officeJs.officeJsStrings.TwoStdDevAboveAverage
import typings.officeJs.officeJsStrings.TwoStdDevBelowAverage
import typings.officeJs.officeJsStrings.UniqueValues
import typings.officeJs.officeJsStrings.Yesterday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Preset Criteria Conditional Format Rule
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalPresetCriteriaRule extends js.Object {
  
  /**
    *
    * The criterion of the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues = js.native
}
object ConditionalPresetCriteriaRule {
  
  @scala.inline
  def apply(
    criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
  ): ConditionalPresetCriteriaRule = {
    val __obj = js.Dynamic.literal(criterion = criterion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalPresetCriteriaRule]
  }
  
  @scala.inline
  implicit class ConditionalPresetCriteriaRuleOps[Self <: ConditionalPresetCriteriaRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCriterion(
      value: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
    ): Self = this.set("criterion", value.asInstanceOf[js.Any])
  }
}
