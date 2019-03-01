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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alpha")(alpha)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("interlace")(interlace)
    __obj.updateDynamic("palette")(palette)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PNGMetadata]
  }
}

