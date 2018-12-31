package typings
package officeDashJsLib.ExcelNs

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
  sealed trait formula
    extends officeDashJsLib.ExcelNs.ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait highestValue
    extends officeDashJsLib.ExcelNs.ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait invalid
    extends officeDashJsLib.ExcelNs.ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait lowestValue
    extends officeDashJsLib.ExcelNs.ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait number
    extends officeDashJsLib.ExcelNs.ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait percent
    extends officeDashJsLib.ExcelNs.ConditionalFormatColorCriterionType
  
  @js.native
  sealed trait percentile
    extends officeDashJsLib.ExcelNs.ConditionalFormatColorCriterionType
  
  /* "Formula" */ val formula: formula with java.lang.String = js.native
  /* "HighestValue" */ val highestValue: highestValue with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "LowestValue" */ val lowestValue: lowestValue with java.lang.String = js.native
  /* "Number" */ val number: number with java.lang.String = js.native
  /* "Percent" */ val percent: percent with java.lang.String = js.native
  /* "Percentile" */ val percentile: percentile with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsLib.ExcelNs.ConditionalFormatColorCriterionType with java.lang.String
  ] = js.native
}

