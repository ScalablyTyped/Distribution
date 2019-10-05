package typings.pahoDashMqtt.pahoDashMqttMod.Global.Paho.MQTT

import typings.pahoDashMqtt.pahoDashMqttStrings.Debug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceElement extends js.Object {
  var message: String
  var severity: Debug
}

object TraceElement {
  @scala.inline
  def apply(message: String, severity: Debug): TraceElement = {
    val __obj = js.Dynamic.literal(message = message, severity = severity)
  
    __obj.asInstanceOf[TraceElement]
  }
}

