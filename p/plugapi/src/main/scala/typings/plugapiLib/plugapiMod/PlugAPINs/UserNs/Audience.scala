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
    val __obj = js.Dynamic.literal(avatarID = avatarID, badge = badge, blurp = blurp, gRole = gRole, grab = grab, id = id, ignores = ignores, joined = joined, language = language, level = level, notifications = notifications, pp = pp, pw = pw, role = role, slug = slug, status = status, sub = sub, username = username, vote = vote, xp = xp)
  
    __obj.asInstanceOf[Audience]
  }
}

