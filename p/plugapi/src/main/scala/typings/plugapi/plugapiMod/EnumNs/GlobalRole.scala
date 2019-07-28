package typings.plugapi.plugapiMod.EnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalRole extends js.Object {
  var ADMIN: Double
  var AMBASSADOR: Double
  var LEADER: Double
  var NONE: Double
  var VOLUNTEER: Double
}

object GlobalRole {
  @scala.inline
  def apply(ADMIN: Double, AMBASSADOR: Double, LEADER: Double, NONE: Double, VOLUNTEER: Double): GlobalRole = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN, AMBASSADOR = AMBASSADOR, LEADER = LEADER, NONE = NONE, VOLUNTEER = VOLUNTEER)
  
    __obj.asInstanceOf[GlobalRole]
  }
}

