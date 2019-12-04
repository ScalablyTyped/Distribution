package typings.ngxDashInfiniteDashScroll.srcServicesEventDashTriggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITriggerEvents extends js.Object {
  def down(event: js.Any): js.Any
  def up(event: js.Any): js.Any
}

object ITriggerEvents {
  @scala.inline
  def apply(down: js.Any => js.Any, up: js.Any => js.Any): ITriggerEvents = {
    val __obj = js.Dynamic.literal(down = js.Any.fromFunction1(down), up = js.Any.fromFunction1(up))
  
    __obj.asInstanceOf[ITriggerEvents]
  }
}

