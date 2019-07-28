package typings.plugapi.plugapiMod.UserNs

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
    val __obj = js.Dynamic.literal(avatarID = avatarID, badge = badge, blurp = blurp, gRole = gRole, grab = grab, id = id, joined = joined, language = language, level = level, role = role, slug = slug, status = status, sub = sub, username = username, vote = vote)
  
    __obj.asInstanceOf[DJ]
  }
}

