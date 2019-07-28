package typings.ngeohash.ngeohashNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeographicPoint extends js.Object {
  var latitude: Double
  var longitude: Double
}

object GeographicPoint {
  @scala.inline
  def apply(latitude: Double, longitude: Double): GeographicPoint = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[GeographicPoint]
  }
}

