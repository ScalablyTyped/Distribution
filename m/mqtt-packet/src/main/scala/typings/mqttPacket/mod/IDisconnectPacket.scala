package typings.mqttPacket.mod

import typings.mqttPacket.anon.ServerReference
import typings.mqttPacket.mqttPacketStrings.disconnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDisconnectPacket
  extends IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IDisconnectPacket: disconnect = js.native
  
  var properties: js.UndefOr[ServerReference] = js.native
}
object IDisconnectPacket {
  
  @scala.inline
  def apply(cmd: disconnect): IDisconnectPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisconnectPacket]
  }
  
  @scala.inline
  implicit class IDisconnectPacketOps[Self <: IDisconnectPacket] (val x: Self) extends AnyVal {
    
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
    def setCmd(value: disconnect): Self = this.set("cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: ServerReference): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
