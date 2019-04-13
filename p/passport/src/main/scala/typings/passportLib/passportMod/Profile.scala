package typings
package passportLib.passportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var displayName: java.lang.String
  var emails: js.UndefOr[js.Array[passportLib.Anon_Type]] = js.undefined
  var id: java.lang.String
  var name: js.UndefOr[passportLib.Anon_FamilyName] = js.undefined
  var photos: js.UndefOr[js.Array[passportLib.Anon_Value]] = js.undefined
  var provider: java.lang.String
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    id: java.lang.String,
    provider: java.lang.String,
    emails: js.Array[passportLib.Anon_Type] = null,
    name: passportLib.Anon_FamilyName = null,
    photos: js.Array[passportLib.Anon_Value] = null,
    username: java.lang.String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(displayName = displayName, id = id, provider = provider)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Profile]
  }
}

