package typings.passportDiscord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile
  extends typings.passport.mod.Profile {
  var avatar: String = js.native
   // requires "email" scope
  var connections: js.UndefOr[js.Array[ConnectionInfo]] = js.native
  var discriminator: String = js.native
  var email: js.UndefOr[String] = js.native
  var fetchedAt: String = js.native
  var flags: Double = js.native
   // requires "connection" scope
  var guilds: js.UndefOr[js.Array[GuildInfo]] = js.native
  var locale: String = js.native
  var mfa_enabled: Boolean = js.native
  var verified: Boolean = js.native
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
    provider: String,
    verified: Boolean
  ): Profile = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], discriminator = discriminator.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fetchedAt = fetchedAt.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mfa_enabled = mfa_enabled.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvatar(value: String): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscriminator(value: String): Self = this.set("discriminator", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchedAt(value: String): Self = this.set("fetchedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMfa_enabled(value: Boolean): Self = this.set("mfa_enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionsVarargs(value: ConnectionInfo*): Self = this.set("connections", js.Array(value :_*))
    @scala.inline
    def setConnections(value: js.Array[ConnectionInfo]): Self = this.set("connections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setGuildsVarargs(value: GuildInfo*): Self = this.set("guilds", js.Array(value :_*))
    @scala.inline
    def setGuilds(value: js.Array[GuildInfo]): Self = this.set("guilds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuilds: Self = this.set("guilds", js.undefined)
  }
  
}

