package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InsertShiftDirection extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.InsertShiftDirection")
@js.native
object InsertShiftDirection extends StObject {
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait down
    extends StObject
       with InsertShiftDirection
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  @js.native
  sealed trait right
    extends StObject
       with InsertShiftDirection
}
