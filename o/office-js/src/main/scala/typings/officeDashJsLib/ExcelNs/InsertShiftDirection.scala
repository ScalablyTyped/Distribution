package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InsertShiftDirection extends js.Object

/**
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.InsertShiftDirection")
@js.native
object InsertShiftDirection extends js.Object {
  @js.native
  sealed trait down
    extends officeDashJsLib.ExcelNs.InsertShiftDirection
  
  @js.native
  sealed trait right
    extends officeDashJsLib.ExcelNs.InsertShiftDirection
  
  /* "Down" */ val down: down with java.lang.String = js.native
  /* "Right" */ val right: right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.InsertShiftDirection with java.lang.String] = js.native
}

