package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.DataValidationAlertStyle.information
import typings.officeDashJs.Excel.DataValidationAlertStyle.stop
import typings.officeDashJs.Excel.DataValidationAlertStyle.warning
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DataValidationAlertStyle with String] = js.native
  /* "Information" */ @js.native
  object information extends TopLevel[information with String]
  
  /* "Stop" */ @js.native
  object stop extends TopLevel[stop with String]
  
  /* "Warning" */ @js.native
  object warning extends TopLevel[warning with String]
  
}

