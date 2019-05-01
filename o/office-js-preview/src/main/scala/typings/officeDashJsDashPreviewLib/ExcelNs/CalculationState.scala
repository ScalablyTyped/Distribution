package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CalculationState extends js.Object

/**
  *
  * Represents the state of calculation across the entire Excel application.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.CalculationState")
@js.native
object CalculationState extends js.Object {
  /**
    *
    * Calculations in progress.
    *
    */
  @js.native
  sealed trait calculating
    extends officeDashJsDashPreviewLib.ExcelNs.CalculationState
  
  /**
    *
    * Calculations complete.
    *
    */
  @js.native
  sealed trait done
    extends officeDashJsDashPreviewLib.ExcelNs.CalculationState
  
  /**
    *
    * Changes that trigger calculation have been made, but a recalculation has not yet been performed.
    *
    */
  @js.native
  sealed trait pending
    extends officeDashJsDashPreviewLib.ExcelNs.CalculationState
  
  /* "Calculating" */ val calculating: calculating with java.lang.String = js.native
  /* "Done" */ val done: done with java.lang.String = js.native
  /* "Pending" */ val pending: pending with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.CalculationState with java.lang.String] = js.native
}

