package typings.plugapi.plugapiMod.Event

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
    val __obj = js.Dynamic.literal(moderator = moderator.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModAddDJ]
  }
}

