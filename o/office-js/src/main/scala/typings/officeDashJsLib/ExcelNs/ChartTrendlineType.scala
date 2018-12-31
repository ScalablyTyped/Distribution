package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartTrendlineType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTrendlineType")
@js.native
object ChartTrendlineType extends js.Object {
  @js.native
  sealed trait exponential
    extends officeDashJsLib.ExcelNs.ChartTrendlineType
  
  @js.native
  sealed trait linear
    extends officeDashJsLib.ExcelNs.ChartTrendlineType
  
  @js.native
  sealed trait logarithmic
    extends officeDashJsLib.ExcelNs.ChartTrendlineType
  
  @js.native
  sealed trait movingAverage
    extends officeDashJsLib.ExcelNs.ChartTrendlineType
  
  @js.native
  sealed trait polynomial
    extends officeDashJsLib.ExcelNs.ChartTrendlineType
  
  @js.native
  sealed trait power
    extends officeDashJsLib.ExcelNs.ChartTrendlineType
  
  /* "Exponential" */ val exponential: exponential with java.lang.String = js.native
  /* "Linear" */ val linear: linear with java.lang.String = js.native
  /* "Logarithmic" */ val logarithmic: logarithmic with java.lang.String = js.native
  /* "MovingAverage" */ val movingAverage: movingAverage with java.lang.String = js.native
  /* "Polynomial" */ val polynomial: polynomial with java.lang.String = js.native
  /* "Power" */ val power: power with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartTrendlineType with java.lang.String] = js.native
}

