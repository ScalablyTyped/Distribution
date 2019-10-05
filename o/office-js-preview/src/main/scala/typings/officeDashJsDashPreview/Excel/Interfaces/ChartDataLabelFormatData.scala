package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartDataLabelFormat.toJSON()`. */
trait ChartDataLabelFormatData extends js.Object {
  /**
    *
    * Represents the border format, which includes color, linestyle, and weight. Read-only.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for a chart data label. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
}

object ChartDataLabelFormatData {
  @scala.inline
  def apply(border: ChartBorderData = null, font: ChartFontData = null): ChartDataLabelFormatData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[ChartDataLabelFormatData]
  }
}

