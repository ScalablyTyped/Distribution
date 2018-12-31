package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait formula
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatIconRuleType
  
  @js.native
  sealed trait invalid
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatIconRuleType
  
  @js.native
  sealed trait number
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatIconRuleType
  
  @js.native
  sealed trait percent
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatIconRuleType
  
  @js.native
  sealed trait percentile
    extends officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatIconRuleType
  
  /* "Formula" */ val formula: formula with java.lang.String = js.native
  /* "Invalid" */ val invalid: invalid with java.lang.String = js.native
  /* "Number" */ val number: number with java.lang.String = js.native
  /* "Percent" */ val percent: percent with java.lang.String = js.native
  /* "Percentile" */ val percentile: percentile with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ConditionalFormatIconRuleType with java.lang.String
  ] = js.native
}

