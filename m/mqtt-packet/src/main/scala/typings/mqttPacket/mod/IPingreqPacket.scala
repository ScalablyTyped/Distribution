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
  
  inline def apply(): IPingreqPacket = {
    val __obj = js.Dynamic.literal(cmd = "pingreq")
    __obj.asInstanceOf[IPingreqPacket]
  }
  
  extension [Self <: IPingreqPacket](x: Self) {
    
    inline def setCmd(value: pingreq): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
  }
}
