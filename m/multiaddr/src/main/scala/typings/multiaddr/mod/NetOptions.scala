package typings.multiaddr.mod

import typings.multiaddr.multiaddrStrings.ipv4_
import typings.multiaddr.multiaddrStrings.ipv6_
import typings.multiaddr.multiaddrStrings.tcp
import typings.multiaddr.multiaddrStrings.udp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetOptions extends js.Object {
  
  var family: ipv4_ | ipv6_ = js.native
  
  var host: String = js.native
  
  var port: Double = js.native
  
  var transport: tcp | udp = js.native
}
object NetOptions {
  
  @scala.inline
  def apply(family: ipv4_ | ipv6_, host: String, port: Double, transport: tcp | udp): NetOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetOptions]
  }
  
  @scala.inline
  implicit class NetOptionsOps[Self <: NetOptions] (val x: Self) extends AnyVal {
    
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
    def setFamily(value: ipv4_ | ipv6_): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport(value: tcp | udp): Self = this.set("transport", value.asInstanceOf[js.Any])
  }
}
