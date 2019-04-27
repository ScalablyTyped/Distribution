package typings
package passportDashDiscordLib.passportDashDiscordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GuildInfo extends js.Object {
  var icon: java.lang.String
  var id: java.lang.String
  var name: java.lang.String
  var owner: scala.Boolean
  var permissions: scala.Double
}

object GuildInfo {
  @scala.inline
  def apply(
    icon: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    owner: scala.Boolean,
    permissions: scala.Double
  ): GuildInfo = {
    val __obj = js.Dynamic.literal(icon = icon, id = id, name = name, owner = owner, permissions = permissions)
  
    __obj.asInstanceOf[GuildInfo]
  }
}

