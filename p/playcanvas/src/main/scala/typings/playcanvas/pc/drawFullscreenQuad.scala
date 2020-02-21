package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.drawFullscreenQuad")
@js.native
object drawFullscreenQuad extends js.Object {
  /**
    * @static
    * @function
    * @name pc.drawFullscreenQuad
    * @description Draw a screen-space rectangle in a render target. Primarily meant to be used in custom post effects based on {@link pc.PostEffect}.
    * @param {pc.GraphicsDevice} device - The graphics device of the application.
    * @param {pc.RenderTarget} target - The output render target.
    * @param {pc.VertexBuffer} vertexBuffer - The vertex buffer for the rectangle mesh. When calling from a custom post effect, pass the field {@link pc.PostEffect#vertexBuffer}.
    * @param {pc.Shader} shader - The shader to be used for drawing the rectangle. When calling from a custom post effect, pass the field {@link pc.PostEffect#shader}.
    * @param {pc.Vec4} [rect] - The normalized screen-space position (rect.x, rect.y) and size (rect.z, rect.w) of the rectangle. Default is [0, 0, 1, 1].
    */
  def apply(device: GraphicsDevice, target: RenderTarget, vertexBuffer: VertexBuffer, shader: Shader): Unit = js.native
  def apply(
    device: GraphicsDevice,
    target: RenderTarget,
    vertexBuffer: VertexBuffer,
    shader: Shader,
    rect: Vec4
  ): Unit = js.native
}

