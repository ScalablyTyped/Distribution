package typings.pahoMqtt.mod.global.Paho.MQTT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to control a subscription
  */
@js.native
trait SubscribeOptions extends js.Object {
  /** passed to the onSuccess callback or onFailure callback. */
  var invocationContext: js.UndefOr[js.Any] = js.native
  /** called when the subscribe request has failed or timed out. */
  var onFailure: js.UndefOr[OnFailureCallback] = js.native
  /** called when the subscribe acknowledgement has been received from the server. */
  var onSuccess: js.UndefOr[OnSubscribeSuccessCallback] = js.native
  /** the maximum qos of any publications sent as a result of making this subscription. */
  var qos: js.UndefOr[Qos] = js.native
  /**
    * timeout which, if present, determines the number of seconds after which the onFailure calback is called.
    * The presence of a timeout does not prevent the onSuccess callback from being called when the subscribe
    * completes.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object SubscribeOptions {
  @scala.inline
  def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  @scala.inline
  implicit class SubscribeOptionsOps[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
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
    def setOnSuccess(value: /* o */ OnSubscribeSuccessParams => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    @scala.inline
    def setQos(value: Qos): Self = this.set("qos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQos: Self = this.set("qos", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

