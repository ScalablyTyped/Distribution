package typings.officeDashJsDashPreview.ExcelNs

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
  sealed trait calculating extends CalculationState
  
  /**
    *
    * Calculations complete.
    *
    */
  @js.native
  sealed trait done extends CalculationState
  
  /**
    *
    * Changes that trigger calculation have been made, but a recalculation has not yet been performed.
    *
    */
  @js.native
  sealed trait pending extends CalculationState
  
  /* "Calculating" */ val calculating: typings.officeDashJsDashPreview.ExcelNs.CalculationState.calculating with String = js.native
  /* "Done" */ val done: typings.officeDashJsDashPreview.ExcelNs.CalculationState.done with String = js.native
  /* "Pending" */ val pending: typings.officeDashJsDashPreview.ExcelNs.CalculationState.pending with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CalculationState with String] = js.native
}

