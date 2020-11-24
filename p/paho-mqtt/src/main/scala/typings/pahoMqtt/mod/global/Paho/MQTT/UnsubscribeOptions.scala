package typings.pahoMqtt.mod.global.Paho.MQTT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnsubscribeOptions extends js.Object {
  
  /** passed to the onSuccess callback or onFailure callback.  */
  var invocationContext: js.UndefOr[js.Any] = js.native
  
  /** called when the unsubscribe request has failed or timed out. */
  var onFailure: js.UndefOr[OnFailureCallback] = js.native
  
  /** called when the unsubscribe acknowledgement has been received from the server. */
  var onSuccess: js.UndefOr[OnSuccessCallback] = js.native
  
  /**
    * timeout which, if present, determines the number of seconds after which the onFailure calback is called.
    * The presence of a timeout does not prevent the onSuccess callback from being called when the unsubscribe
    * completes.
    */
  var timeout: js.UndefOr[Double] = js.native
}
object UnsubscribeOptions {
  
  @scala.inline
  def apply(): UnsubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsubscribeOptions]
  }
  
  @scala.inline
  implicit class UnsubscribeOptionsOps[Self <: UnsubscribeOptions] (val x: Self) extends AnyVal {
    
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
    def setInvocationContext(value: js.Any): Self = this.set("invocationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvocationContext: Self = this.set("invocationContext", js.undefined)
    
    @scala.inline
    def setOnFailure(value: /* e */ ErrorWithInvocationContext => Unit): Self = this.set("onFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: /* o */ WithInvocationContext => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
