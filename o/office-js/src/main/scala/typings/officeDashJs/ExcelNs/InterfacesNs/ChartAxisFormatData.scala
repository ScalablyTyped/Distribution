package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartAxisFormat.toJSON()". */
trait ChartAxisFormatData extends js.Object {
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for a chart axis element. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
  /**
    *
    * Represents chart line formatting. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.undefined
}

object ChartAxisFormatData {
  @scala.inline
  def apply(font: ChartFontData = null, line: ChartLineFormatData = null): ChartAxisFormatData = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[ChartAxisFormatData]
  }
}

