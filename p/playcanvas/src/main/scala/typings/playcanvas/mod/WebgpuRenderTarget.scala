package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGPU implementation of the RenderTarget.
  *
  * @ignore
  */
trait WebgpuRenderTarget extends StObject {
  
  /**
    * Assign a color buffer. This allows the color buffer of the main framebuffer
    * to be swapped each frame to a buffer provided by the context.
    *
    * @param {any} gpuTexture - The color buffer.
    */
  def assignColorTexture(gpuTexture: Any): Unit
  
  /**
    * Texture assigned each frame, and not owned by this render target. This is used on the
    * framebuffer to assign per frame texture obtained from the context.
    *
    * @type {GPUTexture}
    * @private
    */
  /* private */ var assignedColorTexture: Any
  
  /** @type {ColorAttachment[]} */
  var colorAttachments: js.Array[ColorAttachment]
  
  /**
    * @type {GPUTextureFormat}
    * @private
    */
  /* private */ var depthFormat: Any
  
  /**
    * @type {GPUTexture}
    * @private
    */
  /* private */ var depthTexture: Any
  
  /**
    * True if the depthTexture is internally allocated / owned
    *
    * @type {boolean}
    */
  var depthTextureInternal: Boolean
  
  /**
    * Release associated resources. Note that this needs to leave this instance in a state where
    * it can be re-initialized again, which is used by render target resizing.
    *
    * @param {import('../webgpu/webgpu-graphics-device.js').WebgpuGraphicsDevice} device - The
    * graphics device.
    */
  def destroy(device: WebgpuGraphicsDevice): Unit
  
  /** @type {boolean} */
  var hasStencil: Boolean
  
  /**
    * Initialize render target for rendering one time.
    *
    * @param {import('../webgpu/webgpu-graphics-device.js').WebgpuGraphicsDevice} device - The
    * graphics device.
    * @param {import('../render-target.js').RenderTarget} renderTarget - The render target.
    */
  def init(device: WebgpuGraphicsDevice, renderTarget: RenderTarget): Unit
  
  /**
    * @private
    */
  /* private */ var initColor: Any
  
  def initDepthStencil(wgpu: Any, renderTarget: Any): Unit
  
  /** @type {boolean} */
  var initialized: Boolean
  
  /**
    * Unique key used by render pipeline creation
    *
    * @type {string}
    */
  var key: String
  
  def loseContext(): Unit
  
  /**
    * Render pass descriptor used when starting a render pass for this render target.
    *
    * @type {GPURenderPassDescriptor}
    * @private
    */
  /* private */ var renderPassDescriptor: Any
  
  var renderTarget: RenderTarget
  
  def resolve(device: Any, target: Any, color: Any, depth: Any): Unit
  
  def setColorAttachment(index: Any, multisampledBuffer: Any, format: Any): Unit
  
  def setDepthFormat(depthFormat: Any): Unit
  
  /**
    * Update WebGPU render pass descriptor by RenderPass settings.
    *
    * @param {import('../render-pass.js').RenderPass} renderPass - The render pass to start.
    */
  def setupForRenderPass(renderPass: RenderPass): Unit
  
  def updateKey(): Unit
}
object WebgpuRenderTarget {
  
