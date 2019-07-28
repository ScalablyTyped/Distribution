package typings.officeDashJsDashPreview.ExcelNs

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
  
  /* "Both" */ val both: typings.officeDashJsDashPreview.ExcelNs.ChartErrorBarsInclude.both with String = js.native
  /* "MinusValues" */ val minusValues: typings.officeDashJsDashPreview.ExcelNs.ChartErrorBarsInclude.minusValues with String = js.native
  /* "PlusValues" */ val plusValues: typings.officeDashJsDashPreview.ExcelNs.ChartErrorBarsInclude.plusValues with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartErrorBarsInclude with String] = js.native
}

