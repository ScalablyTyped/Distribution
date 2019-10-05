package typings.pahoDashMqtt.pahoDashMqttMod.Global.Paho.MQTT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSubscribeSuccessParams extends WithInvocationContext {
  var grantedQos: Qos
}

object OnSubscribeSuccessParams {
  @scala.inline
  def apply(grantedQos: Qos, invocationContext: js.Any): OnSubscribeSuccessParams = {
    val __obj = js.Dynamic.literal(grantedQos = grantedQos, invocationContext = invocationContext)
  
    __obj.asInstanceOf[OnSubscribeSuccessParams]
  }
}

