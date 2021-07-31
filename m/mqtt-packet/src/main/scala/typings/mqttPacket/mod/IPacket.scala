package typings.mqttPacket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPacket extends StObject {
  
  var cmd: PacketCmd
  
  var length: js.UndefOr[Double] = js.undefined
  
  var messageId: js.UndefOr[Double] = js.undefined
}
object IPacket {
  
  @scala.inline
  def apply(cmd: PacketCmd): IPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPacket]
  }
  
  @scala.inline
  implicit class IPacketMutableBuilder[Self <: IPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: PacketCmd): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMessageId(value: Double): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
  }
}
