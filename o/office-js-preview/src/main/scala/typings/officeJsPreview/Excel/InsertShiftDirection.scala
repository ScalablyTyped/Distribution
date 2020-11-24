package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InsertShiftDirection extends js.Object
/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.InsertShiftDirection")
@js.native
object InsertShiftDirection extends js.Object {
  
  @js.native
  sealed trait down extends InsertShiftDirection
  
  @js.native
  sealed trait right extends InsertShiftDirection
}
