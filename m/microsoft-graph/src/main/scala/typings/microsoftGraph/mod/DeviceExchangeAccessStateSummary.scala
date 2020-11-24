package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceExchangeAccessStateSummary extends js.Object {
  
  // Total count of devices with Exchange Access State: Allowed.
  var allowedDeviceCount: js.UndefOr[Double] = js.native
  
  // Total count of devices with Exchange Access State: Blocked.
  var blockedDeviceCount: js.UndefOr[Double] = js.native
  
  // Total count of devices with Exchange Access State: Quarantined.
  var quarantinedDeviceCount: js.UndefOr[Double] = js.native
  
  // Total count of devices for which no Exchange Access State could be found.
  var unavailableDeviceCount: js.UndefOr[Double] = js.native
  
  // Total count of devices with Exchange Access State: Unknown.
  var unknownDeviceCount: js.UndefOr[Double] = js.native
}
object DeviceExchangeAccessStateSummary {
  
  @scala.inline
  def apply(): DeviceExchangeAccessStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceExchangeAccessStateSummary]
  }
  
  @scala.inline
  implicit class DeviceExchangeAccessStateSummaryOps[Self <: DeviceExchangeAccessStateSummary] (val x: Self) extends AnyVal {
    
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
    def setAllowedDeviceCount(value: Double): Self = this.set("allowedDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedDeviceCount: Self = this.set("allowedDeviceCount", js.undefined)
    
    @scala.inline
    def setBlockedDeviceCount(value: Double): Self = this.set("blockedDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockedDeviceCount: Self = this.set("blockedDeviceCount", js.undefined)
    
    @scala.inline
    def setQuarantinedDeviceCount(value: Double): Self = this.set("quarantinedDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuarantinedDeviceCount: Self = this.set("quarantinedDeviceCount", js.undefined)
    
    @scala.inline
    def setUnavailableDeviceCount(value: Double): Self = this.set("unavailableDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnavailableDeviceCount: Self = this.set("unavailableDeviceCount", js.undefined)
    
    @scala.inline
    def setUnknownDeviceCount(value: Double): Self = this.set("unknownDeviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownDeviceCount: Self = this.set("unknownDeviceCount", js.undefined)
  }
}
