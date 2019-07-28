package typings.passportDashNaver.passportDashNaverMod

import typings.passport.Anon_FamilyName
import typings.passport.Anon_Type
import typings.passport.Anon_Value
import typings.passportDashNaver.Anon_Age
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends typings.passport.passportMod.Profile {
  var _json: Anon_Age
}

object Profile {
  @scala.inline
  def apply(
    _json: Anon_Age,
    displayName: String,
    id: String,
    provider: String,
    emails: js.Array[Anon_Type] = null,
    name: Anon_FamilyName = null,
    photos: js.Array[Anon_Value] = null,
    username: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json, displayName = displayName, id = id, provider = provider)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Profile]
  }
}

