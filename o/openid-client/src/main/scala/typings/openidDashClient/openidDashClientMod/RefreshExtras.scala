package typings.openidDashClient.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshExtras extends js.Object {
  /**
    * extra client assertion payload parameters to be sent as part of a client JWT assertion.
    * This is only used when the client's token_endpoint_auth_method is either client_secret_jwt or private_key_jwt.
    */
  var clientAssertionPayload: js.UndefOr[js.Object] = js.undefined
  /**
    * extra request body properties to be sent to the AS during refresh token exchange.
    */
  var exchangeBody: js.UndefOr[js.Object] = js.undefined
}

object RefreshExtras {
  @scala.inline
  def apply(clientAssertionPayload: js.Object = null, exchangeBody: js.Object = null): RefreshExtras = {
    val __obj = js.Dynamic.literal()
    if (clientAssertionPayload != null) __obj.updateDynamic("clientAssertionPayload")(clientAssertionPayload)
    if (exchangeBody != null) __obj.updateDynamic("exchangeBody")(exchangeBody)
    __obj.asInstanceOf[RefreshExtras]
  }
}

