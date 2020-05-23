package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the region level of a chart series layout. This only applies to region map charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapLabelStrategy")
@js.native
object ChartMapLabelStrategy extends js.Object {
  /* "BestFit" */ val bestFit: typings.officeJs.Excel.ChartMapLabelStrategy.bestFit with String = js.native
  /* "None" */ val none: typings.officeJs.Excel.ChartMapLabelStrategy.none with String = js.native
  /* "ShowAll" */ val showAll: typings.officeJs.Excel.ChartMapLabelStrategy.showAll with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartMapLabelStrategy with String] = js.native
}

