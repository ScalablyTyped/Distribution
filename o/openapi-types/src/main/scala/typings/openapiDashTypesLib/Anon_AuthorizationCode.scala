package typings
package openapiDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthorizationCode extends js.Object {
  var authorizationCode: js.UndefOr[Anon_AuthorizationUrlRefreshUrl] = js.undefined
  var clientCredentials: js.UndefOr[Anon_RefreshUrl] = js.undefined
  var `implicit`: js.UndefOr[Anon_AuthorizationUrl] = js.undefined
  var password: js.UndefOr[Anon_RefreshUrl] = js.undefined
}

object Anon_AuthorizationCode {
  @scala.inline
  def apply(
    authorizationCode: Anon_AuthorizationUrlRefreshUrl = null,
    clientCredentials: Anon_RefreshUrl = null,
    `implicit`: Anon_AuthorizationUrl = null,
    password: Anon_RefreshUrl = null
  ): Anon_AuthorizationCode = {
    val __obj = js.Dynamic.literal()
    if (authorizationCode != null) __obj.updateDynamic("authorizationCode")(authorizationCode)
    if (clientCredentials != null) __obj.updateDynamic("clientCredentials")(clientCredentials)
    if (`implicit` != null) __obj.updateDynamic("implicit")(`implicit`)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[Anon_AuthorizationCode]
  }
}

