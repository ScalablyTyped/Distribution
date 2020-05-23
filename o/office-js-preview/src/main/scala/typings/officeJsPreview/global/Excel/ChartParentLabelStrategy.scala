package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the parent label strategy of the chart series layout. This only applies to treemap charts
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartParentLabelStrategy")
@js.native
object ChartParentLabelStrategy extends js.Object {
  /* "Banner" */ val banner: typings.officeJsPreview.Excel.ChartParentLabelStrategy.banner with String = js.native
  /* "None" */ val none: typings.officeJsPreview.Excel.ChartParentLabelStrategy.none with String = js.native
  /* "Overlapping" */ val overlapping: typings.officeJsPreview.Excel.ChartParentLabelStrategy.overlapping with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartParentLabelStrategy with String] = js.native
}

