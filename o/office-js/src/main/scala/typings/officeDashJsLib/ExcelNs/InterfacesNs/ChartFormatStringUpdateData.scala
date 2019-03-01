package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartFormatString object, for use in "chartFormatString.set({ ... })". */
trait ChartFormatStringUpdateData extends js.Object {
  /**
    *
    * Represents the font attributes, such as font name, font size, color, etc. of chart characters object.
    *
    * [Api set: ExcelApi 1.7]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
}

object ChartFormatStringUpdateData {
  @scala.inline
  def apply(font: ChartFontUpdateData = null): ChartFormatStringUpdateData = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[ChartFormatStringUpdateData]
  }
}

