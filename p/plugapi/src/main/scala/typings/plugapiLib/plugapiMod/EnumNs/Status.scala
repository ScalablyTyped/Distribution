package typings
package plugapiLib.plugapiMod.EnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var OFFLINE: scala.Double
  var ONLINE: scala.Double
}

object Status {
  @scala.inline
  def apply(OFFLINE: scala.Double, ONLINE: scala.Double): Status = {
    val __obj = js.Dynamic.literal(OFFLINE = OFFLINE, ONLINE = ONLINE)
  
    __obj.asInstanceOf[Status]
  }
}

