package typings.playcanvas.playcanvasMod

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
@JSImport("playcanvas", "PostEffectQueue")
@js.native
class PostEffectQueue protected ()
  extends typings.playcanvas.pc.PostEffectQueue {
  def this(app: typings.playcanvas.pc.Application, camera: typings.playcanvas.pc.CameraComponent) = this()
}

