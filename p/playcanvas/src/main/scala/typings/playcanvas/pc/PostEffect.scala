package typings.playcanvas.pc

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
trait PostEffect extends StObject {
  
  /**
    * The graphics device of the application. [read only].
    */
  var device: GraphicsDevice
  
  /**
    * The property that should to be set to `true` (by the custom post effect) if a depth map is necessary (default is false).
    */
  var needsDepthBuffer: Boolean
  
  /**
    * Render the post effect using the specified inputTarget
    to the specified outputTarget.
    * @param inputTarget - The input render target.
    * @param outputTarget - The output render target. If null then this will be the screen.
    * @param rect - (Optional) The rect of the current camera. If not specified then it will default to [0,0,1,1].
    */
  def render(inputTarget: RenderTarget, outputTarget: RenderTarget, rect: Vec4): Unit
  
  /**
    * The shader definition for the fullscreen quad. Needs to be set by the custom post effect (default is null). Used when calling {@link pc.drawFullscreenQuad}.
    */
  var shader: Shader | Null
  
  /**
    * The vertex buffer for the fullscreen quad. Used when calling {@link pc.drawFullscreenQuad}. [read only].
    */
  var vertexBuffer: VertexBuffer
}
object PostEffect {
  
  @scala.inline
  def apply(
    device: GraphicsDevice,
    needsDepthBuffer: Boolean,
    render: (RenderTarget, RenderTarget, Vec4) => Unit,
    vertexBuffer: VertexBuffer
  ): PostEffect = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], needsDepthBuffer = needsDepthBuffer.asInstanceOf[js.Any], render = js.Any.fromFunction3(render), vertexBuffer = vertexBuffer.asInstanceOf[js.Any], shader = null)
    __obj.asInstanceOf[PostEffect]
  }
  
  @scala.inline
  implicit class PostEffectMutableBuilder[Self <: PostEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: GraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedsDepthBuffer(value: Boolean): Self = StObject.set(x, "needsDepthBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: (RenderTarget, RenderTarget, Vec4) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    
    @scala.inline
    def setShader(value: Shader): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShaderNull: Self = StObject.set(x, "shader", null)
    
    @scala.inline
    def setVertexBuffer(value: VertexBuffer): Self = StObject.set(x, "vertexBuffer", value.asInstanceOf[js.Any])
  }
}
