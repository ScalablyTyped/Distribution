package typings
package pngjs2Lib.pngjs2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNGMetadata extends js.Object {
  var alpha: scala.Boolean
  var color: scala.Boolean
  var height: scala.Double
  var interlace: scala.Boolean
  var palette: scala.Boolean
  var width: scala.Double
}

object PNGMetadata {
  @scala.inline
  def apply(
    alpha: scala.Boolean,
    color: scala.Boolean,
    height: scala.Double,
    interlace: scala.Boolean,
    palette: scala.Boolean,
    width: scala.Double
  ): PNGMetadata = {
    val __obj = js.Dynamic.literal(alpha = alpha, color = color, height = height, interlace = interlace, palette = palette, width = width)
  
    __obj.asInstanceOf[PNGMetadata]
  }
}

