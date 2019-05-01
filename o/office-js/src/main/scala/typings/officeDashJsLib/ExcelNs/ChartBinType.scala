package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartBinType extends js.Object

/**
  *
  * Specifies the bins type of the Histogram chart series.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartBinType")
@js.native
object ChartBinType extends js.Object {
  @js.native
  sealed trait auto
    extends officeDashJsLib.ExcelNs.ChartBinType
  
  @js.native
  sealed trait binCount
    extends officeDashJsLib.ExcelNs.ChartBinType
  
  @js.native
  sealed trait binWidth
    extends officeDashJsLib.ExcelNs.ChartBinType
  
  @js.native
  sealed trait category
    extends officeDashJsLib.ExcelNs.ChartBinType
  
  /* "Auto" */ val auto: auto with java.lang.String = js.native
  /* "BinCount" */ val binCount: binCount with java.lang.String = js.native
  /* "BinWidth" */ val binWidth: binWidth with java.lang.String = js.native
  /* "Category" */ val category: category with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartBinType with java.lang.String] = js.native
}

