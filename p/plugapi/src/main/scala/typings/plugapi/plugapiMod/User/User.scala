package typings.plugapi.plugapiMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends Room {
  var guest: Boolean
  var silver: Boolean
}

object User {
  @scala.inline
  def apply(
    avatarID: String,
    badge: String,
    gRole: Double,
    guest: Boolean,
    id: Double,
    joined: String,
    language: String,
    level: Double,
    role: Double,
    silver: Boolean,
    slug: String,
    sub: Double,
    username: String
  ): User = {
    val __obj = js.Dynamic.literal(avatarID = avatarID, badge = badge, gRole = gRole, guest = guest, id = id, joined = joined, language = language, level = level, role = role, silver = silver, slug = slug, sub = sub, username = username)
  
    __obj.asInstanceOf[User]
  }
}

