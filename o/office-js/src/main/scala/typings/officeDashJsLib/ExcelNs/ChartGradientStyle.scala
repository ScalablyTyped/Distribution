package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartGradientStyle extends js.Object

/**
  *
  * Represents the Gradient Style of chart series, only applicable in RegionMap chart.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartGradientStyle")
@js.native
object ChartGradientStyle extends js.Object {
  @js.native
  sealed trait threePhaseColor
    extends officeDashJsLib.ExcelNs.ChartGradientStyle
  
  @js.native
  sealed trait twoPhaseColor
    extends officeDashJsLib.ExcelNs.ChartGradientStyle
  
  /* "ThreePhaseColor" */ val threePhaseColor: threePhaseColor with java.lang.String = js.native
  /* "TwoPhaseColor" */ val twoPhaseColor: twoPhaseColor with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ChartGradientStyle with java.lang.String] = js.native
}

