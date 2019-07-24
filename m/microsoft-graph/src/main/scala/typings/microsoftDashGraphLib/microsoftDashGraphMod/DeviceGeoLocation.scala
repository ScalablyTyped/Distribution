package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceGeoLocation extends js.Object {
  // Altitude, given in meters above sea level
  var altitude: js.UndefOr[scala.Double] = js.undefined
  // Heading in degrees from true north
  var heading: js.UndefOr[scala.Double] = js.undefined
  // Accuracy of longitude and latitude in meters
  var horizontalAccuracy: js.UndefOr[scala.Double] = js.undefined
  // Time at which location was recorded, relative to UTC
  var lastCollectedDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Latitude coordinate of the device's location
  var latitude: js.UndefOr[scala.Double] = js.undefined
  // Longitude coordinate of the device's location
  var longitude: js.UndefOr[scala.Double] = js.undefined
  // Speed the device is traveling in meters per second
  var speed: js.UndefOr[scala.Double] = js.undefined
  // Accuracy of altitude in meters
  var verticalAccuracy: js.UndefOr[scala.Double] = js.undefined
}

object DeviceGeoLocation {
  @scala.inline
  def apply(
    altitude: scala.Int | scala.Double = null,
    heading: scala.Int | scala.Double = null,
    horizontalAccuracy: scala.Int | scala.Double = null,
    lastCollectedDateTime: java.lang.String = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    verticalAccuracy: scala.Int | scala.Double = null
  ): DeviceGeoLocation = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (horizontalAccuracy != null) __obj.updateDynamic("horizontalAccuracy")(horizontalAccuracy.asInstanceOf[js.Any])
    if (lastCollectedDateTime != null) __obj.updateDynamic("lastCollectedDateTime")(lastCollectedDateTime)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (verticalAccuracy != null) __obj.updateDynamic("verticalAccuracy")(verticalAccuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceGeoLocation]
  }
}

