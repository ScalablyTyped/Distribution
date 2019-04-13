package typings
package plugapiLib.plugapiMod.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoothCycle extends js.Object {
  var cycle: scala.Boolean
  var moderator: java.lang.String
}

object BoothCycle {
  @scala.inline
  def apply(cycle: scala.Boolean, moderator: java.lang.String): BoothCycle = {
    val __obj = js.Dynamic.literal(cycle = cycle, moderator = moderator)
  
    __obj.asInstanceOf[BoothCycle]
  }
}

