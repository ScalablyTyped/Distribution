package typings.node.osMod

import typings.node.nodeStrings.IPv6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterfaceInfoIPv6
  extends NetworkInterfaceBase
     with NetworkInterfaceInfo {
  
  var family: IPv6 = js.native
  
  var scopeid: Double = js.native
}
object NetworkInterfaceInfoIPv6 {
  
  @scala.inline
  def apply(address: String, family: IPv6, internal: Boolean, mac: String, netmask: String, scopeid: Double): NetworkInterfaceInfoIPv6 = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], scopeid = scopeid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceInfoIPv6]
  }
  
  @scala.inline
  implicit class NetworkInterfaceInfoIPv6Ops[Self <: NetworkInterfaceInfoIPv6] (val x: Self) extends AnyVal {
    
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
    def setFamily(value: IPv6): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeid(value: Double): Self = this.set("scopeid", value.asInstanceOf[js.Any])
  }
}
