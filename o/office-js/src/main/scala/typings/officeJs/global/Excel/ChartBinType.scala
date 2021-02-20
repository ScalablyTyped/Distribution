package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
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
object ChartBinType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartBinType with String] = js.native
  
  /* "Auto" */ val auto: typings.officeJs.Excel.ChartBinType.auto with String = js.native
  
  /* "BinCount" */ val binCount: typings.officeJs.Excel.ChartBinType.binCount with String = js.native
  
  /* "BinWidth" */ val binWidth: typings.officeJs.Excel.ChartBinType.binWidth with String = js.native
  
  /* "Category" */ val category: typings.officeJs.Excel.ChartBinType.category with String = js.native
}
