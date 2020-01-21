package typings.passportNaver.mod

import typings.passport.AnonFamilyName
import typings.passport.AnonType
import typings.passport.AnonValue
import typings.passportNaver.AnonAge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends typings.passport.mod.Profile {
  var _json: AnonAge
}

object Profile {
  @scala.inline
  def apply(
    _json: AnonAge,
    displayName: String,
    id: String,
    provider: String,
    emails: js.Array[AnonType] = null,
    name: AnonFamilyName = null,
    photos: js.Array[AnonValue] = null,
    username: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

