package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.drawTexture")
@js.native
object drawTexture extends js.Object {
  /**
    * @function
    * @name pc.drawTexture
    * @description Draws a texture in screen-space. Mostly used by post-effects.
    * @param {pc.GraphicsDevice} device - The graphics device used to draw the texture.
    * @param {pc.Texture} texture - The source texture to be drawn. Accessible as `uniform sampler2D source` in shader.
    * @param {pc.RenderTarget} [target] - The destination render target. Defaults to the frame buffer.
    * @param {pc.Shader} [shader] - The shader used for rendering the texture. Defaults to `pc.GraphicsDevice#getCopyShader()`.
    * @param {pc.Vec4} [rect] - The viewport rectangle to use for the texture, in pixels. Defaults to fullscreen (`0, 0, target.width, target.height`).
    * @param {pc.Vec4} [scissorRect] - The scissor rectangle to use for the texture, in pixels. Defaults to fullscreen (`0, 0, target.width, target.height`).
    * @param {boolean} [useBlend] - True to enable blending. Defaults to false, disabling blending.
    */
  def apply(device: GraphicsDevice, texture: Texture): Unit = js.native
  def apply(device: GraphicsDevice, texture: Texture, target: RenderTarget): Unit = js.native
  def apply(device: GraphicsDevice, texture: Texture, target: RenderTarget, shader: Shader): Unit = js.native
  def apply(device: GraphicsDevice, texture: Texture, target: RenderTarget, shader: Shader, rect: Vec4): Unit = js.native
  def apply(
    device: GraphicsDevice,
    texture: Texture,
    target: RenderTarget,
    shader: Shader,
    rect: Vec4,
    scissorRect: Vec4
  ): Unit = js.native
  def apply(
    device: GraphicsDevice,
    texture: Texture,
    target: RenderTarget,
    shader: Shader,
    rect: Vec4,
    scissorRect: Vec4,
    useBlend: Boolean
  ): Unit = js.native
}

