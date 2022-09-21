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
  
  var depthMap: Any = js.native
  
  /**
    * The graphics device of the application.
    *
    * @type {GraphicsDevice}
    */
  var device: GraphicsDevice = js.native
  
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
    * @param {RenderTarget} inputTarget - The input render target.
    * @param {RenderTarget} outputTarget - The output render target. If null then this will be the
    * screen.
    * @param {Vec4} [rect] - The rect of the current camera. If not specified, it will default to
    * [0, 0, 1, 1].
    */
  def render(inputTarget: RenderTarget, outputTarget: RenderTarget): Unit = js.native
  def render(inputTarget: RenderTarget, outputTarget: RenderTarget, rect: Vec4): Unit = js.native
  
  /**
    * The shader definition for the fullscreen quad. Needs to be set by the custom post effect
    * (default is null). Used when calling {@link drawFullscreenQuad}.
    *
    * @type {Shader|null}
    */
  var shader: Shader | Null = js.native
  
  /**
    * The vertex buffer for the fullscreen quad. Used when calling {@link drawFullscreenQuad}.
    *
    * @type {VertexBuffer}
    */
  var vertexBuffer: VertexBuffer = js.native
}
