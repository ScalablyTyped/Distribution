package typings.pahoMqtt.mod.global.Paho.MQTT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorWithInvocationContext
  extends MQTTError
     with WithInvocationContext

object ErrorWithInvocationContext {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String, invocationContext: js.Any): ErrorWithInvocationContext = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], invocationContext = invocationContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorWithInvocationContext]
  }
}

