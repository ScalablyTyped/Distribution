package typings
package nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var args: js.Any
  var emitter: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents
  var interrupt: scala.Null
  var mice: scala.Double
  var name: java.lang.String
  var sync: scala.Boolean
  def callback(interrupt: js.Any): js.Any
}

object Event {
  @scala.inline
  def apply(
    args: js.Any,
    callback: js.Function1[js.Any, js.Any],
    emitter: nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents,
    interrupt: scala.Null,
    mice: scala.Double,
    name: java.lang.String,
    sync: scala.Boolean
  ): Event = {
    val __obj = js.Dynamic.literal(args = args, callback = callback, emitter = emitter, interrupt = interrupt, mice = mice, name = name, sync = sync)
  
    __obj.asInstanceOf[Event]
  }
}

