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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the preset criteria conditional format rule.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalPresetCriteriaRule extends StObject {
  
  /**
    * The criterion of the conditional format.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
}
object ConditionalPresetCriteriaRule {
  
  inline def apply(
    criterion: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
  ): ConditionalPresetCriteriaRule = {
    val __obj = js.Dynamic.literal(criterion = criterion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalPresetCriteriaRule]
  }
  
  extension [Self <: ConditionalPresetCriteriaRule](x: Self) {
    
    inline def setCriterion(
      value: ConditionalFormatPresetCriterion | Invalid | Blanks | NonBlanks | Errors | NonErrors | Yesterday | Today | Tomorrow | LastSevenDays | LastWeek | ThisWeek | NextWeek | LastMonth | ThisMonth | NextMonth | AboveAverage | BelowAverage | EqualOrAboveAverage | EqualOrBelowAverage | OneStdDevAboveAverage | OneStdDevBelowAverage | TwoStdDevAboveAverage | TwoStdDevBelowAverage | ThreeStdDevAboveAverage | ThreeStdDevBelowAverage | UniqueValues | DuplicateValues
    ): Self = StObject.set(x, "criterion", value.asInstanceOf[js.Any])
  }
}
