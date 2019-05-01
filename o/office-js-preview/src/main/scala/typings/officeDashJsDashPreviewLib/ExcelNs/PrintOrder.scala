package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  sealed trait downThenOver
    extends officeDashJsDashPreviewLib.ExcelNs.PrintOrder
  
  /**
    *
    * Process across pages or page fields to the right before moving down the rows.
    *
    */
  @js.native
  sealed trait overThenDown
    extends officeDashJsDashPreviewLib.ExcelNs.PrintOrder
  
  /* "DownThenOver" */ val downThenOver: downThenOver with java.lang.String = js.native
  /* "OverThenDown" */ val overThenDown: overThenDown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.PrintOrder with java.lang.String] = js.native
}

