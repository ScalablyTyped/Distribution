package typings.pixiDotJs.PIXI.interaction

import typings.pixiDotJs.PIXI.DisplayObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionEvent extends js.Object {
  var currentTarget: DisplayObject
  var data: InteractionData
  var stopped: Boolean
  var target: DisplayObject
  var `type`: String
  def reset(): Unit
  def stopPropagation(): Unit
}

object InteractionEvent {
  @scala.inline
  def apply(
    currentTarget: DisplayObject,
    data: InteractionData,
    reset: () => Unit,
    stopPropagation: () => Unit,
    stopped: Boolean,
    target: DisplayObject,
    `type`: String
  ): InteractionEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget, data = data, reset = js.Any.fromFunction0(reset), stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InteractionEvent]
  }
}

