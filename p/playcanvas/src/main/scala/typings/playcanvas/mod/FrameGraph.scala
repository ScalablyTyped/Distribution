package typings.playcanvas.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A frame graph represents a single rendering frame as a sequence of render passes.
  *
  * @ignore
  */
trait FrameGraph extends StObject {
  
  /**
    * Add a render pass to the frame.
    *
    * @param {import('../platform/graphics/render-pass.js').RenderPass} renderPass - The render
    * pass to add.
    */
  def addRenderPass(renderPass: RenderPass): Unit
  
  def compile(): Unit
  
  def render(device: Any): Unit
  
  /** @type {import('../platform/graphics/render-pass.js').RenderPass[]} */
  var renderPasses: js.Array[RenderPass]
  
  /**
    * Map used during frame graph compilation. It maps a render target to its previous occurrence.
    *
    *  @type {Map<import('../platform/graphics/render-target.js').RenderTarget, import('../platform/graphics/render-pass.js').RenderPass>}
    */
  var renderTargetMap: Map[RenderTarget, RenderPass]
  
  def reset(): Unit
}
object FrameGraph {
  
  inline def apply(
    addRenderPass: RenderPass => Unit,
    compile: () => Unit,
    render: Any => Unit,
    renderPasses: js.Array[RenderPass],
    renderTargetMap: Map[RenderTarget, RenderPass],
    reset: () => Unit
  ): FrameGraph = {
    val __obj = js.Dynamic.literal(addRenderPass = js.Any.fromFunction1(addRenderPass), compile = js.Any.fromFunction0(compile), render = js.Any.fromFunction1(render), renderPasses = renderPasses.asInstanceOf[js.Any], renderTargetMap = renderTargetMap.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[FrameGraph]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameGraph] (val x: Self) extends AnyVal {
    
    inline def setAddRenderPass(value: RenderPass => Unit): Self = StObject.set(x, "addRenderPass", js.Any.fromFunction1(value))
    
    inline def setCompile(value: () => Unit): Self = StObject.set(x, "compile", js.Any.fromFunction0(value))
    
    inline def setRender(value: Any => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setRenderPasses(value: js.Array[RenderPass]): Self = StObject.set(x, "renderPasses", value.asInstanceOf[js.Any])
    
    inline def setRenderPassesVarargs(value: RenderPass*): Self = StObject.set(x, "renderPasses", js.Array(value*))
    
    inline def setRenderTargetMap(value: Map[RenderTarget, RenderPass]): Self = StObject.set(x, "renderTargetMap", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
