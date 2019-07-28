package typings.officeDashJs.ExcelNs

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
  sealed trait exponential extends ChartTrendlineType
  
  @js.native
  sealed trait linear extends ChartTrendlineType
  
  @js.native
  sealed trait logarithmic extends ChartTrendlineType
  
  @js.native
  sealed trait movingAverage extends ChartTrendlineType
  
  @js.native
  sealed trait polynomial extends ChartTrendlineType
  
  @js.native
  sealed trait power extends ChartTrendlineType
  
  /* "Exponential" */ val exponential: typings.officeDashJs.ExcelNs.ChartTrendlineType.exponential with String = js.native
  /* "Linear" */ val linear: typings.officeDashJs.ExcelNs.ChartTrendlineType.linear with String = js.native
  /* "Logarithmic" */ val logarithmic: typings.officeDashJs.ExcelNs.ChartTrendlineType.logarithmic with String = js.native
  /* "MovingAverage" */ val movingAverage: typings.officeDashJs.ExcelNs.ChartTrendlineType.movingAverage with String = js.native
  /* "Polynomial" */ val polynomial: typings.officeDashJs.ExcelNs.ChartTrendlineType.polynomial with String = js.native
  /* "Power" */ val power: typings.officeDashJs.ExcelNs.ChartTrendlineType.power with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartTrendlineType with String] = js.native
}

