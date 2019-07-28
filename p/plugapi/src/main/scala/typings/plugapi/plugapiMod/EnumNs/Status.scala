package typings.plugapi.plugapiMod.EnumNs

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
    val __obj = js.Dynamic.literal(OFFLINE = OFFLINE, ONLINE = ONLINE)
  
    __obj.asInstanceOf[Status]
  }
}

