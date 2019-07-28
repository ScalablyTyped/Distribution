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
    val __obj = js.Dynamic.literal(id = id, name = name, show_activity = show_activity, verified = verified, visibility = visibility)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConnectionInfo]
  }
}

