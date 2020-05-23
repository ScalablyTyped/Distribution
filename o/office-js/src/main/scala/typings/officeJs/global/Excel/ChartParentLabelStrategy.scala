package typings.officeJs.global.Excel

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
  /* "Banner" */ val banner: typings.officeJs.Excel.ChartParentLabelStrategy.banner with String = js.native
  /* "None" */ val none: typings.officeJs.Excel.ChartParentLabelStrategy.none with String = js.native
  /* "Overlapping" */ val overlapping: typings.officeJs.Excel.ChartParentLabelStrategy.overlapping with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartParentLabelStrategy with String] = js.native
}

