package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A format object encapsulating the conditional formats range's font, fill, borders, and other properties.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalRangeFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Collection of border objects that apply to the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borders: js.UndefOr[ConditionalRangeBorderCollectionLoadOptions] = js.undefined
  /**
    *
    * Returns the fill object defined on the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var fill: js.UndefOr[ConditionalRangeFillLoadOptions] = js.undefined
  /**
    *
    * Returns the font object defined on the overall conditional format range.
    *
    * [Api set: ExcelApi 1.6]
    */
  var font: js.UndefOr[ConditionalRangeFontLoadOptions] = js.undefined
  /**
    *
    * Represents Excel's number format code for the given range. Cleared if null is passed in.
    *
    * [Api set: ExcelApi 1.6]
    */
  var numberFormat: js.UndefOr[scala.Boolean] = js.undefined
}

object ConditionalRangeFormatLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    borders: ConditionalRangeBorderCollectionLoadOptions = null,
    fill: ConditionalRangeFillLoadOptions = null,
    font: ConditionalRangeFontLoadOptions = null,
    numberFormat: js.UndefOr[scala.Boolean] = js.undefined
  ): ConditionalRangeFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (borders != null) __obj.updateDynamic("borders")(borders)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (font != null) __obj.updateDynamic("font")(font)
    if (!js.isUndefined(numberFormat)) __obj.updateDynamic("numberFormat")(numberFormat)
    __obj.asInstanceOf[ConditionalRangeFormatLoadOptions]
  }
}

