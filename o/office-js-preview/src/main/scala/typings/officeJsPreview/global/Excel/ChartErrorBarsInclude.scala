package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents which parts of the error bar to include.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartErrorBarsInclude")
@js.native
object ChartErrorBarsInclude extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartErrorBarsInclude & String] = js.native
  
  /* "Both" */ val both: typings.officeJsPreview.Excel.ChartErrorBarsInclude.both & String = js.native
  
  /* "MinusValues" */ val minusValues: typings.officeJsPreview.Excel.ChartErrorBarsInclude.minusValues & String = js.native
  
  /* "PlusValues" */ val plusValues: typings.officeJsPreview.Excel.ChartErrorBarsInclude.plusValues & String = js.native
}
