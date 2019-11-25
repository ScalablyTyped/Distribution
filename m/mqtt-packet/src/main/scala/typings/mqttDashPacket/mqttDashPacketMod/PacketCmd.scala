package typings.mqttDashPacket.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mqttDashPacket.mqttDashPacketStrings.connack
  - typings.mqttDashPacket.mqttDashPacketStrings.connect
  - typings.mqttDashPacket.mqttDashPacketStrings.disconnect
  - typings.mqttDashPacket.mqttDashPacketStrings.pingreq
  - typings.mqttDashPacket.mqttDashPacketStrings.pingresp
  - typings.mqttDashPacket.mqttDashPacketStrings.puback
  - typings.mqttDashPacket.mqttDashPacketStrings.pubcomp
  - typings.mqttDashPacket.mqttDashPacketStrings.publish
  - typings.mqttDashPacket.mqttDashPacketStrings.pubrel
  - typings.mqttDashPacket.mqttDashPacketStrings.pubrec
  - typings.mqttDashPacket.mqttDashPacketStrings.suback
  - typings.mqttDashPacket.mqttDashPacketStrings.subscribe
  - typings.mqttDashPacket.mqttDashPacketStrings.unsuback
  - typings.mqttDashPacket.mqttDashPacketStrings.unsubscribe
*/
trait PacketCmd extends js.Object

object PacketCmd {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connack: typings.mqttDashPacket.mqttDashPacketStrings.connack = this.cast("connack")
  @scala.inline
  def connect: typings.mqttDashPacket.mqttDashPacketStrings.connect = this.cast("connect")
  @scala.inline
  def disconnect: typings.mqttDashPacket.mqttDashPacketStrings.disconnect = this.cast("disconnect")
  @scala.inline
  def pingreq: typings.mqttDashPacket.mqttDashPacketStrings.pingreq = this.cast("pingreq")
  @scala.inline
  def pingresp: typings.mqttDashPacket.mqttDashPacketStrings.pingresp = this.cast("pingresp")
  @scala.inline
  def puback: typings.mqttDashPacket.mqttDashPacketStrings.puback = this.cast("puback")
  @scala.inline
  def pubcomp: typings.mqttDashPacket.mqttDashPacketStrings.pubcomp = this.cast("pubcomp")
  @scala.inline
  def publish: typings.mqttDashPacket.mqttDashPacketStrings.publish = this.cast("publish")
  @scala.inline
  def pubrec: typings.mqttDashPacket.mqttDashPacketStrings.pubrec = this.cast("pubrec")
  @scala.inline
  def pubrel: typings.mqttDashPacket.mqttDashPacketStrings.pubrel = this.cast("pubrel")
  @scala.inline
  def suback: typings.mqttDashPacket.mqttDashPacketStrings.suback = this.cast("suback")
  @scala.inline
  def subscribe: typings.mqttDashPacket.mqttDashPacketStrings.subscribe = this.cast("subscribe")
  @scala.inline
  def unsuback: typings.mqttDashPacket.mqttDashPacketStrings.unsuback = this.cast("unsuback")
  @scala.inline
  def unsubscribe: typings.mqttDashPacket.mqttDashPacketStrings.unsubscribe = this.cast("unsubscribe")
}

