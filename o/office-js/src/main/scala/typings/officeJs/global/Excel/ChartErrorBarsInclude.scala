package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents which parts of the error bar to include.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartErrorBarsInclude")
@js.native
object ChartErrorBarsInclude extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartErrorBarsInclude & String] = js.native
  
  /* "Both" */ val both: typings.officeJs.Excel.ChartErrorBarsInclude.both & String = js.native
  
  /* "MinusValues" */ val minusValues: typings.officeJs.Excel.ChartErrorBarsInclude.minusValues & String = js.native
  
  /* "PlusValues" */ val plusValues: typings.officeJs.Excel.ChartErrorBarsInclude.plusValues & String = js.native
}
