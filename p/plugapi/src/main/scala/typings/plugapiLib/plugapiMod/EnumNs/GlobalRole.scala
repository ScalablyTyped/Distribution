package typings
package plugapiLib.plugapiMod.EnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalRole extends js.Object {
  var ADMIN: scala.Double
  var AMBASSADOR: scala.Double
  var LEADER: scala.Double
  var NONE: scala.Double
  var VOLUNTEER: scala.Double
}

object GlobalRole {
  @scala.inline
  def apply(
    ADMIN: scala.Double,
    AMBASSADOR: scala.Double,
    LEADER: scala.Double,
    NONE: scala.Double,
    VOLUNTEER: scala.Double
  ): GlobalRole = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN, AMBASSADOR = AMBASSADOR, LEADER = LEADER, NONE = NONE, VOLUNTEER = VOLUNTEER)
  
    __obj.asInstanceOf[GlobalRole]
  }
}

