package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.PostEffect
  * @classdesc Base class for all post effects. Post effects take a a render target as input
  * apply effects to it and then render the result to an output render target or the screen
  * if no output is specified.
  * @description Creates new PostEffect
  * @param {pc.GraphicsDevice} graphicsDevice The graphics device of the application
  * @property {pc.GraphicsDevice} device The graphics device of the application. [read only]
  * @property {pc.VertexBuffer} vertexBuffer The vertex buffer for the fullscreen quad. Used when calling {@link pc.drawFullscreenQuad}. [read only]
  * @property {pc.Shader|Null} shader The shader definition for the fullscreen quad. Needs to be set by the custom post effect (default is null). Used when calling {@link pc.drawFullscreenQuad}.
  * @property {Boolean} needsDepthBuffer The property that should to be set to `true` (by the custom post effect) if a depth map is necessary (default is false).
  */
@JSImport("playcanvas", "PostEffect")
@js.native
class PostEffect protected ()
  extends typings.playcanvas.pc.PostEffect {
  def this(graphicsDevice: typings.playcanvas.pc.GraphicsDevice) = this()
}

