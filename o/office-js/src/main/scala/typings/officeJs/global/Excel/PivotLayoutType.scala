package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.PivotLayoutType")
@js.native
object PivotLayoutType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.PivotLayoutType with String] = js.native
  
  /* "Compact" */ val compact: typings.officeJs.Excel.PivotLayoutType.compact with String = js.native
  
  /* "Outline" */ val outline: typings.officeJs.Excel.PivotLayoutType.outline with String = js.native
  
  /* "Tabular" */ val tabular: typings.officeJs.Excel.PivotLayoutType.tabular with String = js.native
}
