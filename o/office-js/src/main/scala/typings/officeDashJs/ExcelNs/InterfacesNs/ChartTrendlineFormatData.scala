package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartTrendlineFormat.toJSON()`. */
trait ChartTrendlineFormatData extends js.Object {
  /**
    *
    * Represents chart line formatting. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.undefined
}

object ChartTrendlineFormatData {
  @scala.inline
  def apply(line: ChartLineFormatData = null): ChartTrendlineFormatData = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[ChartTrendlineFormatData]
  }
}

