package typings.pahoMqtt.mod.global.Paho.MQTT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnSubscribeSuccessParams extends WithInvocationContext {
  
  var grantedQos: Qos = js.native
}
object OnSubscribeSuccessParams {
  
  @scala.inline
  def apply(grantedQos: Qos, invocationContext: js.Any): OnSubscribeSuccessParams = {
    val __obj = js.Dynamic.literal(grantedQos = grantedQos.asInstanceOf[js.Any], invocationContext = invocationContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSubscribeSuccessParams]
  }
  
  @scala.inline
  implicit class OnSubscribeSuccessParamsOps[Self <: OnSubscribeSuccessParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGrantedQos(value: Qos): Self = this.set("grantedQos", value.asInstanceOf[js.Any])
  }
}
