package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeleteShiftDirection extends js.Object

/**
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.DeleteShiftDirection")
@js.native
object DeleteShiftDirection extends js.Object {
  @js.native
  sealed trait left
    extends officeDashJsLib.ExcelNs.DeleteShiftDirection
  
  @js.native
  sealed trait up
    extends officeDashJsLib.ExcelNs.DeleteShiftDirection
  
  /* "Left" */ val left: left with java.lang.String = js.native
  /* "Up" */ val up: up with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.DeleteShiftDirection with java.lang.String] = js.native
}

