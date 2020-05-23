package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new PostEffectQueue.
  * @param app - The application.
  * @param camera - The camera component.
  */
trait PostEffectQueue extends js.Object {
  /**
    * Adds a post effect to the queue. If the queue is disabled adding a post effect will
    automatically enable the queue.
    * @param effect - The post effect to add to the queue.
    */
  def addEffect(effect: PostEffect): Unit
  /**
    * Removes all the effects from the queue and disables it.
    */
  def destroy(): Unit
  /**
    * Disables the queue and all of its effects.
    */
  def disable(): Unit
  /**
    * Enables the queue and all of its effects. If there are no effects then the queue will not be enabled.
    */
  def enable(): Unit
  /**
    * Removes a post effect from the queue. If the queue becomes empty it will be disabled automatically.
    * @param effect - The post effect to remove.
    */
  def removeEffect(effect: PostEffect): Unit
}

object PostEffectQueue {
  @scala.inline
  def apply(
    addEffect: PostEffect => Unit,
    destroy: () => Unit,
    disable: () => Unit,
    enable: () => Unit,
    removeEffect: PostEffect => Unit
  ): PostEffectQueue = {
    val __obj = js.Dynamic.literal(addEffect = js.Any.fromFunction1(addEffect), destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), removeEffect = js.Any.fromFunction1(removeEffect))
    __obj.asInstanceOf[PostEffectQueue]
  }
}

