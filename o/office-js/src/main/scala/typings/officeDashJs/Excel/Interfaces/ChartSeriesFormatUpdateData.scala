package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartSeriesFormat object, for use in `chartSeriesFormat.set({ ... })`. */
trait ChartSeriesFormatUpdateData extends js.Object {
  /**
    *
    * Represents line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatUpdateData] = js.undefined
}

object ChartSeriesFormatUpdateData {
  @scala.inline
  def apply(line: ChartLineFormatUpdateData = null): ChartSeriesFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[ChartSeriesFormatUpdateData]
  }
}

