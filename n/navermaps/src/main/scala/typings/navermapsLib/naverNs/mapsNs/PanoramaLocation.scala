package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaLocation extends js.Object {
  var address: java.lang.String
  var coord: LatLng
  var panoId: java.lang.String
  var photodate: java.lang.String
  var title: java.lang.String
}

object PanoramaLocation {
  @scala.inline
  def apply(
    address: java.lang.String,
    coord: LatLng,
    panoId: java.lang.String,
    photodate: java.lang.String,
    title: java.lang.String
  ): PanoramaLocation = {
    val __obj = js.Dynamic.literal(address = address, coord = coord, panoId = panoId, photodate = photodate, title = title)
  
    __obj.asInstanceOf[PanoramaLocation]
  }
}

