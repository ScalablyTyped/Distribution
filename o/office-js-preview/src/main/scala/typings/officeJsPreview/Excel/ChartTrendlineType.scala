package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartTrendlineType with String] = js.native
  /* "Exponential" */ @js.native
  object exponential extends TopLevel[exponential with String]
  
  /* "Linear" */ @js.native
  object linear extends TopLevel[linear with String]
  
  /* "Logarithmic" */ @js.native
  object logarithmic extends TopLevel[logarithmic with String]
  
  /* "MovingAverage" */ @js.native
  object movingAverage extends TopLevel[movingAverage with String]
  
  /* "Polynomial" */ @js.native
  object polynomial extends TopLevel[polynomial with String]
  
  /* "Power" */ @js.native
  object power extends TopLevel[power with String]
  
}

