package typings
package pleasejsLib.PleaseJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeColorOption extends js.Object {
  var base_color: js.UndefOr[java.lang.String] = js.undefined
  var colors_returned: js.UndefOr[scala.Double] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var full_random: js.UndefOr[scala.Boolean] = js.undefined
  var golden: js.UndefOr[scala.Boolean] = js.undefined
  var grayscale: js.UndefOr[scala.Boolean] = js.undefined
  var greyscale: js.UndefOr[scala.Boolean] = js.undefined
  var hue: js.UndefOr[scala.Double] = js.undefined
  var saturation: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object MakeColorOption {
  @scala.inline
  def apply(
    base_color: java.lang.String = null,
    colors_returned: scala.Int | scala.Double = null,
    format: java.lang.String = null,
    full_random: js.UndefOr[scala.Boolean] = js.undefined,
    golden: js.UndefOr[scala.Boolean] = js.undefined,
    grayscale: js.UndefOr[scala.Boolean] = js.undefined,
    greyscale: js.UndefOr[scala.Boolean] = js.undefined,
    hue: scala.Int | scala.Double = null,
    saturation: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): MakeColorOption = {
    val __obj = js.Dynamic.literal()
    if (base_color != null) __obj.updateDynamic("base_color")(base_color)
    if (colors_returned != null) __obj.updateDynamic("colors_returned")(colors_returned.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(full_random)) __obj.updateDynamic("full_random")(full_random)
    if (!js.isUndefined(golden)) __obj.updateDynamic("golden")(golden)
    if (!js.isUndefined(grayscale)) __obj.updateDynamic("grayscale")(grayscale)
    if (!js.isUndefined(greyscale)) __obj.updateDynamic("greyscale")(greyscale)
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeColorOption]
  }
}

