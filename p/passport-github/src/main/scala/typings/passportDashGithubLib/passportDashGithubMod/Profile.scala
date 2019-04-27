package typings
package passportDashGithubLib.passportDashGithubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends passportLib.passportMod.Profile {
  var _json: js.Object
  var _raw: java.lang.String
  var profileUrl: java.lang.String
  @JSName("provider")
  var provider_Profile: passportDashGithubLib.passportDashGithubLibStrings.github
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Object,
    _raw: java.lang.String,
    displayName: java.lang.String,
    id: java.lang.String,
    profileUrl: java.lang.String,
    provider: passportDashGithubLib.passportDashGithubLibStrings.github,
    emails: js.Array[passportLib.Anon_Type] = null,
    name: passportLib.Anon_FamilyName = null,
    photos: js.Array[passportLib.Anon_Value] = null,
    username: java.lang.String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json, _raw = _raw, displayName = displayName, id = id, profileUrl = profileUrl, provider = provider)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Profile]
  }
}

