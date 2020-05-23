package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the axis from which to get the PivotItems.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PivotAxis")
@js.native
object PivotAxis extends js.Object {
  /* "Column" */ val column: typings.officeJsPreview.Excel.PivotAxis.column with String = js.native
  /* "Data" */ val data: typings.officeJsPreview.Excel.PivotAxis.data with String = js.native
  /* "Filter" */ val filter: typings.officeJsPreview.Excel.PivotAxis.filter with String = js.native
  /* "Row" */ val row: typings.officeJsPreview.Excel.PivotAxis.row with String = js.native
  /* "Unknown" */ val unknown: typings.officeJsPreview.Excel.PivotAxis.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.PivotAxis with String] = js.native
}

