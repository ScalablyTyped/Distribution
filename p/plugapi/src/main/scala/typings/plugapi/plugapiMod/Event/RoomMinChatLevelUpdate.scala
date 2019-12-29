package typings.plugapi.plugapiMod.Event

import typings.plugapi.plugapiMod.User.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomMinChatLevelUpdate extends js.Object {
  var id: Double
  var level: Double
  var user: User
}

object RoomMinChatLevelUpdate {
  @scala.inline
  def apply(id: Double, level: Double, user: User): RoomMinChatLevelUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoomMinChatLevelUpdate]
  }
}

