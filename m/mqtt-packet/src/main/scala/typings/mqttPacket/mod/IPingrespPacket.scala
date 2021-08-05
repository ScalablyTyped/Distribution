package typings.mqttPacket.mod

import typings.mqttPacket.mqttPacketStrings.pingresp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPingrespPacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPingrespPacket: pingresp
}
object IPingrespPacket {
  
  inline def apply(): IPingrespPacket = {
    val __obj = js.Dynamic.literal(cmd = "pingresp")
    __obj.asInstanceOf[IPingrespPacket]
  }
  
  extension [Self <: IPingrespPacket](x: Self) {
    
    inline def setCmd(value: pingresp): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
  }
}
