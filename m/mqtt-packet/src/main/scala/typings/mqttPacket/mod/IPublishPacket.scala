package typings.mqttPacket.mod

import typings.mqttPacket.anon.CorrelationData
import typings.mqttPacket.mqttPacketStrings.publish
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPublishPacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IPublishPacket: publish
  
  var dup: Boolean
  
  var payload: String | Buffer
  
  var properties: js.UndefOr[CorrelationData] = js.undefined
  
  var qos: QoS
  
  var retain: Boolean
  
  var topic: String
}
object IPublishPacket {
  
  inline def apply(dup: Boolean, payload: String | Buffer, qos: QoS, retain: Boolean, topic: String): IPublishPacket = {
    val __obj = js.Dynamic.literal(cmd = "publish", dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPublishPacket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPublishPacket] (val x: Self) extends AnyVal {
    
    inline def setCmd(value: publish): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setDup(value: Boolean): Self = StObject.set(x, "dup", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: String | Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: CorrelationData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    inline def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
