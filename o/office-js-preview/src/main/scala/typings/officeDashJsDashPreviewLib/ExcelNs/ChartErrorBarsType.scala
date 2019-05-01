package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartErrorBarsType extends js.Object

/**
  *
  * Represents the range type for error bars.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartErrorBarsType")
@js.native
object ChartErrorBarsType extends js.Object {
  @js.native
  sealed trait custom
    extends officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsType
  
  @js.native
  sealed trait fixedValue
    extends officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsType
  
  @js.native
  sealed trait percent
    extends officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsType
  
  @js.native
  sealed trait stDev
    extends officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsType
  
  @js.native
  sealed trait stError
    extends officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsType
  
  /* "Custom" */ val custom: custom with java.lang.String = js.native
  /* "FixedValue" */ val fixedValue: fixedValue with java.lang.String = js.native
  /* "Percent" */ val percent: percent with java.lang.String = js.native
  /* "StDev" */ val stDev: stDev with java.lang.String = js.native
  /* "StError" */ val stError: stError with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsType with java.lang.String] = js.native
}

