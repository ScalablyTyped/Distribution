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
    altitude: js.UndefOr[Double] = js.undefined,
    heading: js.UndefOr[Double] = js.undefined,
    horizontalAccuracy: js.UndefOr[Double] = js.undefined,
    lastCollectedDateTime: String = null,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    verticalAccuracy: js.UndefOr[Double] = js.undefined
  ): DeviceGeoLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heading)) __obj.updateDynamic("heading")(heading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalAccuracy)) __obj.updateDynamic("horizontalAccuracy")(horizontalAccuracy.get.asInstanceOf[js.Any])
    if (lastCollectedDateTime != null) __obj.updateDynamic("lastCollectedDateTime")(lastCollectedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalAccuracy)) __obj.updateDynamic("verticalAccuracy")(verticalAccuracy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceGeoLocation]
  }
}

