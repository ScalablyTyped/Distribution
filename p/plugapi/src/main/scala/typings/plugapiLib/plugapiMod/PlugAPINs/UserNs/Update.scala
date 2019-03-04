package typings
package plugapiLib.plugapiMod.PlugAPINs.UserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update extends Extended {
  var dateJoined: java.lang.String
}

object Update {
  @scala.inline
  def apply(
    avatarID: java.lang.String,
    curatorPoints: scala.Double,
    dateJoined: java.lang.String,
    djPoints: scala.Double,
    fans: scala.Double,
    id: java.lang.String,
    language: java.lang.String,
    listenerPoints: scala.Double,
    status: scala.Double,
    username: java.lang.String
  ): Update = {
    val __obj = js.Dynamic.literal(avatarID = avatarID, curatorPoints = curatorPoints, dateJoined = dateJoined, djPoints = djPoints, fans = fans, id = id, language = language, listenerPoints = listenerPoints, status = status, username = username)
  
    __obj.asInstanceOf[Update]
  }
}

