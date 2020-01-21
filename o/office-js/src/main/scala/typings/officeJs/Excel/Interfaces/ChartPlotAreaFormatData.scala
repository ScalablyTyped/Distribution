package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartPlotAreaFormat.toJSON()`. */
trait ChartPlotAreaFormatData extends js.Object {
  /**
    *
    * Represents the border attributes of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
}

object ChartPlotAreaFormatData {
  @scala.inline
  def apply(border: ChartBorderData = null): ChartPlotAreaFormatData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPlotAreaFormatData]
  }
}

