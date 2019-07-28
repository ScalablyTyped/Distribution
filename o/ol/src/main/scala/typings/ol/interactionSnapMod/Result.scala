package typings.ol.interactionSnapMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var snapped: Boolean
  var vertex: Coordinate
  var vertexPixel: Pixel
}

object Result {
  @scala.inline
  def apply(snapped: Boolean, vertex: Coordinate, vertexPixel: Pixel): Result = {
    val __obj = js.Dynamic.literal(snapped = snapped, vertex = vertex, vertexPixel = vertexPixel)
  
    __obj.asInstanceOf[Result]
  }
}

