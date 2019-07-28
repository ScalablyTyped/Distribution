package typings.plugapi.plugapiMod.UserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update extends Extended {
  var dateJoined: String
}

object Update {
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
  ): Update = {
    val __obj = js.Dynamic.literal(avatarID = avatarID, curatorPoints = curatorPoints, dateJoined = dateJoined, djPoints = djPoints, fans = fans, id = id, language = language, listenerPoints = listenerPoints, status = status, username = username)
  
    __obj.asInstanceOf[Update]
  }
}

