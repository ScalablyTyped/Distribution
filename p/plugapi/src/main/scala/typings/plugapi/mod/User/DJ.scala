package typings.plugapi.mod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DJ extends Room {
  var blurp: js.Any = js.native
  var grab: Boolean = js.native
  var status: Double = js.native
  var vote: Double = js.native
}

object DJ {
  @scala.inline
  def apply(
    avatarID: String,
    badge: String,
    blurp: js.Any,
    gRole: Double,
    grab: Boolean,
    id: Double,
    joined: String,
    language: String,
    level: Double,
    role: Double,
    slug: String,
    status: Double,
    sub: Double,
    username: String,
    vote: Double
  ): DJ = {
    val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], blurp = blurp.asInstanceOf[js.Any], gRole = gRole.asInstanceOf[js.Any], grab = grab.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], joined = joined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], vote = vote.asInstanceOf[js.Any])
    __obj.asInstanceOf[DJ]
  }
  @scala.inline
  implicit class DJOps[Self <: DJ] (val x: Self) extends AnyVal {
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
    def setBlurp(value: js.Any): Self = this.set("blurp", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrab(value: Boolean): Self = this.set("grab", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setVote(value: Double): Self = this.set("vote", value.asInstanceOf[js.Any])
  }
  
}

