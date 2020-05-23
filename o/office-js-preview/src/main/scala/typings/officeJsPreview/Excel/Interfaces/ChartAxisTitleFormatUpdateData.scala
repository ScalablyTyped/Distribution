package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartAxisTitleFormat object, for use in `chartAxisTitleFormat.set({ ... })`. */
trait ChartAxisTitleFormatUpdateData extends js.Object {
  /**
    *
    * Specifies the chart axis title's border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
  /**
    *
    * Specifies the chart axis title's font attributes, such as font name, font size, color, etc. of chart axis title object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
}

object ChartAxisTitleFormatUpdateData {
  @scala.inline
  def apply(border: ChartBorderUpdateData = null, font: ChartFontUpdateData = null): ChartAxisTitleFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisTitleFormatUpdateData]
  }
}

