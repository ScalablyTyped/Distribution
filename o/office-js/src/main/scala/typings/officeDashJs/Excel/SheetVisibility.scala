package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetVisibility extends js.Object

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.SheetVisibility")
@js.native
object SheetVisibility extends js.Object {
  @js.native
  sealed trait hidden extends SheetVisibility
  
  @js.native
  sealed trait veryHidden extends SheetVisibility
  
  @js.native
  sealed trait visible extends SheetVisibility
  
  /* "Hidden" */ val hidden: typings.officeDashJs.Excel.SheetVisibility.hidden with String = js.native
  /* "VeryHidden" */ val veryHidden: typings.officeDashJs.Excel.SheetVisibility.veryHidden with String = js.native
  /* "Visible" */ val visible: typings.officeDashJs.Excel.SheetVisibility.visible with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SheetVisibility with String] = js.native
}

