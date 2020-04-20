package typings.plugapi.mod.User

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
    val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], gRole = gRole.asInstanceOf[js.Any], guest = guest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], joined = joined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], silver = silver.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

