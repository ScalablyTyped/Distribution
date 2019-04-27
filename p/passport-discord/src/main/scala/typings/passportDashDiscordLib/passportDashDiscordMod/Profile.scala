package typings
package passportDashDiscordLib.passportDashDiscordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends passportLib.passportMod.Profile {
  var avatar: java.lang.String
   // requires "email" scope
  var connections: js.UndefOr[js.Array[ConnectionInfo]] = js.undefined
  var discriminator: java.lang.String
  var email: js.UndefOr[java.lang.String] = js.undefined
  var fetchedAt: java.lang.String
  var flags: scala.Double
   // requires "connection" scope
  var guilds: js.UndefOr[js.Array[GuildInfo]] = js.undefined
  var locale: java.lang.String
  var mfa_enabled: scala.Boolean
  @JSName("provider")
  var provider_Profile: passportDashDiscordLib.passportDashDiscordLibStrings.discord
  @JSName("username")
  var username_Profile: java.lang.String
  var verified: scala.Boolean
}

object Profile {
  @scala.inline
  def apply(
    avatar: java.lang.String,
    discriminator: java.lang.String,
    displayName: java.lang.String,
    fetchedAt: java.lang.String,
    flags: scala.Double,
    id: java.lang.String,
    locale: java.lang.String,
    mfa_enabled: scala.Boolean,
    provider: passportDashDiscordLib.passportDashDiscordLibStrings.discord,
    username: java.lang.String,
    verified: scala.Boolean,
    connections: js.Array[ConnectionInfo] = null,
    email: java.lang.String = null,
    emails: js.Array[passportLib.Anon_Type] = null,
    guilds: js.Array[GuildInfo] = null,
    name: passportLib.Anon_FamilyName = null,
    photos: js.Array[passportLib.Anon_Value] = null
  ): Profile = {
    val __obj = js.Dynamic.literal(avatar = avatar, discriminator = discriminator, displayName = displayName, fetchedAt = fetchedAt, flags = flags, id = id, locale = locale, mfa_enabled = mfa_enabled, provider = provider, username = username, verified = verified)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    if (email != null) __obj.updateDynamic("email")(email)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (guilds != null) __obj.updateDynamic("guilds")(guilds)
    if (name != null) __obj.updateDynamic("name")(name)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    __obj.asInstanceOf[Profile]
  }
}

