package typings.popperJs.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Popper_ extends js.Object {
  var options: PopperOptions
  var popper: Element
  var reference: Element | ReferenceObject
  def destroy(): Unit
  def disableEventListeners(): Unit
  def enableEventListeners(): Unit
  def scheduleUpdate(): Unit
  def update(): Unit
}

object Popper_ {
  @scala.inline
  def apply(
    destroy: () => Unit,
    disableEventListeners: () => Unit,
    enableEventListeners: () => Unit,
    options: PopperOptions,
    popper: Element,
    reference: Element | ReferenceObject,
    scheduleUpdate: () => Unit,
    update: () => Unit
  ): Popper_ = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disableEventListeners = js.Any.fromFunction0(disableEventListeners), enableEventListeners = js.Any.fromFunction0(enableEventListeners), options = options.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Popper_]
  }
}

