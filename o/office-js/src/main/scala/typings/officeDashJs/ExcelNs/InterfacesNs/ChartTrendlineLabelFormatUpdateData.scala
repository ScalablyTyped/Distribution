package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartTrendlineLabelFormat object, for use in `chartTrendlineLabelFormat.set({ ... })`. */
trait ChartTrendlineLabelFormatUpdateData extends js.Object {
  /**
    *
    * Represents the border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for a chart trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
}

object ChartTrendlineLabelFormatUpdateData {
  @scala.inline
  def apply(border: ChartBorderUpdateData = null, font: ChartFontUpdateData = null): ChartTrendlineLabelFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[ChartTrendlineLabelFormatUpdateData]
  }
}

