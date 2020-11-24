package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.SheetVisibility")
@js.native
object SheetVisibility extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.SheetVisibility with String] = js.native
  
  /* "Hidden" */ val hidden: typings.officeJs.Excel.SheetVisibility.hidden with String = js.native
  
  /* "VeryHidden" */ val veryHidden: typings.officeJs.Excel.SheetVisibility.veryHidden with String = js.native
  
  /* "Visible" */ val visible: typings.officeJs.Excel.SheetVisibility.visible with String = js.native
}
