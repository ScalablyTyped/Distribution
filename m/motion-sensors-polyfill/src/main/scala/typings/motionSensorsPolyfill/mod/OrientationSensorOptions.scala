package typings.motionSensorsPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrientationSensorOptions extends SensorOptions {
  var referenceFrame: js.UndefOr[OrientationSensorLocalCoordinateSystem] = js.native
}

object OrientationSensorOptions {
  @scala.inline
  def apply(): OrientationSensorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrientationSensorOptions]
  }
  @scala.inline
  implicit class OrientationSensorOptionsOps[Self <: OrientationSensorOptions] (val x: Self) extends AnyVal {
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
    def setReferenceFrame(value: OrientationSensorLocalCoordinateSystem): Self = this.set("referenceFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceFrame: Self = this.set("referenceFrame", js.undefined)
  }
  
}

