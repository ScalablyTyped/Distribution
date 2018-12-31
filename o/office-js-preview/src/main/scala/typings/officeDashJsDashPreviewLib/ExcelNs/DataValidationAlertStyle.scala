package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait information
    extends officeDashJsDashPreviewLib.ExcelNs.DataValidationAlertStyle
  
  @js.native
  sealed trait stop
    extends officeDashJsDashPreviewLib.ExcelNs.DataValidationAlertStyle
  
  @js.native
  sealed trait warning
    extends officeDashJsDashPreviewLib.ExcelNs.DataValidationAlertStyle
  
  /* "Information" */ val information: information with java.lang.String = js.native
  /* "Stop" */ val stop: stop with java.lang.String = js.native
  /* "Warning" */ val warning: warning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.DataValidationAlertStyle with java.lang.String
  ] = js.native
}

