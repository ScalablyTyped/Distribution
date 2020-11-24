package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "drawQuadWithShader")
@js.native
object drawQuadWithShader extends js.Object {
  
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader,
    rect: js.UndefOr[scala.Nothing],
    scissorRect: js.UndefOr[scala.Nothing],
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader,
    rect: js.UndefOr[scala.Nothing],
    scissorRect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader,
    rect: js.UndefOr[scala.Nothing],
    scissorRect: typings.playcanvas.pc.Vec4,
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: js.UndefOr[scala.Nothing],
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: js.UndefOr[scala.Nothing],
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: typings.playcanvas.pc.Vec4,
    useBlend: Boolean
  ): Unit = js.native
  /**
    * Draws a screen-space quad using a specific shader. Mostly used by post-effects.
    * @param device - The graphics device used to draw the quad.
    * @param target - The destination render target. If undefined, target is the frame buffer.
    * @param shader - The shader used for rendering the quad. Vertex shader should contain `attribute vec2 vertex_position`.
    * @param [rect] - The viewport rectangle of the quad, in pixels. Defaults to fullscreen (`0, 0, target.width, target.height`).
    * @param [scissorRect] - The scissor rectangle of the quad, in pixels. Defaults to fullscreen (`0, 0, target.width, target.height`).
    * @param [useBlend] - True to enable blending. Defaults to false, disabling blending.
    */
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader,
    rect: js.UndefOr[scala.Nothing],
    scissorRect: js.UndefOr[scala.Nothing],
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader,
    rect: js.UndefOr[scala.Nothing],
    scissorRect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader,
    rect: js.UndefOr[scala.Nothing],
    scissorRect: typings.playcanvas.pc.Vec4,
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: js.UndefOr[scala.Nothing],
    useBlend: Boolean
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  def apply(
    device: typings.playcanvas.pc.GraphicsDevice,
    target: typings.playcanvas.pc.RenderTarget,
    shader: typings.playcanvas.pc.Shader,
    rect: typings.playcanvas.pc.Vec4,
    scissorRect: typings.playcanvas.pc.Vec4,
    useBlend: Boolean
  ): Unit = js.native
}
