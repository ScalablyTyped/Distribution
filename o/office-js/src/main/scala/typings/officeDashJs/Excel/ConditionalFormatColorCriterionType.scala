package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalFormatColorCriterionType extends js.Object

/**
  *
  * Represents the types of conditional format values.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatColorCriterionType")
@js.native
object ConditionalFormatColorCriterionType extends js.Object {
  @js.native
  sealed trait formula extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait highestValue extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait invalid extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait lowestValue extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait number extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait percent extends ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait percentile extends ConditionalFormatColorCriterionType
  
  /* "Formula" */ val formula: typings.officeDashJs.Excel.ConditionalFormatColorCriterionType.formula with String = js.native
  /* "HighestValue" */ val highestValue: typings.officeDashJs.Excel.ConditionalFormatColorCriterionType.highestValue with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJs.Excel.ConditionalFormatColorCriterionType.invalid with String = js.native
  /* "LowestValue" */ val lowestValue: typings.officeDashJs.Excel.ConditionalFormatColorCriterionType.lowestValue with String = js.native
  /* "Number" */ val number: typings.officeDashJs.Excel.ConditionalFormatColorCriterionType.number with String = js.native
  /* "Percent" */ val percent: typings.officeDashJs.Excel.ConditionalFormatColorCriterionType.percent with String = js.native
  /* "Percentile" */ val percentile: typings.officeDashJs.Excel.ConditionalFormatColorCriterionType.percentile with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatColorCriterionType with String] = js.native
}

