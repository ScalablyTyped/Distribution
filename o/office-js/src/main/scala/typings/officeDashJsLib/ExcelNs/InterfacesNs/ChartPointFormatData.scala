package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartPointFormat.toJSON()". */
trait ChartPointFormatData extends js.Object {
  /**
    *
    * Represents the border format of a chart data point, which includes color, style, and weight information. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
}

object ChartPointFormatData {
  @scala.inline
  def apply(border: ChartBorderData = null): ChartPointFormatData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    __obj.asInstanceOf[ChartPointFormatData]
  }
}

