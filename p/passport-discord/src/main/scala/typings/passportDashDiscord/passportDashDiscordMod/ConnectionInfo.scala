package typings.passportDashDiscord.passportDashDiscordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionInfo extends js.Object {
  var id: String
  var name: String
  var show_activity: Boolean
  var `type`: String
  var verified: Boolean
  var visibility: Double
}

object ConnectionInfo {
  @scala.inline
  def apply(
    id: String,
    name: String,
    show_activity: Boolean,
    `type`: String,
    verified: Boolean,
    visibility: Double
  ): ConnectionInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], show_activity = show_activity.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfo]
  }
}

