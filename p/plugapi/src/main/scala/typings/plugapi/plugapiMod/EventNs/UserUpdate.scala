package typings.plugapi.plugapiMod.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserUpdate extends js.Object {
  var avatarID: String
  var curatorPoints: Double
  var dateJoined: String
  var djPoints: Double
  var fans: Double
  var id: String
  var language: String
  var listenerPoints: Double
  var status: Double
  var username: String
}

object UserUpdate {
  @scala.inline
  def apply(
    avatarID: String,
    curatorPoints: Double,
    dateJoined: String,
    djPoints: Double,
    fans: Double,
    id: String,
    language: String,
    listenerPoints: Double,
    status: Double,
    username: String
  ): UserUpdate = {
    val __obj = js.Dynamic.literal(avatarID = avatarID, curatorPoints = curatorPoints, dateJoined = dateJoined, djPoints = djPoints, fans = fans, id = id, language = language, listenerPoints = listenerPoints, status = status, username = username)
  
    __obj.asInstanceOf[UserUpdate]
  }
}

