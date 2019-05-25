package typings
package olLib.interactionSnapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var snapped: scala.Boolean
  var vertex: olLib.coordinateMod.Coordinate
  var vertexPixel: olLib.pixelMod.Pixel
}

object Result {
  @scala.inline
  def apply(snapped: scala.Boolean, vertex: olLib.coordinateMod.Coordinate, vertexPixel: olLib.pixelMod.Pixel): Result = {
    val __obj = js.Dynamic.literal(snapped = snapped, vertex = vertex, vertexPixel = vertexPixel)
  
    __obj.asInstanceOf[Result]
  }
}

