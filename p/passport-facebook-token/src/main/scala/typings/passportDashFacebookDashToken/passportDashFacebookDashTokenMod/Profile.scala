package typings.passportDashFacebookDashToken.passportDashFacebookDashTokenMod

import typings.passportDashFacebookDashToken.Anon_FamilyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends typings.passport.passportMod.Profile {
  var _json: js.Any
  var _raw: String
  @JSName("emails")
  var emails_Profile: js.Array[ValueObject]
  var gender: String
  @JSName("name")
  var name_Profile: Anon_FamilyName
  @JSName("photos")
  var photos_Profile: js.Array[ValueObject]
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Any,
    _raw: String,
    displayName: String,
    emails: js.Array[ValueObject],
    gender: String,
    id: String,
    name: Anon_FamilyName,
    photos: js.Array[ValueObject],
    provider: String,
    username: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json, _raw = _raw, displayName = displayName, emails = emails, gender = gender, id = id, name = name, photos = photos, provider = provider)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Profile]
  }
}

