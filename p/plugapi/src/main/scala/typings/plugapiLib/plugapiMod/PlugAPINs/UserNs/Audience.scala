package typings
package plugapiLib.plugapiMod.PlugAPINs.UserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audience extends DJ {
  var ignores: js.Array[_]
  var notifications: js.Array[plugapiLib.plugapiMod.PlugAPINs.Notification]
  var pp: scala.Double
  var pw: scala.Double
  var xp: scala.Double
}

object Audience {
  @scala.inline
  def apply(
    avatarID: java.lang.String,
    badge: java.lang.String,
    blurp: js.Any,
    gRole: scala.Double,
    grab: scala.Boolean,
    id: scala.Double,
    ignores: js.Array[_],
    joined: java.lang.String,
    language: java.lang.String,
    level: scala.Double,
    notifications: js.Array[plugapiLib.plugapiMod.PlugAPINs.Notification],
    pp: scala.Double,
    pw: scala.Double,
    role: scala.Double,
    slug: java.lang.String,
    status: scala.Double,
    sub: scala.Double,
    username: java.lang.String,
    vote: scala.Double,
    xp: scala.Double
  ): Audience = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avatarID")(avatarID)
    __obj.updateDynamic("badge")(badge)
    __obj.updateDynamic("blurp")(blurp)
    __obj.updateDynamic("gRole")(gRole)
    __obj.updateDynamic("grab")(grab)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("ignores")(ignores)
    __obj.updateDynamic("joined")(joined)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("notifications")(notifications)
    __obj.updateDynamic("pp")(pp)
    __obj.updateDynamic("pw")(pw)
    __obj.updateDynamic("role")(role)
    __obj.updateDynamic("slug")(slug)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("sub")(sub)
    __obj.updateDynamic("username")(username)
    __obj.updateDynamic("vote")(vote)
    __obj.updateDynamic("xp")(xp)
    __obj.asInstanceOf[Audience]
  }
}

