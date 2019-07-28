package typings.pngjs2.pngjs2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNGMetadata extends js.Object {
  var alpha: Boolean
  var color: Boolean
  var height: Double
  var interlace: Boolean
  var palette: Boolean
  var width: Double
}

object PNGMetadata {
  @scala.inline
  def apply(
    alpha: Boolean,
    color: Boolean,
    height: Double,
    interlace: Boolean,
    palette: Boolean,
    width: Double
  ): PNGMetadata = {
    val __obj = js.Dynamic.literal(alpha = alpha, color = color, height = height, interlace = interlace, palette = palette, width = width)
  
    __obj.asInstanceOf[PNGMetadata]
  }
}

