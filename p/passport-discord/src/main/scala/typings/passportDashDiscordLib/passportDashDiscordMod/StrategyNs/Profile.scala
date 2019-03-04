package typings
package passportDashDiscordLib.passportDashDiscordMod.StrategyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends passportLib.passportMod.passportNs.Profile {
  var _json: js.Any
  var _raw: js.Any
  var avatar: java.lang.String
  var discriminator: java.lang.String
  var email: java.lang.String
  var profileUrl: java.lang.String
  @JSName("username")
  var username_Profile: java.lang.String
  var verified: scala.Boolean
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Any,
    _raw: js.Any,
    avatar: java.lang.String,
    discriminator: java.lang.String,
    displayName: java.lang.String,
    email: java.lang.String,
    id: js.Any,
    profileUrl: java.lang.String,
    provider: java.lang.String,
    username: java.lang.String,
    verified: scala.Boolean,
    emails: js.Array[passportLib.Anon_Type] = null,
    name: passportLib.Anon_FamilyName = null,
    photos: js.Array[passportLib.Anon_Value] = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json, _raw = _raw, avatar = avatar, discriminator = discriminator, displayName = displayName, email = email, id = id, profileUrl = profileUrl, provider = provider, username = username, verified = verified)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    __obj.asInstanceOf[Profile]
  }
}

