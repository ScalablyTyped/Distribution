package typings.node.osMod

import typings.node.nodeStrings.IPv4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceInfoIPv4
  extends NetworkInterfaceBase
     with NetworkInterfaceInfo {
  var family: IPv4 = js.native
}

object NetworkInterfaceInfoIPv4 {
  @scala.inline
  def apply(address: String, family: IPv4, internal: Boolean, mac: String, netmask: String): NetworkInterfaceInfoIPv4 = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceInfoIPv4]
  }
  @scala.inline
  implicit class NetworkInterfaceInfoIPv4Ops[Self <: NetworkInterfaceInfoIPv4] (val x: Self) extends AnyVal {
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
    def setFamily(value: IPv4): Self = this.set("family", value.asInstanceOf[js.Any])
  }
  
}

