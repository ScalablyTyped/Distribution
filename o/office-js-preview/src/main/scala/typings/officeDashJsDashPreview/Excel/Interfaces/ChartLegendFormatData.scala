package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartLegendFormat.toJSON()`. */
trait ChartLegendFormatData extends js.Object {
  /**
    *
    * Represents the border format, which includes color, linestyle, and weight. Read-only.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  /**
    *
    * Represents the font attributes such as font name, font size, color, etc. of a chart legend. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
}

object ChartLegendFormatData {
  @scala.inline
  def apply(border: ChartBorderData = null, font: ChartFontData = null): ChartLegendFormatData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendFormatData]
  }
}

