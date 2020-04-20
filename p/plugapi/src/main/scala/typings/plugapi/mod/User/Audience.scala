package typings.plugapi.mod.User

import typings.plugapi.mod.Notification
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
    val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], blurp = blurp.asInstanceOf[js.Any], gRole = gRole.asInstanceOf[js.Any], grab = grab.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ignores = ignores.asInstanceOf[js.Any], joined = joined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], pp = pp.asInstanceOf[js.Any], pw = pw.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], vote = vote.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audience]
  }
}

