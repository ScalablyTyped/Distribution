package typings.passport.mod

import typings.passport.AnonFamilyName
import typings.passport.AnonType
import typings.passport.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var displayName: String
  var emails: js.UndefOr[js.Array[AnonType]] = js.undefined
  var id: String
  var name: js.UndefOr[AnonFamilyName] = js.undefined
  var photos: js.UndefOr[js.Array[AnonValue]] = js.undefined
  var provider: String
  var username: js.UndefOr[String] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    displayName: String,
    id: String,
    provider: String,
    emails: js.Array[AnonType] = null,
    name: AnonFamilyName = null,
    photos: js.Array[AnonValue] = null,
    username: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

