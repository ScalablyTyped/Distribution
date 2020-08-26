package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanoramaLocation extends js.Object {
  var address: String = js.native
  var coord: LatLng = js.native
  var panoId: String = js.native
  var photodate: String = js.native
  var title: String = js.native
}

object PanoramaLocation {
  @scala.inline
  def apply(address: String, coord: LatLng, panoId: String, photodate: String, title: String): PanoramaLocation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], coord = coord.asInstanceOf[js.Any], panoId = panoId.asInstanceOf[js.Any], photodate = photodate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaLocation]
  }
  @scala.inline
  implicit class PanoramaLocationOps[Self <: PanoramaLocation] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoord(value: LatLng): Self = this.set("coord", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanoId(value: String): Self = this.set("panoId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotodate(value: String): Self = this.set("photodate", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

