package typings.plugapi.mod.Enum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var OFFLINE: Double
  var ONLINE: Double
}

object Status {
  @scala.inline
  def apply(OFFLINE: Double, ONLINE: Double): Status = {
    val __obj = js.Dynamic.literal(OFFLINE = OFFLINE.asInstanceOf[js.Any], ONLINE = ONLINE.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
}

