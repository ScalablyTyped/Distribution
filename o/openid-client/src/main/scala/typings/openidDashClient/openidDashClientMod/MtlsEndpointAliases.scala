package typings.openidDashClient.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MtlsEndpointAliases extends js.Object {
  var device_authorization_endpoint: js.UndefOr[String] = js.undefined
  var introspection_endpoint: js.UndefOr[String] = js.undefined
  var revocation_endpoint: js.UndefOr[String] = js.undefined
  var token_endpoint: js.UndefOr[String] = js.undefined
  var userinfo_endpoint: js.UndefOr[String] = js.undefined
}

object MtlsEndpointAliases {
  @scala.inline
  def apply(
    device_authorization_endpoint: String = null,
    introspection_endpoint: String = null,
    revocation_endpoint: String = null,
    token_endpoint: String = null,
    userinfo_endpoint: String = null
  ): MtlsEndpointAliases = {
    val __obj = js.Dynamic.literal()
    if (device_authorization_endpoint != null) __obj.updateDynamic("device_authorization_endpoint")(device_authorization_endpoint.asInstanceOf[js.Any])
    if (introspection_endpoint != null) __obj.updateDynamic("introspection_endpoint")(introspection_endpoint.asInstanceOf[js.Any])
    if (revocation_endpoint != null) __obj.updateDynamic("revocation_endpoint")(revocation_endpoint.asInstanceOf[js.Any])
    if (token_endpoint != null) __obj.updateDynamic("token_endpoint")(token_endpoint.asInstanceOf[js.Any])
    if (userinfo_endpoint != null) __obj.updateDynamic("userinfo_endpoint")(userinfo_endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[MtlsEndpointAliases]
  }
}

