package typings.oauth2Server.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<oauth2-server.oauth2-server.AuthorizationCode, 'authorizationCode' | 'expiresAt' | 'redirectUri' | 'scope'> */
@js.native
trait PickAuthorizationCodeauth extends js.Object {
  var authorizationCode: String = js.native
  var expiresAt: Date = js.native
  var redirectUri: String = js.native
  var scope: js.UndefOr[String | js.Array[String]] = js.native
}

object PickAuthorizationCodeauth {
  @scala.inline
  def apply(authorizationCode: String, expiresAt: Date, redirectUri: String): PickAuthorizationCodeauth = {
    val __obj = js.Dynamic.literal(authorizationCode = authorizationCode.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAuthorizationCodeauth]
  }
  @scala.inline
  implicit class PickAuthorizationCodeauthOps[Self <: PickAuthorizationCodeauth] (val x: Self) extends AnyVal {
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
    def setAuthorizationCode(value: String): Self = this.set("authorizationCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiresAt(value: Date): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

