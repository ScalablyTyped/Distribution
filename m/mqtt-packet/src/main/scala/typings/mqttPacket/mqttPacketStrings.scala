package typings.mqttPacket

import typings.mqttPacket.mod.PacketCmd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mqttPacketStrings {
  @js.native
  sealed trait MQIsdp extends js.Object
  
  @js.native
  sealed trait MQTT extends js.Object
  
  @js.native
  sealed trait connack extends PacketCmd
  
  @js.native
  sealed trait connect extends PacketCmd
  
  @js.native
  sealed trait disconnect extends PacketCmd
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait packet extends js.Object
  
  @js.native
  sealed trait pingreq extends PacketCmd
  
  @js.native
  sealed trait pingresp extends PacketCmd
  
  @js.native
  sealed trait puback extends PacketCmd
  
  @js.native
  sealed trait pubcomp extends PacketCmd
  
  @js.native
  sealed trait publish extends PacketCmd
  
  @js.native
  sealed trait pubrec extends PacketCmd
  
  @js.native
  sealed trait pubrel extends PacketCmd
  
  @js.native
  sealed trait suback extends PacketCmd
  
  @js.native
  sealed trait subscribe extends PacketCmd
  
  @js.native
  sealed trait unsuback extends PacketCmd
  
  @js.native
  sealed trait unsubscribe extends PacketCmd
  
  @scala.inline
  def MQIsdp: MQIsdp = "MQIsdp".asInstanceOf[MQIsdp]
  @scala.inline
  def MQTT: MQTT = "MQTT".asInstanceOf[MQTT]
  @scala.inline
  def connack: connack = "connack".asInstanceOf[connack]
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  @scala.inline
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def packet: packet = "packet".asInstanceOf[packet]
  @scala.inline
  def pingreq: pingreq = "pingreq".asInstanceOf[pingreq]
  @scala.inline
  def pingresp: pingresp = "pingresp".asInstanceOf[pingresp]
  @scala.inline
  def puback: puback = "puback".asInstanceOf[puback]
  @scala.inline
  def pubcomp: pubcomp = "pubcomp".asInstanceOf[pubcomp]
  @scala.inline
  def publish: publish = "publish".asInstanceOf[publish]
  @scala.inline
  def pubrec: pubrec = "pubrec".asInstanceOf[pubrec]
  @scala.inline
  def pubrel: pubrel = "pubrel".asInstanceOf[pubrel]
  @scala.inline
  def suback: suback = "suback".asInstanceOf[suback]
  @scala.inline
  def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  @scala.inline
  def unsuback: unsuback = "unsuback".asInstanceOf[unsuback]
  @scala.inline
  def unsubscribe: unsubscribe = "unsubscribe".asInstanceOf[unsubscribe]
}

