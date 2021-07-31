package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the bin's type of a histogram chart or pareto chart series.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartBinType")
@js.native
object ChartBinType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartBinType & String] = js.native
  
  /* "Auto" */ val auto: typings.officeJs.Excel.ChartBinType.auto & String = js.native
  
  /* "BinCount" */ val binCount: typings.officeJs.Excel.ChartBinType.binCount & String = js.native
  
  /* "BinWidth" */ val binWidth: typings.officeJs.Excel.ChartBinType.binWidth & String = js.native
  
  /* "Category" */ val category: typings.officeJs.Excel.ChartBinType.category & String = js.native
}
