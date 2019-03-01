package typings
package plugapiLib.plugapiMod.PlugAPINs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModRemoveDJ extends js.Object {
  var moderator: java.lang.String
  var userID: java.lang.String
  var username: java.lang.String
}

object ModRemoveDJ {
  @scala.inline
  def apply(moderator: java.lang.String, userID: java.lang.String, username: java.lang.String): ModRemoveDJ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("moderator")(moderator)
    __obj.updateDynamic("userID")(userID)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ModRemoveDJ]
  }
}

