package typings.passportDashBeam.passportDashBeamMod.Strategy

import typings.passport.Anon_FamilyName
import typings.passport.Anon_Type
import typings.passport.Anon_Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends typings.passport.passportMod.Profile {
  var _json: js.Any
  var _raw: js.Any
  var email: String
  var profileUrl: String
  @JSName("username")
  var username_Profile: String
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Any,
    _raw: js.Any,
    displayName: String,
    email: String,
    id: js.Any,
    profileUrl: String,
    provider: String,
    username: String,
    emails: js.Array[Anon_Type] = null,
    name: Anon_FamilyName = null,
    photos: js.Array[Anon_Value] = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json, _raw = _raw, displayName = displayName, email = email, id = id, profileUrl = profileUrl, provider = provider, username = username)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    __obj.asInstanceOf[Profile]
  }
}

