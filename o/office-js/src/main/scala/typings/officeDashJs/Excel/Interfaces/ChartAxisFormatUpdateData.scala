package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartAxisFormat object, for use in `chartAxisFormat.set({ ... })`. */
trait ChartAxisFormatUpdateData extends js.Object {
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for a chart axis element.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
  /**
    *
    * Represents chart line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatUpdateData] = js.undefined
}

object ChartAxisFormatUpdateData {
  @scala.inline
  def apply(font: ChartFontUpdateData = null, line: ChartLineFormatUpdateData = null): ChartAxisFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[ChartAxisFormatUpdateData]
  }
}

