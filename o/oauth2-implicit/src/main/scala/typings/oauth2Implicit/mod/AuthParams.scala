package typings.oauth2Implicit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthParams extends js.Object {
  var auth_uri: String = js.native
  var client_id: String = js.native
  var redirect_uri: String = js.native
  var scope: js.UndefOr[js.Array[String]] = js.native
  var state: AuthState = js.native
}

object AuthParams {
  @scala.inline
  def apply(auth_uri: String, client_id: String, redirect_uri: String, state: AuthState): AuthParams = {
    val __obj = js.Dynamic.literal(auth_uri = auth_uri.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], redirect_uri = redirect_uri.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthParams]
  }
  @scala.inline
  implicit class AuthParamsOps[Self <: AuthParams] (val x: Self) extends AnyVal {
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
    def setAuth_uri(value: String): Self = this.set("auth_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirect_uri(value: String): Self = this.set("redirect_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: AuthState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    @scala.inline
    def setScope(value: js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

