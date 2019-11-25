package typings.passportDashDiscord.passportDashDiscordMod

import typings.passport.Anon_FamilyName
import typings.passport.Anon_Type
import typings.passport.Anon_Value
import typings.passportDashDiscord.passportDashDiscordStrings.discord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile
  extends typings.passport.passportMod.Profile {
  var avatar: String
   // requires "email" scope
  var connections: js.UndefOr[js.Array[ConnectionInfo]] = js.undefined
  var discriminator: String
  var email: js.UndefOr[String] = js.undefined
  var fetchedAt: String
  var flags: Double
   // requires "connection" scope
  var guilds: js.UndefOr[js.Array[GuildInfo]] = js.undefined
  var locale: String
  var mfa_enabled: Boolean
  @JSName("provider")
  var provider_Profile: discord
  @JSName("username")
  var username_Profile: String
  var verified: Boolean
}

object Profile {
  @scala.inline
  def apply(
    avatar: String,
    discriminator: String,
    displayName: String,
    fetchedAt: String,
    flags: Double,
    id: String,
    locale: String,
    mfa_enabled: Boolean,
    provider: discord,
    username: String,
    verified: Boolean,
    connections: js.Array[ConnectionInfo] = null,
    email: String = null,
    emails: js.Array[Anon_Type] = null,
    guilds: js.Array[GuildInfo] = null,
    name: Anon_FamilyName = null,
    photos: js.Array[Anon_Value] = null
  ): Profile = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], discriminator = discriminator.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fetchedAt = fetchedAt.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mfa_enabled = mfa_enabled.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (guilds != null) __obj.updateDynamic("guilds")(guilds.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

