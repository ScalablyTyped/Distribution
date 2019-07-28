package typings.officeDashJsDashPreview.ExcelNs

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
    *
    * The default recalculation behavior where Excel calculates new formula results every time the relevant data is changed.
    *
    */
  @js.native
  sealed trait automatic extends CalculationMode
  
  /**
    *
    * Calculates new formula results every time the relevant data is changed, unless the formula is in a data table.
    *
    */
  @js.native
  sealed trait automaticExceptTables extends CalculationMode
  
  /**
    *
    * Calculations only occur when the user or add-in requests them.
    *
    */
  @js.native
  sealed trait manual extends CalculationMode
  
  /* "Automatic" */ val automatic: typings.officeDashJsDashPreview.ExcelNs.CalculationMode.automatic with String = js.native
  /* "AutomaticExceptTables" */ val automaticExceptTables: typings.officeDashJsDashPreview.ExcelNs.CalculationMode.automaticExceptTables with String = js.native
  /* "Manual" */ val manual: typings.officeDashJsDashPreview.ExcelNs.CalculationMode.manual with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CalculationMode with String] = js.native
}

