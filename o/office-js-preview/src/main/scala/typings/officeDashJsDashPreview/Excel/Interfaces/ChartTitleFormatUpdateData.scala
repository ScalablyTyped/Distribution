package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartTitleFormat object, for use in `chartTitleFormat.set({ ... })`. */
trait ChartTitleFormatUpdateData extends js.Object {
  /**
    *
    * Represents the border format of chart title, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for an object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
}

object ChartTitleFormatUpdateData {
  @scala.inline
  def apply(border: ChartBorderUpdateData = null, font: ChartFontUpdateData = null): ChartTitleFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTitleFormatUpdateData]
  }
}

