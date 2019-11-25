package typings.openidDashClient.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectExtras extends js.Object {
  /**
    * extra client assertion payload parameters to be sent as part of a client JWT assertion.
    * This is only used when the client's token_endpoint_auth_method is either client_secret_jwt or private_key_jwt.
    */
  var clientAssertionPayload: js.UndefOr[js.Object] = js.undefined
  /**
    * extra request body properties to be sent to the introspection endpoint.
    */
  var introspectBody: js.UndefOr[js.Object] = js.undefined
}

object IntrospectExtras {
  @scala.inline
  def apply(clientAssertionPayload: js.Object = null, introspectBody: js.Object = null): IntrospectExtras = {
    val __obj = js.Dynamic.literal()
    if (clientAssertionPayload != null) __obj.updateDynamic("clientAssertionPayload")(clientAssertionPayload.asInstanceOf[js.Any])
    if (introspectBody != null) __obj.updateDynamic("introspectBody")(introspectBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectExtras]
  }
}

