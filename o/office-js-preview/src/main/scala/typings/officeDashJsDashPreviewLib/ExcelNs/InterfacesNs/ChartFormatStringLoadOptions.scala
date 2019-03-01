package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the substring in chart related objects that contains text, like ChartTitle object, ChartAxisTitle object, etc.
  *
  * [Api set: ExcelApi 1.7]
  */
trait ChartFormatStringLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the font attributes, such as font name, font size, color, etc. of chart characters object.
    *
    * [Api set: ExcelApi 1.7]
    */
  var font: js.UndefOr[ChartFontLoadOptions] = js.undefined
}

object ChartFormatStringLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[scala.Boolean] = js.undefined, font: ChartFontLoadOptions = null): ChartFormatStringLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[ChartFormatStringLoadOptions]
  }
}

