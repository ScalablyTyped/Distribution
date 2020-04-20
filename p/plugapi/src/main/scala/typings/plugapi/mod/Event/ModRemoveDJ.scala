package typings.plugapi.mod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModRemoveDJ extends js.Object {
  var moderator: String
  var userID: String
  var username: String
}

object ModRemoveDJ {
  @scala.inline
  def apply(moderator: String, userID: String, username: String): ModRemoveDJ = {
    val __obj = js.Dynamic.literal(moderator = moderator.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModRemoveDJ]
  }
}

