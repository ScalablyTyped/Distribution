package typings.playcanvas.pc

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
trait PostEffect extends js.Object {
  /**
    * The graphics device of the application. [read only].
    */
  var device: GraphicsDevice
  /**
    * The property that should to be set to `true` (by the custom post effect) if a depth map is necessary (default is false).
    */
  var needsDepthBuffer: Boolean
  /**
    * The shader definition for the fullscreen quad. Needs to be set by the custom post effect (default is null). Used when calling {@link pc.drawFullscreenQuad}.
    */
  var shader: Shader | Null
  /**
    * The vertex buffer for the fullscreen quad. Used when calling {@link pc.drawFullscreenQuad}. [read only].
    */
  var vertexBuffer: VertexBuffer
  /**
    * Render the post effect using the specified inputTarget
    to the specified outputTarget.
    * @param inputTarget - The input render target.
    * @param outputTarget - The output render target. If null then this will be the screen.
    * @param rect - (Optional) The rect of the current camera. If not specified then it will default to [0,0,1,1].
    */
  def render(inputTarget: RenderTarget, outputTarget: RenderTarget, rect: Vec4): Unit
}

object PostEffect {
  @scala.inline
  def apply(
    device: GraphicsDevice,
    needsDepthBuffer: Boolean,
    render: (RenderTarget, RenderTarget, Vec4) => Unit,
    vertexBuffer: VertexBuffer,
    shader: Shader = null
  ): PostEffect = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], needsDepthBuffer = needsDepthBuffer.asInstanceOf[js.Any], render = js.Any.fromFunction3(render), vertexBuffer = vertexBuffer.asInstanceOf[js.Any], shader = shader.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostEffect]
  }
}

