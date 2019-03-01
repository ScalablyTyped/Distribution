package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartLegendFormat object, for use in "chartLegendFormat.set({ ... })". */
trait ChartLegendFormatUpdateData extends js.Object {
  /**
    *
    * Represents the border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
  /**
    *
    * Represents the font attributes such as font name, font size, color, etc. of a chart legend.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
}

object ChartLegendFormatUpdateData {
  @scala.inline
  def apply(border: ChartBorderUpdateData = null, font: ChartFontUpdateData = null): ChartLegendFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[ChartLegendFormatUpdateData]
  }
}

