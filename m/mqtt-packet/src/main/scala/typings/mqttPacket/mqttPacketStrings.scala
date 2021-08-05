package typings.mqttPacket

import typings.mqttPacket.mod.PacketCmd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mqttPacketStrings {
  
  @js.native
  sealed trait MQIsdp extends StObject
  inline def MQIsdp: MQIsdp = "MQIsdp".asInstanceOf[MQIsdp]
  
  @js.native
  sealed trait MQTT extends StObject
  inline def MQTT: MQTT = "MQTT".asInstanceOf[MQTT]
  
  @js.native
  sealed trait connack
    extends StObject
       with PacketCmd
  inline def connack: connack = "connack".asInstanceOf[connack]
  
  @js.native
  sealed trait connect
    extends StObject
       with PacketCmd
  inline def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait disconnect
    extends StObject
       with PacketCmd
  inline def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait packet extends StObject
  inline def packet: packet = "packet".asInstanceOf[packet]
  
  @js.native
  sealed trait pingreq
    extends StObject
       with PacketCmd
  inline def pingreq: pingreq = "pingreq".asInstanceOf[pingreq]
  
  @js.native
  sealed trait pingresp
    extends StObject
       with PacketCmd
  inline def pingresp: pingresp = "pingresp".asInstanceOf[pingresp]
  
  @js.native
  sealed trait puback
    extends StObject
       with PacketCmd
  inline def puback: puback = "puback".asInstanceOf[puback]
  
  @js.native
  sealed trait pubcomp
    extends StObject
       with PacketCmd
  inline def pubcomp: pubcomp = "pubcomp".asInstanceOf[pubcomp]
  
  @js.native
  sealed trait publish
    extends StObject
       with PacketCmd
  inline def publish: publish = "publish".asInstanceOf[publish]
  
  @js.native
  sealed trait pubrec
    extends StObject
       with PacketCmd
  inline def pubrec: pubrec = "pubrec".asInstanceOf[pubrec]
  
  @js.native
  sealed trait pubrel
    extends StObject
       with PacketCmd
  inline def pubrel: pubrel = "pubrel".asInstanceOf[pubrel]
  
  @js.native
  sealed trait suback
    extends StObject
       with PacketCmd
  inline def suback: suback = "suback".asInstanceOf[suback]
  
  @js.native
  sealed trait subscribe
    extends StObject
       with PacketCmd
  inline def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  
  @js.native
  sealed trait unsuback
    extends StObject
       with PacketCmd
  inline def unsuback: unsuback = "unsuback".asInstanceOf[unsuback]
  
  @js.native
  sealed trait unsubscribe
    extends StObject
       with PacketCmd
  inline def unsubscribe: unsubscribe = "unsubscribe".asInstanceOf[unsubscribe]
}
