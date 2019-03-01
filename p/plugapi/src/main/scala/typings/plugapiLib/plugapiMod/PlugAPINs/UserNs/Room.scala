package typings
package plugapiLib.plugapiMod.PlugAPINs.UserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Room extends Default {
  var badge: java.lang.String
  var gRole: scala.Double
  var id: scala.Double
  var joined: java.lang.String
  var level: scala.Double
  var role: scala.Double
  var slug: java.lang.String
  var sub: scala.Double
}

object Room {
  @scala.inline
  def apply(
    avatarID: java.lang.String,
    badge: java.lang.String,
    gRole: scala.Double,
    id: scala.Double,
    joined: java.lang.String,
    language: java.lang.String,
    level: scala.Double,
    role: scala.Double,
    slug: java.lang.String,
    sub: scala.Double,
    username: java.lang.String
  ): Room = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avatarID")(avatarID)
    __obj.updateDynamic("badge")(badge)
    __obj.updateDynamic("gRole")(gRole)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("joined")(joined)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("role")(role)
    __obj.updateDynamic("slug")(slug)
    __obj.updateDynamic("sub")(sub)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Room]
  }
}

