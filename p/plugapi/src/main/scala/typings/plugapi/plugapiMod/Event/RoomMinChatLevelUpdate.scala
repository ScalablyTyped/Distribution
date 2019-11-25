package typings.plugapi.plugapiMod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomMinChatLevelUpdate extends js.Object {
  var id: Double
  var level: Double
  var user: typings.plugapi.plugapiMod.User.User
}

object RoomMinChatLevelUpdate {
  @scala.inline
  def apply(id: Double, level: Double, user: typings.plugapi.plugapiMod.User.User): RoomMinChatLevelUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoomMinChatLevelUpdate]
  }
}

