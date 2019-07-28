package typings.netlifyDashIdentityDashWidget.netlifyDashIdentityDashWidgetMod

import typings.netlifyDashIdentityDashWidget.Anon_ApiURL
import typings.netlifyDashIdentityDashWidget.Anon_Avatarurl
import typings.netlifyDashIdentityDashWidget.Anon_Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var api: Anon_ApiURL
  var app_metadata: Anon_Provider
  var aud: String
  var audience: js.UndefOr[js.Any] = js.undefined
  var confirmed_at: String
  var created_at: String
  var email: String
  var id: String
  var role: String
  var token: js.UndefOr[Token] = js.undefined
  var updated_at: String
  var url: String
  var user_metadata: Anon_Avatarurl
}

object User {
  @scala.inline
  def apply(
    api: Anon_ApiURL,
    app_metadata: Anon_Provider,
    aud: String,
    confirmed_at: String,
    created_at: String,
    email: String,
    id: String,
    role: String,
    updated_at: String,
    url: String,
    user_metadata: Anon_Avatarurl,
    audience: js.Any = null,
    token: Token = null
  ): User = {
    val __obj = js.Dynamic.literal(api = api, app_metadata = app_metadata, aud = aud, confirmed_at = confirmed_at, created_at = created_at, email = email, id = id, role = role, updated_at = updated_at, url = url, user_metadata = user_metadata)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[User]
  }
}

