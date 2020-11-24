package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.PageOrientation")
@js.native
object PageOrientation extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.PageOrientation with String] = js.native
  
  /* "Landscape" */ val landscape: typings.officeJs.Excel.PageOrientation.landscape with String = js.native
  
  /* "Portrait" */ val portrait: typings.officeJs.Excel.PageOrientation.portrait with String = js.native
}
