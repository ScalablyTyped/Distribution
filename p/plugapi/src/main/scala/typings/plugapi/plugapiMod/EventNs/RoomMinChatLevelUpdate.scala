package typings.plugapi.plugapiMod.EventNs

import typings.plugapi.plugapiMod.UserNs.User
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
    val __obj = js.Dynamic.literal(id = id, level = level, user = user)
  
    __obj.asInstanceOf[RoomMinChatLevelUpdate]
  }
}

