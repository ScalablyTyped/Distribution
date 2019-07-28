package typings.plugapi.plugapiMod.UserNs

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
    val __obj = js.Dynamic.literal(avatarID = avatarID, badge = badge, gRole = gRole, id = id, joined = joined, language = language, level = level, role = role, slug = slug, sub = sub, username = username)
  
    __obj.asInstanceOf[Room]
  }
}

