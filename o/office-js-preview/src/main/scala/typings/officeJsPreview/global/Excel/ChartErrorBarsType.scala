package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the range type for error bars.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartErrorBarsType")
@js.native
object ChartErrorBarsType extends js.Object {
  /* "Custom" */ val custom: typings.officeJsPreview.Excel.ChartErrorBarsType.custom with String = js.native
  /* "FixedValue" */ val fixedValue: typings.officeJsPreview.Excel.ChartErrorBarsType.fixedValue with String = js.native
  /* "Percent" */ val percent: typings.officeJsPreview.Excel.ChartErrorBarsType.percent with String = js.native
  /* "StDev" */ val stDev: typings.officeJsPreview.Excel.ChartErrorBarsType.stDev with String = js.native
  /* "StError" */ val stError: typings.officeJsPreview.Excel.ChartErrorBarsType.stError with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartErrorBarsType with String] = js.native
}

