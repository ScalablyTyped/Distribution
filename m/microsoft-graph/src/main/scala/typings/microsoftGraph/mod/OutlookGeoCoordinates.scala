package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutlookGeoCoordinates extends js.Object {
  /**
    * The accuracy of the latitude and longitude. As an example, the accuracy can be measured in meters, such as the latitude
    * and longitude are accurate to within 50 meters.
    */
  var accuracy: js.UndefOr[Double] = js.native
  // The altitude of the location.
  var altitude: js.UndefOr[Double] = js.native
  // The accuracy of the altitude.
  var altitudeAccuracy: js.UndefOr[Double] = js.native
  // The latitude of the location.
  var latitude: js.UndefOr[Double] = js.native
  // The longitude of the location.
  var longitude: js.UndefOr[Double] = js.native
}

object OutlookGeoCoordinates {
  @scala.inline
  def apply(): OutlookGeoCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlookGeoCoordinates]
  }
  @scala.inline
  implicit class OutlookGeoCoordinatesOps[Self <: OutlookGeoCoordinates] (val x: Self) extends AnyVal {
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
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccuracy: Self = this.set("accuracy", js.undefined)
    @scala.inline
    def setAltitude(value: Double): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    @scala.inline
    def setAltitudeAccuracy(value: Double): Self = this.set("altitudeAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitudeAccuracy: Self = this.set("altitudeAccuracy", js.undefined)
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
  }
  
}

