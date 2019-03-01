package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLngBoundsObjectLiteral extends js.Object {
  var east: scala.Double
  var north: scala.Double
  var south: scala.Double
  var west: scala.Double
}

object LatLngBoundsObjectLiteral {
  @scala.inline
  def apply(east: scala.Double, north: scala.Double, south: scala.Double, west: scala.Double): LatLngBoundsObjectLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("east")(east)
    __obj.updateDynamic("north")(north)
    __obj.updateDynamic("south")(south)
    __obj.updateDynamic("west")(west)
    __obj.asInstanceOf[LatLngBoundsObjectLiteral]
  }
}

