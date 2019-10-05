package typings.officeDashJs.Excel

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
  
  /* "Down" */ val down: typings.officeDashJs.Excel.InsertShiftDirection.down with String = js.native
  /* "Right" */ val right: typings.officeDashJs.Excel.InsertShiftDirection.right with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InsertShiftDirection with String] = js.native
}

