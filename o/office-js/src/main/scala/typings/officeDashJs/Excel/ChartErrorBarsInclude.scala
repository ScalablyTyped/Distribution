package typings.officeDashJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartErrorBarsInclude extends js.Object

/**
  *
  * Represents which parts of the error bar to include.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartErrorBarsInclude")
@js.native
object ChartErrorBarsInclude extends js.Object {
  @js.native
  sealed trait both extends ChartErrorBarsInclude
  
  @js.native
  sealed trait minusValues extends ChartErrorBarsInclude
  
  @js.native
  sealed trait plusValues extends ChartErrorBarsInclude
  
  /* "Both" */ val both: typings.officeDashJs.Excel.ChartErrorBarsInclude.both with String = js.native
  /* "MinusValues" */ val minusValues: typings.officeDashJs.Excel.ChartErrorBarsInclude.minusValues with String = js.native
  /* "PlusValues" */ val plusValues: typings.officeDashJs.Excel.ChartErrorBarsInclude.plusValues with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartErrorBarsInclude with String] = js.native
}

