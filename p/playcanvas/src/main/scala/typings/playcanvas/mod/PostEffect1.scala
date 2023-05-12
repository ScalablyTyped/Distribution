package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for all post effects. Post effects take a a render target as input apply effects to
  * it and then render the result to an output render target or the screen if no output is
  * specified.
  */
@js.native
trait PostEffect1 extends StObject {
  
  /**
    * The graphics device of the application.
    *
    * @type {import('../../platform/graphics/graphics-device.js').GraphicsDevice}
    */
  var device: GraphicsDevice = js.native
  
  /**
    * Draw a screen-space rectangle in a render target, using a specified shader.
    *
    * @param {import('../../platform/graphics/render-target.js').RenderTarget} target - The output
    * render target.
    * @param {import('../../platform/graphics/shader.js').Shader} shader - The shader to be used for
    * drawing the rectangle.
    * @param {import('../../core/math/vec4.js').Vec4} [rect] - The normalized screen-space position
    * (rect.x, rect.y) and size (rect.z, rect.w) of the rectangle. Default is [0, 0, 1, 1].
    */
  def drawQuad(target: RenderTarget, shader: Shader): Unit = js.native
  def drawQuad(target: RenderTarget, shader: Shader, rect: Vec4): Unit = js.native
  
  /**
    * The property that should to be set to `true` (by the custom post effect) if a depth map
    * is necessary (default is false).
    *
    * @type {boolean}
    */
  var needsDepthBuffer: Boolean = js.native
  
  /**
    * Render the post effect using the specified inputTarget to the specified outputTarget.
    *
    * @param {import('../../platform/graphics/render-target.js').RenderTarget} inputTarget - The
    * input render target.
    * @param {import('../../platform/graphics/render-target.js').RenderTarget} outputTarget - The
    * output render target. If null then this will be the screen.
    * @param {import('../../core/math/vec4.js').Vec4} [rect] - The rect of the current camera. If
    * not specified, it will default to [0, 0, 1, 1].
    */
  def render(inputTarget: RenderTarget, outputTarget: RenderTarget): Unit = js.native
  def render(inputTarget: RenderTarget, outputTarget: RenderTarget, rect: Vec4): Unit = js.native
}
