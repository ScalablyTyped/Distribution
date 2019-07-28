package typings.nodeDashGeocoder.nodeDashGeocoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var lat: Double
  var lon: Double
}

object Location {
  @scala.inline
  def apply(lat: Double, lon: Double): Location = {
    val __obj = js.Dynamic.literal(lat = lat, lon = lon)
  
    __obj.asInstanceOf[Location]
  }
}

