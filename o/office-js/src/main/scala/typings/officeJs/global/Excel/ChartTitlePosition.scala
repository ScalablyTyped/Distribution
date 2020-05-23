package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the position of chart title.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTitlePosition")
@js.native
object ChartTitlePosition extends js.Object {
  /* "Automatic" */ val automatic: typings.officeJs.Excel.ChartTitlePosition.automatic with String = js.native
  /* "Bottom" */ val bottom: typings.officeJs.Excel.ChartTitlePosition.bottom with String = js.native
  /* "Left" */ val left: typings.officeJs.Excel.ChartTitlePosition.left with String = js.native
  /* "Right" */ val right: typings.officeJs.Excel.ChartTitlePosition.right with String = js.native
  /* "Top" */ val top: typings.officeJs.Excel.ChartTitlePosition.top with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.ChartTitlePosition with String] = js.native
}

