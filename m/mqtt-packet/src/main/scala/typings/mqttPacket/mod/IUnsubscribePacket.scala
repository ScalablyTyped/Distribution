package typings.mqttPacket.mod

import typings.mqttPacket.mqttPacketStrings.unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUnsubscribePacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IUnsubscribePacket: unsubscribe
  
  var properties: js.UndefOr[typings.mqttPacket.anon.UserProperties] = js.undefined
  
  var unsubscriptions: js.Array[String]
}
object IUnsubscribePacket {
  
  inline def apply(unsubscriptions: js.Array[String]): IUnsubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = "unsubscribe", unsubscriptions = unsubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnsubscribePacket]
  }
  
  extension [Self <: IUnsubscribePacket](x: Self) {
    
    inline def setCmd(value: unsubscribe): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: typings.mqttPacket.anon.UserProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setUnsubscriptions(value: js.Array[String]): Self = StObject.set(x, "unsubscriptions", value.asInstanceOf[js.Any])
    
    inline def setUnsubscriptionsVarargs(value: String*): Self = StObject.set(x, "unsubscriptions", js.Array(value*))
  }
}
