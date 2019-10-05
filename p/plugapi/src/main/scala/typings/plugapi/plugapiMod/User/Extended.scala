package typings.plugapi.plugapiMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extended extends Default {
  var curatorPoints: Double
  var djPoints: Double
  var fans: Double
  var id: String
  var listenerPoints: Double
  var status: Double
}

object Extended {
  @scala.inline
  def apply(
    avatarID: String,
    curatorPoints: Double,
    djPoints: Double,
    fans: Double,
    id: String,
    language: String,
    listenerPoints: Double,
    status: Double,
    username: String
  ): Extended = {
    val __obj = js.Dynamic.literal(avatarID = avatarID, curatorPoints = curatorPoints, djPoints = djPoints, fans = fans, id = id, language = language, listenerPoints = listenerPoints, status = status, username = username)
  
    __obj.asInstanceOf[Extended]
  }
}

