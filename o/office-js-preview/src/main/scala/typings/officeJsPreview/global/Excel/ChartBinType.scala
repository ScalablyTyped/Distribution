package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the bin type of a histogram chart or pareto chart series.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartBinType")
@js.native
object ChartBinType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartBinType & String] = js.native
  
  /* "Auto" */ val auto: typings.officeJsPreview.Excel.ChartBinType.auto & String = js.native
  
  /* "BinCount" */ val binCount: typings.officeJsPreview.Excel.ChartBinType.binCount & String = js.native
  
  /* "BinWidth" */ val binWidth: typings.officeJsPreview.Excel.ChartBinType.binWidth & String = js.native
  
  /* "Category" */ val category: typings.officeJsPreview.Excel.ChartBinType.category & String = js.native
}