  inline def apply(
    assignColorTexture: Any => Unit,
    assignedColorTexture: Any,
    colorAttachments: js.Array[ColorAttachment],
    depthFormat: Any,
    depthTexture: Any,
    depthTextureInternal: Boolean,
    destroy: WebgpuGraphicsDevice => Unit,
    hasStencil: Boolean,
    init: (WebgpuGraphicsDevice, RenderTarget) => Unit,
    initColor: Any,
    initDepthStencil: (Any, Any) => Unit,
    initialized: Boolean,
    key: String,
    loseContext: () => Unit,
    renderPassDescriptor: Any,
    renderTarget: RenderTarget,
    resolve: (Any, Any, Any, Any) => Unit,
    setColorAttachment: (Any, Any, Any) => Unit,
    setDepthFormat: Any => Unit,
    setupForRenderPass: RenderPass => Unit,
    updateKey: () => Unit
  ): WebgpuRenderTarget = {
    val __obj = js.Dynamic.literal(assignColorTexture = js.Any.fromFunction1(assignColorTexture), assignedColorTexture = assignedColorTexture.asInstanceOf[js.Any], colorAttachments = colorAttachments.asInstanceOf[js.Any], depthFormat = depthFormat.asInstanceOf[js.Any], depthTexture = depthTexture.asInstanceOf[js.Any], depthTextureInternal = depthTextureInternal.asInstanceOf[js.Any], destroy = js.Any.fromFunction1(destroy), hasStencil = hasStencil.asInstanceOf[js.Any], init = js.Any.fromFunction2(init), initColor = initColor.asInstanceOf[js.Any], initDepthStencil = js.Any.fromFunction2(initDepthStencil), initialized = initialized.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loseContext = js.Any.fromFunction0(loseContext), renderPassDescriptor = renderPassDescriptor.asInstanceOf[js.Any], renderTarget = renderTarget.asInstanceOf[js.Any], resolve = js.Any.fromFunction4(resolve), setColorAttachment = js.Any.fromFunction3(setColorAttachment), setDepthFormat = js.Any.fromFunction1(setDepthFormat), setupForRenderPass = js.Any.fromFunction1(setupForRenderPass), updateKey = js.Any.fromFunction0(updateKey))
    __obj.asInstanceOf[WebgpuRenderTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebgpuRenderTarget] (val x: Self) extends AnyVal {
    
    inline def setAssignColorTexture(value: Any => Unit): Self = StObject.set(x, "assignColorTexture", js.Any.fromFunction1(value))
    
    inline def setAssignedColorTexture(value: Any): Self = StObject.set(x, "assignedColorTexture", value.asInstanceOf[js.Any])
    
    inline def setColorAttachments(value: js.Array[ColorAttachment]): Self = StObject.set(x, "colorAttachments", value.asInstanceOf[js.Any])
    
    inline def setColorAttachmentsVarargs(value: ColorAttachment*): Self = StObject.set(x, "colorAttachments", js.Array(value*))
    
    inline def setDepthFormat(value: Any): Self = StObject.set(x, "depthFormat", value.asInstanceOf[js.Any])
    
    inline def setDepthTexture(value: Any): Self = StObject.set(x, "depthTexture", value.asInstanceOf[js.Any])
    
    inline def setDepthTextureInternal(value: Boolean): Self = StObject.set(x, "depthTextureInternal", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: WebgpuGraphicsDevice => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setHasStencil(value: Boolean): Self = StObject.set(x, "hasStencil", value.asInstanceOf[js.Any])
    
    inline def setInit(value: (WebgpuGraphicsDevice, RenderTarget) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
    
    inline def setInitColor(value: Any): Self = StObject.set(x, "initColor", value.asInstanceOf[js.Any])
    
    inline def setInitDepthStencil(value: (Any, Any) => Unit): Self = StObject.set(x, "initDepthStencil", js.Any.fromFunction2(value))
    
    inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLoseContext(value: () => Unit): Self = StObject.set(x, "loseContext", js.Any.fromFunction0(value))
    
    inline def setRenderPassDescriptor(value: Any): Self = StObject.set(x, "renderPassDescriptor", value.asInstanceOf[js.Any])
    
    inline def setRenderTarget(value: RenderTarget): Self = StObject.set(x, "renderTarget", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: (Any, Any, Any, Any) => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction4(value))
    
    inline def setSetColorAttachment(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "setColorAttachment", js.Any.fromFunction3(value))
    
    inline def setSetDepthFormat(value: Any => Unit): Self = StObject.set(x, "setDepthFormat", js.Any.fromFunction1(value))
    
    inline def setSetupForRenderPass(value: RenderPass => Unit): Self = StObject.set(x, "setupForRenderPass", js.Any.fromFunction1(value))
    
    inline def setUpdateKey(value: () => Unit): Self = StObject.set(x, "updateKey", js.Any.fromFunction0(value))
  }
}
