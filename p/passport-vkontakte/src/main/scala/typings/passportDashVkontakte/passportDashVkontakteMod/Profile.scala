package typings.passportDashVkontakte.passportDashVkontakteMod

import typings.passport.Anon_FamilyName
import typings.passport.Anon_Type
import typings.passport.Anon_Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends typings.passport.passportMod.Profile {
  var _json: js.Any
  var _raw: String
  var gender: js.UndefOr[String] = js.undefined
  var profileUrl: js.UndefOr[String] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Any,
    _raw: String,
    displayName: String,
    id: String,
    provider: String,
    emails: js.Array[Anon_Type] = null,
    gender: String = null,
    name: Anon_FamilyName = null,
    photos: js.Array[Anon_Value] = null,
    profileUrl: String = null,
    username: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json, _raw = _raw, displayName = displayName, id = id, provider = provider)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    if (profileUrl != null) __obj.updateDynamic("profileUrl")(profileUrl)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Profile]
  }
}

