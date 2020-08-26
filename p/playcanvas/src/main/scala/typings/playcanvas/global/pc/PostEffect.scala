package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates new PostEffect.
  * @property device - The graphics device of the application. [read only].
  * @property vertexBuffer - The vertex buffer for the fullscreen quad. Used when calling {@link pc.drawFullscreenQuad}. [read only].
  * @property shader - The shader definition for the fullscreen quad. Needs to be set by the custom post effect (default is null). Used when calling {@link pc.drawFullscreenQuad}.
  * @property needsDepthBuffer - The property that should to be set to `true` (by the custom post effect) if a depth map is necessary (default is false).
  * @param graphicsDevice - The graphics device of the application.
  */
@JSGlobal("pc.PostEffect")
@js.native
class PostEffect protected ()
  extends typings.playcanvas.pc.PostEffect {
  def this(graphicsDevice: typings.playcanvas.pc.GraphicsDevice) = this()
}

