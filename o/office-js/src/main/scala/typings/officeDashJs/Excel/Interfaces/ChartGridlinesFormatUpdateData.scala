package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartGridlinesFormat object, for use in `chartGridlinesFormat.set({ ... })`. */
trait ChartGridlinesFormatUpdateData extends js.Object {
  /**
    *
    * Represents chart line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatUpdateData] = js.undefined
}

object ChartGridlinesFormatUpdateData {
  @scala.inline
  def apply(line: ChartLineFormatUpdateData = null): ChartGridlinesFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartGridlinesFormatUpdateData]
  }
}

