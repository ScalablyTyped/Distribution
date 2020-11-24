package typings.mqttPacket.mod

import typings.mqttPacket.mqttPacketStrings.pingresp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPingrespPacket
  extends IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPingrespPacket: pingresp = js.native
}
object IPingrespPacket {
  
  @scala.inline
  def apply(cmd: pingresp): IPingrespPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPingrespPacket]
  }
  
  @scala.inline
  implicit class IPingrespPacketOps[Self <: IPingrespPacket] (val x: Self) extends AnyVal {
    
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
    def setCmd(value: pingresp): Self = this.set("cmd", value.asInstanceOf[js.Any])
  }
}
