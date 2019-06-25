package typings
package olLib.eventsEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var target: js.Any
  var `type`: java.lang.String
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

object Event {
  @scala.inline
  def apply(
    preventDefault: () => scala.Unit,
    stopPropagation: () => scala.Unit,
    target: js.Any,
    `type`: java.lang.String
  ): Event = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Event]
  }
}

