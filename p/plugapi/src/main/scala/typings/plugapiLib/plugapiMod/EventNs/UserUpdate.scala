package typings
package plugapiLib.plugapiMod.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserUpdate extends js.Object {
  var avatarID: java.lang.String
  var curatorPoints: scala.Double
  var dateJoined: java.lang.String
  var djPoints: scala.Double
  var fans: scala.Double
  var id: java.lang.String
  var language: java.lang.String
  var listenerPoints: scala.Double
  var status: scala.Double
  var username: java.lang.String
}

object UserUpdate {
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
  ): UserUpdate = {
    val __obj = js.Dynamic.literal(avatarID = avatarID, curatorPoints = curatorPoints, dateJoined = dateJoined, djPoints = djPoints, fans = fans, id = id, language = language, listenerPoints = listenerPoints, status = status, username = username)
  
    __obj.asInstanceOf[UserUpdate]
  }
}

