package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanoramaPov extends js.Object {
  var fov: Double = js.native
  var pan: Double = js.native
  var tilt: Double = js.native
}

object PanoramaPov {
  @scala.inline
  def apply(fov: Double, pan: Double, tilt: Double): PanoramaPov = {
    val __obj = js.Dynamic.literal(fov = fov.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], tilt = tilt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaPov]
  }
  @scala.inline
  implicit class PanoramaPovOps[Self <: PanoramaPov] (val x: Self) extends AnyVal {
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
    def setFov(value: Double): Self = this.set("fov", value.asInstanceOf[js.Any])
    @scala.inline
    def setPan(value: Double): Self = this.set("pan", value.asInstanceOf[js.Any])
    @scala.inline
    def setTilt(value: Double): Self = this.set("tilt", value.asInstanceOf[js.Any])
  }
  
}

