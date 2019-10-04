package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the chart axis title formatting.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartAxisTitleFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderLoadOptions] = js.undefined
  /**
    *
    * Represents the font attributes, such as font name, font size, color, etc. of chart axis title object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontLoadOptions] = js.undefined
}

object ChartAxisTitleFormatLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    border: ChartBorderLoadOptions = null,
    font: ChartFontLoadOptions = null
  ): ChartAxisTitleFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (border != null) __obj.updateDynamic("border")(border)
    if (font != null) __obj.updateDynamic("font")(font)
    __obj.asInstanceOf[ChartAxisTitleFormatLoadOptions]
  }
}

