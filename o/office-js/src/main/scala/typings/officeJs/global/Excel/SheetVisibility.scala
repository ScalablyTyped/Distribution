package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.SheetVisibility")
@js.native
object SheetVisibility extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.SheetVisibility & String] = js.native
  
  /* "Hidden" */ val hidden: typings.officeJs.Excel.SheetVisibility.hidden & String = js.native
  
  /* "VeryHidden" */ val veryHidden: typings.officeJs.Excel.SheetVisibility.veryHidden & String = js.native
  
  /* "Visible" */ val visible: typings.officeJs.Excel.SheetVisibility.visible & String = js.native
}
