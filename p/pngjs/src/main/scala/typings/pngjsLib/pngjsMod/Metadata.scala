package typings
package pngjsLib.pngjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var alpha: scala.Boolean
  var bpp: pngjsLib.pngjsLibNumbers.`1` | pngjsLib.pngjsLibNumbers.`2` | pngjsLib.pngjsLibNumbers.`3` | pngjsLib.pngjsLibNumbers.`4`
  var color: scala.Boolean
  var colorType: ColorType
  var depth: pngjsLib.pngjsLibNumbers.`1` | pngjsLib.pngjsLibNumbers.`2` | pngjsLib.pngjsLibNumbers.`4` | pngjsLib.pngjsLibNumbers.`8` | pngjsLib.pngjsLibNumbers.`16`
  var height: scala.Double
  var interlace: scala.Boolean
  var palette: scala.Boolean
  var width: scala.Double
}

object Metadata {
  @scala.inline
  def apply(
    alpha: scala.Boolean,
    bpp: pngjsLib.pngjsLibNumbers.`1` | pngjsLib.pngjsLibNumbers.`2` | pngjsLib.pngjsLibNumbers.`3` | pngjsLib.pngjsLibNumbers.`4`,
    color: scala.Boolean,
    colorType: ColorType,
    depth: pngjsLib.pngjsLibNumbers.`1` | pngjsLib.pngjsLibNumbers.`2` | pngjsLib.pngjsLibNumbers.`4` | pngjsLib.pngjsLibNumbers.`8` | pngjsLib.pngjsLibNumbers.`16`,
    height: scala.Double,
    interlace: scala.Boolean,
    palette: scala.Boolean,
    width: scala.Double
  ): Metadata = {
    val __obj = js.Dynamic.literal(alpha = alpha, bpp = bpp.asInstanceOf[js.Any], color = color, colorType = colorType, depth = depth.asInstanceOf[js.Any], height = height, interlace = interlace, palette = palette, width = width)
  
    __obj.asInstanceOf[Metadata]
  }
}

