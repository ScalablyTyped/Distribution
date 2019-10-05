package typings.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartGradientStyle extends js.Object

/**
  *
  * Represents the gradient style of a chart series. This is only applicable for region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartGradientStyle")
@js.native
object ChartGradientStyle extends js.Object {
  @js.native
  sealed trait threePhaseColor extends ChartGradientStyle
  
  @js.native
  sealed trait twoPhaseColor extends ChartGradientStyle
  
  /* "ThreePhaseColor" */ val threePhaseColor: typings.officeDashJsDashPreview.Excel.ChartGradientStyle.threePhaseColor with String = js.native
  /* "TwoPhaseColor" */ val twoPhaseColor: typings.officeDashJsDashPreview.Excel.ChartGradientStyle.twoPhaseColor with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartGradientStyle with String] = js.native
}

