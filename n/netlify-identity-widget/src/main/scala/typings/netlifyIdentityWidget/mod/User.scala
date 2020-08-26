package typings.netlifyIdentityWidget.mod

import typings.netlifyIdentityWidget.anon.ApiURL
import typings.netlifyIdentityWidget.anon.Avatarurl
import typings.netlifyIdentityWidget.anon.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  var api: ApiURL = js.native
  var app_metadata: Provider = js.native
  var aud: String = js.native
  var audience: js.UndefOr[js.Any] = js.native
  var confirmed_at: String = js.native
  var created_at: String = js.native
  var email: String = js.native
  var id: String = js.native
  var role: String = js.native
  var token: js.UndefOr[Token] = js.native
  var updated_at: String = js.native
  var url: String = js.native
  var user_metadata: Avatarurl = js.native
}

object User {
  @scala.inline
  def apply(
    api: ApiURL,
    app_metadata: Provider,
    aud: String,
    confirmed_at: String,
    created_at: String,
    email: String,
    id: String,
    role: String,
    updated_at: String,
    url: String,
    user_metadata: Avatarurl
  ): User = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], app_metadata = app_metadata.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], confirmed_at = confirmed_at.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_metadata = user_metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
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
    def setApi(value: ApiURL): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setApp_metadata(value: Provider): Self = this.set("app_metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setAud(value: String): Self = this.set("aud", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfirmed_at(value: String): Self = this.set("confirmed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_metadata(value: Avatarurl): Self = this.set("user_metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudience(value: js.Any): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    @scala.inline
    def setToken(value: Token): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
  
}

