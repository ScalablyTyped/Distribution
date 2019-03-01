package typings
package passportDashLinkedinDashOauth2Lib.passportDashLinkedinDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends passportLib.passportMod.passportNs.Profile {
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_json")(_json)
    __obj.updateDynamic("_raw")(_raw)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("emails")(emails)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("photos")(photos)
    __obj.updateDynamic("provider")(provider)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Profile]
  }
}

