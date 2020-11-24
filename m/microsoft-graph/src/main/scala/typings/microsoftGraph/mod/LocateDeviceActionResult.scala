package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocateDeviceActionResult extends DeviceActionResult {
  
  // device location
  var deviceLocation: js.UndefOr[NullableOption[DeviceGeoLocation]] = js.native
}
object LocateDeviceActionResult {
  
  @scala.inline
  def apply(): LocateDeviceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocateDeviceActionResult]
  }
  
  @scala.inline
  implicit class LocateDeviceActionResultOps[Self <: LocateDeviceActionResult] (val x: Self) extends AnyVal {
    
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
    def setDeviceLocation(value: NullableOption[DeviceGeoLocation]): Self = this.set("deviceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceLocation: Self = this.set("deviceLocation", js.undefined)
    
    @scala.inline
    def setDeviceLocationNull: Self = this.set("deviceLocation", null)
  }
}
