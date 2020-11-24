package typings.multiaddr.mod

import typings.multiaddr.multiaddrStrings.IPv4
import typings.multiaddr.multiaddrStrings.IPv6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeAddress extends js.Object {
  
  var address: String = js.native
  
  var family: IPv4 | IPv6 = js.native
  
  var port: String = js.native
}
object NodeAddress {
  
  @scala.inline
  def apply(address: String, family: IPv4 | IPv6, port: String): NodeAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeAddress]
  }
  
  @scala.inline
  implicit class NodeAddressOps[Self <: NodeAddress] (val x: Self) extends AnyVal {
    
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
    def setFamily(value: IPv4 | IPv6): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
  }
}
