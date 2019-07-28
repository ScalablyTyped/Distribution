package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOrder extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PrintOrder")
@js.native
object PrintOrder extends js.Object {
  /**
    *
    * Process down the rows before processing across pages or page fields to the right.
    *
    */
  @js.native
  sealed trait downThenOver extends PrintOrder
  
  /**
    *
    * Process across pages or page fields to the right before moving down the rows.
    *
    */
  @js.native
  sealed trait overThenDown extends PrintOrder
  
  /* "DownThenOver" */ val downThenOver: typings.officeDashJs.ExcelNs.PrintOrder.downThenOver with String = js.native
  /* "OverThenDown" */ val overThenDown: typings.officeDashJs.ExcelNs.PrintOrder.overThenDown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PrintOrder with String] = js.native
}

