package typings.mqttPacket.mod

import typings.mqttPacket.mqttPacketStrings.unsuback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUnsubackPacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IUnsubackPacket: unsuback
  
  var properties: js.UndefOr[typings.mqttPacket.anon.UserProperties] = js.undefined
  
  var reasonCode: js.UndefOr[Double] = js.undefined
}
object IUnsubackPacket {
  
  inline def apply(): IUnsubackPacket = {
    val __obj = js.Dynamic.literal(cmd = "unsuback")
    __obj.asInstanceOf[IUnsubackPacket]
  }
  
  extension [Self <: IUnsubackPacket](x: Self) {
    
    inline def setCmd(value: unsuback): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: typings.mqttPacket.anon.UserProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setReasonCode(value: Double): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
  }
}
