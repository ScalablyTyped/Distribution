package typings.plugapi.plugapiMod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoothCycle extends js.Object {
  var cycle: Boolean
  var moderator: String
}

object BoothCycle {
  @scala.inline
  def apply(cycle: Boolean, moderator: String): BoothCycle = {
    val __obj = js.Dynamic.literal(cycle = cycle.asInstanceOf[js.Any], moderator = moderator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoothCycle]
  }
}

