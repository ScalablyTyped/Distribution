package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents location information.
  */
@js.native
trait ILocation extends js.Object {
  /**
    * The altitude portion of the location, expressed as positive (above)
    * or negative (below) values relative to sea level, in units of
    * measurement as determined by the camera.
    */
  var altitude: Double = js.native
  /**
    * The latitude portion of the location, expressed as positive (north)
    * or negative (south) degrees relative to the equator.
    */
  var latitude: Double = js.native
  /**
    * The longitude portion of the location expressed as positive (east) or
    * negative (west) degrees relative to the Prime Meridian.
    */
  var longitude: Double = js.native
}

object ILocation {
  @scala.inline
  def apply(altitude: Double, latitude: Double, longitude: Double): ILocation = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocation]
  }
  @scala.inline
  implicit class ILocationOps[Self <: ILocation] (val x: Self) extends AnyVal {
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
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
  }
  
}

