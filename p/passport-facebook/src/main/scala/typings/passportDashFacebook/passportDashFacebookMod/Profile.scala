package typings.passportDashFacebook.passportDashFacebookMod

import typings.passport.Anon_FamilyName
import typings.passport.Anon_Type
import typings.passport.Anon_Value
import typings.passportDashFacebook.Anon_Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends typings.passport.passportMod.Profile {
  var _json: js.Any
  var _raw: String
  var ageRange: js.UndefOr[Anon_Max] = js.undefined
  var birthday: String
  var gender: js.UndefOr[String] = js.undefined
  var profileUrl: js.UndefOr[String] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Any,
    _raw: String,
    birthday: String,
    displayName: String,
    id: String,
    provider: String,
    ageRange: Anon_Max = null,
    emails: js.Array[Anon_Type] = null,
    gender: String = null,
    name: Anon_FamilyName = null,
    photos: js.Array[Anon_Value] = null,
    profileUrl: String = null,
    username: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json, _raw = _raw, birthday = birthday, displayName = displayName, id = id, provider = provider)
    if (ageRange != null) __obj.updateDynamic("ageRange")(ageRange)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    if (profileUrl != null) __obj.updateDynamic("profileUrl")(profileUrl)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Profile]
  }
}

