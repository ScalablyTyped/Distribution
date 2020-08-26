package typings.openidClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceAuthorizationExtras extends js.Object {
  /**
    * extra client assertion payload parameters to be sent as part of a client JWT assertion.
    * This is only used when the client's token_endpoint_auth_method is either client_secret_jwt or private_key_jwt.
    */
  var clientAssertionPayload: js.UndefOr[js.Object] = js.native
  /**
    * extra request body properties to be sent to the AS during the Device Access Token Request
    */
  var exchangeBody: js.UndefOr[js.Object] = js.native
}

object DeviceAuthorizationExtras {
  @scala.inline
  def apply(): DeviceAuthorizationExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceAuthorizationExtras]
  }
  @scala.inline
  implicit class DeviceAuthorizationExtrasOps[Self <: DeviceAuthorizationExtras] (val x: Self) extends AnyVal {
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
    def setClientAssertionPayload(value: js.Object): Self = this.set("clientAssertionPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientAssertionPayload: Self = this.set("clientAssertionPayload", js.undefined)
    @scala.inline
    def setExchangeBody(value: js.Object): Self = this.set("exchangeBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExchangeBody: Self = this.set("exchangeBody", js.undefined)
  }
  
}

