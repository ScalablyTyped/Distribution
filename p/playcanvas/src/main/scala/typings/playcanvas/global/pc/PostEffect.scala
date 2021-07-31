package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with typings.playcanvas.pc.PostEffect {
  def this(graphicsDevice: typings.playcanvas.pc.GraphicsDevice) = this()
  
  /**
    * The graphics device of the application. [read only].
    */
  /* CompleteClass */
  var device: typings.playcanvas.pc.GraphicsDevice = js.native
  
  /**
    * The property that should to be set to `true` (by the custom post effect) if a depth map is necessary (default is false).
    */
  /* CompleteClass */
  var needsDepthBuffer: Boolean = js.native
  
  /**
    * Render the post effect using the specified inputTarget
    to the specified outputTarget.
    * @param inputTarget - The input render target.
    * @param outputTarget - The output render target. If null then this will be the screen.
    * @param rect - (Optional) The rect of the current camera. If not specified then it will default to [0,0,1,1].
    */
  /* CompleteClass */
  override def render(
    inputTarget: typings.playcanvas.pc.RenderTarget,
    outputTarget: typings.playcanvas.pc.RenderTarget,
    rect: typings.playcanvas.pc.Vec4
  ): Unit = js.native
  
  /**
    * The shader definition for the fullscreen quad. Needs to be set by the custom post effect (default is null). Used when calling {@link pc.drawFullscreenQuad}.
    */
  /* CompleteClass */
  var shader: typings.playcanvas.pc.Shader | Null = js.native
  
  /**
    * The vertex buffer for the fullscreen quad. Used when calling {@link pc.drawFullscreenQuad}. [read only].
    */
  /* CompleteClass */
  var vertexBuffer: typings.playcanvas.pc.VertexBuffer = js.native
}
