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
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], app_metadata = app_metadata.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], confirmed_at = confirmed_at.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user_metadata = user_metadata.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

