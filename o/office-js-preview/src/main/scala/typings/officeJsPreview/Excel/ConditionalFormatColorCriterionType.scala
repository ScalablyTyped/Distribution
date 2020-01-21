package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatColorCriterionType with String] = js.native
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

