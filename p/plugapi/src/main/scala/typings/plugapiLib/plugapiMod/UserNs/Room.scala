package typings
package plugapiLib.plugapiMod.UserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Room extends Default {
  var badge: java.lang.String
  var gRole: scala.Double
  var id: scala.Double
  var joined: java.lang.String
  var level: scala.Double
  var role: scala.Double
  var slug: java.lang.String
  var sub: scala.Double
}

object Room {
  @scala.inline
  def apply(
    avatarID: java.lang.String,
    badge: java.lang.String,
    gRole: scala.Double,
    id: scala.Double,
    joined: java.lang.String,
    language: java.lang.String,
    level: scala.Double,
    role: scala.Double,
    slug: java.lang.String,
    sub: scala.Double,
    username: java.lang.String
  ): Room = {
    val __obj = js.Dynamic.literal(avatarID = avatarID, badge = badge, gRole = gRole, id = id, joined = joined, language = language, level = level, role = role, slug = slug, sub = sub, username = username)
  
    __obj.asInstanceOf[Room]
  }
}

