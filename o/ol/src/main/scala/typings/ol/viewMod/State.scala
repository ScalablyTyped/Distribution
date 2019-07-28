package typings.ol.viewMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var center: Coordinate
  var projection: typings.ol.projProjectionMod.default
  var resolution: Double
  var rotation: Double
  var zoom: Double
}

object State {
  @scala.inline
  def apply(
    center: Coordinate,
    projection: typings.ol.projProjectionMod.default,
    resolution: Double,
    rotation: Double,
    zoom: Double
  ): State = {
    val __obj = js.Dynamic.literal(center = center, projection = projection, resolution = resolution, rotation = rotation, zoom = zoom)
  
    __obj.asInstanceOf[State]
  }
}

