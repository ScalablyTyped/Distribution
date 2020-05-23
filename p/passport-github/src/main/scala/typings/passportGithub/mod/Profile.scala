package typings.passportGithub.mod

import typings.passport.anon.FamilyName
import typings.passport.anon.Type
import typings.passport.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends typings.passport.mod.Profile {
  var _json: js.Object
  var _raw: String
  var profileUrl: String
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Object,
    _raw: String,
    displayName: String,
    id: String,
    profileUrl: String,
    provider: String,
    emails: js.Array[Type] = null,
    name: FamilyName = null,
    photos: js.Array[Value] = null,
    username: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

