package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait automatic
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatRuleType
  
  @js.native
  sealed trait formula
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatRuleType
  
  @js.native
  sealed trait highestValue
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatRuleType
  
  @js.native
  sealed trait invalid
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatRuleType
  
  @js.native
  sealed trait lowestValue
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatRuleType
  
  @js.native
  sealed trait number
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatRuleType
  
  @js.native
  sealed trait percent
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatRuleType
  
  @js.native
  sealed trait percentile
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatRuleType
  
  /* "Automatic" */ val automatic: automatic with java.lang.String = js.native
  /* "Formula" */ val formula: formula with java.lang.String = js.native
  /* "HighestValue" */ val highestValue: highestValue with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "LowestValue" */ val lowestValue: lowestValue with java.lang.String = js.native
  /* "Number" */ val number: number with java.lang.String = js.native
  /* "Percent" */ val percent: percent with java.lang.String = js.native
  /* "Percentile" */ val percentile: percentile with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatRuleType with java.lang.String
  ] = js.native
}

