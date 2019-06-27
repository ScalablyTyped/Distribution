package typings
package openidDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Introspectionendpoint extends js.Object {
  var introspection_endpoint: js.UndefOr[java.lang.String] = js.undefined
  var revocation_endpoint: js.UndefOr[java.lang.String] = js.undefined
  var token_endpoint: js.UndefOr[java.lang.String] = js.undefined
  var userinfo_endpoint: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Introspectionendpoint {
  @scala.inline
  def apply(
    introspection_endpoint: java.lang.String = null,
    revocation_endpoint: java.lang.String = null,
    token_endpoint: java.lang.String = null,
    userinfo_endpoint: java.lang.String = null
  ): Anon_Introspectionendpoint = {
    val __obj = js.Dynamic.literal()
    if (introspection_endpoint != null) __obj.updateDynamic("introspection_endpoint")(introspection_endpoint)
    if (revocation_endpoint != null) __obj.updateDynamic("revocation_endpoint")(revocation_endpoint)
    if (token_endpoint != null) __obj.updateDynamic("token_endpoint")(token_endpoint)
    if (userinfo_endpoint != null) __obj.updateDynamic("userinfo_endpoint")(userinfo_endpoint)
    __obj.asInstanceOf[Anon_Introspectionendpoint]
  }
}

