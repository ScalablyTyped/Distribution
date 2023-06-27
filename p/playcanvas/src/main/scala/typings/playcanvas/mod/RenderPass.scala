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
@js.native
trait RenderPass extends StObject {
  
  /**
    * Custom function that is called after the pass has fnished.
    *
    * @type {Function}
    */
  var after: js.Function = js.native
  
  /**
    * Custom function that is called before the pass has started.
    *
    * @type {Function}
    */
  var before: js.Function = js.native
  
  /**
    * Array of color attachment operations. The first element corresponds to the color attachment
    * 0, and so on.
    *
    * @type {Array<ColorAttachmentOps>}
    */
  var colorArrayOps: js.Array[ColorAttachmentOps] = js.native
  
  /**
    * Color attachment operations for the first color attachment.
    *
    * @type {ColorAttachmentOps}
    */
  def colorOps: ColorAttachmentOps = js.native
  
  /** @type {DepthStencilAttachmentOps} */
  var depthStencilOps: DepthStencilAttachmentOps = js.native
  
  var device: GraphicsDevice = js.native
  
  /**
    * Custom function that is called to render the pass.
    *
    * @type {Function}
    */
  var execute: js.Function = js.native
  
  /**
    * True if the render pass uses the full viewport / scissor for rendering into the render target.
    *
    * @type {boolean}
    */
  var fullSizeClearRect: Boolean = js.native
  
  /**
    * @param {import('../graphics/render-target.js').RenderTarget} renderTarget - The render
    * target to render into (output). This function should be called only for render passes which
    * use render target, or passes which render directly into the default framebuffer, in which
    * case a null or undefined render target is expected.
    */
  def init(renderTarget: RenderTarget): Unit = js.native
  
  def log(device: Any, index: Any): Unit = js.native
  
  /** @type {string} */
  var name: String = js.native
  
  /**
    * Render the render pass
    */
  def render(): Unit = js.native
  
  /** @type {import('../graphics/render-target.js').RenderTarget} */
  var renderTarget: RenderTarget = js.native
  
  /**
    * If true, this pass might use dynamically rendered cubemaps. Use for a case where rendering to cubemap
    * faces is interleaved with rendering to shadows, to avoid generating cubemap mipmaps. This will likely
    * be retired when render target dependency tracking gets implemented.
    *
    * @type {boolean}
    */
  var requiresCubemaps: Boolean = js.native
  
  /**
    * Number of samples. 0 if no render target, otherwise number of samples from the render target,
    * or the main framebuffer if render target is null.
    *
    * @type {number}
    */
  var samples: Double = js.native
  
  /**
    * Mark render pass as clearing the full color buffer.
    *
    * @param {Color} color - The color to clear to.
    */
  def setClearColor(color: Color): Unit = js.native
  
  /**
    * Mark render pass as clearing the full depth buffer.
    *
    * @param {number} depthValue - The depth value to clear to.
    */
  def setClearDepth(depthValue: Double): Unit = js.native
  
  /**
    * Mark render pass as clearing the full stencil buffer.
    *
    * @param {number} stencilValue - The stencil value to clear to.
    */
  def setClearStencil(stencilValue: Double): Unit = js.native
}
