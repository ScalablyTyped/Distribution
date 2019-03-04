package typings
package netlifyDashIdentityDashWidgetLib.netlifyDashIdentityDashWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var api: netlifyDashIdentityDashWidgetLib.Anon_ApiURL
  var app_metadata: netlifyDashIdentityDashWidgetLib.Anon_Provider
  var aud: java.lang.String
  var audience: js.UndefOr[js.Any] = js.undefined
  var confirmed_at: java.lang.String
  var created_at: java.lang.String
  var email: java.lang.String
  var id: java.lang.String
  var role: java.lang.String
  var token: js.UndefOr[Token] = js.undefined
  var updated_at: java.lang.String
  var url: java.lang.String
  var user_metadata: netlifyDashIdentityDashWidgetLib.Anon_Avatarurl
}

object User {
  @scala.inline
  def apply(
    api: netlifyDashIdentityDashWidgetLib.Anon_ApiURL,
    app_metadata: netlifyDashIdentityDashWidgetLib.Anon_Provider,
    aud: java.lang.String,
    confirmed_at: java.lang.String,
    created_at: java.lang.String,
    email: java.lang.String,
    id: java.lang.String,
    role: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String,
    user_metadata: netlifyDashIdentityDashWidgetLib.Anon_Avatarurl,
    audience: js.Any = null,
    token: Token = null
  ): User = {
    val __obj = js.Dynamic.literal(api = api, app_metadata = app_metadata, aud = aud, confirmed_at = confirmed_at, created_at = created_at, email = email, id = id, role = role, updated_at = updated_at, url = url, user_metadata = user_metadata)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[User]
  }
}

