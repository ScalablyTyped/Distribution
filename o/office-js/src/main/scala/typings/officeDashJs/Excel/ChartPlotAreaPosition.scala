package typings.officeDashJs.Excel

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
  sealed trait automatic extends ChartPlotAreaPosition
  
  @js.native
  sealed trait custom extends ChartPlotAreaPosition
  
  /* "Automatic" */ val automatic: typings.officeDashJs.Excel.ChartPlotAreaPosition.automatic with String = js.native
  /* "Custom" */ val custom: typings.officeDashJs.Excel.ChartPlotAreaPosition.custom with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartPlotAreaPosition with String] = js.native
}

