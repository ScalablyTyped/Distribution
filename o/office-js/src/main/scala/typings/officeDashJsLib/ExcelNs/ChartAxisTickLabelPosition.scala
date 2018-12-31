package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisTickLabelPosition extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisTickLabelPosition")
@js.native
object ChartAxisTickLabelPosition extends js.Object {
  @js.native
  sealed trait high
    extends officeDashJsLib.ExcelNs.ChartAxisTickLabelPosition
  
  @js.native
  sealed trait low
    extends officeDashJsLib.ExcelNs.ChartAxisTickLabelPosition
  
  @js.native
  sealed trait nextToAxis
    extends officeDashJsLib.ExcelNs.ChartAxisTickLabelPosition
  
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.ChartAxisTickLabelPosition
  
  /* "High" */ val high: high with java.lang.String = js.native
  /* "Low" */ val low: low with java.lang.String = js.native
  /* "NextToAxis" */ val nextToAxis: nextToAxis with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartAxisTickLabelPosition with java.lang.String] = js.native
}

