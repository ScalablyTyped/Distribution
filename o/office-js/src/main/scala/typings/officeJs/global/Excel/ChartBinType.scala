package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies the bin's type of a histogram chart or pareto chart series.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartBinType")
@js.native
object ChartBinType extends js.Object {
  /* "Auto" */ val auto: typings.officeJs.Excel.ChartBinType.auto with String = js.native
  /* "BinCount" */ val binCount: typings.officeJs.Excel.ChartBinType.binCount with String = js.native
  /* "BinWidth" */ val binWidth: typings.officeJs.Excel.ChartBinType.binWidth with String = js.native
  /* "Category" */ val category: typings.officeJs.Excel.ChartBinType.category with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartBinType with String] = js.native
}

