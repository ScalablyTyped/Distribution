package typings
package passportDashTwitterLib.passportDashTwitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends passportLib.passportMod.passportNs.Profile {
  var _accessLevel: java.lang.String
  var _json: js.Any
  var _raw: java.lang.String
  var gender: java.lang.String
  @JSName("username")
  var username_Profile: java.lang.String
}

object Profile {
  @scala.inline
  def apply(
    _accessLevel: java.lang.String,
    _json: js.Any,
    _raw: java.lang.String,
    displayName: java.lang.String,
    gender: java.lang.String,
    id: java.lang.String,
    provider: java.lang.String,
    username: java.lang.String,
    emails: js.Array[passportLib.Anon_Type] = null,
    name: passportLib.Anon_FamilyName = null,
    photos: js.Array[passportLib.Anon_Value] = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_accessLevel = _accessLevel, _json = _json, _raw = _raw, displayName = displayName, gender = gender, id = id, provider = provider, username = username)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    __obj.asInstanceOf[Profile]
  }
}

