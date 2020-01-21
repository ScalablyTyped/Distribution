package typings.mqttPacket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mqttPacket.mqttPacketStrings.connack
  - typings.mqttPacket.mqttPacketStrings.connect
  - typings.mqttPacket.mqttPacketStrings.disconnect
  - typings.mqttPacket.mqttPacketStrings.pingreq
  - typings.mqttPacket.mqttPacketStrings.pingresp
  - typings.mqttPacket.mqttPacketStrings.puback
  - typings.mqttPacket.mqttPacketStrings.pubcomp
  - typings.mqttPacket.mqttPacketStrings.publish
  - typings.mqttPacket.mqttPacketStrings.pubrel
  - typings.mqttPacket.mqttPacketStrings.pubrec
  - typings.mqttPacket.mqttPacketStrings.suback
  - typings.mqttPacket.mqttPacketStrings.subscribe
  - typings.mqttPacket.mqttPacketStrings.unsuback
  - typings.mqttPacket.mqttPacketStrings.unsubscribe
*/
trait PacketCmd extends js.Object

object PacketCmd {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connack: typings.mqttPacket.mqttPacketStrings.connack = this.cast("connack")
  @scala.inline
  def connect: typings.mqttPacket.mqttPacketStrings.connect = this.cast("connect")
  @scala.inline
  def disconnect: typings.mqttPacket.mqttPacketStrings.disconnect = this.cast("disconnect")
  @scala.inline
  def pingreq: typings.mqttPacket.mqttPacketStrings.pingreq = this.cast("pingreq")
  @scala.inline
  def pingresp: typings.mqttPacket.mqttPacketStrings.pingresp = this.cast("pingresp")
  @scala.inline
  def puback: typings.mqttPacket.mqttPacketStrings.puback = this.cast("puback")
  @scala.inline
  def pubcomp: typings.mqttPacket.mqttPacketStrings.pubcomp = this.cast("pubcomp")
  @scala.inline
  def publish: typings.mqttPacket.mqttPacketStrings.publish = this.cast("publish")
  @scala.inline
  def pubrec: typings.mqttPacket.mqttPacketStrings.pubrec = this.cast("pubrec")
  @scala.inline
  def pubrel: typings.mqttPacket.mqttPacketStrings.pubrel = this.cast("pubrel")
  @scala.inline
  def suback: typings.mqttPacket.mqttPacketStrings.suback = this.cast("suback")
  @scala.inline
  def subscribe: typings.mqttPacket.mqttPacketStrings.subscribe = this.cast("subscribe")
  @scala.inline
  def unsuback: typings.mqttPacket.mqttPacketStrings.unsuback = this.cast("unsuback")
  @scala.inline
  def unsubscribe: typings.mqttPacket.mqttPacketStrings.unsubscribe = this.cast("unsubscribe")
}

