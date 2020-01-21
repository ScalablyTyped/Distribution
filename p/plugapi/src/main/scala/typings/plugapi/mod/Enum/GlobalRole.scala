package typings.plugapi.mod.Enum

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
    val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], AMBASSADOR = AMBASSADOR.asInstanceOf[js.Any], LEADER = LEADER.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], VOLUNTEER = VOLUNTEER.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlobalRole]
  }
}

