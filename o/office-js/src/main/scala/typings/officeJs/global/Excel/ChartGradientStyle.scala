package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the gradient style of a chart series. This is only applicable for region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartGradientStyle")
@js.native
object ChartGradientStyle extends js.Object {
  /* "ThreePhaseColor" */ val threePhaseColor: typings.officeJs.Excel.ChartGradientStyle.threePhaseColor with String = js.native
  /* "TwoPhaseColor" */ val twoPhaseColor: typings.officeJs.Excel.ChartGradientStyle.twoPhaseColor with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartGradientStyle with String] = js.native
}

