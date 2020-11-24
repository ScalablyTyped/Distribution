package typings.motionSensorsPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GyroscopeSensorOptions extends js.Object {
  
  var referenceFrame: js.UndefOr[GyroscopeLocalCoordinateSystem] = js.native
}
object GyroscopeSensorOptions {
  
  @scala.inline
  def apply(): GyroscopeSensorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GyroscopeSensorOptions]
  }
  
  @scala.inline
  implicit class GyroscopeSensorOptionsOps[Self <: GyroscopeSensorOptions] (val x: Self) extends AnyVal {
    
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
    def setReferenceFrame(value: GyroscopeLocalCoordinateSystem): Self = this.set("referenceFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceFrame: Self = this.set("referenceFrame", js.undefined)
  }
}
