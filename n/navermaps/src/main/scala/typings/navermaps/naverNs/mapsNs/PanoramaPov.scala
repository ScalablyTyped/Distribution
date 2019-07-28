package typings.navermaps.naverNs.mapsNs

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
    val __obj = js.Dynamic.literal(fov = fov, pan = pan, tilt = tilt)
  
    __obj.asInstanceOf[PanoramaPov]
  }
}

