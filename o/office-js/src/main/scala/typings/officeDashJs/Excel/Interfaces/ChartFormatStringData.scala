package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartFormatString.toJSON()`. */
trait ChartFormatStringData extends js.Object {
  /**
    *
    * Represents the font attributes, such as font name, font size, color, etc. of chart characters object.
    *
    * [Api set: ExcelApi 1.7]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
}

object ChartFormatStringData {
  @scala.inline
  def apply(font: ChartFontData = null): ChartFormatStringData = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[ChartFormatStringData]
  }
}

