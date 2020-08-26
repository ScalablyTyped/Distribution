package typings.node.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceBase extends js.Object {
  var address: String = js.native
  var cidr: String | Null = js.native
  var internal: Boolean = js.native
  var mac: String = js.native
  var netmask: String = js.native
}

object NetworkInterfaceBase {
  @scala.inline
  def apply(address: String, internal: Boolean, mac: String, netmask: String): NetworkInterfaceBase = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceBase]
  }
  @scala.inline
  implicit class NetworkInterfaceBaseOps[Self <: NetworkInterfaceBase] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternal(value: Boolean): Self = this.set("internal", value.asInstanceOf[js.Any])
    @scala.inline
    def setMac(value: String): Self = this.set("mac", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetmask(value: String): Self = this.set("netmask", value.asInstanceOf[js.Any])
    @scala.inline
    def setCidr(value: String): Self = this.set("cidr", value.asInstanceOf[js.Any])
    @scala.inline
    def setCidrNull: Self = this.set("cidr", null)
  }
  
}

