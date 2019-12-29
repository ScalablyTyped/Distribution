package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatIconRuleType with String] = js.native
  /* "Formula" */ @js.native
  object formula extends TopLevel[formula with String]
  
  /* "Invalid" */ @js.native
  object invalid extends TopLevel[invalid with String]
  
  /* "Number" */ @js.native
  object number extends TopLevel[number with String]
  
  /* "Percent" */ @js.native
  object percent extends TopLevel[percent with String]
  
  /* "Percentile" */ @js.native
  object percentile extends TopLevel[percentile with String]
  
}

