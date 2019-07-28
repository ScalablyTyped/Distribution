package typings.nextgenDashEvents.nextgenDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var args: js.Any
  var emitter: NextGenEvents
  var interrupt: Null
  var mice: Double
  var name: String
  var sync: Boolean
  def callback(interrupt: js.Any): js.Any
}

object Event {
  @scala.inline
  def apply(
    args: js.Any,
    callback: js.Any => js.Any,
    emitter: NextGenEvents,
    interrupt: Null,
    mice: Double,
    name: String,
    sync: Boolean
  ): Event = {
    val __obj = js.Dynamic.literal(args = args, callback = js.Any.fromFunction1(callback), emitter = emitter, interrupt = interrupt, mice = mice, name = name, sync = sync)
  
    __obj.asInstanceOf[Event]
  }
}

