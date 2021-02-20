package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataValidationAlertStyle extends StObject
/**
  *
  * Represents Data validation error alert style. The default is "Stop".
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationAlertStyle")
@js.native
object DataValidationAlertStyle extends StObject {
  
  @js.native
  sealed trait information extends DataValidationAlertStyle
  
  @js.native
  sealed trait stop extends DataValidationAlertStyle
  
  @js.native
  sealed trait warning extends DataValidationAlertStyle
}
