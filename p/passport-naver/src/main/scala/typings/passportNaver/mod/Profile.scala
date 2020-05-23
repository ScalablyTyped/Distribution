package typings.passportNaver.mod

import typings.passport.anon.FamilyName
import typings.passport.anon.Type
import typings.passport.anon.Value
import typings.passportNaver.anon.Age
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends typings.passport.mod.Profile {
  var _json: Age
}

object Profile {
  @scala.inline
  def apply(
    _json: Age,
    displayName: String,
    id: String,
    provider: String,
    emails: js.Array[Type] = null,
    name: FamilyName = null,
    photos: js.Array[Value] = null,
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

