package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ForwardRenderer
  * @classdesc The forward renderer render scene objects.
  * @description Creates a new forward renderer object.
  * @param {pc.GraphicsDevice} graphicsDevice The graphics device used by the renderer.
  */
@JSImport("playcanvas", "ForwardRenderer")
@js.native
class ForwardRenderer protected ()
  extends typings.playcanvas.pc.ForwardRenderer {
  def this(graphicsDevice: typings.playcanvas.pc.GraphicsDevice) = this()
}

