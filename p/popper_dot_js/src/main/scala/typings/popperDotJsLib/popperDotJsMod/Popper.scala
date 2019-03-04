package typings
package popperDotJsLib.popperDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Popper extends js.Object {
  var options: PopperOptions
  def destroy(): scala.Unit
  def disableEventListeners(): scala.Unit
  def enableEventListeners(): scala.Unit
  def scheduleUpdate(): scala.Unit
  def update(): scala.Unit
}

object Popper {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    disableEventListeners: js.Function0[scala.Unit],
    enableEventListeners: js.Function0[scala.Unit],
    options: PopperOptions,
    scheduleUpdate: js.Function0[scala.Unit],
    update: js.Function0[scala.Unit]
  ): Popper = {
    val __obj = js.Dynamic.literal(destroy = destroy, disableEventListeners = disableEventListeners, enableEventListeners = enableEventListeners, options = options, scheduleUpdate = scheduleUpdate, update = update)
  
    __obj.asInstanceOf[Popper]
  }
}

