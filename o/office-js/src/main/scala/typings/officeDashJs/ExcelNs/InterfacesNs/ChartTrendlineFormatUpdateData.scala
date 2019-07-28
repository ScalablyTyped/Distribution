package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartTrendlineFormat object, for use in "chartTrendlineFormat.set({ ... })". */
trait ChartTrendlineFormatUpdateData extends js.Object {
  /**
    *
    * Represents chart line formatting.
    *
    * [Api set: ExcelApi 1.7]
    */
  var line: js.UndefOr[ChartLineFormatUpdateData] = js.undefined
}

object ChartTrendlineFormatUpdateData {
  @scala.inline
  def apply(line: ChartLineFormatUpdateData = null): ChartTrendlineFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[ChartTrendlineFormatUpdateData]
  }
}

