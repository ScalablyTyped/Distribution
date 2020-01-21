package typings.passportDiscord.mod

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
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GuildInfo]
  }
}

