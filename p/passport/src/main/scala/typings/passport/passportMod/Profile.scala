package typings.passport.passportMod

import typings.passport.Anon_FamilyName
import typings.passport.Anon_Type
import typings.passport.Anon_Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var displayName: String
  var emails: js.UndefOr[js.Array[Anon_Type]] = js.undefined
  var id: String
  var name: js.UndefOr[Anon_FamilyName] = js.undefined
  var photos: js.UndefOr[js.Array[Anon_Value]] = js.undefined
  var provider: String
  var username: js.UndefOr[String] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    displayName: String,
    id: String,
    provider: String,
    emails: js.Array[Anon_Type] = null,
    name: Anon_FamilyName = null,
    photos: js.Array[Anon_Value] = null,
    username: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(displayName = displayName, id = id, provider = provider)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Profile]
  }
}

