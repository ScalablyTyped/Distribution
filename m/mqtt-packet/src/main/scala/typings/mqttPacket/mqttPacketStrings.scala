package typings.mqttPacket

import typings.mqttPacket.mod.PacketCmd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mqttPacketStrings {
  
  @js.native
  sealed trait MQIsdp extends StObject
  @scala.inline
  def MQIsdp: MQIsdp = "MQIsdp".asInstanceOf[MQIsdp]
  
  @js.native
  sealed trait MQTT extends StObject
  @scala.inline
  def MQTT: MQTT = "MQTT".asInstanceOf[MQTT]
  
  @js.native
  sealed trait connack extends PacketCmd
  @scala.inline
  def connack: connack = "connack".asInstanceOf[connack]
  
  @js.native
  sealed trait connect extends PacketCmd
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait disconnect extends PacketCmd
  @scala.inline
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait packet extends StObject
  @scala.inline
  def packet: packet = "packet".asInstanceOf[packet]
  
  @js.native
  sealed trait pingreq extends PacketCmd
  @scala.inline
  def pingreq: pingreq = "pingreq".asInstanceOf[pingreq]
  
  @js.native
  sealed trait pingresp extends PacketCmd
  @scala.inline
  def pingresp: pingresp = "pingresp".asInstanceOf[pingresp]
  
  @js.native
  sealed trait puback extends PacketCmd
  @scala.inline
  def puback: puback = "puback".asInstanceOf[puback]
  
  @js.native
  sealed trait pubcomp extends PacketCmd
  @scala.inline
  def pubcomp: pubcomp = "pubcomp".asInstanceOf[pubcomp]
  
  @js.native
  sealed trait publish extends PacketCmd
  @scala.inline
  def publish: publish = "publish".asInstanceOf[publish]
  
  @js.native
  sealed trait pubrec extends PacketCmd
  @scala.inline
  def pubrec: pubrec = "pubrec".asInstanceOf[pubrec]
  
  @js.native
  sealed trait pubrel extends PacketCmd
  @scala.inline
  def pubrel: pubrel = "pubrel".asInstanceOf[pubrel]
  
  @js.native
  sealed trait suback extends PacketCmd
  @scala.inline
  def suback: suback = "suback".asInstanceOf[suback]
  
  @js.native
  sealed trait subscribe extends PacketCmd
  @scala.inline
  def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  
  @js.native
  sealed trait unsuback extends PacketCmd
  @scala.inline
  def unsuback: unsuback = "unsuback".asInstanceOf[unsuback]
  
  @js.native
  sealed trait unsubscribe extends PacketCmd
  @scala.inline
  def unsubscribe: unsubscribe = "unsubscribe".asInstanceOf[unsubscribe]
}
