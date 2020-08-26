package typings.motionSensorsPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccelerometerSensorOptions extends SensorOptions {
  var referenceFrame: js.UndefOr[AccelerometerLocalCoordinateSystem] = js.native
}

object AccelerometerSensorOptions {
  @scala.inline
  def apply(): AccelerometerSensorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccelerometerSensorOptions]
  }
  @scala.inline
  implicit class AccelerometerSensorOptionsOps[Self <: AccelerometerSensorOptions] (val x: Self) extends AnyVal {
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
    def setReferenceFrame(value: AccelerometerLocalCoordinateSystem): Self = this.set("referenceFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceFrame: Self = this.set("referenceFrame", js.undefined)
  }
  
}

