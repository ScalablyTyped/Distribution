package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`remote-connect`
import typings.openfin.openfinStrings.`remote-disconnect`
import typings.openfin.openfinStrings.`session-changed`
import typings.openfin.openfinStrings.lock
import typings.openfin.openfinStrings.system
import typings.openfin.openfinStrings.unknown
import typings.openfin.openfinStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionChangedEvent extends js.Object {
  /**
    * the action that triggered this event:
    */
  var reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown
  var topic: system
  var `type`: `session-changed`
}

object SessionChangedEvent {
  @scala.inline
  def apply(
    reason: lock | unlock | `remote-connect` | `remote-disconnect` | unknown,
    topic: system,
    `type`: `session-changed`
  ): SessionChangedEvent = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionChangedEvent]
  }
}

