package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataValidationAlertStyle extends js.Object

/**
  *
  * Represents Data validation error alert style. The default is "Stop".
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationAlertStyle")
@js.native
object DataValidationAlertStyle extends js.Object {
  @js.native
  sealed trait information extends DataValidationAlertStyle
  
  @js.native
  sealed trait stop extends DataValidationAlertStyle
  
  @js.native
  sealed trait warning extends DataValidationAlertStyle
  
  /* "Information" */ val information: typings.officeDashJs.ExcelNs.DataValidationAlertStyle.information with String = js.native
  /* "Stop" */ val stop: typings.officeDashJs.ExcelNs.DataValidationAlertStyle.stop with String = js.native
  /* "Warning" */ val warning: typings.officeDashJs.ExcelNs.DataValidationAlertStyle.warning with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DataValidationAlertStyle with String] = js.native
}

