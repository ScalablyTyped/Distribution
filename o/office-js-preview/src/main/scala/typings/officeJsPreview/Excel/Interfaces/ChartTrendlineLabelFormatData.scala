package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartTrendlineLabelFormat.toJSON()`. */
trait ChartTrendlineLabelFormatData extends js.Object {
  /**
    *
    * Specifies the border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  /**
    *
    * Specifies the font attributes (font name, font size, color, etc.) for a chart trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
}

object ChartTrendlineLabelFormatData {
  @scala.inline
  def apply(border: ChartBorderData = null, font: ChartFontData = null): ChartTrendlineLabelFormatData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTrendlineLabelFormatData]
  }
}

