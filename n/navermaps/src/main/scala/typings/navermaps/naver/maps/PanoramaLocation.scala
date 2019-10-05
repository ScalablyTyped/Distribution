package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaLocation extends js.Object {
  var address: String
  var coord: LatLng
  var panoId: String
  var photodate: String
  var title: String
}

object PanoramaLocation {
  @scala.inline
  def apply(address: String, coord: LatLng, panoId: String, photodate: String, title: String): PanoramaLocation = {
    val __obj = js.Dynamic.literal(address = address, coord = coord, panoId = panoId, photodate = photodate, title = title)
  
    __obj.asInstanceOf[PanoramaLocation]
  }
}

