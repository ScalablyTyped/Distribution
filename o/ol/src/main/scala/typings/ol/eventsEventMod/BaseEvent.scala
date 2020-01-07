package typings.ol.eventsEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEvent extends js.Object {
  var target: js.Any
  var `type`: String
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object BaseEvent {
  @scala.inline
  def apply(preventDefault: () => Unit, stopPropagation: () => Unit, target: js.Any, `type`: String): BaseEvent = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent]
  }
}

