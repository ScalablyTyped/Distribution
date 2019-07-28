package typings.ol.eventsEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var target: js.Any
  var `type`: String
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object Event {
  @scala.inline
  def apply(preventDefault: () => Unit, stopPropagation: () => Unit, target: js.Any, `type`: String): Event = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Event]
  }
}

