package typings.officeDashJsDashPreview.Excel

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
  
  /* "Exponential" */ val exponential: typings.officeDashJsDashPreview.Excel.ChartTrendlineType.exponential with String = js.native
  /* "Linear" */ val linear: typings.officeDashJsDashPreview.Excel.ChartTrendlineType.linear with String = js.native
  /* "Logarithmic" */ val logarithmic: typings.officeDashJsDashPreview.Excel.ChartTrendlineType.logarithmic with String = js.native
  /* "MovingAverage" */ val movingAverage: typings.officeDashJsDashPreview.Excel.ChartTrendlineType.movingAverage with String = js.native
  /* "Polynomial" */ val polynomial: typings.officeDashJsDashPreview.Excel.ChartTrendlineType.polynomial with String = js.native
  /* "Power" */ val power: typings.officeDashJsDashPreview.Excel.ChartTrendlineType.power with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartTrendlineType with String] = js.native
}

