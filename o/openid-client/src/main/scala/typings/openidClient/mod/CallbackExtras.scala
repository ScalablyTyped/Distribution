package typings.openidClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackExtras extends js.Object {
  /**
    * extra client assertion payload parameters to be sent as part of a client JWT assertion. This is only used
    * when the client's token_endpoint_auth_method is either client_secret_jwt or private_key_jwt.
    */
  var clientAssertionPayload: js.UndefOr[js.Object] = js.undefined
  /**
    * extra request body properties to be sent to the AS during code exchange.
    */
  var exchangeBody: js.UndefOr[js.Object] = js.undefined
}

object CallbackExtras {
  @scala.inline
  def apply(clientAssertionPayload: js.Object = null, exchangeBody: js.Object = null): CallbackExtras = {
    val __obj = js.Dynamic.literal()
    if (clientAssertionPayload != null) __obj.updateDynamic("clientAssertionPayload")(clientAssertionPayload.asInstanceOf[js.Any])
    if (exchangeBody != null) __obj.updateDynamic("exchangeBody")(exchangeBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackExtras]
  }
}

