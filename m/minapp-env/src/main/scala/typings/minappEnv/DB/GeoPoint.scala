package typings.minappEnv.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoPoint extends js.Object {
  var latitude: Double
  var longitude: Double
  def toJSON(): js.Object
}

object GeoPoint {
  @scala.inline
  def apply(latitude: Double, longitude: Double, toJSON: () => js.Object): GeoPoint = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeoPoint]
  }
}

