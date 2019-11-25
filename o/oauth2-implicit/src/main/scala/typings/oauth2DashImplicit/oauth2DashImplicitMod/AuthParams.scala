package typings.oauth2DashImplicit.oauth2DashImplicitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthParams extends js.Object {
  var auth_uri: String
  var client_id: String
  var redirect_uri: String
  var scope: js.UndefOr[js.Array[String]] = js.undefined
  var state: AuthState
}

object AuthParams {
  @scala.inline
  def apply(
    auth_uri: String,
    client_id: String,
    redirect_uri: String,
    state: AuthState,
    scope: js.Array[String] = null
  ): AuthParams = {
    val __obj = js.Dynamic.literal(auth_uri = auth_uri.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthParams]
  }
}

