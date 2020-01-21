package typings.nextgenEvents.mod

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
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], callback = js.Any.fromFunction1(callback), emitter = emitter.asInstanceOf[js.Any], interrupt = interrupt.asInstanceOf[js.Any], mice = mice.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Event]
  }
}

