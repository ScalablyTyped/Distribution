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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avatarID")(avatarID)
    __obj.updateDynamic("badge")(badge)
    __obj.updateDynamic("gRole")(gRole)
    __obj.updateDynamic("guest")(guest)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("joined")(joined)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("role")(role)
    __obj.updateDynamic("silver")(silver)
    __obj.updateDynamic("slug")(slug)
    __obj.updateDynamic("sub")(sub)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[User]
  }
}

