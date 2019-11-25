package typings.plugapi.plugapiMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DJ extends Room {
  var blurp: js.Any
  var grab: Boolean
  var status: Double
  var vote: Double
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
}

