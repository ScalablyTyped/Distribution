package typings.openapiTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorizationCode extends js.Object {
  var authorizationCode: js.UndefOr[AnonScopes] = js.undefined
  var clientCredentials: js.UndefOr[AnonRefreshUrl] = js.undefined
  var `implicit`: js.UndefOr[AnonAuthorizationUrl] = js.undefined
  var password: js.UndefOr[AnonRefreshUrl] = js.undefined
}

object AnonAuthorizationCode {
  @scala.inline
  def apply(
    authorizationCode: AnonScopes = null,
    clientCredentials: AnonRefreshUrl = null,
    `implicit`: AnonAuthorizationUrl = null,
    password: AnonRefreshUrl = null
  ): AnonAuthorizationCode = {
    val __obj = js.Dynamic.literal()
    if (authorizationCode != null) __obj.updateDynamic("authorizationCode")(authorizationCode.asInstanceOf[js.Any])
    if (clientCredentials != null) __obj.updateDynamic("clientCredentials")(clientCredentials.asInstanceOf[js.Any])
    if (`implicit` != null) __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorizationCode]
  }
}

