package typings
package officeDashJsDashPreviewLib.ExcelNs

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
    extends officeDashJsDashPreviewLib.ExcelNs.ChartTrendlineType
  
  @js.native
  sealed trait linear
    extends officeDashJsDashPreviewLib.ExcelNs.ChartTrendlineType
  
  @js.native
  sealed trait logarithmic
    extends officeDashJsDashPreviewLib.ExcelNs.ChartTrendlineType
  
  @js.native
  sealed trait movingAverage
    extends officeDashJsDashPreviewLib.ExcelNs.ChartTrendlineType
  
  @js.native
  sealed trait polynomial
    extends officeDashJsDashPreviewLib.ExcelNs.ChartTrendlineType
  
  @js.native
  sealed trait power
    extends officeDashJsDashPreviewLib.ExcelNs.ChartTrendlineType
  
  /* "Exponential" */ val exponential: exponential with java.lang.String = js.native
  /* "Linear" */ val linear: linear with java.lang.String = js.native
  /* "Logarithmic" */ val logarithmic: logarithmic with java.lang.String = js.native
  /* "MovingAverage" */ val movingAverage: movingAverage with java.lang.String = js.native
  /* "Polynomial" */ val polynomial: polynomial with java.lang.String = js.native
  /* "Power" */ val power: power with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartTrendlineType with java.lang.String] = js.native
}

