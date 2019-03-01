package typings
package plugapiLib.plugapiMod.PlugAPINs.UserNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avatarID")(avatarID)
    __obj.updateDynamic("badge")(badge)
    __obj.updateDynamic("blurp")(blurp)
    __obj.updateDynamic("gRole")(gRole)
    __obj.updateDynamic("grab")(grab)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("joined")(joined)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("role")(role)
    __obj.updateDynamic("slug")(slug)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("sub")(sub)
    __obj.updateDynamic("username")(username)
    __obj.updateDynamic("vote")(vote)
    __obj.asInstanceOf[DJ]
  }
}

