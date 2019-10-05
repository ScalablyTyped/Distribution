package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalFormatIconRuleType extends js.Object

/**
  *
  * Represents the types of conditional format values.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatIconRuleType")
@js.native
object ConditionalFormatIconRuleType extends js.Object {
  @js.native
  sealed trait formula extends ConditionalFormatIconRuleType
  
  @js.native
  sealed trait invalid extends ConditionalFormatIconRuleType
  
  @js.native
  sealed trait number extends ConditionalFormatIconRuleType
  
  @js.native
  sealed trait percent extends ConditionalFormatIconRuleType
  
  @js.native
  sealed trait percentile extends ConditionalFormatIconRuleType
  
  /* "Formula" */ val formula: typings.officeDashJs.Excel.ConditionalFormatIconRuleType.formula with String = js.native
  /* "Invalid" */ val invalid: typings.officeDashJs.Excel.ConditionalFormatIconRuleType.invalid with String = js.native
  /* "Number" */ val number: typings.officeDashJs.Excel.ConditionalFormatIconRuleType.number with String = js.native
  /* "Percent" */ val percent: typings.officeDashJs.Excel.ConditionalFormatIconRuleType.percent with String = js.native
  /* "Percentile" */ val percentile: typings.officeDashJs.Excel.ConditionalFormatIconRuleType.percentile with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatIconRuleType with String] = js.native
}

