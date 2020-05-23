package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents Data validation error alert style. The default is "Stop".
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationAlertStyle")
@js.native
object DataValidationAlertStyle extends js.Object {
  /* "Information" */ val information: typings.officeJs.Excel.DataValidationAlertStyle.information with String = js.native
  /* "Stop" */ val stop: typings.officeJs.Excel.DataValidationAlertStyle.stop with String = js.native
  /* "Warning" */ val warning: typings.officeJs.Excel.DataValidationAlertStyle.warning with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.DataValidationAlertStyle with String] = js.native
}

