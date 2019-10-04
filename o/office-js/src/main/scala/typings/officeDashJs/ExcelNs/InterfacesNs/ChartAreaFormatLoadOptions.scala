package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the format properties for the overall chart area.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartAreaFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the border format of chart area, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderLoadOptions] = js.undefined
  /**
    *
    * Returns or sets color scheme of the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for the current object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontLoadOptions] = js.undefined
  /**
    *
    * Specifies whether or not chart area of the chart has rounded corners. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: js.UndefOr[Boolean] = js.undefined
}

object ChartAreaFormatLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    border: ChartBorderLoadOptions = null,
    colorScheme: js.UndefOr[Boolean] = js.undefined,
    font: ChartFontLoadOptions = null,
    roundedCorners: js.UndefOr[Boolean] = js.undefined
  ): ChartAreaFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (border != null) __obj.updateDynamic("border")(border)
    if (!js.isUndefined(colorScheme)) __obj.updateDynamic("colorScheme")(colorScheme)
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(roundedCorners)) __obj.updateDynamic("roundedCorners")(roundedCorners)
    __obj.asInstanceOf[ChartAreaFormatLoadOptions]
  }
}

