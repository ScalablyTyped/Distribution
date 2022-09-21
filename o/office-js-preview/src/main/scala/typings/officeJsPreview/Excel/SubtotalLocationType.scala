package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubtotalLocationType extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.SubtotalLocationType")
@js.native
object SubtotalLocationType extends StObject {
  
  /**
    * Subtotals are at the bottom.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait atBottom
    extends StObject
       with SubtotalLocationType
  
  /**
    * Subtotals are at the top.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait atTop
    extends StObject
       with SubtotalLocationType
  
  /**
    * Subtotals are off.
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  @js.native
  sealed trait off
    extends StObject
       with SubtotalLocationType
}
