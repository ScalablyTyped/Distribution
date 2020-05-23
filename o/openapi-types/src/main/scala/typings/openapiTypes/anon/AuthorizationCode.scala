package typings.openapiTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationCode extends js.Object {
  var authorizationCode: js.UndefOr[Scopes] = js.undefined
  var clientCredentials: js.UndefOr[RefreshUrl] = js.undefined
  var `implicit`: js.UndefOr[AuthorizationUrl] = js.undefined
  var password: js.UndefOr[RefreshUrl] = js.undefined
}

object AuthorizationCode {
  @scala.inline
  def apply(
    authorizationCode: Scopes = null,
    clientCredentials: RefreshUrl = null,
    `implicit`: AuthorizationUrl = null,
    password: RefreshUrl = null
  ): AuthorizationCode = {
    val __obj = js.Dynamic.literal()
    if (authorizationCode != null) __obj.updateDynamic("authorizationCode")(authorizationCode.asInstanceOf[js.Any])
    if (clientCredentials != null) __obj.updateDynamic("clientCredentials")(clientCredentials.asInstanceOf[js.Any])
    if (`implicit` != null) __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationCode]
  }
}

