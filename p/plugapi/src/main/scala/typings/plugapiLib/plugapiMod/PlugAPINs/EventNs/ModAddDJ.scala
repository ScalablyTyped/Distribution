package typings
package plugapiLib.plugapiMod.PlugAPINs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModAddDJ extends js.Object {
  var moderator: java.lang.String
  var username: java.lang.String
}

object ModAddDJ {
  @scala.inline
  def apply(moderator: java.lang.String, username: java.lang.String): ModAddDJ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("moderator")(moderator)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ModAddDJ]
  }
}

