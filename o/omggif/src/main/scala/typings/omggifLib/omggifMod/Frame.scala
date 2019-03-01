package typings
package omggifLib.omggifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  var data_length: scala.Double
  var data_offset: scala.Double
  var delay: scala.Double
  var disposal: scala.Double
  var has_local_palette: scala.Boolean
  var height: scala.Double
  var interlaced: scala.Boolean
  var palette_offset: scala.Double | scala.Null
  var palette_size: scala.Double | scala.Null
  var transparent_index: scala.Double | scala.Null
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Frame {
  @scala.inline
  def apply(
    data_length: scala.Double,
    data_offset: scala.Double,
    delay: scala.Double,
    disposal: scala.Double,
    has_local_palette: scala.Boolean,
    height: scala.Double,
    interlaced: scala.Boolean,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double,
    palette_offset: scala.Int | scala.Double = null,
    palette_size: scala.Int | scala.Double = null,
    transparent_index: scala.Int | scala.Double = null
  ): Frame = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data_length")(data_length)
    __obj.updateDynamic("data_offset")(data_offset)
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("disposal")(disposal)
    __obj.updateDynamic("has_local_palette")(has_local_palette)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("interlaced")(interlaced)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    if (palette_offset != null) __obj.updateDynamic("palette_offset")(palette_offset.asInstanceOf[js.Any])
    if (palette_size != null) __obj.updateDynamic("palette_size")(palette_size.asInstanceOf[js.Any])
    if (transparent_index != null) __obj.updateDynamic("transparent_index")(transparent_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

