package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.PostEffectQueue
  * @classdesc Used to manage multiple post effects for a camera
  * @description Create a new PostEffectQueue
  * @param {pc.Application} app The application
  * @param {pc.CameraComponent} camera The camera component
  */
@JSGlobal("pc.PostEffectQueue")
@js.native
class PostEffectQueue protected () extends js.Object {
  def this(app: Application, camera: CameraComponent) = this()
  /**
    * @function
    * @name pc.PostEffectQueue#addEffect
    * @description Adds a post effect to the queue. If the queue is disabled adding a post effect will
    * automatically enable the queue.
    * @param {pc.PostEffect} effect The post effect to add to the queue.
    */
  def addEffect(effect: PostEffect): Unit = js.native
  /**
    * @function
    * @name pc.PostEffectQueue#destroy
    * @description Removes all the effects from the queue and disables it
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.PostEffectQueue#disable
    * @description Disables the queue and all of its effects.
    */
  def disable(): Unit = js.native
  /**
    * @function
    * @name pc.PostEffectQueue#enable
    * @description Enables the queue and all of its effects. If there are no effects then the queue will not be enabled.
    */
  def enable(): Unit = js.native
  /**
    * @function
    * @name pc.PostEffectQueue#removeEffect
    * @description Removes a post effect from the queue. If the queue becomes empty it will be disabled automatically.
    * @param {pc.PostEffect} effect The post effect to remove.
    */
  def removeEffect(effect: PostEffect): Unit = js.native
}

