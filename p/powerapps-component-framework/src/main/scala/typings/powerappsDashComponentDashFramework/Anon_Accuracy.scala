package typings.powerappsDashComponentDashFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accuracy extends js.Object {
  var accuracy: Double
  var altitude: Double
  var altitudeAccuracy: Double
  var heading: Double
  var latitude: Double
  var longitude: Double
  var speed: Double
}

object Anon_Accuracy {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    altitudeAccuracy: Double,
    heading: Double,
    latitude: Double,
    longitude: Double,
    speed: Double
  ): Anon_Accuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, altitude = altitude, altitudeAccuracy = altitudeAccuracy, heading = heading, latitude = latitude, longitude = longitude, speed = speed)
  
    __obj.asInstanceOf[Anon_Accuracy]
  }
}

