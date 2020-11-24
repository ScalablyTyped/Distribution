package typings.mqttPacket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPacket extends js.Object {
  
  var cmd: PacketCmd = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var messageId: js.UndefOr[Double] = js.native
}
object IPacket {
  
  @scala.inline
  def apply(cmd: PacketCmd): IPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPacket]
  }
  
  @scala.inline
  implicit class IPacketOps[Self <: IPacket] (val x: Self) extends AnyVal {
    
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
    def setCmd(value: PacketCmd): Self = this.set("cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setMessageId(value: Double): Self = this.set("messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
  }
}
