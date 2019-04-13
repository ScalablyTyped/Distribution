package typings
package passportDashFacebookDashTokenLib.passportDashFacebookDashTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends passportLib.passportMod.Profile {
  var _json: js.Any
  var _raw: java.lang.String
  @JSName("emails")
  var emails_Profile: js.Array[ValueObject]
  var gender: java.lang.String
  @JSName("name")
  var name_Profile: passportDashFacebookDashTokenLib.Anon_FamilyName
  @JSName("photos")
  var photos_Profile: js.Array[ValueObject]
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Any,
    _raw: java.lang.String,
    displayName: java.lang.String,
    emails: js.Array[ValueObject],
    gender: java.lang.String,
    id: java.lang.String,
    name: passportDashFacebookDashTokenLib.Anon_FamilyName,
    photos: js.Array[ValueObject],
    provider: java.lang.String,
    username: java.lang.String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json, _raw = _raw, displayName = displayName, emails = emails, gender = gender, id = id, name = name, photos = photos, provider = provider)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Profile]
  }
}

