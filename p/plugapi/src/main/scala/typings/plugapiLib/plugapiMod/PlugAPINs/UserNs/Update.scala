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
    __obj.asInstanceOf[Update]
  }
}

