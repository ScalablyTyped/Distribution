package typings.mqttPacket.mod

import typings.mqttPacket.mqttPacketStrings.pingreq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPingreqPacket
  extends IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPingreqPacket: pingreq = js.native
}
object IPingreqPacket {
  
  @scala.inline
  def apply(cmd: pingreq): IPingreqPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPingreqPacket]
  }
  
  @scala.inline
  implicit class IPingreqPacketOps[Self <: IPingreqPacket] (val x: Self) extends AnyVal {
    
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
    def setCmd(value: pingreq): Self = this.set("cmd", value.asInstanceOf[js.Any])
  }
}
