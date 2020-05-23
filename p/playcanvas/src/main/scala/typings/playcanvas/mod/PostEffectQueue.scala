package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new PostEffectQueue.
  * @param app - The application.
  * @param camera - The camera component.
  */
@JSImport("playcanvas", "PostEffectQueue")
@js.native
class PostEffectQueue protected ()
  extends typings.playcanvas.pc.PostEffectQueue {
  def this(app: typings.playcanvas.pc.Application, camera: typings.playcanvas.pc.CameraComponent) = this()
  /**
    * Adds a post effect to the queue. If the queue is disabled adding a post effect will
    automatically enable the queue.
    * @param effect - The post effect to add to the queue.
    */
  /* CompleteClass */
  override def addEffect(effect: typings.playcanvas.pc.PostEffect): Unit = js.native
  /**
    * Removes all the effects from the queue and disables it.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Disables the queue and all of its effects.
    */
  /* CompleteClass */
  override def disable(): Unit = js.native
  /**
    * Enables the queue and all of its effects. If there are no effects then the queue will not be enabled.
    */
  /* CompleteClass */
  override def enable(): Unit = js.native
  /**
    * Removes a post effect from the queue. If the queue becomes empty it will be disabled automatically.
    * @param effect - The post effect to remove.
    */
  /* CompleteClass */
  override def removeEffect(effect: typings.playcanvas.pc.PostEffect): Unit = js.native
}

