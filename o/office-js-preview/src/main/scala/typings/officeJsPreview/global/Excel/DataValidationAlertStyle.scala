package typings.officeJsPreview.global.Excel

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
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.DataValidationAlertStyle with String] = js.native
  
  /* "Information" */ val information: typings.officeJsPreview.Excel.DataValidationAlertStyle.information with String = js.native
  
  /* "Stop" */ val stop: typings.officeJsPreview.Excel.DataValidationAlertStyle.stop with String = js.native
  
  /* "Warning" */ val warning: typings.officeJsPreview.Excel.DataValidationAlertStyle.warning with String = js.native
}
