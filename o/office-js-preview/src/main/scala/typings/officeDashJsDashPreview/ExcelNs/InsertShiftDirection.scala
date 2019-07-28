package typings.officeDashJsDashPreview.ExcelNs

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
  sealed trait down extends InsertShiftDirection
  
  @js.native
  sealed trait right extends InsertShiftDirection
  
  /* "Down" */ val down: typings.officeDashJsDashPreview.ExcelNs.InsertShiftDirection.down with String = js.native
  /* "Right" */ val right: typings.officeDashJsDashPreview.ExcelNs.InsertShiftDirection.right with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InsertShiftDirection with String] = js.native
}

