package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartPlotAreaPosition extends js.Object

/**
     * [Api set: ExcelApi 1.8]
     */
@JSGlobal("Excel.ChartPlotAreaPosition")
@js.native
object ChartPlotAreaPosition extends js.Object {
  @js.native
  sealed trait automatic
    extends officeDashJsLib.ExcelNs.ChartPlotAreaPosition
  
  @js.native
  sealed trait custom
    extends officeDashJsLib.ExcelNs.ChartPlotAreaPosition
  
  /* "Automatic" */ val automatic: automatic with java.lang.String = js.native
  /* "Custom" */ val custom: custom with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartPlotAreaPosition with java.lang.String] = js.native
}

