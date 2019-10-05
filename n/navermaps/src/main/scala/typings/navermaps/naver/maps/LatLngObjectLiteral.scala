package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLngObjectLiteral extends js.Object {
  var lat: Double
  var lng: Double
}

object LatLngObjectLiteral {
  @scala.inline
  def apply(lat: Double, lng: Double): LatLngObjectLiteral = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng)
  
    __obj.asInstanceOf[LatLngObjectLiteral]
  }
}

