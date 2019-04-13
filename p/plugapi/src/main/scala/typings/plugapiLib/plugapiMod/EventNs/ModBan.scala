package typings
package plugapiLib.plugapiMod.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModBan extends js.Object {
  var duration: scala.Double
  var moderator: java.lang.String
  var reason: java.lang.String
  var ref: java.lang.String
  var username: java.lang.String
}

object ModBan {
  @scala.inline
  def apply(
    duration: scala.Double,
    moderator: java.lang.String,
    reason: java.lang.String,
    ref: java.lang.String,
    username: java.lang.String
  ): ModBan = {
    val __obj = js.Dynamic.literal(duration = duration, moderator = moderator, reason = reason, ref = ref, username = username)
  
    __obj.asInstanceOf[ModBan]
  }
}

