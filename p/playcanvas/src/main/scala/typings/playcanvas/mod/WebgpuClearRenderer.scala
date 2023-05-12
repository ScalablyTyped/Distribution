package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A WebGPU helper class implementing a viewport clear operation. When rendering to a texture,
  * the whole surface can be cleared using loadOp, but if only a viewport needs to be cleared, or if
  * it needs to be cleared later during the rendering, this need to be archieved by rendering a quad.
  * This class renders a full-screen quad, and expects the viewport / scissor to be set up to clip
  * it to only required area.
  *
  * @ignore
  */
trait WebgpuClearRenderer extends StObject {
  
  var bindGroup: BindGroup
  
  def clear(device: Any, renderTarget: Any, options: Any, defaultOptions: Any): Unit
  
  var colorData: js.typedarray.Float32Array
  
  var colorId: Any
  
  var depthId: Any
  
  var shader: Shader
  
  var uniformBuffer: UniformBuffer
}
object WebgpuClearRenderer {
  
  inline def apply(
    bindGroup: BindGroup,
    clear: (Any, Any, Any, Any) => Unit,
    colorData: js.typedarray.Float32Array,
    colorId: Any,
    depthId: Any,
    shader: Shader,
    uniformBuffer: UniformBuffer
  ): WebgpuClearRenderer = {
    val __obj = js.Dynamic.literal(bindGroup = bindGroup.asInstanceOf[js.Any], clear = js.Any.fromFunction4(clear), colorData = colorData.asInstanceOf[js.Any], colorId = colorId.asInstanceOf[js.Any], depthId = depthId.asInstanceOf[js.Any], shader = shader.asInstanceOf[js.Any], uniformBuffer = uniformBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebgpuClearRenderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebgpuClearRenderer] (val x: Self) extends AnyVal {
    
    inline def setBindGroup(value: BindGroup): Self = StObject.set(x, "bindGroup", value.asInstanceOf[js.Any])
    
    inline def setClear(value: (Any, Any, Any, Any) => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction4(value))
    
    inline def setColorData(value: js.typedarray.Float32Array): Self = StObject.set(x, "colorData", value.asInstanceOf[js.Any])
    
    inline def setColorId(value: Any): Self = StObject.set(x, "colorId", value.asInstanceOf[js.Any])
    
    inline def setDepthId(value: Any): Self = StObject.set(x, "depthId", value.asInstanceOf[js.Any])
    
    inline def setShader(value: Shader): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
    
    inline def setUniformBuffer(value: UniformBuffer): Self = StObject.set(x, "uniformBuffer", value.asInstanceOf[js.Any])
  }
}
