package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Calculations in progress.
    *
    */
  @js.native
  sealed trait calculating extends CalculationState
  
  /**
    * Calculations complete.
    *
    */
  @js.native
  sealed trait done extends CalculationState
  
  /**
    * Changes that trigger calculation have been made, but a recalculation has not yet been performed.
    *
    */
  @js.native
  sealed trait pending extends CalculationState
}
