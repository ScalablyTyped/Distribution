package typings.mqttPacket.mod

import typings.mqttPacket.anon.AssignedClientIdentifier
import typings.mqttPacket.mqttPacketStrings.connack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConnackPacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IConnackPacket: connack
  
  var properties: js.UndefOr[AssignedClientIdentifier] = js.undefined
  
  var reasonCode: js.UndefOr[Double] = js.undefined
  
  var returnCode: js.UndefOr[Double] = js.undefined
  
  var sessionPresent: Boolean
}
object IConnackPacket {
  
  inline def apply(sessionPresent: Boolean): IConnackPacket = {
    val __obj = js.Dynamic.literal(cmd = "connack", sessionPresent = sessionPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnackPacket]
  }
  
  extension [Self <: IConnackPacket](x: Self) {
    
    inline def setCmd(value: connack): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AssignedClientIdentifier): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setReasonCode(value: Double): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReturnCode(value: Double): Self = StObject.set(x, "returnCode", value.asInstanceOf[js.Any])
    
    inline def setReturnCodeUndefined: Self = StObject.set(x, "returnCode", js.undefined)
    
    inline def setSessionPresent(value: Boolean): Self = StObject.set(x, "sessionPresent", value.asInstanceOf[js.Any])
  }
}
