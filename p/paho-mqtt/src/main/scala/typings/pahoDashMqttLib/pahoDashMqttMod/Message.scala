package typings
package pahoDashMqttLib.pahoDashMqttMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * An application message, sent or received.
         */
@JSImport("paho-mqtt", "Message")
@js.native
class Message protected ()
  extends pahoDashMqttLib.pahoDashMqttMod.Global.PahoNs.MQTTNs.Message {
  /**
               * @param payload The message data to be sent.
               */
  def this(payload: java.lang.String) = this()
  /**
               * @param payload The message data to be sent.
               */
  def this(payload: pahoDashMqttLib.pahoDashMqttMod.Global.PahoNs.MQTTNs.TypedArray) = this()
  /**
               * @param payload The message data to be sent.
               */
  def this(payload: stdLib.ArrayBuffer) = this()
}

