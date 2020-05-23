package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Sub module: panorama
@js.native
trait PanoramaProjection extends KVO {
  def fromCoordToPov(coord: LatLng): PanoramaPov = js.native
}

