package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubtotalLocationType extends js.Object
/**
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.SubtotalLocationType")
@js.native
object SubtotalLocationType extends js.Object {
  
  /**
    * Subtotals are at the bottom.
    *
    */
  @js.native
  sealed trait atBottom extends SubtotalLocationType
  
  /**
    * Subtotals are at the top.
    *
    */
  @js.native
  sealed trait atTop extends SubtotalLocationType
  
  /**
    * Subtotals are off.
    *
    */
  @js.native
  sealed trait off extends SubtotalLocationType
}
