package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.CalculationMode")
@js.native
object CalculationMode extends js.Object {
  /* "Automatic" */ val automatic: typings.officeJs.Excel.CalculationMode.automatic with String = js.native
  /* "AutomaticExceptTables" */ val automaticExceptTables: typings.officeJs.Excel.CalculationMode.automaticExceptTables with String = js.native
  /* "Manual" */ val manual: typings.officeJs.Excel.CalculationMode.manual with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.CalculationMode with String] = js.native
}

