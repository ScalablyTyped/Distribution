package typings.mqttPacket.mod

import typings.mqttPacket.anon.ServerReference
import typings.mqttPacket.mqttPacketStrings.disconnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDisconnectPacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IDisconnectPacket: disconnect
  
  var properties: js.UndefOr[ServerReference] = js.undefined
}
object IDisconnectPacket {
  
  inline def apply(): IDisconnectPacket = {
    val __obj = js.Dynamic.literal(cmd = "disconnect")
    __obj.asInstanceOf[IDisconnectPacket]
  }
  
  extension [Self <: IDisconnectPacket](x: Self) {
    
    inline def setCmd(value: disconnect): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: ServerReference): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
