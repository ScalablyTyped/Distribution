package typings.natUpnp.anon

import typings.natUpnp.mod.RawDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends js.Object {
  
  var device: RawDevice | js.Array[RawDevice] = js.native
}
object Device {
  
  @scala.inline
  def apply(device: RawDevice | js.Array[RawDevice]): Device = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    
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
    def setDeviceVarargs(value: RawDevice*): Self = this.set("device", js.Array(value :_*))
    
    @scala.inline
    def setDevice(value: RawDevice | js.Array[RawDevice]): Self = this.set("device", value.asInstanceOf[js.Any])
  }
}
