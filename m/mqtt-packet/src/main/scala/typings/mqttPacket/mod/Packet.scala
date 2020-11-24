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
trait Packet extends js.Object
object Packet {
  
  @scala.inline
  def IPublishPacket(cmd: publish, dup: Boolean, payload: String | Buffer, qos: QoS, retain: Boolean, topic: String): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], dup = dup.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IPingreqPacket(cmd: pingreq): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IPubackPacket(cmd: puback): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IUnsubscribePacket(cmd: unsubscribe, unsubscriptions: js.Array[String]): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], unsubscriptions = unsubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IPubrelPacket(cmd: pubrel): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IConnectPacket(clientId: String, cmd: connect): Packet = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def ISubackPacket(cmd: suback, granted: js.Array[Double | js.Object]): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IDisconnectPacket(cmd: disconnect): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def ISubscribePacket(cmd: subscribe, subscriptions: js.Array[ISubscription]): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IPingrespPacket(cmd: pingresp): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IPubcompPacket(cmd: pubcomp): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IPubrecPacket(cmd: pubrec): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IUnsubackPacket(cmd: unsuback): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
  
  @scala.inline
  def IConnackPacket(cmd: connack, returnCode: Double, sessionPresent: Boolean): Packet = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], returnCode = returnCode.asInstanceOf[js.Any], sessionPresent = sessionPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
}
