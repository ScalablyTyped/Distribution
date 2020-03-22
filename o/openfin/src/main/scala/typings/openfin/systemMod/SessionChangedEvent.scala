package typings.openfin.systemMod

import typings.openfin.eventsBaseMod.BaseEvent
import typings.openfin.openfinStrings.`remote-connect`
import typings.openfin.openfinStrings.`remote-disconnect`
import typings.openfin.openfinStrings.lock
import typings.openfin.openfinStrings.unknown
import typings.openfin.openfinStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionChangedEvent[Topic, Type] extends BaseEvent[Topic, Type] {
  var reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown
}

object SessionChangedEvent {
  @scala.inline
  def apply[Topic, Type](
    reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown,
    topic: Topic,
    `type`: Type
  ): SessionChangedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionChangedEvent[Topic, Type]]
  }
}

