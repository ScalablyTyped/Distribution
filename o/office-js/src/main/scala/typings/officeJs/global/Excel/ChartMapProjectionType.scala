package typings.officeJs.global.Excel

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
  /* "Albers" */ val albers: typings.officeJs.Excel.ChartMapProjectionType.albers with String = js.native
  /* "Automatic" */ val automatic: typings.officeJs.Excel.ChartMapProjectionType.automatic with String = js.native
  /* "Mercator" */ val mercator: typings.officeJs.Excel.ChartMapProjectionType.mercator with String = js.native
  /* "Miller" */ val miller: typings.officeJs.Excel.ChartMapProjectionType.miller with String = js.native
  /* "Robinson" */ val robinson: typings.officeJs.Excel.ChartMapProjectionType.robinson with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartMapProjectionType with String] = js.native
}

