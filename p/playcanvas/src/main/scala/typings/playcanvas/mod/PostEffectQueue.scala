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
}

