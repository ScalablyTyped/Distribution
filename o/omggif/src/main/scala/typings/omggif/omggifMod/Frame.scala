package typings.omggif.omggifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  var data_length: Double
  var data_offset: Double
  var delay: Double
  var disposal: Double
  var has_local_palette: Boolean
  var height: Double
  var interlaced: Boolean
  var palette_offset: Double | Null
  var palette_size: Double | Null
  var transparent_index: Double | Null
  var width: Double
  var x: Double
  var y: Double
}

object Frame {
  @scala.inline
  def apply(
    data_length: Double,
    data_offset: Double,
    delay: Double,
    disposal: Double,
    has_local_palette: Boolean,
    height: Double,
    interlaced: Boolean,
    width: Double,
    x: Double,
    y: Double,
    palette_offset: Int | Double = null,
    palette_size: Int | Double = null,
    transparent_index: Int | Double = null
  ): Frame = {
    val __obj = js.Dynamic.literal(data_length = data_length, data_offset = data_offset, delay = delay, disposal = disposal, has_local_palette = has_local_palette, height = height, interlaced = interlaced, width = width, x = x, y = y)
    if (palette_offset != null) __obj.updateDynamic("palette_offset")(palette_offset.asInstanceOf[js.Any])
    if (palette_size != null) __obj.updateDynamic("palette_size")(palette_size.asInstanceOf[js.Any])
    if (transparent_index != null) __obj.updateDynamic("transparent_index")(transparent_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

