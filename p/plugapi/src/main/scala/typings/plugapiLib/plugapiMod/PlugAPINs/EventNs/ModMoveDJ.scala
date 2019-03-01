package typings
package plugapiLib.plugapiMod.PlugAPINs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModMoveDJ extends js.Object {
  var index: scala.Double
  var moderator: java.lang.String
  var old: scala.Double
  var userID: java.lang.String
}

object ModMoveDJ {
  @scala.inline
  def apply(index: scala.Double, moderator: java.lang.String, old: scala.Double, userID: java.lang.String): ModMoveDJ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("moderator")(moderator)
    __obj.updateDynamic("old")(old)
    __obj.updateDynamic("userID")(userID)
    __obj.asInstanceOf[ModMoveDJ]
  }
}

