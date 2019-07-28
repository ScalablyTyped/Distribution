package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the format properties for the chart axis.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartAxisFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for a chart axis element.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontLoadOptions] = js.undefined
  /**
    *
    * Represents chart line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatLoadOptions] = js.undefined
}

object ChartAxisFormatLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    font: ChartFontLoadOptions = null,
    line: ChartLineFormatLoadOptions = null
  ): ChartAxisFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (font != null) __obj.updateDynamic("font")(font)
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[ChartAxisFormatLoadOptions]
  }
}

