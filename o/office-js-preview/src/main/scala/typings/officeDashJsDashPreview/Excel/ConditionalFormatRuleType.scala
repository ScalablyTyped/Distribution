package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatRuleType with String] = js.native
  /* "Automatic" */ @js.native
  object automatic extends TopLevel[automatic with String]
  
  /* "Formula" */ @js.native
  object formula extends TopLevel[formula with String]
  
  /* "HighestValue" */ @js.native
  object highestValue extends TopLevel[highestValue with String]
  
  /* "Invalid" */ @js.native
  object invalid extends TopLevel[invalid with String]
  
  /* "LowestValue" */ @js.native
  object lowestValue extends TopLevel[lowestValue with String]
  
  /* "Number" */ @js.native
  object number extends TopLevel[number with String]
  
  /* "Percent" */ @js.native
  object percent extends TopLevel[percent with String]
  
  /* "Percentile" */ @js.native
  object percentile extends TopLevel[percentile with String]
  
}

