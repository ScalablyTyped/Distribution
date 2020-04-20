package typings.plugapi.mod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Room extends Default {
  var badge: String
  var gRole: Double
  var id: Double
  var joined: String
  var level: Double
  var role: Double
  var slug: String
  var sub: Double
}

object Room {
  @scala.inline
  def apply(
    avatarID: String,
    badge: String,
    gRole: Double,
    id: Double,
    joined: String,
    language: String,
    level: Double,
    role: Double,
    slug: String,
    sub: Double,
    username: String
  ): Room = {
    val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], gRole = gRole.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], joined = joined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Room]
  }
}

