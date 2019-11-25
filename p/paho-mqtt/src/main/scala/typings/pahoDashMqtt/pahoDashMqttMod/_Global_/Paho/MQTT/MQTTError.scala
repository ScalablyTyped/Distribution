package typings.pahoDashMqtt.pahoDashMqttMod._Global_.Paho.MQTT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MQTTError extends js.Object {
  /** A number indicating the nature of the error. */
  var errorCode: Double
  /** Text describing the error */
  var errorMessage: String
}

object MQTTError {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String): MQTTError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MQTTError]
  }
}

