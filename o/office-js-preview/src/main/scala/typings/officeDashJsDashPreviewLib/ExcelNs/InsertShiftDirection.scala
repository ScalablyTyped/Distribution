package typings
package officeDashJsDashPreviewLib.ExcelNs

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
    extends officeDashJsDashPreviewLib.ExcelNs.InsertShiftDirection
  
  @js.native
  sealed trait right
    extends officeDashJsDashPreviewLib.ExcelNs.InsertShiftDirection
  
  /* "Down" */ val down: down with java.lang.String = js.native
  /* "Right" */ val right: right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.InsertShiftDirection with java.lang.String] = js.native
}

