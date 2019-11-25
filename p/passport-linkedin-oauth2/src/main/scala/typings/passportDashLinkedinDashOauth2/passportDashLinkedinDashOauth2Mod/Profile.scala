package typings.passportDashLinkedinDashOauth2.passportDashLinkedinDashOauth2Mod

import typings.passportDashLinkedinDashOauth2.Anon_FamilyName
import typings.passportDashLinkedinDashOauth2.Anon_Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends typings.passport.passportMod.Profile {
  var _json: js.Any
  var _raw: String
  @JSName("emails")
  var emails_Profile: js.Array[Anon_Value]
  @JSName("name")
  var name_Profile: Anon_FamilyName
  @JSName("photos")
  var photos_Profile: js.Array[Anon_Value]
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Any,
    _raw: String,
    displayName: String,
    emails: js.Array[Anon_Value],
    id: String,
    name: Anon_FamilyName,
    photos: js.Array[Anon_Value],
    provider: String,
    username: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

