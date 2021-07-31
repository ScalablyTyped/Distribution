package typings.mqttPacket.mod

import typings.mqttPacket.mqttPacketStrings.pingreq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPingreqPacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPingreqPacket: pingreq
}
object IPingreqPacket {
  
  @scala.inline
  def apply(): IPingreqPacket = {
    val __obj = js.Dynamic.literal(cmd = "pingreq")
    __obj.asInstanceOf[IPingreqPacket]
  }
  
  @scala.inline
  implicit class IPingreqPacketMutableBuilder[Self <: IPingreqPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmd(value: pingreq): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
  }
}
