package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents which parts of the error bar to include.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartErrorBarsInclude")
@js.native
object ChartErrorBarsInclude extends js.Object {
  /* "Both" */ val both: typings.officeJsPreview.Excel.ChartErrorBarsInclude.both with String = js.native
  /* "MinusValues" */ val minusValues: typings.officeJsPreview.Excel.ChartErrorBarsInclude.minusValues with String = js.native
  /* "PlusValues" */ val plusValues: typings.officeJsPreview.Excel.ChartErrorBarsInclude.plusValues with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartErrorBarsInclude with String] = js.native
}

