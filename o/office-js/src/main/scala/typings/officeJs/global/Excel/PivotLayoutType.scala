package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.PivotLayoutType")
@js.native
object PivotLayoutType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.PivotLayoutType & String] = js.native
  
  /* "Compact" */ val compact: typings.officeJs.Excel.PivotLayoutType.compact & String = js.native
  
  /* "Outline" */ val outline: typings.officeJs.Excel.PivotLayoutType.outline & String = js.native
  
  /* "Tabular" */ val tabular: typings.officeJs.Excel.PivotLayoutType.tabular & String = js.native
}
