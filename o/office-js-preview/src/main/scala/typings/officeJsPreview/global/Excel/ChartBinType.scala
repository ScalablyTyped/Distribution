package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the bin's type of a histogram chart or pareto chart series.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartBinType")
@js.native
object ChartBinType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartBinType with String] = js.native
  
  /* "Auto" */ val auto: typings.officeJsPreview.Excel.ChartBinType.auto with String = js.native
  
  /* "BinCount" */ val binCount: typings.officeJsPreview.Excel.ChartBinType.binCount with String = js.native
  
  /* "BinWidth" */ val binWidth: typings.officeJsPreview.Excel.ChartBinType.binWidth with String = js.native
  
  /* "Category" */ val category: typings.officeJsPreview.Excel.ChartBinType.category with String = js.native
}
