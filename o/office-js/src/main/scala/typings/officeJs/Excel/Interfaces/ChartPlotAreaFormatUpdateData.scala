package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartPlotAreaFormat object, for use in `chartPlotAreaFormat.set({ ... })`. */
trait ChartPlotAreaFormatUpdateData extends js.Object {
  /**
    *
    * Represents the border attributes of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
}

object ChartPlotAreaFormatUpdateData {
  @scala.inline
  def apply(border: ChartBorderUpdateData = null): ChartPlotAreaFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPlotAreaFormatUpdateData]
  }
}

