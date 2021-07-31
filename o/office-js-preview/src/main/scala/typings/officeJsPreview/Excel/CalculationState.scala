package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CalculationState extends StObject
/**
  *
  * Represents the state of calculation across the entire Excel application.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.CalculationState")
@js.native
object CalculationState extends StObject {
  
  /**
    * Calculations in progress.
    *
    */
  @js.native
  sealed trait calculating
    extends StObject
       with CalculationState
  
  /**
    * Calculations complete.
    *
    */
  @js.native
  sealed trait done
    extends StObject
       with CalculationState
  
  /**
    * Changes that trigger calculation have been made, but a recalculation has not yet been performed.
    *
    */
  @js.native
  sealed trait pending
    extends StObject
       with CalculationState
}
