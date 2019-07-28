package typings.passportDashGithub.passportDashGithubMod

import typings.passport.Anon_FamilyName
import typings.passport.Anon_Type
import typings.passport.Anon_Value
import typings.passportDashGithub.passportDashGithubStrings.github
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends typings.passport.passportMod.Profile {
  var _json: js.Object
  var _raw: String
  var profileUrl: String
  @JSName("provider")
  var provider_Profile: github
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Object,
    _raw: String,
    displayName: String,
    id: String,
    profileUrl: String,
    provider: github,
    emails: js.Array[Anon_Type] = null,
    name: Anon_FamilyName = null,
    photos: js.Array[Anon_Value] = null,
    username: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json, _raw = _raw, displayName = displayName, id = id, profileUrl = profileUrl, provider = provider)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Profile]
  }
}

