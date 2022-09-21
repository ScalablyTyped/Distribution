package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A render pass represents a node in the frame graph, and encapsulates a system which
  * renders to a render target using an execution callback.
  *
  * @ignore
  */
trait RenderPass extends StObject {
  
  /** @type {ColorAttachmentOps} */
  var colorOps: ColorAttachmentOps
  
  /** @type {DepthStencilAttachmentOps} */
  var depthStencilOps: DepthStencilAttachmentOps
  
  var device: GraphicsDevice
  
  /** @type {Function} */
  var execute: js.Function
  
  /**
    * True if the render pass uses the full viewport / scissor for rendering into the render target.
    *
    * @type {boolean}
    */
  var fullSizeClearRect: Boolean
  
  /**
    * @param {RenderTarget} renderTarget - The render target to render into (output). This function should be
    * called only for render passes which use render target, or passes which render directly into the default
    * framebuffer, in which case a null or undefined render target is expected.
    */
  def init(renderTarget: RenderTarget): Unit
  
  /** @type {string} */
  var name: String
  
  /**
    * Render the render pass
    */
  def render(): Unit
  
  /** @type {RenderTarget} */
  var renderTarget: RenderTarget
  
  /**
    * If true, this pass might use dynamically rendered cubemaps. Use for a case where rendering to cubemap
    * faces is interleaved with rendering to shadows, to avoid generating cubemap mipmaps. This will likely
    * be retired when render target dependency tracking gets implemented.
    *
    * @type {boolean}
    */
  var requiresCubemaps: Boolean
  
  /**
    * Number of samples. 0 if no render target, otherwise number of samples from the render target,
    * or the main framebuffer if render target is null.
    *
    * @type {number}
    */
  var samples: Double
  
  /**
    * Mark render pass as clearing the full color buffer.
    *
    * @param {Color} color - The color to clear to.
    */
  def setClearColor(color: Color): Unit
  
  /**
    * Mark render pass as clearing the full depth buffer.
    *
    * @param {number} depthValue - The depth value to clear to.
    */
  def setClearDepth(depthValue: Double): Unit
  
  /**
    * Mark render pass as clearing the full stencil buffer.
    *
    * @param {number} stencilValue - The stencil value to clear to.
    */
  def setClearStencil(stencilValue: Double): Unit
}
object RenderPass {
  
  inline def apply(
    colorOps: ColorAttachmentOps,
    depthStencilOps: DepthStencilAttachmentOps,
    device: GraphicsDevice,
    execute: js.Function,
    fullSizeClearRect: Boolean,
    init: RenderTarget => Unit,
    name: String,
    render: () => Unit,
    renderTarget: RenderTarget,
    requiresCubemaps: Boolean,
    samples: Double,
    setClearColor: Color => Unit,
    setClearDepth: Double => Unit,
    setClearStencil: Double => Unit
  ): RenderPass = {
    val __obj = js.Dynamic.literal(colorOps = colorOps.asInstanceOf[js.Any], depthStencilOps = depthStencilOps.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], fullSizeClearRect = fullSizeClearRect.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), name = name.asInstanceOf[js.Any], render = js.Any.fromFunction0(render), renderTarget = renderTarget.asInstanceOf[js.Any], requiresCubemaps = requiresCubemaps.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any], setClearColor = js.Any.fromFunction1(setClearColor), setClearDepth = js.Any.fromFunction1(setClearDepth), setClearStencil = js.Any.fromFunction1(setClearStencil))
    __obj.asInstanceOf[RenderPass]
  }
  
  extension [Self <: RenderPass](x: Self) {
    
    inline def setColorOps(value: ColorAttachmentOps): Self = StObject.set(x, "colorOps", value.asInstanceOf[js.Any])
    
    inline def setDepthStencilOps(value: DepthStencilAttachmentOps): Self = StObject.set(x, "depthStencilOps", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: GraphicsDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setExecute(value: js.Function): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    inline def setFullSizeClearRect(value: Boolean): Self = StObject.set(x, "fullSizeClearRect", value.asInstanceOf[js.Any])
    
    inline def setInit(value: RenderTarget => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    inline def setRenderTarget(value: RenderTarget): Self = StObject.set(x, "renderTarget", value.asInstanceOf[js.Any])
    
    inline def setRequiresCubemaps(value: Boolean): Self = StObject.set(x, "requiresCubemaps", value.asInstanceOf[js.Any])
    
    inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSetClearColor(value: Color => Unit): Self = StObject.set(x, "setClearColor", js.Any.fromFunction1(value))
    
    inline def setSetClearDepth(value: Double => Unit): Self = StObject.set(x, "setClearDepth", js.Any.fromFunction1(value))
    
    inline def setSetClearStencil(value: Double => Unit): Self = StObject.set(x, "setClearStencil", js.Any.fromFunction1(value))
  }
}
