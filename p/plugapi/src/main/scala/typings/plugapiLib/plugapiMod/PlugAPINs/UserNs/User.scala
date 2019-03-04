package typings
package plugapiLib.plugapiMod.PlugAPINs.UserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends Room {
  var guest: scala.Boolean
  var silver: scala.Boolean
}

object User {
  @scala.inline
  def apply(
    avatarID: java.lang.String,
    badge: java.lang.String,
    gRole: scala.Double,
    guest: scala.Boolean,
    id: scala.Double,
    joined: java.lang.String,
    language: java.lang.String,
    level: scala.Double,
    role: scala.Double,
    silver: scala.Boolean,
    slug: java.lang.String,
    sub: scala.Double,
    username: java.lang.String
  ): User = {
    val __obj = js.Dynamic.literal(avatarID = avatarID, badge = badge, gRole = gRole, guest = guest, id = id, joined = joined, language = language, level = level, role = role, silver = silver, slug = slug, sub = sub, username = username)
  
    __obj.asInstanceOf[User]
  }
}

