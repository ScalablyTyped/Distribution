package typings.plugapi.plugapiMod.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModAddDJ extends js.Object {
  var moderator: String
  var username: String
}

object ModAddDJ {
  @scala.inline
  def apply(moderator: String, username: String): ModAddDJ = {
    val __obj = js.Dynamic.literal(moderator = moderator, username = username)
  
    __obj.asInstanceOf[ModAddDJ]
  }
}

