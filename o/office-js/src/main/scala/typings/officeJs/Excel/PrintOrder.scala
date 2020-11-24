package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintOrder extends js.Object
/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PrintOrder")
@js.native
object PrintOrder extends js.Object {
  
  /**
    * Process down the rows before processing across pages or page fields to the right.
    *
    */
  @js.native
  sealed trait downThenOver extends PrintOrder
  
  /**
    * Process across pages or page fields to the right before moving down the rows.
    *
    */
  @js.native
  sealed trait overThenDown extends PrintOrder
}
