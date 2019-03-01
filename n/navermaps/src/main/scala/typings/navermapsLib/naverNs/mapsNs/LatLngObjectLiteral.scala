package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLngObjectLiteral extends js.Object {
  var lat: scala.Double
  var lng: scala.Double
}

object LatLngObjectLiteral {
  @scala.inline
  def apply(lat: scala.Double, lng: scala.Double): LatLngObjectLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lat")(lat)
    __obj.updateDynamic("lng")(lng)
    __obj.asInstanceOf[LatLngObjectLiteral]
  }
}

