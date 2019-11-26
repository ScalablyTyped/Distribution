package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartPointFormat object, for use in `chartPointFormat.set({ ... })`. */
trait ChartPointFormatUpdateData extends js.Object {
  /**
    *
    * Represents the border format of a chart data point, which includes color, style, and weight information.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
}

object ChartPointFormatUpdateData {
  @scala.inline
  def apply(border: ChartBorderUpdateData = null): ChartPointFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPointFormatUpdateData]
  }
}

