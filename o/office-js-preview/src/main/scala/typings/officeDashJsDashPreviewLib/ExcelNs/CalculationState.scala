package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CalculationState extends js.Object

/**
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Excel.CalculationState")
@js.native
object CalculationState extends js.Object {
  @js.native
  sealed trait calculating
    extends officeDashJsDashPreviewLib.ExcelNs.CalculationState
  
  @js.native
  sealed trait done
    extends officeDashJsDashPreviewLib.ExcelNs.CalculationState
  
  @js.native
  sealed trait pending
    extends officeDashJsDashPreviewLib.ExcelNs.CalculationState
  
  /* "Calculating" */ val calculating: calculating with java.lang.String = js.native
  /* "Done" */ val done: done with java.lang.String = js.native
  /* "Pending" */ val pending: pending with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.CalculationState with java.lang.String] = js.native
}

