package typings
package plugapiLib.plugapiMod.PlugAPINs.EventNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avatarID")(avatarID)
    __obj.updateDynamic("curatorPoints")(curatorPoints)
    __obj.updateDynamic("dateJoined")(dateJoined)
    __obj.updateDynamic("djPoints")(djPoints)
    __obj.updateDynamic("fans")(fans)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("listenerPoints")(listenerPoints)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[UserUpdate]
  }
}

