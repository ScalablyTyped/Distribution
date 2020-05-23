package typings.officeJsPreview.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the region projection type of a chart series layout. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapProjectionType")
@js.native
object ChartMapProjectionType extends js.Object {
  /* "Albers" */ val albers: typings.officeJsPreview.Excel.ChartMapProjectionType.albers with String = js.native
  /* "Automatic" */ val automatic: typings.officeJsPreview.Excel.ChartMapProjectionType.automatic with String = js.native
  /* "Mercator" */ val mercator: typings.officeJsPreview.Excel.ChartMapProjectionType.mercator with String = js.native
  /* "Miller" */ val miller: typings.officeJsPreview.Excel.ChartMapProjectionType.miller with String = js.native
  /* "Robinson" */ val robinson: typings.officeJsPreview.Excel.ChartMapProjectionType.robinson with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJsPreview.Excel.ChartMapProjectionType with String] = js.native
}

