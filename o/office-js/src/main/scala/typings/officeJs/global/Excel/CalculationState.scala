package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the state of calculation across the entire Excel application.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.CalculationState")
@js.native
object CalculationState extends js.Object {
  /* "Calculating" */ val calculating: typings.officeJs.Excel.CalculationState.calculating with String = js.native
  /* "Done" */ val done: typings.officeJs.Excel.CalculationState.done with String = js.native
  /* "Pending" */ val pending: typings.officeJs.Excel.CalculationState.pending with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.CalculationState with String] = js.native
}

