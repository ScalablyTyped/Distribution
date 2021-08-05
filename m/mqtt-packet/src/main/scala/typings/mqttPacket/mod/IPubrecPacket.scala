package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.pubrec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPubrecPacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPubrecPacket: pubrec
  
  var properties: js.UndefOr[ReasonString] = js.undefined
}
object IPubrecPacket {
  
  inline def apply(): IPubrecPacket = {
    val __obj = js.Dynamic.literal(cmd = "pubrec")
    __obj.asInstanceOf[IPubrecPacket]
  }
  
  extension [Self <: IPubrecPacket](x: Self) {
    
    inline def setCmd(value: pubrec): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: ReasonString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
