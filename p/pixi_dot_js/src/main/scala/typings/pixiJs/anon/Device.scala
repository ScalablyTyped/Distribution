package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  var device: Boolean = js.native
  var ipod: Boolean = js.native
  var phone: Boolean = js.native
  var tablet: Boolean = js.native
}

object Device {
  @scala.inline
  def apply(device: Boolean, ipod: Boolean, phone: Boolean, tablet: Boolean): Device = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], ipod = ipod.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
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
    def setDevice(value: Boolean): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpod(value: Boolean): Self = this.set("ipod", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: Boolean): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setTablet(value: Boolean): Self = this.set("tablet", value.asInstanceOf[js.Any])
  }
  
}

