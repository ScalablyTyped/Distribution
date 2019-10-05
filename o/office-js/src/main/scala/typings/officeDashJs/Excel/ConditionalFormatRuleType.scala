package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalFormatRuleType extends js.Object

/**
  *
  * Represents the types of conditional format values.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatRuleType")
@js.native
object ConditionalFormatRuleType extends js.Object {
  @js.native
  sealed trait automatic extends ConditionalFormatRuleType
  
  @js.native
  sealed trait formula extends ConditionalFormatRuleType
  
  @js.native
  sealed trait highestValue extends ConditionalFormatRuleType
  
  @js.native
  sealed trait invalid extends ConditionalFormatRuleType
  
  @js.native
  sealed trait lowestValue extends ConditionalFormatRuleType
  
  @js.native
  sealed trait number extends ConditionalFormatRuleType
  
  @js.native
  sealed trait percent extends ConditionalFormatRuleType
  
  @js.native
  sealed trait percentile extends ConditionalFormatRuleType
  
  /* "Automatic" */ val automatic: typings.officeDashJs.Excel.ConditionalFormatRuleType.automatic with String = js.native
  /* "Formula" */ val formula: typings.officeDashJs.Excel.ConditionalFormatRuleType.formula with String = js.native
  /* "HighestValue" */ val highestValue: typings.officeDashJs.Excel.ConditionalFormatRuleType.highestValue with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJs.Excel.ConditionalFormatRuleType.invalid with String = js.native
  /* "LowestValue" */ val lowestValue: typings.officeDashJs.Excel.ConditionalFormatRuleType.lowestValue with String = js.native
  /* "Number" */ val number: typings.officeDashJs.Excel.ConditionalFormatRuleType.number with String = js.native
  /* "Percent" */ val percent: typings.officeDashJs.Excel.ConditionalFormatRuleType.percent with String = js.native
  /* "Percentile" */ val percentile: typings.officeDashJs.Excel.ConditionalFormatRuleType.percentile with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatRuleType with String] = js.native
}

