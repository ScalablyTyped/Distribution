package typings.mqttPacket.mod

import typings.mqttPacket.anon.ReasonString
import typings.mqttPacket.mqttPacketStrings.subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISubscribePacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_ISubscribePacket: subscribe
  
  var properties: js.UndefOr[ReasonString] = js.undefined
  
  var subscriptions: js.Array[ISubscription]
}
object ISubscribePacket {
  
  inline def apply(subscriptions: js.Array[ISubscription]): ISubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = "subscribe", subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscribePacket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISubscribePacket] (val x: Self) extends AnyVal {
    
    inline def setCmd(value: subscribe): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: ReasonString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSubscriptions(value: js.Array[ISubscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsVarargs(value: ISubscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
  }
}
