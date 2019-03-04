package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaPov extends js.Object {
  var fov: scala.Double
  var pan: scala.Double
  var tilt: scala.Double
}

object PanoramaPov {
  @scala.inline
  def apply(fov: scala.Double, pan: scala.Double, tilt: scala.Double): PanoramaPov = {
    val __obj = js.Dynamic.literal(fov = fov, pan = pan, tilt = tilt)
  
    __obj.asInstanceOf[PanoramaPov]
  }
}

