package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents Data validation error alert style. The default is "Stop".
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationAlertStyle")
@js.native
object DataValidationAlertStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.DataValidationAlertStyle with String] = js.native
  
  /* "Information" */ val information: typings.officeJs.Excel.DataValidationAlertStyle.information with String = js.native
  
  /* "Stop" */ val stop: typings.officeJs.Excel.DataValidationAlertStyle.stop with String = js.native
  
  /* "Warning" */ val warning: typings.officeJs.Excel.DataValidationAlertStyle.warning with String = js.native
}
