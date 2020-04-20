package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaPov extends js.Object {
  var fov: Double
  var pan: Double
  var tilt: Double
}

object PanoramaPov {
  @scala.inline
  def apply(fov: Double, pan: Double, tilt: Double): PanoramaPov = {
    val __obj = js.Dynamic.literal(fov = fov.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], tilt = tilt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaPov]
  }
}

