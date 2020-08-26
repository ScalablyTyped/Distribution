package typings.plugapi.mod.User

import typings.plugapi.mod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Audience extends DJ {
  var ignores: js.Array[_] = js.native
  var notifications: js.Array[Notification] = js.native
  var pp: Double = js.native
  var pw: Double = js.native
  var xp: Double = js.native
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
  @scala.inline
  implicit class AudienceOps[Self <: Audience] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIgnoresVarargs(value: js.Any*): Self = this.set("ignores", js.Array(value :_*))
    @scala.inline
    def setIgnores(value: js.Array[_]): Self = this.set("ignores", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationsVarargs(value: Notification*): Self = this.set("notifications", js.Array(value :_*))
    @scala.inline
    def setNotifications(value: js.Array[Notification]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setPp(value: Double): Self = this.set("pp", value.asInstanceOf[js.Any])
    @scala.inline
    def setPw(value: Double): Self = this.set("pw", value.asInstanceOf[js.Any])
    @scala.inline
    def setXp(value: Double): Self = this.set("xp", value.asInstanceOf[js.Any])
  }
  
}

