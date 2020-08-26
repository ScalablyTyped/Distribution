package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceGeoLocation extends js.Object {
  // Altitude, given in meters above sea level
  var altitude: js.UndefOr[Double] = js.native
  // Heading in degrees from true north
  var heading: js.UndefOr[Double] = js.native
  // Accuracy of longitude and latitude in meters
  var horizontalAccuracy: js.UndefOr[Double] = js.native
  // Time at which location was recorded, relative to UTC
  var lastCollectedDateTime: js.UndefOr[String] = js.native
  // Latitude coordinate of the device's location
  var latitude: js.UndefOr[Double] = js.native
  // Longitude coordinate of the device's location
  var longitude: js.UndefOr[Double] = js.native
  // Speed the device is traveling in meters per second
  var speed: js.UndefOr[Double] = js.native
  // Accuracy of altitude in meters
  var verticalAccuracy: js.UndefOr[Double] = js.native
}

object DeviceGeoLocation {
  @scala.inline
  def apply(): DeviceGeoLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceGeoLocation]
  }
  @scala.inline
  implicit class DeviceGeoLocationOps[Self <: DeviceGeoLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    @scala.inline
    def setHorizontalAccuracy(value: Double): Self = this.set("horizontalAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAccuracy: Self = this.set("horizontalAccuracy", js.undefined)
    @scala.inline
    def setLastCollectedDateTime(value: String): Self = this.set("lastCollectedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastCollectedDateTime: Self = this.set("lastCollectedDateTime", js.undefined)
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setVerticalAccuracy(value: Double): Self = this.set("verticalAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAccuracy: Self = this.set("verticalAccuracy", js.undefined)
  }
  
}

