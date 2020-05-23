package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies whether the series are by rows or by columns. On Desktop, the "auto" option will inspect the source data shape to automatically guess whether the data is by rows or columns; in Excel on the web, "auto" will simply default to "columns".
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartSeriesBy")
@js.native
object ChartSeriesBy extends js.Object {
  /* "Auto" */ val auto: typings.officeJsPreview.Excel.ChartSeriesBy.auto with String = js.native
  /* "Columns" */ val columns: typings.officeJsPreview.Excel.ChartSeriesBy.columns with String = js.native
  /* "Rows" */ val rows: typings.officeJsPreview.Excel.ChartSeriesBy.rows with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartSeriesBy with String] = js.native
}

