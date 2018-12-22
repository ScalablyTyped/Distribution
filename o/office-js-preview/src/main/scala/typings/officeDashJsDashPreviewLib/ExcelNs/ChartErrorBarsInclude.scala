package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartErrorBarsInclude extends js.Object

/**
     *
     * Represents which error-bar parts to include.
     *
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Excel.ChartErrorBarsInclude")
@js.native
object ChartErrorBarsInclude extends js.Object {
  @js.native
  sealed trait both
    extends officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsInclude
  
  @js.native
  sealed trait minusValues
    extends officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsInclude
  
  @js.native
  sealed trait plusValues
    extends officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsInclude
  
  /* "Both" */ val both: both with java.lang.String = js.native
  /* "MinusValues" */ val minusValues: minusValues with java.lang.String = js.native
  /* "PlusValues" */ val plusValues: plusValues with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsInclude with java.lang.String] = js.native
}

