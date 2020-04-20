package typings.pahoMqtt.mod._Global_.Paho.MQTT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSubscribeSuccessParams extends WithInvocationContext {
  var grantedQos: Qos
}

object OnSubscribeSuccessParams {
  @scala.inline
  def apply(grantedQos: Qos, invocationContext: js.Any): OnSubscribeSuccessParams = {
    val __obj = js.Dynamic.literal(grantedQos = grantedQos.asInstanceOf[js.Any], invocationContext = invocationContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSubscribeSuccessParams]
  }
}

