package typings
package passportDashLinkedinDashOauth2Lib.passportDashLinkedinDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends passportLib.passportMod.Profile {
  var _json: js.Any
  var _raw: java.lang.String
  @JSName("emails")
  var emails_Profile: js.Array[passportDashLinkedinDashOauth2Lib.Anon_Value]
  @JSName("name")
  var name_Profile: passportDashLinkedinDashOauth2Lib.Anon_FamilyName
  @JSName("photos")
  var photos_Profile: js.Array[passportDashLinkedinDashOauth2Lib.Anon_Value]
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Any,
    _raw: java.lang.String,
    displayName: java.lang.String,
    emails: js.Array[passportDashLinkedinDashOauth2Lib.Anon_Value],
    id: java.lang.String,
    name: passportDashLinkedinDashOauth2Lib.Anon_FamilyName,
    photos: js.Array[passportDashLinkedinDashOauth2Lib.Anon_Value],
    provider: java.lang.String,
    username: java.lang.String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json, _raw = _raw, displayName = displayName, emails = emails, id = id, name = name, photos = photos, provider = provider)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Profile]
  }
}

