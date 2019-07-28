package typings.passportDashDiscord.passportDashDiscordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuildInfo extends js.Object {
  var icon: String
  var id: String
  var name: String
  var owner: Boolean
  var permissions: Double
}

object GuildInfo {
  @scala.inline
  def apply(icon: String, id: String, name: String, owner: Boolean, permissions: Double): GuildInfo = {
    val __obj = js.Dynamic.literal(icon = icon, id = id, name = name, owner = owner, permissions = permissions)
  
    __obj.asInstanceOf[GuildInfo]
  }
}

