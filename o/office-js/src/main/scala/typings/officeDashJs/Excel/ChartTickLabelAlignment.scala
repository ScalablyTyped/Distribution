package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartTickLabelAlignment extends js.Object

/**
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ChartTickLabelAlignment")
@js.native
object ChartTickLabelAlignment extends js.Object {
  @js.native
  sealed trait center extends ChartTickLabelAlignment
  
  @js.native
  sealed trait left extends ChartTickLabelAlignment
  
  @js.native
  sealed trait right extends ChartTickLabelAlignment
  
  /* "Center" */ val center: typings.officeDashJs.Excel.ChartTickLabelAlignment.center with String = js.native
  /* "Left" */ val left: typings.officeDashJs.Excel.ChartTickLabelAlignment.left with String = js.native
  /* "Right" */ val right: typings.officeDashJs.Excel.ChartTickLabelAlignment.right with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartTickLabelAlignment with String] = js.native
}

