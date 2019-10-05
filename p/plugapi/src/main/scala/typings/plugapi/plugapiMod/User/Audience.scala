package typings.plugapi.plugapiMod.User

import typings.plugapi.plugapiMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audience extends DJ {
  var ignores: js.Array[_]
  var notifications: js.Array[Notification]
  var pp: Double
  var pw: Double
  var xp: Double
}

object Audience {
  @scala.inline
  def apply(
    avatarID: String,
    badge: String,
    blurp: js.Any,
    gRole: Double,
    grab: Boolean,
    id: Double,
    ignores: js.Array[_],
    joined: String,
    language: String,
    level: Double,
    notifications: js.Array[Notification],
    pp: Double,
    pw: Double,
    role: Double,
    slug: String,
    status: Double,
    sub: Double,
    username: String,
    vote: Double,
    xp: Double
  ): Audience = {
    val __obj = js.Dynamic.literal(avatarID = avatarID, badge = badge, blurp = blurp, gRole = gRole, grab = grab, id = id, ignores = ignores, joined = joined, language = language, level = level, notifications = notifications, pp = pp, pw = pw, role = role, slug = slug, status = status, sub = sub, username = username, vote = vote, xp = xp)
  
    __obj.asInstanceOf[Audience]
  }
}

