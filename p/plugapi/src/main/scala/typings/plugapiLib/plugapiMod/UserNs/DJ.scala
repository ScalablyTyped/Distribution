package typings
package plugapiLib.plugapiMod.UserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DJ extends Room {
  var blurp: js.Any
  var grab: scala.Boolean
  var status: scala.Double
  var vote: scala.Double
}

object DJ {
  @scala.inline
  def apply(
    avatarID: java.lang.String,
    badge: java.lang.String,
    blurp: js.Any,
    gRole: scala.Double,
    grab: scala.Boolean,
    id: scala.Double,
    joined: java.lang.String,
    language: java.lang.String,
    level: scala.Double,
    role: scala.Double,
    slug: java.lang.String,
    status: scala.Double,
    sub: scala.Double,
    username: java.lang.String,
    vote: scala.Double
  ): DJ = {
    val __obj = js.Dynamic.literal(avatarID = avatarID, badge = badge, blurp = blurp, gRole = gRole, grab = grab, id = id, joined = joined, language = language, level = level, role = role, slug = slug, status = status, sub = sub, username = username, vote = vote)
  
    __obj.asInstanceOf[DJ]
  }
}

