package typings.plugapi.plugapiMod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModBan extends js.Object {
  var duration: Double
  var moderator: String
  var reason: String
  var ref: String
  var username: String
}

object ModBan {
  @scala.inline
  def apply(duration: Double, moderator: String, reason: String, ref: String, username: String): ModBan = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], moderator = moderator.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModBan]
  }
}

