package typings.nodeGeocoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  var lat: Double = js.native
  var lon: Double = js.native
}

object Location {
  @scala.inline
  def apply(lat: Double, lon: Double): Location = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    @scala.inline
    def setLon(value: Double): Self = this.set("lon", value.asInstanceOf[js.Any])
  }
  
}

