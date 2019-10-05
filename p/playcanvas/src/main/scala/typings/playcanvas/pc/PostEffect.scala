package typings.playcanvas.pc

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
@JSGlobal("pc.PostEffect")
@js.native
class PostEffect protected () extends js.Object {
  def this(graphicsDevice: GraphicsDevice) = this()
  /**
    * The graphics device of the application. [read only]
    */
  var device: GraphicsDevice = js.native
  /**
    * The property that should to be set to `true` (by the custom post effect) if a depth map is necessary (default is false).
    */
  var needsDepthBuffer: Boolean = js.native
  /**
    * The shader definition for the fullscreen quad. Needs to be set by the custom post effect (default is null). Used when calling {@link pc.drawFullscreenQuad}.
    */
  var shader: Shader | Null = js.native
  /**
    * The vertex buffer for the fullscreen quad. Used when calling {@link pc.drawFullscreenQuad}. [read only]
    */
  var vertexBuffer: VertexBuffer = js.native
  /**
    * @function
    * @name pc.PostEffect#render
    * @description Render the post effect using the specified inputTarget
    * to the specified outputTarget.
    * @param {pc.RenderTarget} inputTarget The input render target
    * @param {pc.RenderTarget} outputTarget The output render target. If null then this will be the screen.
    * @param {pc.Vec4} rect (Optional) The rect of the current camera. If not specified then it will default to [0,0,1,1]
    */
  def render(inputTarget: RenderTarget, outputTarget: RenderTarget, rect: Vec4): Unit = js.native
}

