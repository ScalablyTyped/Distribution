package typings.plugapi.plugapiMod.EventNs

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
    val __obj = js.Dynamic.literal(duration = duration, moderator = moderator, reason = reason, ref = ref, username = username)
  
    __obj.asInstanceOf[ModBan]
  }
}

