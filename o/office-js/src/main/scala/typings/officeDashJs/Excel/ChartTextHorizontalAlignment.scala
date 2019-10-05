package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartTextHorizontalAlignment extends js.Object

/**
  *
  * Represents the horizontal alignment for the specified object.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTextHorizontalAlignment")
@js.native
object ChartTextHorizontalAlignment extends js.Object {
  @js.native
  sealed trait center extends ChartTextHorizontalAlignment
  
  @js.native
  sealed trait distributed extends ChartTextHorizontalAlignment
  
  @js.native
  sealed trait justify extends ChartTextHorizontalAlignment
  
  @js.native
  sealed trait left extends ChartTextHorizontalAlignment
  
  @js.native
  sealed trait right extends ChartTextHorizontalAlignment
  
  /* "Center" */ val center: typings.officeDashJs.Excel.ChartTextHorizontalAlignment.center with String = js.native
  /* "Distributed" */ val distributed: typings.officeDashJs.Excel.ChartTextHorizontalAlignment.distributed with String = js.native
  /* "Justify" */ val justify: typings.officeDashJs.Excel.ChartTextHorizontalAlignment.justify with String = js.native
  /* "Left" */ val left: typings.officeDashJs.Excel.ChartTextHorizontalAlignment.left with String = js.native
  /* "Right" */ val right: typings.officeDashJs.Excel.ChartTextHorizontalAlignment.right with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartTextHorizontalAlignment with String] = js.native
}

