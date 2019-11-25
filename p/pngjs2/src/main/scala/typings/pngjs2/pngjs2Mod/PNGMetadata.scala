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
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], interlace = interlace.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PNGMetadata]
  }
}

