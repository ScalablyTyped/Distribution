package typings.pahoDashMqtt.pahoDashMqttMod

import typings.pahoDashMqtt.pahoDashMqttMod._Global_.Paho.MQTT.TypedArray
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An application message, sent or received.
  */
@JSImport("paho-mqtt", "Message")
@js.native
class Message protected ()
  extends typings.pahoDashMqtt.pahoDashMqttMod._Global_.Paho.MQTT.Message {
  /**
    * @param payload The message data to be sent.
    */
  def this(payload: String) = this()
  def this(payload: TypedArray) = this()
  def this(payload: ArrayBuffer) = this()
}

