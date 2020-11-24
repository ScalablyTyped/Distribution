package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "drawTexture")
@js.native
object drawTexture extends js.Object {
  
  /**
    * Draws a texture in screen-space. Mostly used by post-effects.
    * @param device - The graphics device used to draw the texture.
    * @param texture - The source texture to be drawn. Accessible as `uniform sampler2D source` in shader.
    * @param [target] - The destination render target. Defaults to the frame buffer.
    * @param [shader] - The shader used for rendering the texture. Defaults to `pc.GraphicsDevice#getCopyShader()`.
    * @param [rect] - The viewport rectangle to use for the texture, in pixels. Defaults to fullscreen (`0, 0, target.width, target.height`).
    * @param [scissorRect] - The scissor rectangle to use for the texture, in pixels. Defaults to fullscreen (`0, 0, target.width, target.height`).
    * @param [useBlend] - True to enable blending. Defaults to false, disabling blending.
    */
  def apply(device: typings.playcanvas.pc.GraphicsDevice, texture: typings.playcanvas.pc.Texture): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: js.UndefOr[scala.Nothing],
    rect: js.UndefOr[scala.Nothing],
    scissorRect: js.UndefOr[scala.Nothing],
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: js.UndefOr[scala.Nothing],
    rect: js.UndefOr[scala.Nothing],
    scissorRect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: js.UndefOr[scala.Nothing],
    rect: js.UndefOr[scala.Nothing],
    scissorRect: typings.playcanvas.pc.Vec4,
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: js.UndefOr[scala.Nothing],
    rect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: js.UndefOr[scala.Nothing],
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: js.UndefOr[scala.Nothing],
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: js.UndefOr[scala.Nothing],
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: js.UndefOr[scala.Nothing],
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: typings.playcanvas.pc.Vec4,
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader,
    rect: js.UndefOr[scala.Nothing],
    scissorRect: js.UndefOr[scala.Nothing],
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader,
    rect: js.UndefOr[scala.Nothing],
    scissorRect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader,
    rect: js.UndefOr[scala.Nothing],
    scissorRect: typings.playcanvas.pc.Vec4,
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: js.UndefOr[scala.Nothing],
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: typings.playcanvas.pc.Vec4,
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: js.UndefOr[scala.Nothing],
    rect: js.UndefOr[scala.Nothing],
    scissorRect: js.UndefOr[scala.Nothing],
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: js.UndefOr[scala.Nothing],
    rect: js.UndefOr[scala.Nothing],
    scissorRect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: js.UndefOr[scala.Nothing],
    rect: js.UndefOr[scala.Nothing],
    scissorRect: typings.playcanvas.pc.Vec4,
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: js.UndefOr[scala.Nothing],
    rect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: js.UndefOr[scala.Nothing],
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: js.UndefOr[scala.Nothing],
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: js.UndefOr[scala.Nothing],
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: js.UndefOr[scala.Nothing],
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: typings.playcanvas.pc.Vec4,
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader,
    rect: js.UndefOr[scala.Nothing],
    scissorRect: js.UndefOr[scala.Nothing],
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader,
    rect: js.UndefOr[scala.Nothing],
    scissorRect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader,
    rect: js.UndefOr[scala.Nothing],
    scissorRect: typings.playcanvas.pc.Vec4,
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: js.UndefOr[scala.Nothing],
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    texture: typings.playcanvas.pc.Texture,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: typings.playcanvas.pc.Vec4,
    useBlend: Boolean
  ): Unit = js.native
}
