package typings.officeJs.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CalculationMode extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.CalculationMode")
@js.native
object CalculationMode extends js.Object {
  /**
    * The default recalculation behavior where Excel calculates new formula results every time the relevant data is changed.
    *
    */
  @js.native
  sealed trait automatic extends CalculationMode
  
  /**
    * Calculates new formula results every time the relevant data is changed, unless the formula is in a data table.
    *
    */
  @js.native
  sealed trait automaticExceptTables extends CalculationMode
  
  /**
    * Calculations only occur when the user or add-in requests them.
    *
    */
  @js.native
  sealed trait manual extends CalculationMode
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CalculationMode with String] = js.native
  /* "Automatic" */ @js.native
  object automatic extends TopLevel[automatic with String]
  
  /* "AutomaticExceptTables" */ @js.native
  object automaticExceptTables extends TopLevel[automaticExceptTables with String]
  
  /* "Manual" */ @js.native
  object manual extends TopLevel[manual with String]
  
}

