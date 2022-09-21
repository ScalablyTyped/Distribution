package typings.mqttPacket.mod

import typings.mqttPacket.mqttPacketStrings.suback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISubackPacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_ISubackPacket: suback
  
  var granted: js.Array[Double | js.Object]
  
  var properties: js.UndefOr[typings.mqttPacket.anon.UserProperties] = js.undefined
  
  var reasonCode: js.UndefOr[Double] = js.undefined
}
object ISubackPacket {
  
  inline def apply(granted: js.Array[Double | js.Object]): ISubackPacket = {
    val __obj = js.Dynamic.literal(cmd = "suback", granted = granted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubackPacket]
  }
  
  extension [Self <: ISubackPacket](x: Self) {
    
    inline def setCmd(value: suback): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setGranted(value: js.Array[Double | js.Object]): Self = StObject.set(x, "granted", value.asInstanceOf[js.Any])
    
    inline def setGrantedVarargs(value: (Double | js.Object)*): Self = StObject.set(x, "granted", js.Array(value*))
    
    inline def setProperties(value: typings.mqttPacket.anon.UserProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setReasonCode(value: Double): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
  }
}
