package typings.pngjs.mod

import typings.pngjs.pngjsNumbers.`16`
import typings.pngjs.pngjsNumbers.`1`
import typings.pngjs.pngjsNumbers.`2`
import typings.pngjs.pngjsNumbers.`3`
import typings.pngjs.pngjsNumbers.`4`
import typings.pngjs.pngjsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var alpha: Boolean
  var bpp: `1` | `2` | `3` | `4`
  var color: Boolean
  var colorType: ColorType
  var depth: `1` | `2` | `4` | `8` | `16`
  var height: Double
  var interlace: Boolean
  var palette: Boolean
  var width: Double
}

object Metadata {
  @scala.inline
  def apply(
    alpha: Boolean,
    bpp: `1` | `2` | `3` | `4`,
    color: Boolean,
    colorType: ColorType,
    depth: `1` | `2` | `4` | `8` | `16`,
    height: Double,
    interlace: Boolean,
    palette: Boolean,
    width: Double
  ): Metadata = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], bpp = bpp.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorType = colorType.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], interlace = interlace.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Metadata]
  }
}

