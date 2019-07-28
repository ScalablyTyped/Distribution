package typings.officeDashJs.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartBinType extends js.Object

/**
  *
  * Specifies the bin's type of a histogram chart or pareto chart series.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartBinType")
@js.native
object ChartBinType extends js.Object {
  @js.native
  sealed trait auto extends ChartBinType
  
  @js.native
  sealed trait binCount extends ChartBinType
  
  @js.native
  sealed trait binWidth extends ChartBinType
  
  @js.native
  sealed trait category extends ChartBinType
  
  /* "Auto" */ val auto: typings.officeDashJs.ExcelNs.ChartBinType.auto with String = js.native
  /* "BinCount" */ val binCount: typings.officeDashJs.ExcelNs.ChartBinType.binCount with String = js.native
  /* "BinWidth" */ val binWidth: typings.officeDashJs.ExcelNs.ChartBinType.binWidth with String = js.native
  /* "Category" */ val category: typings.officeDashJs.ExcelNs.ChartBinType.category with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartBinType with String] = js.native
}

