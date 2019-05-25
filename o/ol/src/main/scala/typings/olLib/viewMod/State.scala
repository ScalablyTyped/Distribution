package typings
package olLib.viewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var center: olLib.coordinateMod.Coordinate
  var projection: olLib.projProjectionMod.default
  var resolution: scala.Double
  var rotation: scala.Double
  var zoom: scala.Double
}

object State {
  @scala.inline
  def apply(
    center: olLib.coordinateMod.Coordinate,
    projection: olLib.projProjectionMod.default,
    resolution: scala.Double,
    rotation: scala.Double,
    zoom: scala.Double
  ): State = {
    val __obj = js.Dynamic.literal(center = center, projection = projection, resolution = resolution, rotation = rotation, zoom = zoom)
  
    __obj.asInstanceOf[State]
  }
}

