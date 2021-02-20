package typings.mqttPacket.mod

import typings.mqttPacket.mqttPacketStrings.connack
import typings.mqttPacket.mqttPacketStrings.connect
import typings.mqttPacket.mqttPacketStrings.disconnect
import typings.mqttPacket.mqttPacketStrings.pingreq
import typings.mqttPacket.mqttPacketStrings.pingresp
import typings.mqttPacket.mqttPacketStrings.puback
import typings.mqttPacket.mqttPacketStrings.pubcomp
import typings.mqttPacket.mqttPacketStrings.publish
import typings.mqttPacket.mqttPacketStrings.pubrec
import typings.mqttPacket.mqttPacketStrings.pubrel
import typings.mqttPacket.mqttPacketStrings.suback
import typings.mqttPacket.mqttPacketStrings.subscribe
import typings.mqttPacket.mqttPacketStrings.unsuback
import typings.mqttPacket.mqttPacketStrings.unsubscribe
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def IConnackPacket(cmd: connack, returnCode: Double, sessionPresent: Boolean): typings.mqttPacket.mod.IConnackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], returnCode = returnCode.asInstanceOf[js.Any], sessionPresent = sessionPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IConnackPacket]
  }
  
  @scala.inline
  def IConnectPacket(clientId: String, cmd: connect): typings.mqttPacket.mod.IConnectPacket = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IConnectPacket]
  }
  
  @scala.inline
  def IDisconnectPacket(cmd: disconnect): typings.mqttPacket.mod.IDisconnectPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IDisconnectPacket]
  }
  
  @scala.inline
  def IPingreqPacket(cmd: pingreq): typings.mqttPacket.mod.IPingreqPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IPingreqPacket]
  }
  
  @scala.inline
  def IPingrespPacket(cmd: pingresp): typings.mqttPacket.mod.IPingrespPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IPingrespPacket]
  }
  
  @scala.inline
  def IPubackPacket(cmd: puback): typings.mqttPacket.mod.IPubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IPubackPacket]
  }
  
  @scala.inline
  def IPubcompPacket(cmd: pubcomp): typings.mqttPacket.mod.IPubcompPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IPubcompPacket]
  }
  
  @scala.inline
  def IPublishPacket(cmd: publish, dup: Boolean, payload: String | Buffer, qos: QoS, retain: Boolean, topic: String): typings.mqttPacket.mod.IPublishPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IPublishPacket]
  }
  
  @scala.inline
  def IPubrecPacket(cmd: pubrec): typings.mqttPacket.mod.IPubrecPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IPubrecPacket]
  }
  
  @scala.inline
  def IPubrelPacket(cmd: pubrel): typings.mqttPacket.mod.IPubrelPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IPubrelPacket]
  }
  
  @scala.inline
  def ISubackPacket(cmd: suback, granted: js.Array[Double | js.Object]): typings.mqttPacket.mod.ISubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.ISubackPacket]
  }
  
  @scala.inline
  def ISubscribePacket(cmd: subscribe, subscriptions: js.Array[ISubscription]): typings.mqttPacket.mod.ISubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.ISubscribePacket]
  }
  
  @scala.inline
  def IUnsubackPacket(cmd: unsuback): typings.mqttPacket.mod.IUnsubackPacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IUnsubackPacket]
  }
  
  @scala.inline
  def IUnsubscribePacket(cmd: unsubscribe, unsubscriptions: js.Array[String]): typings.mqttPacket.mod.IUnsubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], unsubscriptions = unsubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mqttPacket.mod.IUnsubscribePacket]
  }
}
