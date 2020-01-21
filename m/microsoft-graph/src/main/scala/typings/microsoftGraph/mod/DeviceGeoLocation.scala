package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceGeoLocation extends js.Object {
  // Altitude, given in meters above sea level
  var altitude: js.UndefOr[Double] = js.undefined
  // Heading in degrees from true north
  var heading: js.UndefOr[Double] = js.undefined
  // Accuracy of longitude and latitude in meters
  var horizontalAccuracy: js.UndefOr[Double] = js.undefined
  // Time at which location was recorded, relative to UTC
  var lastCollectedDateTime: js.UndefOr[String] = js.undefined
  // Latitude coordinate of the device's location
  var latitude: js.UndefOr[Double] = js.undefined
  // Longitude coordinate of the device's location
  var longitude: js.UndefOr[Double] = js.undefined
  // Speed the device is traveling in meters per second
  var speed: js.UndefOr[Double] = js.undefined
  // Accuracy of altitude in meters
  var verticalAccuracy: js.UndefOr[Double] = js.undefined
}

object DeviceGeoLocation {
  @scala.inline
  def apply(
    altitude: Int | Double = null,
    heading: Int | Double = null,
    horizontalAccuracy: Int | Double = null,
    lastCollectedDateTime: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    speed: Int | Double = null,
    verticalAccuracy: Int | Double = null
  ): DeviceGeoLocation = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (horizontalAccuracy != null) __obj.updateDynamic("horizontalAccuracy")(horizontalAccuracy.asInstanceOf[js.Any])
    if (lastCollectedDateTime != null) __obj.updateDynamic("lastCollectedDateTime")(lastCollectedDateTime.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (verticalAccuracy != null) __obj.updateDynamic("verticalAccuracy")(verticalAccuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceGeoLocation]
  }
}

