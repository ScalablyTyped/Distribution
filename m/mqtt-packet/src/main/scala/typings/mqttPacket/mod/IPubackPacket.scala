package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.puback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPubackPacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPubackPacket: puback
  
  var properties: js.UndefOr[ReasonString] = js.undefined
}
object IPubackPacket {
  
  inline def apply(): IPubackPacket = {
    val __obj = js.Dynamic.literal(cmd = "puback")
    __obj.asInstanceOf[IPubackPacket]
  }
  
  extension [Self <: IPubackPacket](x: Self) {
    
    inline def setCmd(value: puback): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: ReasonString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
