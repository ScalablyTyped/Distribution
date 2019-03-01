package typings
package passportDashFacebookLib.passportDashFacebookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends passportLib.passportMod.passportNs.Profile {
  var _json: js.Any
  var _raw: java.lang.String
  var ageRange: js.UndefOr[passportDashFacebookLib.Anon_Max] = js.undefined
  var birthday: java.lang.String
  var gender: js.UndefOr[java.lang.String] = js.undefined
  var profileUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Any,
    _raw: java.lang.String,
    birthday: java.lang.String,
    displayName: java.lang.String,
    id: java.lang.String,
    provider: java.lang.String,
    ageRange: passportDashFacebookLib.Anon_Max = null,
    emails: js.Array[passportLib.Anon_Type] = null,
    gender: java.lang.String = null,
    name: passportLib.Anon_FamilyName = null,
    photos: js.Array[passportLib.Anon_Value] = null,
    profileUrl: java.lang.String = null,
    username: java.lang.String = null
  ): Profile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_json")(_json)
    __obj.updateDynamic("_raw")(_raw)
    __obj.updateDynamic("birthday")(birthday)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("provider")(provider)
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

