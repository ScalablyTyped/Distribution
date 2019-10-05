package typings.pahoDashMqtt.pahoDashMqttMod.Global.Paho.MQTT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorWithInvocationContext
  extends MQTTError
     with WithInvocationContext

object ErrorWithInvocationContext {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String, invocationContext: js.Any): ErrorWithInvocationContext = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errorMessage = errorMessage, invocationContext = invocationContext)
  
    __obj.asInstanceOf[ErrorWithInvocationContext]
  }
}

