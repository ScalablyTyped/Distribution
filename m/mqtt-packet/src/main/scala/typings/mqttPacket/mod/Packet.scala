package typings.mqttPacket.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mqttPacket.mod.IConnectPacket
  - typings.mqttPacket.mod.IPublishPacket
  - typings.mqttPacket.mod.IConnackPacket
  - typings.mqttPacket.mod.ISubscribePacket
  - typings.mqttPacket.mod.ISubackPacket
  - typings.mqttPacket.mod.IUnsubscribePacket
  - typings.mqttPacket.mod.IUnsubackPacket
  - typings.mqttPacket.mod.IPubackPacket
  - typings.mqttPacket.mod.IPubcompPacket
  - typings.mqttPacket.mod.IPubrelPacket
  - typings.mqttPacket.mod.IPingreqPacket
  - typings.mqttPacket.mod.IPingrespPacket
  - typings.mqttPacket.mod.IDisconnectPacket
  - typings.mqttPacket.mod.IPubrecPacket
*/
trait Packet extends StObject
object Packet {
  
  inline def IConnackPacket(returnCode: Double, sessionPresent: Boolean): typings.mqttPacket.mod.IConnackPacket = {
    val __obj = js.Dynamic.literal(cmd = "connack", returnCode = returnCode.asInstanceOf[js.Any], sessionPresent = sessionPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IConnackPacket]
  }
  
  inline def IConnectPacket(clientId: String): typings.mqttPacket.mod.IConnectPacket = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], cmd = "connect")
    __obj.asInstanceOf[typings.mqttPacket.mod.IConnectPacket]
  }
  
  inline def IDisconnectPacket(): typings.mqttPacket.mod.IDisconnectPacket = {
    val __obj = js.Dynamic.literal(cmd = "disconnect")
    __obj.asInstanceOf[typings.mqttPacket.mod.IDisconnectPacket]
  }
  
  inline def IPingreqPacket(): typings.mqttPacket.mod.IPingreqPacket = {
    val __obj = js.Dynamic.literal(cmd = "pingreq")
    __obj.asInstanceOf[typings.mqttPacket.mod.IPingreqPacket]
  }
  
  inline def IPingrespPacket(): typings.mqttPacket.mod.IPingrespPacket = {
    val __obj = js.Dynamic.literal(cmd = "pingresp")
    __obj.asInstanceOf[typings.mqttPacket.mod.IPingrespPacket]
  }
  
  inline def IPubackPacket(): typings.mqttPacket.mod.IPubackPacket = {
    val __obj = js.Dynamic.literal(cmd = "puback")
    __obj.asInstanceOf[typings.mqttPacket.mod.IPubackPacket]
  }
  
  inline def IPubcompPacket(): typings.mqttPacket.mod.IPubcompPacket = {
    val __obj = js.Dynamic.literal(cmd = "pubcomp")
    __obj.asInstanceOf[typings.mqttPacket.mod.IPubcompPacket]
  }
  
  inline def IPublishPacket(dup: Boolean, payload: String | Buffer, qos: QoS, retain: Boolean, topic: String): typings.mqttPacket.mod.IPublishPacket = {
    val __obj = js.Dynamic.literal(cmd = "publish", dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IPublishPacket]
  }
  
  inline def IPubrecPacket(): typings.mqttPacket.mod.IPubrecPacket = {
    val __obj = js.Dynamic.literal(cmd = "pubrec")
    __obj.asInstanceOf[typings.mqttPacket.mod.IPubrecPacket]
  }
  
  inline def IPubrelPacket(): typings.mqttPacket.mod.IPubrelPacket = {
    val __obj = js.Dynamic.literal(cmd = "pubrel")
    __obj.asInstanceOf[typings.mqttPacket.mod.IPubrelPacket]
  }
  
  inline def ISubackPacket(granted: js.Array[Double | js.Object]): typings.mqttPacket.mod.ISubackPacket = {
    val __obj = js.Dynamic.literal(cmd = "suback", granted = granted.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.ISubackPacket]
  }
  
  inline def ISubscribePacket(subscriptions: js.Array[ISubscription]): typings.mqttPacket.mod.ISubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = "subscribe", subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.ISubscribePacket]
  }
  
  inline def IUnsubackPacket(): typings.mqttPacket.mod.IUnsubackPacket = {
    val __obj = js.Dynamic.literal(cmd = "unsuback")
    __obj.asInstanceOf[typings.mqttPacket.mod.IUnsubackPacket]
  }
  
  inline def IUnsubscribePacket(unsubscriptions: js.Array[String]): typings.mqttPacket.mod.IUnsubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = "unsubscribe", unsubscriptions = unsubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IUnsubscribePacket]
  }
}
