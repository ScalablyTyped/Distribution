package typings.pleasejs.PleaseJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeColorOption extends js.Object {
  var base_color: js.UndefOr[String] = js.undefined
  var colors_returned: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var full_random: js.UndefOr[Boolean] = js.undefined
  var golden: js.UndefOr[Boolean] = js.undefined
  var grayscale: js.UndefOr[Boolean] = js.undefined
  var greyscale: js.UndefOr[Boolean] = js.undefined
  var hue: js.UndefOr[Double] = js.undefined
  var saturation: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object MakeColorOption {
  @scala.inline
  def apply(
    base_color: String = null,
    colors_returned: js.UndefOr[Double] = js.undefined,
    format: String = null,
    full_random: js.UndefOr[Boolean] = js.undefined,
    golden: js.UndefOr[Boolean] = js.undefined,
    grayscale: js.UndefOr[Boolean] = js.undefined,
    greyscale: js.UndefOr[Boolean] = js.undefined,
    hue: js.UndefOr[Double] = js.undefined,
    saturation: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): MakeColorOption = {
    val __obj = js.Dynamic.literal()
    if (base_color != null) __obj.updateDynamic("base_color")(base_color.asInstanceOf[js.Any])
    if (!js.isUndefined(colors_returned)) __obj.updateDynamic("colors_returned")(colors_returned.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(full_random)) __obj.updateDynamic("full_random")(full_random.get.asInstanceOf[js.Any])
    if (!js.isUndefined(golden)) __obj.updateDynamic("golden")(golden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grayscale)) __obj.updateDynamic("grayscale")(grayscale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(greyscale)) __obj.updateDynamic("greyscale")(greyscale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hue)) __obj.updateDynamic("hue")(hue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(saturation)) __obj.updateDynamic("saturation")(saturation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeColorOption]
  }
}

